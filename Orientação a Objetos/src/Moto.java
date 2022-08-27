public class Moto extends Veiculo{
    private boolean esportiva;

    public Moto(String no, String co, int an, Double pc, Double pv, int qe, Boolean moto){
        super(no, co, an, pc, pv, qe);
        esportiva = moto;
    }

    public boolean getMoto() { return esportiva; }
    public void setMoto(Boolean esportiva) { this.esportiva = esportiva; }

    //override
    public String imprimir(){
        String impressao =("\nEsportiva: "+ esportiva);
        if (esportiva=false){
            impressao =("\nEsportiva: Não");
        }
        else{
            impressao =("\nEsportiva: Sim");
        }
        return super.imprimir() + impressao;
    }


}