package Thirdparts;

public class Demo_thread {
    public static void main(String[] args){
        MyThread thread=new MyThread("线程1");
        System.out.println(thread.getName());
        try{
            thread.sleep(3000);    //线程休眠
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread.start();

//加入线程    thread.join();
//守护线程    thread.setDaemon(true);

    }
}
