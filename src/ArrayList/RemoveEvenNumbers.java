package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9);
        removeEvenNumbers(list);
        System.out.println("List without even numbers"+list);
    }

    private static void removeEvenNumbers(List<Integer> list) {
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
    }
}
