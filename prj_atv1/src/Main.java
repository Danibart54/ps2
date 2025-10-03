//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AssentoEconomica assentoEconomica = new AssentoEconomica();
        AssentoExecutiva assentoExecutiva = new AssentoExecutiva();
        AssentoPrimeiraClasse assentoPrimeiraClasse = new AssentoPrimeiraClasse();


        System.out.println("Valor do assento Economica: R$ " + assentoEconomica.calcularPrecoBase());
        System.out.println("Valor do assento Executiva: R$ " + assentoExecutiva.calcularPrecoBase());
        System.out.println("Valor do assento Primeira Classe: R$" + assentoPrimeiraClasse.calcularPrecoBase());
    }
}