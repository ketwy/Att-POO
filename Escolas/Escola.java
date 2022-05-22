import java.util.ArrayList;

public class Escola
{
    private String nome;
    private ArrayList<Estudante> estudantes;

    public Escola()
    {
    
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Estudante> getEstudantes(){
        return this.estudantes;
    }
    
    public void setEstudantes(ArrayList<Estudante> estudantes){
        this.estudantes = estudantes;
    }
    
    public double media(){
        double soma = 0;
        for(Estudante e:estudantes){
            soma+=e.getNivelLeitura();
        }
        
        return soma/estudantes.size();
    }
    
    public ArrayList<Estudante> acimaMedia(double media){
        ArrayList<Estudante> acimaMedia = new ArrayList<>();
        for(Estudante e:estudantes){
            if(e.getNivelLeitura()>media) acimaMedia.add(e);
        }
        return acimaMedia;
    }
    
    public ArrayList<Estudante> acimaMedia(){
        ArrayList<Estudante> acimaMedia = new ArrayList<>();
        for(Estudante e:estudantes){
            if(e.getNivelLeitura()>media()) acimaMedia.add(e);
        }
        return acimaMedia;
    }
}
