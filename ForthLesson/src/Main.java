import java.util.Random;

/**
 * Created by cu on 18.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        Object a = new Object();
        String s = "string s";

        if(a!=s){
            System.out.println("Param pam pam");
        }

        boolean b = false;

        if(!b){
            System.out.println("Tut bil ya");
        }

        if(false || false || true){
            System.out.println("slon");
        }
        if(ili(true, false)){
            System.out.println("slon");
        }

        Random R = new Random();

                for(int i=0; i<10; i++){

                    System.out.println("@ 17 pd 5" + " " + (R.nextBoolean() ? 10 : 15));
                }


        switch (1) {
            case 0:
                System.out.println("asd");
        }

        int[] arr = {1,2,3,3,4,5,7,6,6};

        for(int c: arr){
            System.out.println(c);
        }


    }

    static boolean ili(boolean a, boolean b){
        return a ? a : b;
    }

}
