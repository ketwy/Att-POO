import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.io.IOException;
import java.awt.Color;

public class Texto03
{
    public Texto03()
    {
        
    }
    
    //3.1 Obter a data atual do sistema e retorná-la na forma de String.
    public String e3_1()
    {   
        return ""+ new Date();
    }
    
    //3.2 Receber uma data (como String) no formato dd/mm/aaaa e retornar a mesma data (como String) no formato "<dia da semana>, <dia> de <nome do mês> de <ano>"
    public String e3_2(String data) throws Exception 
    {           
        return new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }
    
    //3.3 Receber um caminho de diretório como parâmetro e retornar um vetor com todos os itens do diretório. Dica: objetos da classe File podem ser usados para realizar operações sobre diretórios, entre várias outras coisas. Analise a documentação da classe File para saber além do que já foi descrito no conteúdo deste texto.
    public String []e3_3(String n)
    {           
        File diretorio = new File(n);
        if(diretorio.exists()){
           return new File(n).list(); 
        }
        return new String[]{null};

    }
    
    //3.4 Receber um caminho de diretório como parâmetro e retornar um vetor com todos os itens do diretório. Cada item do vetor retornado deve estar precedido por "[A]", caso seja arquivo, e "D", caso seja diretório. Retorne um valor nulo caso o String recebido como parâmetro não corresponda a um diretório existente no disco. Mais uma vez, você precisará de um objeto da classe File para fazer o trabalho sujo para você.
    public String[] e3_4(String n)
    {           
        File diretorio = new File(n);
        if(diretorio.exists()){
            String[] arquivos = diretorio.list();
            for(int i=0; i<arquivos.length; i++){
                if(new File(diretorio.getPath() + "/" + arquivos[i]).isDirectory()){
                    arquivos[i] = "[D] " + arquivos[i];    
                }else arquivos[i] = "[A] " + arquivos[i];
            }
            
            return arquivos;
        }
        
        return new String[]{null};

    }
    
    //3.5 Receber um caminho para um arquivo como parâmetro e deletar o arquivo. 
    public boolean e3_5(String n)
    {           
        File arquivo = new File(n);
        if(arquivo.exists()){
            arquivo.delete();
            return true;
        }
        
        return false;
    }
    
    //3.6 (Desafio) Escreva um programa que mostre uma janela com dois menus - Arquivo e Editar. Dica: você deverá utilizar objetos das classes JFrame, JMenuBar e JMenu). 
    public void e3_6()
    {           
        JFrame tela = new JFrame();
        tela.setTitle("Exercício 3_6");
        tela.setSize(300, 100);
        
        JMenuBar menu = new JMenuBar();
        tela.setJMenuBar(menu);
        menu.add(new JMenu("Arquivo"));
        menu.add(new JMenu("Editar"));
        
        tela.setVisible(true);

    }
    
    //3.7 (Desafio) Escreva um método que receba como parâmetro um String representando um caminho para um arquivo executável e execute tal arquivo. Dica: pesquise no google "java como executar programas externos" (SEM as aspas) e seja feliz (você pode ter que escrever código que não vai entender bem - a ideia aqui é que você desenrole a solução independentemente de entender o que está acontecendo. Acredite, isso lhe será muito útil em sua vida de programador) 
    public boolean e3_7(String n) throws Exception
    {           
        File arquivo = new File(n);
        if(arquivo.exists()){
            Runtime.getRuntime().exec(n);
            return true;
        }
        return false;
    }
    
    //3.8 (Desafio) Escreva um método que receba o caminho de um arquivo de texto (txt) e abra o arquivo no bloco de notas (notepad no windows ou qualquer gedit no Ubuntu). Dica: você vai precisar apenas da solução da questão anterior e de um real a mais de esperteza.
    public boolean e3_8(String n) throws Exception
    {           
        File arquivo = new File(n);
        if(arquivo.exists()){
            Runtime.getRuntime().exec(new String[]{"notepad", n});
            return true;
        }
        return false;
    }
    
    //3.9 (Desafio) Faça um método que mostre uma Janela (vazia) do tamanho da tela. O programa deve funcionar em monitores com diferentes resoluções. Dica de professor: a classe ToolKit pode prover o tamanho da tela. Dica de MÃE: pesquise "como criar uma janela tela cheia em java" (sem aspas, pelo amor de Deus) e seja feliz.
    public void e3_9()
    {           
        JFrame tela = new JFrame();
        tela.setTitle("Tela responsiva");
        tela.setExtendedState(tela.MAXIMIZED_BOTH);
        tela.getContentPane().setBackground(Color.red);
        tela.setVisible(true);
    }
    
    //3.10 Receber duas datas como parâmetro e retornar a mais recente
    public String e3_10(String data1, String data2) throws Exception 
    {           
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(data1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(data2);
        
        if(date1.compareTo(date2)>0) return data1;
        return data2;
    }
    
    //3.11 (Desafio) Receber um array de Dates e modificar o array de forma que fique em ordem cronológica. Dica: use o método compareTo da classe Date
    public String[] e3_11(String[] n) throws Exception 
    {           

        int cont = 0;
        for(int i=1; i<n.length; i++){
            String k=n[i];
            int j = i-1;
            while(j>=0 && n[j].compareTo(k)>0){
                n[j+1]=n[j];
                j=j-1;
            }
            n[j+1]=k;
        }
        
        return n;
    }
    
    //3.12 Receber uma data, na forma de String, no formato dd/mm/aaaa, e retornar o dia da semana referente à data.
    public String e3_12(String data) throws Exception 
    {           
        return new SimpleDateFormat("EEEE").format(new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }

}
