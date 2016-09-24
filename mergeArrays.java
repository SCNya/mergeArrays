import java.util.Arrays;

/**
 * Created by Vsevolod on 24/09/16.
 * <p>
 * <code>mergeArrays!</code>
 *
 * @author Vsevolod
 * @version 1.0
 */

public class mergeArrays {
    public static void main(String[] args) {

/*int[] a1 = {0, 2};
int[] a2 = {1, 3};*/

/* int[] a1 = {0, 2, 2, 10,10,20};
int[] a2 = {1, 3, 5, 7, 8,10,10};*/

/*int[] a1 = {-3, -2, -1, 0};
int[] a2 = {-1, 1, 1};*/

int[] a1 = {0, 0, 0, 0, 0, 1, 2} ;
int[] a2 = {1, 3};

/*int[] a1 = new int[0];
int[] a2 = new int[0];*/

        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int i = 0;
        int j = 0;

        int[] mass = new int[a1.length + a2.length];

        for (int pos = 0; pos < mass.length; pos++) {

            if ((i < a1.length) && (j < a2.length)) {

                if (a1[i] <= a2[j]) {

                    mass[pos] = a1[i];
                    ++i;

                } else {

                    mass[pos] = a2[j];
                    ++j;
                }

            } else {

                if (i < a1.length) {

                    for (; pos < mass.length; pos++) {
                        mass[pos] = a1[i];
                        ++i;
                    }

                } else {

                    for (; pos < mass.length; pos++) {
                        mass[pos] = a2[j];
                        ++j;
                    }
                }
            }
        }

        return mass;
    }
}
