import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created with IntelliJ IDEA.
 * User: windows 7
 * Date: 12/11/14
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArraySort {




    public static void main(String[] args){
        Integer[] array = {2,6,3,9,4,0,100,78};
        Arrays.sort(array,new Comparator<Integer>(){

            public int compare(Integer o1, Integer o2) {
               return  o2 - o1;
            }
        });
        for(int x =0;x<array.length;x++)
        System.out.println(array[x]);
    }
}
