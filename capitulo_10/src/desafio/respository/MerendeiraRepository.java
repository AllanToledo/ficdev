package desafio.respository;

//@author Allan Toledo

import desafio.model.Merendeira;
import java.util.List;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
