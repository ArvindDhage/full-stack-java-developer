// creating our thread using Runnable interface .

public class MyThread implements Runnable{
    @Override
    public void run() {
        //Task for thread
        for(int i=0;i<=10;i++){
            System.out.println("Value of i: "+i);
        }
    }//now blueprint is created

    public static void main(String args[]){
        //Create object of MyThread class
        MyThread t=new MyThread();
        Thread thread=new Thread(t);
        thread.start();
    }
}
