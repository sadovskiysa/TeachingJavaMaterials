import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by cu on 27.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <Short.MAX_VALUE; i++) {
            Math.pow(i, 2);
        }
        for (int i = 0; i <Short.MAX_VALUE; i++) {
            Math.pow(i, 2);
        }
        long delt = System.currentTimeMillis()-start;
        System.out.println(delt);

        System.out.println(System.currentTimeMillis());

        Date data = new Date(System.currentTimeMillis());
        System.out.println(data);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(data));

        FileInputStream is;
        /*try {
            File f = new File("/test.log");
            is = new FileInputStream(f);
        } catch (FileNotFoundException ex){

        } finally {
            is.close();
        }*/


        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]).append(i < arr.length - 1 ? ", " : "]");
        }
        System.out.println(builder.toString());
        String name = "Andrey";
        System.out.printf("Hello %s", name);

        int x =0;
        boolean a = x>0 && 1/x>0;
        System.out.println(a);

        String simpleString = "Hello my dear friend";
        String pass = "pass";
        byte[] encodedArr = simpleString.getBytes();
        byte[] decodedArr = new byte[encodedArr.length];
        int c =0;
        for (int i = 0; i <encodedArr.length; i++) {
            decodedArr[i]= (byte) (encodedArr[i]^pass.getBytes()[c]);
            c++;
            if(c==pass.getBytes().length){
                c=0;
            }
        }
        Arrays.fill(encodedArr, (byte)0);
        System.out.println(new String(decodedArr));
        for (int i = 0; i <decodedArr.length; i++) {
            encodedArr[i]= (byte) (decodedArr[i]^pass.getBytes()[c]);
            c++;
            if(c==pass.getBytes().length){
                c=0;
            }
        }
        System.out.println(new String(encodedArr));






    }
}
