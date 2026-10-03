package learnthebasics.hashing;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str="banana";
        charFreq(str);
    }
    static void charFreq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        // iterate over map
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}