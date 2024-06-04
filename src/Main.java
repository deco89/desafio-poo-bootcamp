import java.time.LocalDate;

import model.Bootcamp;
import model.Curso;
import model.Dev;
import model.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

      Curso curso1 = new Curso();

      curso1.setTitulo("Curso Java");
      curso1.setDescricao("descrição do curso de java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();

      curso2.setTitulo("Curso Ruby on Rails");
      curso2.setDescricao("descrição do curso de Ruby on Rails");
      curso2.setCargaHoraria(12);

      Mentoria mentoria1 = new Mentoria();
      mentoria1.setTitulo("Mentoria Java");
      mentoria1.setDescricao("Descrição mentoria java");
      mentoria1.setData(LocalDate.now());

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp JAVA");
      bootcamp.setDescricao("Curso completo de Java para o mercado de trabalho");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria1);

      Dev devAndre = new Dev();
      devAndre.setNome("André");
      devAndre.inscrever(bootcamp);
      System.out.println("Conteudos inscritos" + devAndre.getConteudosInscritos());

      devAndre.prodredir();
      devAndre.prodredir();

      System.out.println("-");
      System.out.println("Conteudos inscritos" + devAndre.getConteudosInscritos());
      System.out.println("Conteudos concluidos" + devAndre.getConteudosConcluidos());
      System.out.println("XP: " + devAndre.calcularTotalXP());

      System.out.println("------------------");

      Dev devAna = new Dev();
      devAna.setNome("Ana");
      devAna.inscrever(bootcamp);
      System.out.println("Conteudos inscritos" + devAna.getConteudosInscritos());
      devAna.prodredir();
      devAna.prodredir();
      devAna.prodredir();
      System.out.println("-");
      System.out.println("Conteudos inscritos" + devAna.getConteudosInscritos());
      System.out.println("Conteudos concluidos" + devAna.getConteudosConcluidos());
      System.out.println("XP: " + devAna.calcularTotalXP());

    }
}
