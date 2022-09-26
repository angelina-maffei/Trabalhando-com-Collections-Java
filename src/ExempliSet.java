import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExempliSet {
    public static void main(String[] args) {

        System.out.println("Crie um confunto e adicione as notas");
        Set<Double> notas = new HashSet<>(ArrayList(7d, 8., 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5. esta no conjunto" + notas.contains(d));
        System.out.println("Exiba a menor nota:" + Collection.min(notas));   
        System.out.println("Exiba a maior nota: + Collection.max(notas")); 
        
        Interator<Double> Iterator = notas.iterador();
        Double soma = 0.0;
        while(iterador.hasNext()) {
            Double next = iterador.next();
        soma += next;        
        }  

        System.out.println("Exiba a soma dos valores:" + soma);
        System.out.println("Exiba a media das notas:" + (soma/ Notas.size()));

        System.out.println("Removava a nota 0: ");
        notas.remove((0:0d));
        System.out.println("notas");

        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterador();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("notas");

        System.out.println("Exiba todas as notas na ordem em que foram informados");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("notas2");  

        System.out.println("Exiba toas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto esta vazio:" + notas.isEmpty());
        System.out.println("Confira se o conjunto esta 2 vazio:" + notas2.isEmpty());
        System.out.println("Confira se o conjunto esta 3 vazio:" + notas3.isEmpty());

    

}
