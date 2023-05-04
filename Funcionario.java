public class Funcionario {
    private int id;
    private String nome;
    private String departamento;
    private boolean isSuporte;
    
    public Funcionario(int id, String nome, String departamento) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        if(departamento.equals("Suporte")){
            isSuporte = true;
        }
        else{
            isSuporte = false;
        }
    }
    
    @Override
    public String toString() {
        return "Funcionário " + nome + " (id: " + id + ") do departamento " + departamento + ".";
    }

    public int getId(){
        return id;
    }

    public String getDepartamento(){
        return departamento;
    }

    public boolean getIsSuporte(){
        return isSuporte;
    }

    public String getNome() {
        return nome;
    }

    public void atualizarStatusChamado(int idChamado, String novoStatus) {
        if (isSuporte) {
        } else {
            System.out.println("Apenas funcionários do departamento de suporte podem atualizar o status de chamados.");
        }
    }
}
