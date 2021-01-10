package com.company;

class Hii implements Runnable{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }
}

class Bye implements Runnable{
    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println("Bye");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
//            System.out.println("");
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
//        OBJECTS OF THREADS
    Hii obj1 = new Hii();
    Hello obj2 = new Hello();
    Bye obj3 = new Bye();

//   OBJECTS OF RUNNABLE
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    Thread t3 = new Thread(obj3);



    t1.start();
    try {
        Thread.sleep(10);
    }
    catch (Exception e){

    }
    t2.start();
    try {
        Thread.sleep(10);
    }
    catch (Exception e){

    }
    t3.start();

    }
}

//package com.company;
//
//class Hii implements Runnable{
//    public void run(){
//        for(int i = 0; i <= 5; i++){
//            System.out.println("Hii");
//            try {
//                Thread.sleep(1000);
//            }
//            catch (Exception e){
//
//            }
//        }
//    }
//}
//
//class Hello implements Runnable{
//    public void run(){
//        for(int i = 0; i <= 5; i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(1000);
//            }
//            catch (Exception e){
//
//            }
//        }
//    }
//}
//
//class Bye implements Runnable{
//    public void run(){
//        for (int i = 0; i <= 5; i++){
//            System.out.println("Bye");
//            try {
//                Thread.sleep(1000);
//            }
//            catch (Exception e){
//
//            }
////            System.out.println("");
//        }
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
////        OBJECTS OF THREADS
//    Hii obj1 = new Hii();
//    Hello obj2 = new Hello();
//    Bye obj3 = new Bye();
//
////   OBJECTS OF RUNNABLE
//    Thread t1 = new Thread(obj1);
//    Thread t2 = new Thread(obj2);
//    Thread t3 = new Thread(obj3);
//
//
//
//    t1.start();
//    try {
//        Thread.sleep(10);
//    }
//    catch (Exception e){
//
//    }
//    t2.start();
//    try {
//        Thread.sleep(10);
//    }
//    catch (Exception e){
//
//    }
//    t3.start();
//
//    }
//}
