package br.com.desafio.dominio;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Java Script");
        curso2.setDescricao("Curso de Java Script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Curso de Mentoria Java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMario = new Dev();
        devMario.setNome("Mário");
        devMario.inscreverBootcamp(bootcamp);
        devMario.progredir();
        devMario.progredir();

        System.out.println("Conteúdos Inscritos de Mário:" + devMario.getConteudosInscritos());
        System.out.println("---------------------------------");
        System.out.println("Conteúdos Concluidos de Mário:" + devMario.getConteudosConcluidos());
        System.out.println("XP = " + devMario.calcularTotalXp());

        System.out.println("=============================");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("----------------------------------");
        System.out.println("Conteúdos Concluidos de Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP = " + devPedro.calcularTotalXp());







    }
}