import java.util.ArrayList;
public class Grupo {
    private ArrayList<Funcionario> cadastro;

    public Grupo(){
        cadastro = new ArrayList<Funcionario>();
    }

    public boolean cadastraFuncionario(Funcionario f){
        return cadastro.add(f);
    }

    public Funcionario checarFuncionario(int id){
        for(int i = 0; i<cadastro.size(); i++) {
            Funcionario aux = cadastro.get(i);
            if(aux.getId() == id){
                return aux;
                
            }
                
        }
        return null;
    }

    public boolean checarSuporte(int id){
        if(checarFuncionario(id) != null){
            Funcionario aux = checarFuncionario(id);
            if(aux.getIsSuporte() == true){
                return true;
            }
        }
        return false;
        
    }
    
    
}
