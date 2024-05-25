import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao da Mentoria Java ");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bottcamp Java Developer");
        bootcamp.setDescricao("Descricao do Bottcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devCamila.getNome() + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteudos concluidos " + devCamila.getNome() + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos inscritos " + devCamila.getNome() + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("----------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devJoao.getNome() + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos concluidos " + devJoao.getNome() + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos " + devJoao.getNome() + devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);


        }
    }
