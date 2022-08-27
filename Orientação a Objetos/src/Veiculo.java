import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Veiculo {

    private String nome;
    private String cor;
    private int anoDeFabricacao;
    private Double precoCompra;
    private Double precoVenda;
    private int quantEstoque;
    

    public Veiculo(String no, String co, int an, Double pc, Double pv, int qe){
        nome = no;
        cor = co;
        anoDeFabricacao = an;
        precoCompra = pc;
        precoVenda = pv; 
        quantEstoque = qe;
    }

    public String getNome() {  
        return nome; 
    }
    public String getCor() { 
        return cor;  
    }
    public int getAnoDeFabricacao() { 
        return anoDeFabricacao;  
    }
    public Double getPrecoCompra() { 
        return precoCompra;  
    }
    public Double getPrecoVenda() { 
        return precoVenda;  
    }
    public int getQuantEstoque() { 
        return quantEstoque;  
    }
    public void setNome (String nome) { 
        this.nome = nome; 
    }
    public void setCor (String cor) { 
        this.cor = cor; 
    }
    public void setAnoDeFabricacao (int anoDeFabricacao) { 
        this.anoDeFabricacao = anoDeFabricacao; 
    }
    public void setPrecoCompra (Double precoCompra) { 
        this.precoCompra = precoCompra; 
    }
    public void setprecoVenda (Double precoVenda) { 
        this.precoVenda = precoVenda; 
    }
    public void setQuantEstoque (int quantEstoque) { 
        this.quantEstoque = quantEstoque; 
    }
    

    public String imprimir(){
        String impressao = "\nNome: " + nome + "\nCor: " + cor + "\nAno de Fabricação: " + anoDeFabricacao + "\nPreço de Compra: R$" + precoCompra + "\nPreço de Venda: R$" + precoVenda + "\nQuantidade em Estoque: "+ quantEstoque;
        return impressao;
    }

  
    
        public Carro leCarro (){
    
            String [] valores = new String [2];
            String [] nomeVal = {"Nome", "Numero", "Velocidade"};
            valores = leValores (nomeVal);
    
            Carro atlCorr = new Carro(no, co, an, pc, pv, qe, carro);
            return atlCorr;
        }
    
        public Moto leMoto (){
    
            String [] valores = new String [2];
            String [] nomeVal = {"Nome", "Numero", "Estilo"};
            valores = leValores (nomeVal);
    
            Moto atlNad = new Moto (valores[0],valores[1],valores[2]);
            return atlNad;
        }
    
        public Caminhao leCaminhao (){
    
            String [] valores = new String [2];
            String [] nomeVal = {"Nome", "Numero", "Altura"};
            valores = leValores (nomeVal);
    
            Caminhao atlSalt = new Caminhao (valores[0],valores[1],valores[2]);
            return atlSalt;
        }

        public Onibus leOnibus (){
    
            String [] getStrings = new String [2];
            String [] values = {"Capacidade"};
            values = leValores (values);
    
            Onibus atlSalt = new Onibus (valores[0],valores[1],valores[2]);
            return atlSalt;
        }
    
    }