package javaCollectionFramework.JavaGenerics;

public class LearnGenerics {
    public static void main(String[] args) {
//        Dog d1=new Dog("asd12");
//        Dog d2=new Dog("ashhgfd132");
//        Dog d3=new Dog("afffsd123");
        // this will not support to int data, bcoz in dog class id is declared by string

        // but what if in future we wanna work with int type of data in same class
        // here generics will help
//        Dog<String> d1=new Dog<>("asd12");
//        Dog<Integer> d2=new Dog<>(12);
//
//        System.out.println(d1.getId());
//        System.out.println(d2.getId());

        Dog<String, String> d1=new Dog<>("asd12", "Shubham");
        Dog<Integer, String> d2=new Dog<>(12, "Sagar");

    }
}
//class Dog{
//    String id;
//    public Dog(String id){
//        this.id=id;
//    }
//}


//class Dog<T>{
//    T id;
//
//    V name;
//    public Dog(T id){
//        this.id=id;
//        this.name=name;
//    }
//    T getId(){ // method return type is T
//        return id;
//    }
//}

class Dog<T,V>{
    T id;

    V name;
    public Dog(T id,V name){
        this.id=id;
        this.name=name;
    }
    T getId(){ // method return type is T
        return id;
    }
}

