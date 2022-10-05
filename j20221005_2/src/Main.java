/*
 Создать массив с первыми 10-тью четными числами
 начиная от заданного числа start
 */
public class Main {
    public static void main(String[] args) {
        int[] arr=getArrayWithEvenNumbers(9);
        print(arr);
        System.out.println("----------------------");
        int[] arr2= getArrayWithEvenNumbers(100,100);
        print(arr2);

    }

    public static void print (int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("["+i+"]=" + arr[i]);
        }
    }

    public static int[] getArrayWithEvenNumbers(int start) {
        int[] result = new int[10];
        start = start % 2 != 0 ? start + 1 : start;
        for (int i = 0; i < result.length; i++) {
            result[i] = start;
            start += 2;
        }
        return result;
    }


    public static int[] getArrayWithEvenNumbers(int start, int size) {
        int[] result = new int[size];
        start = start % 2 != 0 ? start + 1 : start;
        for (int i = 0; i < result.length; i++) {
            result[i] = start;
            start += 2;
        }
        return result;
    }

}