package Thirdparts;

public class MyThread extends Thread {
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            if(i==50){
                System.out.println("在这停顿");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
            System.out.println("mythread"+i);
        }
    }
}
