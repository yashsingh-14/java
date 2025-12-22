package Multithreading;

 class SetNameThread extends Thread {
    public void run(){
        System.out.println("Inside run() method:"+Thread.currentThread().getName());
    }
}
 class SetNameMethod {

    public static void main(String[] args) {
        System.out.println("Before Changing name in main() method:"+Thread.currentThread().getName());
        Thread.currentThread().setName("Avenger");
        System.out.println("After Changing name in main() method:"+ Thread.currentThread().getName());
        SetNameThread t1 = new SetNameThread();
        SetNameThread t2 = new SetNameThread();
        SetNameThread t3 = new SetNameThread();
        t2.setName("Tony");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread t1 name:"+ t1.getName());
        System.out.println("Thread t2 name:"+ t2.getName());
    
    }
}
