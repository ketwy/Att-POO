public class SerieDeLucas
{
    final int p,q;
    int numero;
    
    public SerieDeLucas(int p, int q)
    {
        this.p = p;
        this.q = q;
        this.numero = -1;
    }
    
    public int proximoValor(){
        numero++;
        return lucas(numero);
    }
    
    public int saltarValores(int quantidade){
        numero += quantidade;
        return lucas(numero);
    }
    
    private int serieLucas(int numero){
        if(numero<2) return numero;
        return p*serieLucas(numero-1) - q*serieLucas(numero-2);
    }
