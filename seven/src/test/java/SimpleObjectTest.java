import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by cu on 02.12.2014.
 */
public class SimpleObjectTest {

    @Test
    public void testArrReverser(){
        int[] testArray = {1,2,3,4,5,6,7,8,9,0};
        int[] result = {0, 9, 8, 7,6,5,4,3,2,1};

        SimpleObject o = new SimpleObject();

        int[] resFromClass = o.arrRreverse(testArray);

//        assertEquals(resFromClass, result);

    }
}
