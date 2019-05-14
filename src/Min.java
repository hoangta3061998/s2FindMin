import java.util.Scanner;
public class Min {
    public static int min(int[]array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
int index = min(arr);
        System.out.println("The smallest value is " + arr[index]);
    }
}
