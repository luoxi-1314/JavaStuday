package Firstparts;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class practice18ArrayBegin {
    public static void main(String[] args){
        char[] a={'A','B','C'};
        System.out.print("a[]:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        char[] b=new char[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.print("b[]:");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int[] c={1,8,7,6,4,9,2};

        int max=c[0],min=c[0];
        for(int i=0;i<c.length;i++){
            if(c[i]>max)max=c[i];
            if(c[i]<min)min=c[i];
        }
        System.out.println("c[]中最大的数:"+max);
        System.out.println("c[]中最小的数:"+min);
        int[] d={1,5,3,8,7};
        int[] dcopy=new int[d.length];
        for (int i=0;i<d.length;i++){
            dcopy[d.length-i-1]=d[i];
        }
        System.out.print("d[]倒置:");
        for(int i=0;i<dcopy.length;i++)System.out.print(dcopy[i]+" ");
        System.out.println();
        int[] oldarray={1,2,0,0,6,0,5,0,8};
        int[] newarray=new int[oldarray.length];
        int num=0;
        for(int i=0;i<oldarray.length;i++){
            if(oldarray[i]!=0){
                newarray[num]=oldarray[i];num++;
            }else{continue;}
        }
        System.out.print("newarray[]:");
        for(int i=0;i<num;i++){
            System.out.print(newarray[i]+" ");
        }
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入查找的数字:");
        int number=scanner.nextInt();
        int[] e={9,5,4,7,2,0,1,8,3,6};
        for(int i=0;i<e.length;i++){
            if(e[i]==number){System.out.println("数字所在位置:"+i);break;}
        }
    }
}
