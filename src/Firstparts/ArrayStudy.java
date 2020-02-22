package Firstparts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args){
        int[] array1={1,2,3};
        int[] array2=null;
        int[] array3=new int[20];
        for(int i=0;i<3;i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println(array3[5]);
        array3[5]=100;
        System.out.println(array3[5]);
        System.out.println(array3.length);
        System.out.println("--------------------");
        array2=array1;
        System.out.println(array1[0]+" "+array2[0]);
        array2[0]=100;
        System.out.println(array1[0]+" "+array2[0]);
        System.out.println("--------------------");
        Arrays.fill(array2,10);
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        System.out.println("--------------------");
        int[][] doublearray=new int[][]{{1,2,3},{1,9},{3,4,5},{9,8,7,5,4,1}};
        //System.out.println(doublearray[0]);//输出地址
        for(int i=0;i<doublearray.length;i++){
            for(int j=0;j<doublearray[i].length;j++){
                System.out.print(doublearray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
