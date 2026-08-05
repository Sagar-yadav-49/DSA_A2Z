package javaCollectionFramework.JavaGenerics;

public class GenericMethod {
    public static void main(String[] args) {
//        printData("Sagar");
//        printData(123);
        // another way of calling non-static method
        GenericMethod gm=new GenericMethod();
        gm.<Integer>printData(123); // in today's time we need not to do this
        gm.printData("Sagar");
    }
//    static void printData(String data){
//        System.out.println(data);
//    }
//    static <T> void printData(T data){ // this method will work for all type of data
//        System.out.println(data);
//    }

    <T> void printData(T data){ // this method will work for all type of data
        System.out.println(data);
    }


}