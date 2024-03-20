package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição java mentorias");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descircao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor dev = new Desenvolvedor();
        Desenvolvedor devJoao =  new Desenvolvedor();
        dev.setNome("Daniel");
        dev.inscreverBootcamp(bootcamp);
        dev.progressao();

        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progressao();
        
        System.out.println("Conteudos inscritos"+ dev.getConteudosInscritos());
        System.out.println("Conteudos inscritos"+ devJoao.getConteudosInscritos());
        System.out.println("====================================================");
        System.out.println("Conteudos concluidos"+ dev.getConteudosConcluidos());
        System.out.println("Conteudos concluidos"+ devJoao.getConteudosConcluidos());
    }
}
