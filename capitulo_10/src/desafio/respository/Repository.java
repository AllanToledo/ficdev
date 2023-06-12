package desafio.respository;

//@author Allan Toledo

import java.util.List;

public interface Repository<T> {
    public abstract void save(T obj);
    public abstract T getById(int id);
    public abstract List<T> getAll();
}
