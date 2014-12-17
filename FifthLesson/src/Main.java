import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by cu on 25.11.2014.
 */
public class Main {
    public static void main(int[] args) {
        Random random = new Random();
        assert (false);
        int arr[] = new int[100];
        for (int i = 0; i < 100; i++) {
            int val = random.nextInt(5);
            arr[i] = val;
            // System.out.println(random.nextInt()/val);
        }

        assert (random != null);

        methodA();

        Scanner scaner = new Scanner(System.in);
//        while (true){
//            int a = scaner.nextInt();
//            int b = scaner.nextInt();
//            System.out.println(add(Integer.toString(a), Integer.toString(b)));
//        }

        printArray(arr);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        printArray(a);


        int prim1 = 2;
        int prim2 = 2;
        add(prim1, prim2);
        System.out.println(prim1);
        System.out.println(prim2);

        Integer s1 = 1000;
        Integer s2 = 2000;
        add(s1, s2);
        System.out.println(s1);
        System.out.println(s2);

        A aa = new A();
        System.out.println(aa.field);
        changer(aa);
        System.out.println(aa.field);


    }








    public static void main(String... args){
        String first = "))(("; // not balanced
        String second = "(())"; //balanced
        String third = "aa((as)asdas)"; //balanced
        String forth = "324(sada)(asdsad)(asdsa)()"; //balanced

        assert(isBalanced(first));
        assert(isBalanced(second));
        assert(isBalanced(third));
        assert(isBalanced(forth));

    }

    public static boolean isBalanced(String s){
        //return is the string balanced or not.
    }






















    public static void changer(A a){
        a.field = "Changed";
    }

    private static void printArray(int[] arr) {
        for(int i: arr){
            System.out.println((i*2));
        }
    }

    public static double add(double a, double b){
        return a + b;
    }
/*    public static int add(int a, int b){
        a = a + b;
        return a;
    }*/

    public static Integer add(Integer a, Integer b){
        a = a * b;
        return a;
    }

    public static String add(String a, String b){
        a = b+a;
        return a;
    }

    static class A {
        public String field = "Normal";
    }


    public static void methodA() {
        System.out.println("Hello word!");
    }



    int[] array = {1, 2, 3, 7, 4,5, 6};
    String arr = Arrays.toString(array);
    public static String megaMethod(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {

        }
        return s;
    }
    String arr1 = megaMethod(array);
    assert(arr==arr1);




}
