package Firstparts;

class method {
    public void binary(int x) {
        int arr[]=new int [32];
        for (int i = 0; i < 32; i++) {
            arr[i] = x % 2;
            x = x / 2;
        }
        for (int i = 31; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
public class VariousSystem {
    public static void main(String[] args){
        method a=new method();
        a.binary(111);
    }
}
