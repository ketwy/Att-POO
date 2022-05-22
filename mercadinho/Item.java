public class Item extends Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double quantidade;
    private Produto produto;
    private double preco;

    /**
     * Construtor para objetos da classe Item
     */
    public Item(Produto pro)
    {
       produto = pro; 
    }
    
    public double getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(double quantidade){
        this.quantidade=quantidade;
    }
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public double total(){
        return preco * quantidade;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
}
