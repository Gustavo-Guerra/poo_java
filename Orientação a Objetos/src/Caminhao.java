public class Caminhao extends Veiculo{
    private Float quantCarga;

    public Caminhao(String no, String co, int an, Double pc, Double pv, int qe, Float caminhao){
        super(no, co, an, pc, pv, qe);
        quantCarga = caminhao;
    }

    public Float getquantCarga() { return quantCarga; }
    public void setquantCarga(Float quantCarga) { this.quantCarga = quantCarga; }

    //override
    public String imprimir(){
        String impressao =("\nQuantidade de Carga (Em t): "+ quantCarga);
        return super.imprimir() + impressao;

    }


}