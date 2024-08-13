package BTNC;

import java.util.HashMap;
import java.util.Map;

public class bai2 {
    Map<String, Integer> mapDemChuoiCon = new HashMap<>();

    public  Map<String, Integer> countSubstrings(String input, int length){
        for(int i = 0;i<= input.length()-length;i++){
        String chuoiCon = input.substring(i,i + length);
        mapDemChuoiCon.put(chuoiCon,mapDemChuoiCon.getOrDefault(chuoiCon,0)+1);
        }
        return mapDemChuoiCon;

    }

    public void findSubstrings(String input, int length){
        Map<String, Integer> substrings = countSubstrings(input, length);
       for (Map.Entry<String,Integer>entry:substrings.entrySet()){
           System.out.println(entry.getKey() + " -> " + entry.getValue());
       }

    }

    public static void main(String[] args) {
        bai2 b2 = new bai2();
        b2.findSubstrings("abcabc",2);
    }
}
