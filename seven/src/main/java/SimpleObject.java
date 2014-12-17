/**
 * Created by cu on 02.12.2014.
 */
public class SimpleObject {

    public int[] arrRreverse(int[] a){
        int[] arr = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            arr[i] = a[a.length-i-1];
        }
        return arr;
    }

}
