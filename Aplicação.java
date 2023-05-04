import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicação{
    private Grupo grupo;
    private EquipamentoLista  equipamentos;
    private ChamadoLista chamados;
    private Scanner entrada;

    public Aplicação(){
        grupo = new Grupo();
        equipamentos = new EquipamentoLista();
        entrada = new Scanner(System.in);

}





    private void menu(){
        System.out.println("------- MENU --------");
        System.out.println("0) Sair do sistema.");
        System.out.println("1) Cadastrar funcionário.");
        System.out.println("2) Cadastrar equipamento.");
        System.out.println("3) Criar chamado.");
        System.out.println("4) Gerenciar chamados.");
        System.out.println("5) Gerenciar setor de um equipamento.");
        System.out.println("6) Consultar painel de dados.");
        System.out.println("7) Pesquisar chamado.");
        System.out.println("----------------------");
        System.out.println("Escolha uma opção");



    }

    public void executa(){
        Funcionario um = new Funcionario(01,"01", "Suporte");
        grupo.cadastraFuncionario(um);
        Funcionario atual;
        do{
        System.out.println("Digite o seu id de funcionário");
        int id = entrada.nextInt();
        entrada.nextLine();
        if(grupo.checarFuncionario(id) == null){
            System.out.println("Funcionario inválido");
            atual = null;
        }
        else{
            atual = grupo.checarFuncionario(id);

        int opcao;
        switch(opcao){
            case 1:
            cadastraFuncionario();  
            break;
            case 2:
            cadastraEquipamento();
            break;
            case 5:
            if(atual.getIsSuporte() == false){
                System.out.println("Acesso negado, não é da equipe de suporte.");
            }
            else{
                trocaSetor();

            }
            break;
            case 6:
            System.out.println("Informe a descrição do equipamento");
            String descrição = entrada.nextLine();
            System.out.println("Equipamentos com esta descrição:");
            pesquisaEquipamento(descrição);
            break;
            case 0:
            break;
            
        
        }

        }while(atual == null);

        int opcao;
        do{
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 1:
                cadastraFuncionario();  
                break;
                case 2:
                cadastraEquipamento();
                break;
                case 3:
                break;
                case 5:
                if(atual.getIsSuporte() == false){
                    System.out.println("Acesso negado, não é da equipe de suporte.");
                }
                else{
                    trocaSetor();

                }
                break;
                case 6:
                painelDados.exibirPainel(chamados);
                break;
                case 0:
                break;
                
            
            }

        }while(opcao != 0);
    }

    public void cadastraFuncionario(){
        System.out.println("Digite o Id do funcionário");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o nome do funcionário.");
        String nome = entrada.nextLine();
        System.out.println("1) Digite o departamento do funcionário (Primeira letra em maiúscula).");
        String departamento = entrada.nextLine();
        Funcionario f = new Funcionario(id, nome, departamento);
        if(grupo.cadastraFuncionario(f) == true){
            System.out.println("Funcionário cadastrado com sucesso");

        }
        else{
            System.out.println("Funcionário não cadastrado...");
        }

    }

    public void cadastraEquipamento(){
        
        System.out.println("Digite o Id do equipamento");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite a descrição do equipamento.");
        String descrição = entrada.nextLine();
        System.out.println("Digite a data de aquisição do equipamento");
        int data = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o setor  do equipamento");
        String setor  = entrada.nextLine();
        Setor setorr = new Setor(setor);
        Equipamento equipamento = new Equipamento(id, descrição, data, setorr);
        equipamentos.adicionarEquipamento(equipamento);
        System.out.println("Equipamento cadastrado com sucesso!");
        
    }

    public void trocaSetor(){
        System.out.println("Qual o id do equipamento? ");
        int id = entrada.nextInt();
        entrada.nextLine();
        if(equipamentos.buscarEquipamento(id) == null){
        System.out.println("Equipamento não encontrado");
        }
        else{
            Equipamento equipamento = equipamentos.buscarEquipamento(id);
            System.out.println("Equipamento encontrado!");
            System.out.println("Qual setor deseja colocar-lo?");
            String setor = entrada.nextLine();
            Setor setorr = new Setor(setor);
            equipamento.setSetor(setorr);
            System.out.println("Operação concluída com sucesso");

        }

    }

    public void pesquisaChamado(){
        int opcao;
        do{
            System.out.println("------- Pesquisa de Chamado --------");
            System.out.println("Escolha como você deseja procurar o chamado:");
            System.out.println("(1) Nome do funcionário");
            System.out.println("(2) Descrição do equipamento");
            System.out.println("(3) Setor do equipamento");
            System.out.println("(4) Resolução");
            System.out.println("(0) Retornar ao menu principal");
            Chamado aux;
            do{
                opcao = entrada.nextInt();
                if(opcao < 0 || opcao > 4)
                    System.out.println("Opção inválida. Tente novamente.");
            } while(opcao < 0 || opcao > 4);
            switch(opcao){
                case 1:
                System.out.println("Digite o nome do funcionário:");
                String nome = entrada.nextLine();
                aux = chamados.pesquisaPorFuncionario(nome);
                if(aux == null){
                    System.out.println("Chamado não encontrado.");
                    break;
                }
                aux.dadosChamado();
                break;

                case 2:
                System.out.println("Informe a descrição do equipamento:");
                String descricao = entrada.nextLine();
                aux = chamados.pesquisaPorDescricao(descricao);
                if(aux == null){
                    System.out.println("Chamado não encontrado.");
                    break;
                }
                aux.dadosChamado();
                break;

                case 3:
                System.out.println("Informe o setor do equipamento:");
                String setor = entrada.nextLine();
                aux = chamados.pesquisaPorSetor(setor);
                if(aux == null){
                    System.out.println("Chamado não encontrado.");
                    break;
                }
                aux.dadosChamado();
                break;

                case 4:
                System.out.println("Escreva a resolução do chamado:");
                String resolucao = entrada.nextLine();
                aux = chamados.pesquisaPorResolucao(resolucao);
                if(aux == null){
                    System.out.println("Chamado não encontrado.");
                    break;
                }
                aux.dadosChamado();
                break;

                case 0:
                break;

            }  
        }while(opcao != 0);
        menu();
    }
    }

public void pesquisaEquipamento(String descrição){
    for( int i = 0; i<equipamentos.length(); i++){
        Equipamento e = equipamentos.get(i);
        if(descrição.contains(e.getDescrição())){
            System.out.println(e.toString());
        }
    }

}

    
    }


