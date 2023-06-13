package desafio.respository;

//@author Allan Toledo

import desafio.model.Merendeira;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class MerendeiraRepository implements Repository<Merendeira> {

    private static Repository<Merendeira> instance;
    
    private MerendeiraRepository(){}
    
    public Repository<Merendeira> getInstance() {
        if(instance == null) instance = new MerendeiraRepository();
        return instance;
    }
    
    @Override
    public void save(Merendeira obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Merendeira getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Merendeira> getAll() {
        List<Merendeira> merendeiras = new ArrayList<>();
        try {
            Connection conn = DefaultConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM merendeira LEFT JOIN escola on =;");
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                
            }
        } catch() {
            
        }
        return merendeiras;
    
    }

}
