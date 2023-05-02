import java.util.Date;


public class Chamado {
    private int id;
    private Funcionario funcionarioAbertura;
    private Equipamento equipamento;
    private Date dataSolicitacao;
    private String descricao;
    private StatusChamado status;
    private Funcionario funcionarioAtendimento;
    private String resolucao;

    public Chamado(int id, Funcionario funcionarioAbertura, Equipamento equipamento, Date dataSolicitacao,
            String descricao) {
        this.id = id;
        this.funcionarioAbertura = funcionarioAbertura;
        this.equipamento = equipamento;
        this.dataSolicitacao = dataSolicitacao;
        this.descricao = descricao;
        this.status = StatusChamado.ABERTO;
    }

    public int getId() {
        return id;
    }

    public Funcionario getFuncionarioAbertura() {
        return funcionarioAbertura;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public Funcionario getFuncionarioAtendimento() {
        return funcionarioAtendimento;
    }

    public void setFuncionarioAtendimento(Funcionario funcionarioAtendimento) {
        this.funcionarioAtendimento = funcionarioAtendimento;
        this.status = StatusChamado.EM_ANDAMENTO;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    enum StatusChamado {
        ABERTO,
        EM_ANDAMENTO,
        FECHADO
    }
}