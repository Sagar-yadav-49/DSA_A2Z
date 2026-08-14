package javaCollectionFramework.ComparableAndComparator;

// this class should have implements Comparable and its method "compareTo()" in order to done sorting
public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;


    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    // override toString() method so that dogs can be print
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+"\n"; // add \n so that dog object can be print in separate lines
    }

    @Override
    public int compareTo(Animal that) {
//        return this.age-that.age; // logic for sorting based on age
        // logic , if age of both are equal then do sorting based on name
        if(this.age==that.age){
            return this.name.compareTo(that.name);
        }
        return 0;
    }
}
