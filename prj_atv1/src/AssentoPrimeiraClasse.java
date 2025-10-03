public class AssentoPrimeiraClasse extends Assento {
    public AssentoPrimeiraClasse() {
        this.classe = "Primeira classe";
        this.precoBase = 500;
    }

    @Override
    public double calcularPrecoBase() {
        return super.precoBase * 1.5;
    }
}
