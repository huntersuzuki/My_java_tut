package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable is used to implement custom logic to our sorting.
// Comparable implements itself to the class and provides a method compareTo to compare the values with itself.

class Students implements Comparable<Students> {
    int age;
    String name;

    Students(int age,String name){
        this.age = age;
        this.name = name;
    }


    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Students that) {
//        if (this.age > that.age){
//            return 1;
//        }else {
//            return -1;
//        }
        return this.age > that.age ? 1 : -1;
    }
}

public class ComparableCollection<S> {
    public static void main(String[] args) {

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(21,"Pranay"));
        studs.add(new Students(25,"Aditya"));
        studs.add(new Students(23,"Mayur"));
        studs.add(new Students(44,"Navin"));
        studs.add(new Students(28,"Harsh"));
        studs.add(new Students(50,"Modi"));
        Collections.sort(studs);
        System.out.println(studs);

    }
}
