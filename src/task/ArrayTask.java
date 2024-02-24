package task;

public class ArrayTask {

    public static void main(String[] args) {

        int[] myArray = {1, 5, 7 ,3, 9, 2, 10};

        // 1. Given an array, find the largest element in it

        int max = 0;
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] > max)
            {
                max = myArray[i];
            }
        }

        System.out.println(max);
    }
}
