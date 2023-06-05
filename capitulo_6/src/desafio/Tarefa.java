package desafio;

//@author Allan Toledo
public class Tarefa implements Comparable {

    @Override
    public int compareTo(Object o) {
        Tarefa other = (Tarefa) o;
        if(this.prioridade.ordinal() != other.prioridade.ordinal())
            return this.prioridade.ordinal() -  other.prioridade.ordinal();
        return this.titulo.compareTo(other.titulo);
    }
 
    public static enum Prioridades {
        URGENTE, IMPORTANTE, NORMAL, OPCIONAL
    }
    
    private String titulo;
    private String descricao;
    private Prioridades prioridade = Prioridades.NORMAL;
    private boolean concluido = false;
    
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    public Tarefa(String titulo, String descricao, Prioridades prioridade){
        this(titulo, descricao);
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridades getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridades prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "titulo=" + titulo + ", descricao=" + descricao + ", prioridade=" + prioridade + ", concluido=" + concluido + '}';
    }
    
    
    
}
