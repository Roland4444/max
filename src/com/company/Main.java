package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    int [] input ={0,1,0,-2};

    public static void main(String[] args) {
	// write your code here
    }
    Container max(int[] input){
        Map<Integer, Integer> initial = new HashMap<>();


        return null;
    }

    Map<Integer, Integer> initial(int[] input){
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, input[0]);
        for (int i=1;i<input.length;i++){
            if (input[i]<input[i]+input[i-1]) result.put(i, input[i-1]);
        }
        if (input[input.length-1]>0) result.put(input.length, input[input.length-1]);
        return result;
    }

    Map<Integer, Integer> secondary(Map<Integer, Integer> input){
        Map<Integer, Integer> result = new HashMap<>();
        int counter = 1;
        result.put(1, input.get(1));
        int currentInd=1;
       // System.out.print(input.get(5));
        boolean sequence=false;
        while ( (counter < input.size())){
            if (input.get(++currentInd)!=null){
                counter++;
                System.out.print(currentInd);
                int pos=currentInd;
                int sigma=input.get(currentInd);
                boolean line=false;
                while (input.get(++currentInd)!=null){
                    System.out.print(currentInd);
                    line=true;
                    counter++;
                    sigma+=input.get(currentInd);
                    continue;
                }
                if (!line)  result.put(pos, input.get(pos));
                else result.put(pos, sigma);
            }
        }
        return result;
    }

    int max(Map<Integer, Integer> input){
        for (input..: map.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxindex;
    }

    class Container{
        int start ;
        int stop;
    }
}
