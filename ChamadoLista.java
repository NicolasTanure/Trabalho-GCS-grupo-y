import java.util.Date;
import java.util.ArrayList;

public class ChamadoLista{
    private ArrayList<Chamado> chamados;

    public ChamadoLista(){
        chamados = new ArrayList<>();
    }

    public void add(Chamado chamado){
        chamados.add(chamado);
    }

    public int getSize(){
        return chamados.size();
    }

    public int chamadosAbertos(){
        int count = 0;
        for(Chamado chamado : chamados){
            if(chamado.getStatus() == Chamado.StatusChamado.ABERTO){
                count++;
            }
        }
        return count;
    }

    public int percentualAbertos(){
        int chamadosAbertos = this.chamadosAbertos();
        double porcentagem = (chamadosAbertos*100)/this.getSize();
        return (int)porcentagem;
    }

    public int chamadosEmAndamento(){
        int count = 0;
        for(Chamado chamado : chamados){
            if(chamado.getStatus() == Chamado.StatusChamado.EM_ANDAMENTO){
                count++;
            }
        }
        return count;
    }

    public int percentualEmAndamento(){
        int chamadosEmAndamento = this.chamadosEmAndamento();
        double porcentagem = (chamadosEmAndamento*100)/this.getSize();
        return (int)porcentagem;
    }

    public int chamadosFechados(){
        int count = 0;
        for(Chamado chamado : chamados){
            if(chamado.getStatus() == Chamado.StatusChamado.FECHADO){
                count++;
            }
        }
        return count;
    }

    public int percentualFechados(){
        int chamadosFechados = this.chamadosFechados();
        double porcentagem = (chamadosFechados*100)/this.getSize();
        return (int)porcentagem;
    }

    public int chamadosPorDia(){
        ArrayList<Date> datas = new ArrayList<>();
        for(Chamado chamado : chamados){
            datas.add(chamado.getDataSolicitacao());
        }
        for(int i = 0; i < datas.size() - 1; i++){
            if(datas.get(i) == datas.get(i + 1)){
                for(int j = i; j < datas.size() - 1; j++){
                    datas.add(i, datas.get(i+1));
                    if(j == datas.size() - 2)
                        datas.add(j, null);
                }
            }
        }
        double chamadosPorDia = (double)chamados.size()/datas.size();
        return (int)chamadosPorDia;
    }

    public Chamado pesquisaPorFuncionario(String nome){
        for(Chamado chamado : chamados){
            if(chamado.getFuncionarioAbertura().getNome().equalsIgnoreCase(nome)){
                return chamado;
            }
        }
        return null;
    }

    public Chamado pesquisaPorDescricao(String descricao){
        for(Chamado chamado : chamados){
            if(chamado.getEquipamento().getDescricao().equalsIgnoreCase(descricao)){
                return chamado;
            }
        }
        return null;
    }

    public Chamado pesquisaPorSetor(String setor){
        for(Chamado chamado : chamados){
            if(chamado.getEquipamento().getSetor().getNome().equalsIgnoreCase(setor)){
                return chamado;
            }
        }
        return null;
    }

    public Chamado pesquisaPorResolucao(String resolucao){
        for(Chamado chamado : chamados){
            if(chamado.getResolucao().equalsIgnoreCase(resolucao)){
                return chamado;
            }
        }
        return null;
    }



}