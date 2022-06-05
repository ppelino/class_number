import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> valores = new ArrayList<Integer>();

        while (sc.hasNextLine()) {
            valores.add(Integer.parseInt(sc.nextLine()));
        }

        List<Integer> par = valores.stream().filter(valor -> valor % 2 == 0).collect(Collectors.toList());
        List<Integer> imp = valores.stream().filter(valor -> valor % 2 != 0).collect(Collectors.toList());
        List<Integer> pos = valores.stream().filter(valor -> valor > 0).collect(Collectors.toList());
        List<Integer> neg = valores.stream().filter(valor -> valor < 0).collect(Collectors.toList());

        System.out.println(par.size() + " par(es)");
        System.out.println(imp.size() + " impar(es)");
        System.out.println(pos.size() + " positivo(s)");
        System.out.println(neg.size() + " negativo(s)");

        sc.close();

    }
}