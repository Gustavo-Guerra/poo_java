public class Onibus extends Veiculo{
    private int capacidade;

    public Onibus(String no, String co, int an, Double pc, Double pv, int qe, int onibus){
        super(no, co, an, pc, pv, qe);
        capacidade = onibus;
    }

    public int getcapacidade() { return capacidade; }
    public void setcapacidade(int capacidade) { this.capacidade = capacidade; }

    //override
    public String imprimir(){
        String impressao =("\nCapacidade: "+ capacidade);
        return super.imprimir() + impressao;

    }


}