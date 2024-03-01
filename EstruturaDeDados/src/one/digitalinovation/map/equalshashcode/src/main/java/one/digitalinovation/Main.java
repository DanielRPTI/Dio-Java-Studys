package one.digitalinovation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String>  aluno = new HashMap<>();

        //(Key set , value
        aluno.put("Nome", "Joao");
        aluno.put("Idade", "21");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "DSM2");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Bruno");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "10.00");
        aluno2.put("Turma", "DSM1");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        System.out.println(aluno2.containsKey("Nome")));
    }
}
