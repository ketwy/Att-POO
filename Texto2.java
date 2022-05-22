import java.lang.Math;

public class AulaStrings
{
    public AulaStrings()
    {
        
    }

    //2.2
    public int[] e2_2(int y, int x)
    {
        if(y>x) return new int[] {x,y};
        return new int[] {y,x};
        
    }
    //2.3 Receber três números reais e retorná-los em ordem decrescente
    public int[] e2_3(int y, int x, int z)
    {
        if(y>x & y>z){
            if(x>z){
                return new int[]{y,x,x};
            }else{
                return new int[]{y,z,x};
            }
        }else if(x>y & x>z){
            if(y>z){
                return new int[]{x,y,z};
            }
            else{
                return new int[]{x,z,y};
            }
        }else{
            if(y>x){
                return new int[]{z,y,x};
            }
            else{
                return new int[]{z,x,y};
            }
        }
    }
    
    //2.4 Receber um número real e retornar sua raiz quadrada
    public double e2_4(int y)
    {
        return  Math.sqrt(y);
    }
    
    //Receber dois Strings e informar se o primeiro String está contido no segundo (use o método indexOf)
    public boolean e2_5(String y, String x)
    {
        int indice = y.indexOf(x);
        
        if (indice<0){
            return false;
        }else{
            return true;
        }

    }
    
    public String[] e2_6(String y, String x)
    {
        int comp= y.compareTo(x);
        if (comp<0){
            return new String[]{y,x};
        }else{
            return new String[]{x,y};
        }

    }
    
    //Receber três Strings e retorná-los em ordem alfabética (use o método compareTo)
     public String[] e2_7(String y, String x, String z)
    {
        int comp= y.compareTo(x); 
        int comp2= y.compareTo(z);
        int comp3= x.compareTo(z);
        
        if (comp>0 & comp2>0){
            if(comp3>0){
                return new String[]{z,x,y};    
            }else{
                return new String[]{x,z,y};    
            }       
        }else if(comp<0 & comp2>0){
            if(comp3>0){
                return new String[]{z,x,y};
            }else{
                return new String[]{z,y,x};
            }
        }else{
            if(comp3>0){
                return new String[]{y,z,x};
            }else{
                return new String[]{y,x,z};
            }
        }
    }    
    //2.8 Receber um array de Strings na forma "nome sobrenome" e retornar um array na forma "sobrenome, nome" (use os métodos indexOf e substring)
    public String[] e2_8(String[] y)
    {   
        for(int i=0; i< y.length; i++){
            int indice= y[i].indexOf(" ");
            int tam = y[i].length();
            String nome= y[i].substring(0,indice);
            String sobrenome= y[i].substring(indice+1,tam);
            y[i]=sobrenome+" "+nome;
        }
        return y;
    }
    //2.9 Receber um array de Strings e modificá-lo de forma que todos os seus itens fiquem com todas as letras maiúsculas (use o método toUpperCase)
    public String[] e2_9(String[] y){
        for(int i=0; i< y.length; i++){
            y[i]=y[i].toUpperCase();
        }
        return y;
    }
    //2.10 Receber um array de Strings e retornar um array com os mesmos Strings mas com todas as letras maiúsculas (use o método toUpperCase)
    public String[] e2_10(String[] y){
        String[] x;
        x = new String[y.length];
        for(int i=0; i< y.length; i++){
            x[i]=y[i].toUpperCase();
        }
        return x;
    }
    //2.11 Receber um vetor de inteiros. Percorrer o vetor com um comando for. A cada repetição, troque o elemento corrente com o que estiver uma posição à frente sempre que o elemento da frente for menor que o elemento corrente. 
    
    public int[] e2_11(int[] n)
    {
        //for(int i=0; i<n.length; i++){}
        for(int i=1; i<n.length; i++){
            int k=n[i];
            int j = i-1;
            while(j>=0 && n[j]>k){
                n[j+1]=n[j];
                j=j-1;
            }
            n[j+1]=k;
        }
        return  n;
    }
    
    //2.12 Adapte o exercício anterior de forma que as trocas sejam efetuadas e, além disso, o método retorne a quantidade de trocas realizadas. 
    public int e2_12(int[] n)
    {
        int cont = 0;
        for(int i=1; i<n.length; i++){
            int k=n[i];
            int j = i-1;
            while(j>=0 && n[j]>k){
                n[j+1]=n[j];
                j=j-1;
                cont++;
            }
            n[j+1]=k;
        }
        
        return  cont;
    }
    //2.13. Adapte o exercício anterior para que funcione com um vetor de Strings e faça as trocas sempre que um String for lexicograficamente maior que o String que está à sua frente no vetor. Lembre de retornar o número de trocas.
    public int e2_13(String[] n)
    {
        int cont = 0;
        for(int i=1; i<n.length; i++){
            String k=n[i];
            int j = i-1;
            while(j>=0 && n[j].compareTo(k)>0){
                n[j+1]=n[j];
                j=j-1;
                cont++;
            }
            n[j+1]=k;
        }
        
        return cont;
    }
    
    public String[] e2_13Vetor(String[] n)
    {
        int cont = 0;
        for(int i=1; i<n.length; i++){
            String k=n[i];
            int j = i-1;
            while(j>=0 && n[j].compareTo(k)>0){
                n[j+1]=n[j];
                j=j-1;
                cont++;
            }
            n[j+1]=k;
        }
        
        return n;
    }
    //2.14 (Desafio) Receber um vetor de inteiros e modificá-lo para que fique em ordem decrescente. Dica de amigo: se você usar o método do exercício 2.12 e a quantidade de trocas retornada for 0 (zero), o vetor estará ordenado. É possível chamar um método de dentro de outro, assim como em qualquer linguagem de programação que você já estudou.
    public int[] e2_14(int[] numeros)
    {   
        int x=0;
        int tam=numeros.length;
        if(e2_12(numeros)>0){
            numeros = e2_11(numeros);
        }
        for(int i=0; i<=tam/2; i++){
            x=numeros[i];
            numeros[i]=numeros[tam-1-i];
            numeros[tam-1-i]=x;
        }
        return numeros;
    }
    //2.15 (Desafio) Receber um vetor de Strings e modificá-lo para que fique ordem alfabética. Dica de amigo: veja a dica de amigo da questão anterior.
    public String[] e2_15(String[] n)
    {
        n=e2_13Vetor(n);
        
        return n;
    }
    
    //2.16 (Desafio) Receber um vetor de Strings na forma "nome sobrenome" e modificá-lo para que fique ordenado alfabeticamente por sobrenome. Por exemplo: se o vetor {"robert plant", "ian gillan", "neil young"} for passado como parâmetro, após a execução do método, o conteúdo do vetor deve ser {"ian gillan", "robert plant",  "neil young"}. Sem dicas, se vire sozinho.
    public String[] e2_16(String[] n)
    {
        String[] inversa=e2_8(n);
        String[] inversaOrdenada=e2_13Vetor(inversa);
        for(int i=0; i< n.length; i++){
            int indice= inversaOrdenada[i].indexOf(" ");
            int tam = inversaOrdenada[i].length();
            String sobrenome= inversaOrdenada[i].substring(0,indice);
            String nome= inversaOrdenada[i].substring(indice+1,tam);
            n[i]=nome+" "+sobrenome;
        }
        return n;
    }
    
    //2.17 (Desafio) Receber um vetor de Strings na forma "nome sobrenome" e modificá-lo para que fique ordenado alfabeticamente por sobrenome e com a forma dos strings alterada para "sobrenome, nome".  Por exemplo: se o vetor {"robert plant", "ian gillan", "neil young"} for passado como parâmetro, após a execução do método, o conteúdo do vetor deve ser {"gillan, ian", "plant, robert",  "young, neil"}
    public String[] e2_17(String[] n)
    {
        String[] inversa=e2_8(n);
        String[] inversaOrdenada=e2_13Vetor(inversa);
        return inversaOrdenada;
    }
}
