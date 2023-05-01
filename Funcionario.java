public class Funcionario{
    private int id;
    private String nome;
    private String departamento;
    private boolean isSuporte;
    
    public Funcionario(int id, String nome, String departamento, boolean isSuporte) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.isSuporte = isSuporte;
    }
    
    @Override
    public String toString() {
        return "Funcionário " + nome + " (id: " + id + ") do departamento " + departamento + ".";
    }
}
