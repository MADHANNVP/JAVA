
import java.util.*;
class plus_One {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int b=0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] + 1 < 10) {
                a[i]++;
                b=0;
                for (int j = 0; j < a.length; j++) {
                    System.out.println(a[j]);
                b++;   
                }
                if(b>0)
                {
                    break;
                }

            } else {
                a[i] = 0;
            }
        }
         a = new int[a.length+1];
        a[0] = 1;
        if(b==0)
        {
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
    }
}
