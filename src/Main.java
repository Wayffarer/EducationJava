import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Одномерные масивы
//        int[] nums = new int[5];
//        nums[0] = 124;
//        nums[1] = 34;
//        nums[2] = 12;
//        nums[3] = 2;
//        nums[4] = 87;
//        int res = nums[2] * 2;
//        System.out.println(nums[2] + "\n" + res);
//
//        float[] nums2 = new float[]{5.5f, 6.75f, 12.43f, 125.32f, 91,23f};
//
//        for (int i = 0; i < nums2.length; i++){
//            System.out.println(nums2[i]);
//        }

//        int[] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.print("Ведите число: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println("Minimal: " + min);
        //многомерные
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {3,5},
                {12,31},
                {7,11},
        };
            nums[1][1] = 23;
        System.out.println(nums[1][1]);
    }
}