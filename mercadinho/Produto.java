
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double preco;
    private String descricao;
    private double vendas;

    
    public Produto()
    {
        vendas = 0;
        
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    public double getVendas(){
        return this.vendas;
    }
    
    public void setVendas(double vendas){
        this.vendas = vendas;
    }
}
