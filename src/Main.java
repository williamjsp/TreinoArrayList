import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("maria");
        lista.add("Pedro");
        lista.add("Letícia");
        lista.add("William");

        List<String> lista2 = lista.stream().filter(x -> x.toLowerCase().charAt(0) == 'm')
                .collect(Collectors.toList());

        for(String i : lista2){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        for(String i : lista){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        String name1 = lista.stream().filter(x -> x.toLowerCase().charAt(0) == 'm').findFirst().orElse(null);
        System.out.println(name1);
    }
}