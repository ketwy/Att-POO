import java.util.*;
import java.util.stream.*;
public class Agencia
{
    private int cod;
    private ArrayList<Conta> contas = new ArrayList();
    /**
     * Construtor para objetos da classe Agencia
     */
    public Agencia()
    {
        
        
    }
    
    public void setCod(int cod){  
        this.cod=cod;
    }
    
    public int getCod(){
        return cod;
    }
    
    public void setConta(ArrayList<Conta> contas){  
        this.contas=contas;
    }
    
    public ArrayList<Conta> getConta(){
        return contas;
    }
    
    public double total(){
        return contas.stream().mapToDouble(c->c.getSaldo()).sum();
    }
    
    public List<Conta> devedores(){
        return contas.stream().filter(c->c.devedor()).collect(Collectors.toList());
    }
    
    public List<Conta> aniversariante(String date){
        int indice= date.indexOf("/",3);
        String data= date.substring(0,indice);
        return contas.stream().filter(c->c.getDate().startsWith(data)).collect(Collectors.toList());
    }
    
   
    public void rendimento(){
        contas.stream().filter(c->c.getTipo().equals("poupanca")).forEach(c->c.rendimento());
    }
    
    public void manutencao(){
        contas.stream().forEach(c->c.taxa_manutencao());
    }
    
    public void manutencaoCorrente(){
        contas.stream().filter(c->c.getTipo().equals("corrente")).forEach(c->c.taxa_manutencao());
    }
}
