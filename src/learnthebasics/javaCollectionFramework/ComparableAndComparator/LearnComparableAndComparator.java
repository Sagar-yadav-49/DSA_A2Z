package learnthebasics.javaCollectionFramework.ComparableAndComparator;

import java.util.*;

// 2 way comparator
class MyCustomDogComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
//        return o1.weight-o2.weight;
        // better way
        return Integer.compare(o1.weight,o2.weight);

    }
}
public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1=new Animal(10,"leo",50);
        Animal a2=new Animal(5,"tuffy",30);
        Animal a3=new Animal(5,"bruno",40);
        Animal a4=new Animal(11,"max",60);

        // add these objects into list
        List<Animal> dogs=new ArrayList<>();

        // adding
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        // for sorting
        Collections.sort(dogs);
        System.out.println(dogs);


        // comparator
        // 1 way
//        Collections.sort(dogs, new Comparator<Animal>() { // Anonymous class
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                    return 0;
//            }
//        });

        //if we're using 2nd way of comparator then
        Collections.sort(dogs, new MyCustomDogComparator()); // pass object of that 2nd way class
        // now if we want to do sorting on basis of another aspect, so we don't have to change in class as in comparable
        // we just
        Collections.sort(dogs, new Comparator<Animal>() { // pass anonymous class
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name); // sorting based on name
            }
        });

        // The java 8 comparator interface , by using lambda expressions
        Collections.sort(dogs, (o1,o2)->o1.name.compareTo(o2.name));

        System.out.println(dogs);


        // sort 2d array
        int[][] a={
                {1,5,2},
                {1,1,2},
                {1,4,7}
        };
        // so we define own comparator which sort this 2d array on basis of criteria of " sort on basis of 1st index of some two rows "
//        Arrays.sort(a, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] arr1, int[] arr2) {
//                return arr1[0]-arr2[0];
//            }
//        });
        // by using lambda expreessios
        Arrays.sort(a, (arr1,arr2)->{
            return arr1[0]-arr2[0];
        });
        for(int[] ele:a){
            System.out.println(Arrays.toString(ele));
        }

        // homework, make an logic so that is 1st element of an array is equal , then do sorting on basis of 2nd element
        Arrays.sort(a, (arr1, arr2)->{
            int index=0;
            while(index<arr1.length){
                if (arr1[index] != arr2[index]) {
                    return arr1[index]-arr2[index];
                }
                index++;
            }
            return 0;
        });
        for(int[] ele:a){
            System.out.println(Arrays.toString(ele));
        }
    }
}