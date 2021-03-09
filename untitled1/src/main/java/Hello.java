
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {


        Person olesya = new Person("Olesya", 18);
        System.out.println(olesya.getAge());
        System.out.println(olesya.getName());
        olesya.displayID();
        Person katya = new Person("Katya", 18);
        katya.displayID();

    }

    static void sum(int ...nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.println(result);
    }



}


