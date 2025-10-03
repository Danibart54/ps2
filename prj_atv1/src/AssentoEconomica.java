public class AssentoEconomica extends Assento {

    public AssentoEconomica() {
        super.classe = "Economica";
        super.precoBase = 500;
    }


    @Override
    public double calcularPrecoBase() {
        return super.precoBase;
    }
}
