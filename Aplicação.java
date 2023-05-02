import java.util.ArrayList;
import java.util.Scanner;

public class Aplicação {
private Grupo grupo;
private EquipamentoLista  equipamentos;
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
    System.out.println("5) Gerenciar equipamentos.");
    System.out.println("----------------------");
    System.out.println("Escolha uma opção");



}

public void executa(){
    int opcao;
    do{
        menu();
         opcao = entrada.nextInt();
        entrada.nextLine();

        switch(opcao){
            case 1:
            cadastraFuncionario();
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

    
}
