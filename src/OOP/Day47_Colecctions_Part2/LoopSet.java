package OOP.Day47_Colecctions_Part2;

import java.util.HashSet;
import java.util.Set;

public class LoopSet {
    
    public static void main(String[] args) {
        
        Set<Integer> numset = new HashSet<>();
        
        numset.add(50);
        numset.add(564);
        numset.add(4567);
        numset.add(523230);
        numset.add(978);
        numset.add(9088);
        numset.add(768);
        numset.add(7000);
        for (Integer n : numset) {
            System.out.print(n+"|");
            
        }
        System.out.println();

        numset.forEach(n-> System.out.print(n+"/"));
        
    }
}
