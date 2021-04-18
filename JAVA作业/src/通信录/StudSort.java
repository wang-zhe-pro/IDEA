package 通信录;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class StudSort {
    public static void main(String[] args) {

        Arrays.asList(sort(1,3,45,6,56,345,13)).forEach(System.out::println);
    }
    public  static <T extends Comparable<T>> T[] sort(T...t){
        for (int i = 0; i <t.length-1 ; i++) {
            for (int j = i+1; j <t.length ; j++) {
                if(t[j].compareTo(t[i])>0){
                    T k=t[i];
                    t[i]=t[j];
                    t[j]=k;
                }
            }

        }
        return  t;
    }

}
