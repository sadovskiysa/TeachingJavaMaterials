import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by cu on 13.11.2014.
 */
public class Main {


    public static void main(String... args) {

        int[][]a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[3];


        a[1][2] = 42;

        System.out.println(a[1][2]);


      /*  int[] a = new int[10];

        Random random = new Random();

        int[] randomNumArray = new int[10];

        Arrays.fill(randomNumArray, random.nextInt());

        for(int i: randomNumArray){
            System.out.println(i);
        }

        Arrays.sort(randomNumArray);

        for(int i: randomNumArray){
            System.out.println(i);
        }




        int b = a[a.length-1];

        String[] s = new String[]{"asdsa", "asdfas"};

        int aa[] = new int[]{4, 5, 6};
        int ab[] = new int[]{8, 6, 4, 3, 6};

        Arrays.sort(ab);

        for(int i: ab){
            System.out.println(i);
        }

        System.arraycopy(aa, 0, ab, 0, aa.length);

        System.out.println(Arrays.toString(ab));
*/


//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }



    }

}
