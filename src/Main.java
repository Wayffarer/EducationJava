public class Main {
    public static void main(String[] args) {
//        Примеры работы методов
//        info("Hello");
//        String java="Java";
//        info(java);

//        short num=7;
//        int result1=summa((short)5,num);
//
//        short num2=13;
//        int result2=summa((short)4,num2);
//        info(String.valueOf(result2));

        byte[] nums1=new byte[]{5,6,8};

        int summ1=summaAray(nums1);
        System.out.println("Сумма: "+summ1);

        byte[] nums2=new byte[]{5,12,5,32,6,8};

        int summ2=summaAray(nums2);
        System.out.println("Сумма: "+summ2);
    }

    public static int summaAray(byte[] arr){
        int summa=0;
        for(byte i =0; i<arr.length;i++){
            summa +=arr[i];
        }
        return summa;
    }

//    public static int summa(short a, short b){
//        int res= a+b;
//        String result="Результат: "+res;
//        info(result);
//        return res;
//    }
//    public static void info(String word){
//        System.out.print(word);
//        System.out.println("!");
//    }
}