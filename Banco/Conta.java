import java.util.*;
import java.util.stream.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Conta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int cod;
    private String tipo;
    private double saldo;
    private double limite;
    private String date;
    private double taxa;
    private double rendimento;
    private ArrayList<String> extrato = new ArrayList<>();
    

    /**
     * Construtor para objetos da classe Conta
     */
    public Conta()
    {
        // 
    }
    
    public int getCod(){
        return cod;
    }
    
    public void setCod(int cod){
        this.cod=cod;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
        this.date=date;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public double getSaldo(){ //verSaldo()
        return saldo;
    }
    
    public void setSaldo(double saldo){//deposito()
        this.saldo=saldo;
    }
    
    public double getTaxa(){
        return taxa;
    }
    
    public void setTaxa(double taxa){
        this.taxa=taxa;
    }
    
    public double getRendimento(){ 
        return rendimento;
    }
    
    public void setRendimento(double rendimento){
        this.rendimento=rendimento;
    }
    
    public ArrayList<String> getExtrato(){
        return this.extrato;
    }
    
    public double getLimite(){ 
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite=limite;
    }
    
    public void deposito(double valor){
        saldo=saldo+valor;
        extrato.add("Deposito: R$" + valor + " | Saldo atual: R$" + saldo + " | Limite atual: R$" + limite + " | Data: " + LocalDateTime.now());
    }
    
    public boolean sacar(double valor){
        if(valor<= saldo+limite){
            if (valor > saldo){
                saldo=0;
                limite=(valor-saldo);
            }else{saldo=saldo-limite;}
            extrato.add("Saque: R$" + valor + " | Saldo atual: R$" + saldo + " | Limite atual: R$" + limite + " | Data: " + LocalDateTime.now());
            return true;
        }else{return false;}
    }
    
    public boolean transferir(double valor, Conta conta){
        if(valor<= saldo+limite){
            if (valor > saldo){
                saldo=0;
                limite=(valor-saldo);
            }else{saldo=saldo-limite;}
            conta.saldo+=valor; 
            extrato.add("Transferência enviada: R$ -" + valor + " | Saldo atual: R$" + saldo + " | Limite atual: R$" + limite + " | Data: " + LocalDateTime.now());
            conta.extrato.add("Tranferência recebida: R$" + valor + " | Saldo atual: R$" + saldo + " | Limite atual: R$" + limite + " | Data: " + LocalDateTime.now());
            return true;
        }else{return false;}
    }
    
    public boolean devedor(){
        if(saldo>0){
            return false;
        }else return true;
    }
    
    public void taxa_manutencao(){
        if(extrato.stream().filter(t->t.endsWith(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now()))
         && t.contains("Taxa de Manutenção")).collect(Collectors.toList()).size()<1){
            saldo-=taxa;
            extrato.add("Taxa de manutencao: R$ -" + taxa + " | Saldo atual: R$" + saldo + " | Limite atual: R$" + limite + " | Data: " + LocalDateTime.now());
        }
    }
    
    public void rendimento(){
        saldo+= saldo*rendimento;
        extrato.add("Rendimento: R$ " + saldo*rendimento + " | Saldo atual: R$" + saldo + " | Limite atual: R$" + limite + " | Data: " + LocalDateTime.now());    
    }
    
}
