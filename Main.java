import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Pelé", "Maradona", "Ronaldinho", "Messi", "Romário", "Garrincha", "Zidane"));
        ArrayList<Integer> IDs = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        for (int i=0; i < nomes.size(); i++){
            System.out.println("Nome: " + nomes.get(i) + " ID: " + IDs.get(i));
        }

    }

}