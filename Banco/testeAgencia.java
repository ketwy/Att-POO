import java.util.ArrayList;
import java.util.Random;
public class testeAgencia
{
    Random rand = new Random();
        
    public Banco montarTudo(){
        Banco banco= criarBanco();
        banco.setAgencia(criarAgencia(5));
        return banco;
    }
    
    
    public ArrayList<Conta> criarContas(int n)
    {
        ArrayList<Conta> conta = new ArrayList<>();
        for (int i=0; i<n; i++){
            Conta cs = new Conta(); 
            cs.setCod(i);
            if(i%2==0){
                cs.setTipo("corrente");
                cs.setRendimento(0.0);
            }
            else{
                cs.setTipo("poupanca"); 
                cs.setRendimento(rand.nextDouble());
            }
            cs.setSaldo(rand.nextInt(10000));
            cs.setLimite(cs.getSaldo()*0.5);
            cs.setTaxa(rand.nextInt(100)*0.9);
            cs.setDate("23/03/2002");
            conta.add(cs);
        }
        return conta;
    }
   
    
    public ArrayList<Agencia> criarAgencia(int n){
        ArrayList<Agencia> agencia = new ArrayList<>();
        for(int i=0; i<n; i++){
            Agencia age = new Agencia();
            age.setCod(i);
            age.setConta(criarContas(10));
            agencia.add(age);
        }
        return agencia;
    }
    
    public Banco criarBanco()
    {
        Banco banco = new Banco();
        banco.setNome("Banco");
        return banco;
    }
}