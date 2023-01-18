import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){

            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descrição curso Java.");
            curso1.setCargaHoraria(103);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso Js");
            curso2.setDescricao("Descrição curso Js.");
            curso2.setCargaHoraria(10);

            Mentoria mentoria1 = new Mentoria();
            mentoria1.setTitulo("Mentoria Java");
            mentoria1.setDescricao("Descrição da mentoria.");
            mentoria1.setData(LocalDate.now());
           
            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição");
            bootcamp.getConteudos().add(mentoria1);
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);

            Dev devSayonara = new Dev();
            devSayonara.setNome("Sayonara");
            devSayonara.increverBootcamp(bootcamp);
            System.out.println("Matrícula Sayonara: "+ devSayonara.getConteudosInscritos());
            devSayonara.progredir();
            devSayonara.progredir();
            System.out.println("Inscrito: "+ devSayonara.getConteudosInscritos());
            System.out.println("Concluídos: "+ devSayonara.getConteudosConcluidos());
            System.out.println("XP: "+devSayonara.calcularTotalXp());

            System.out.println("-----------------------------------------------");

            Dev devSandra = new Dev();
            devSandra.setNome("Sandra");
            devSandra.increverBootcamp(bootcamp);
            System.out.println("Matrícula Sandra: "+ devSandra.getConteudosInscritos());
            devSandra.progredir();
            devSandra.progredir();
            devSandra.progredir();
            System.out.println("Inscrito: "+ devSandra.getConteudosInscritos());
            System.out.println("Concluídos: "+ devSandra.getConteudosConcluidos());
            System.out.println("XP: "+devSandra.calcularTotalXp());     
    }
}
