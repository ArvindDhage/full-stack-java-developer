 multi theriding in java 
 
1.Introduction to multi threading

->Multithreading in java is a process of executing multiple threads simultaneously.

-> A thread is a lightweight sub process, the smallest unit of processing.

**Creating thread in java **
-> using runnable
ex: interface Runnable{
     run();
  }

-> using thread
  ex: class thread{
}



***Starting Thread in java **
**1st option to creating thread
class MyThread implement runnable
{
         public void run()
          {
              //task
          }
}

MyThread t=new MyThread();
 
Thread thread=new Thread(t);

thread.start();

**2nd option to creating thread
problem : having a problem multiple inheritance problem
class MyThread extends Thread
{
         public void run(){
         //task
         }
}

MyThread t=new MyThread();
t.start













2.Process , thread , Multitasking , Multithreading , Multiprocessing

3.Creating and Starting thread in java 

4.life cycle of thread 

5.Thread operation ,getting time , Sleeping .

6.Daemon in thread 

7.producer and consumer problem 
