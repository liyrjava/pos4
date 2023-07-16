import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public  static  void  main(String[] args)
    {
        int[] a = new int[5];
       //Arrays.sort(a);

        //System.out.println(Arrays.binarySearch(a,23));

        Arrays.fill(a,0,5,100);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");

        }

    }
}
