import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Pelé", "Maradona", "Ronaldinho", "Messi", "Romário", "Garrincha", "Zidane"));
        ArrayList<Integer> IDs = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        boolean encontrado = false;

        for (int i=0; i < nomes.size(); i++){
            if (nomes.get(i).equals(args[0])){
                System.out.println("Nome: " + nomes.get(i) + " ID: " + IDs.get(i));
                encontrado = true;
                break;
            }

        }

        if (!encontrado){
            System.out.println("404 Nome não encontrado!");
        }

    }

}