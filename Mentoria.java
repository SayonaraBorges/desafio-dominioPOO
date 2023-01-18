package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    public Mentoria(){
        
    }
    @Override
    public double calcularXp() {
        
        return XP_PADRAO+20d;
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate date){
        this.data=date;
    }
    @Override
    public String toString(){
        return "Mentoria{" +
               "Título: '" + getTitulo() + '\'' +
               ", Descrição: " + getDescricao() + '\'' +
               ", Data: " + data +
                '}'; 
    }
    
}


