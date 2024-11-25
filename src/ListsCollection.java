import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsCollection {

    public static void main(String args[]) {
        exercicio1();
        exercicio2();
    }

    public static void exercicio1() {
        List<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Pedro");
        lista.add("Carlos");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    public static void exercicio2() {
        List<Nomes> listaNomes = new ArrayList<>();
        listaNomes.add(new Nomes("Carlos-M"));
        listaNomes.add(new Nomes("Mariana-F"));
        listaNomes.add(new Nomes("Leticia-F"));
        listaNomes.add(new Nomes("Andre-M"));
        listaNomes.add(new Nomes("Lucas-M"));

        Collections.sort(listaNomes);

        List<Nomes> listaMasculino = new ArrayList<>();
        List<Nomes> listaFeminino = new ArrayList<>();

        for (Nomes nome : listaNomes) {
            if (nome.getSexo().equals("M")) {
                listaMasculino.add(nome);
            } else {
                listaFeminino.add(nome);
            }
        }

        System.out.println("Lista Masculino: " + listaMasculino);
        System.out.println("Lista Feminino: " + listaFeminino);
    }
}
