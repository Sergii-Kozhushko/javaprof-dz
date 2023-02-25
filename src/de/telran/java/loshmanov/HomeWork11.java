/**
 * HomeWork11.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 25-Feb-2023 23:33
 */

package de.telran.java.loshmanov;

public class HomeWork11 {
    public final static int[] array = {1, 2, 10, 12, 7, 0, 2};
    public static int index1, index2;

    public static String findSum(int n) {
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == n){
                    index1 = i;
                    index2 = j;
                    return "[" + index1 +", " + index2 + "]";
                }
            }
        }
        return "Elements not found";
    }

    public static void main(String[] args) {
        System.out.println(findSum(19));

    }

}
