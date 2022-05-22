import java.util.ArrayList;
/**
 * Escreva uma descrição da classe Mercado aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Mercado extends rede
{
    private String nome;
    private ArrayList<Venda> vendas;
    
            
    public Mercado()
    {
        

    }
    
    public ArrayList<Venda> getVendas(){
        return this.vendas;
    }
    
    public void setVendas(ArrayList<Venda> vendas){
        this.vendas = vendas;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double total(String data)
    {
        double soma=0;
        for (Venda v:vendas){
            if(data.equals(v.getData())){
                soma+=v.total();
            }
        }
        
        return soma;
    }
    
    public double total(){
        double soma = 0;
        for(Venda v:vendas){
            soma+=v.total();
        }
        
        return soma;
    }
}
