import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Equipamento equipamento1 = new Equipamento(1, "Máquina de Lavar", 2022, Setor.LAVANDERIA);
        Equipamento equipamento2 = new Equipamento(2, "Notebook", 2021, Setor.TI);
        Equipamento equipamento3 = new Equipamento(3, "Ar-condicionado", 2020, Setor.MANUTENCAO);
        ArrayList<Equipamento> listaEquipamentos = new ArrayList<>();

        
        listaEquipamentos.add(equipamento1);
        listaEquipamentos.add(equipamento2);
        listaEquipamentos.add(equipamento3);

        
    }
}
