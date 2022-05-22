## Lista dinamica:
import java.util.ArrayList;

class Venda{
    private ArrayList<Item> itens = new ArrayList<>();
    
    public void adicionar(Item i){
        itens.add(i);
    }
    
    public Item remove(int indice){
        return itens.remove(indice);
    }
    
    public double total(){
        double res=0;
        for(Item i:itens){        // (int k=0; k<itens.size();k++)
            res+=i.total();       // rest+=itens.get(k).total();
        }
        return res;
    }
}

##LinkedList <-- lista ligada, a remoção é melhor. 
##Mas não é muito bom para consulta