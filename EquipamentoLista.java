import java.util.ArrayList;

public class EquipamentoLista {
    private ArrayList<Equipamento> listaEquipamentos;

    public EquipamentoLista(){
        this.listaEquipamentos = new ArrayList<>();
    }

    public void adicionarEquipamento(Equipamento equipamento){
        this.listaEquipamentos.add(equipamento);
    }

    public void removerEquipamento(int id){
        for(Equipamento equipamento : listaEquipamentos){
            if(equipamento.getId() == id){
                listaEquipamentos.remove(equipamento);
                break;
            }
        }
    }

    public Equipamento buscarEquipamento(int id){
        for(Equipamento equipamento : listaEquipamentos){
            if(equipamento.getId() == id){
                return equipamento;
            }
        }
        return null;
    }

}
