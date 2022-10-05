public class Main {
    public static void main(String[] args) {
        int[] arr= {-5,2,-1,7,-3,9,0,-10};
        print(arr);
        System.out.println(min(arr));
        swap(arr, 0,min(arr));
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "]=" + arr[i] +"  ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;



    }

    public static int min(int[] arr) {
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
   }
}

