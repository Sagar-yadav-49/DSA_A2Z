package javaCollectionFramework.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// class for seeing working of HashSet of custom objects
class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
       this.rollNo=rollNo;
       this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo; // if rollNo of two students are equal then both student are equal
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo); // taking input as rollNo and generate hashCode as a output which is unique for each rollNo
    }
}
public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(); // HashSet doesn't follow any insertion order, so elements are added and removed in random order
        // by this means of randomness, HashSet provide O(1) time complexity for basic operation such as add(), remove(), contanis()
        // set doesn't allow duplicates so 10 only inserts 1 time
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        // custom objects
        Set<Student> set2=new HashSet<>();
//        set2.add(new Student(1,"Sagar"));
//        set2.add(new Student(1,"Sagar"));
//        set2.add(new Student(1,"Sagar"));
//        System.out.println(set2);
        // same student with same rollNo and name are allowed , but hashset doesn't allow duplicates so we have to customize HashCode() and equals() method
        // after override equals() and hashCode() method
        // only one student with these details print, even if names are different but we are comparing on the basis of rollNo
        set2.add(new Student(1,"Sagar"));
        set2.add(new Student(1,"Ram"));
        set2.add(new Student(1,"Rohit"));
        System.out.println(set2);
    }
}