package desafio.respository;

//@author Allan Toledo
import desafio.model.Escola;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscolaRepository implements Repository<Escola> {

    private static Repository<Escola> instance = null;

    private EscolaRepository() {

    }

    public static Repository<Escola> getInstance() {
        if (instance == null) {
            instance = new EscolaRepository();
        }
        return instance;
    }

    private void create(Escola escola) {
        try {
            Connection conn = DefaultConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO escola values(default, ?) RETURNING id;");
            stmt.setString(1, escola.getNome());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                escola.setId(id);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EscolaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void update(Escola escola) {
        try {
            Connection conn = DefaultConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE escola SET nome=? WHERE id=?;");
            stmt.setString(1, escola.getNome());
            stmt.setInt(2, escola.getId());
            stmt.execute();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EscolaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Escola escola) {
        if (escola.getId() == null) {
            create(escola);
        } else {
            update(escola);
        }

    }

    @Override
    public Escola getById(int id) {
        Escola escola = null;

        try {
            Connection conn = DefaultConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM escola WHERE id=?;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                escola = new Escola(id, nome);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EscolaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return escola;

    }

    @Override
    public List<Escola> getAll() {
        List<Escola> escolas = new ArrayList<>();

        try {
            Connection conn = DefaultConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM escola;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                escolas.add(new Escola(id, nome));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EscolaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return escolas;
    }

}
