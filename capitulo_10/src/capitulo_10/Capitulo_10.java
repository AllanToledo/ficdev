
import java.sql.*;

public class Capitulo_10 {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // registra o driver
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://172.17.0.2:5432/tarefas", "postgres", "123456"); // abre conexão
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tarefa;"); // executa comando SQL
            while (rs.next()) { //manipula resultado
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                String concluido = rs.getBoolean("concluido") ? "Concluido" : "Não concluido"; 
                System.out.println(id + ", " + titulo + ", " + descricao + ", " + concluido);
            }
            conn.close(); // fecha conexão
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
