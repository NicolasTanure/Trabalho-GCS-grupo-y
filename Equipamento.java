
public class Equipamento {
    private int id;
    private String descrição;
    private int data;
    private Setor setor;

    public Equipamento(int id, String descrição, int data, Setor setor){
        this.id = id;
        this.descrição = descrição;
        this.data = data;
        this.setor = setor;
    }

    public Setor getSetor(){
        return setor;
    }

    public void setSetor(Setor setor){
        this.setor = setor;
    }

    public int getId(){
        return id;
    }

<<<<<<< HEAD
    public String getDescricao() {
        return descrição;
    }
=======
    public String getDescrição(){
        return descrição;
    }

    public String toString() {
        return "Equipamento "  + " (id: " + id + ") do setor " + setor.getNome() + ".";
    }



    
>>>>>>> f738c44e6257dadcda47ea5e3cc29883e5561b11
}
