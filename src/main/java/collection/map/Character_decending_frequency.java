package collection.map;


// print the character in decending order of their frequency.
// if the 2 character have same frequency then print the character in decending order.



import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

//wrong
public class Character_decending_frequency {
    public static void main(String[] args){
        String str="helloworld";
        Map<Character,Integer> map=new LinkedHashMap<>();
        char[] ch=str.toCharArray();

        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        List<Integer> b = new ArrayList<>();
        map.forEach((k, l)->{
            b.add(l);
        });
        Collections.sort(b);
        Collections.reverse(b);
        /*b.forEach(m->{
           // System.out.println(m);
            AtomicReference<Boolean> f = new AtomicReference<>(true);
            map.forEach((k, l)->{
                if(m == l && f.get()){
                    System.out.println(m+"     "+k);
                    f.set(false);
                    map.replace(k, 0);
                }
            });
        });*/
        System.out.println(sortByValue(map));
    }
    public static Map<Character, Integer> sortByValue(Map<Character, Integer> hm)
    {
        HashMap<Character, Integer> temp
                = hm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return temp;
    }
}


