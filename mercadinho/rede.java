import java.util.ArrayList;
/**
 * Escreva uma descrição da classe rede aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class rede
{
    private String nome;
    private ArrayList<Mercado> mercados;
    
    public rede()
    {
        nome="Santa Rita";
        
    }
    
    public ArrayList<Mercado> getMercados(){
        return this.mercados;
    }
    
    public void setMercados(ArrayList<Mercado> mercados){
        this.mercados = mercados;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    } 
    
    public double total(){
        double soma = 0;
        for(Mercado m:mercados){
            soma+=m.total();
        }
        
        return soma;
    }
    
    public double total(String data){ 
        double soma = 0;
        for(Mercado m:mercados){
            soma+=m.total(data);
        }
        
        return soma;
    }
}
