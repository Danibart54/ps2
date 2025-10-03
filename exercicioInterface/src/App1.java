public class App1 {
    public static void main(String[] args) {
        GerenciadorNomes g = new GerenciadorNomesArquivos();
        g.adicionarNome("Marcelo");
        g.adicionarNome("Silvia");
        g.adicionarNome("Jonas");
        System.out.println(g.obterNomes());
    }
}