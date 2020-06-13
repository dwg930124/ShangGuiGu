import java.util.Arrays;

/**
 * @author DWG
 * @create 2020-06-12-16:20
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{10, 20}, {77, 10, 30}, {55}};

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j]);


        int[] arr2= new int[]{1, 2, 3, 4, 5};
        int[] arr3 = new int[arr2.length];
        int temp = arr2.length-1;
        for (int i =0; i<arr2.length; i++) {
            arr3[i] = arr2[temp--];
            System.out.println(arr3[i]);
        }
        for (int i=0;i<arr2.length/2;i++){
            temp = arr2[i];
            arr2[i] = arr2[arr2.length -1-i];
            arr2[arr2.length -1-i] = temp;
        }
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
