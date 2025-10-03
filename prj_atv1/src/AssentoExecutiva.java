public class AssentoExecutiva extends Assento {


    public AssentoExecutiva() {
        this.precoBase = 500;
        this.classe = "Executiva";
    }


    @Override
    public double calcularPrecoBase() {
        return super.precoBase  * 1.3;
    }

    @Override
    public String toString() {
        return "AssentoExecutiva{" +
                "precoBase=" + precoBase +
                ", classe='" + classe + '\'' +
                '}';
    }
}
