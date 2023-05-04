public class painelDados{
    public static void exibirPainel(ChamadoLista chamados){
        System.out.println("--- Painel de Dados ---");
        System.out.println(chamados.getSize() + " chamados registrados.");
        System.out.println(chamados.chamadosAbertos() + " chamados abertos. " + chamados.percentualAbertos() + "% do total.");
        System.out.println(chamados.chamadosEmAndamento() + " chamados em andamento. " + chamados.percentualEmAndamento() + "% do total.");
        System.out.println(chamados.chamadosFechados() + " chamados concluídos. " + chamados.percentualFechados() + "% do total.");
        System.out.println(chamados.chamadosPorDia() + " chamados por dia.");
    }
}