public class Carro extends Veiculo{

    
    private int tipo;

    public Carro(String no, String co, int an, Double pc, Double pv, int qe, int carro){
        super(no, co, an, pc, pv, qe);
        tipo = carro;
    }

    public int getCarro() { return tipo; }
    public void setCarro(int tipo) { this.tipo = tipo; }
    
    //override
    public String imprimir(){
        String impressao = ("\nTipo de carro:  "+ tipo);
        return super.imprimir() + impressao;
    }







}