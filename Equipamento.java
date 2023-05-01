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

    public getSetor(){
        return setor;
    }

    public setSetor(Setor setor){
        this.setor = setor;
    }


    
}
