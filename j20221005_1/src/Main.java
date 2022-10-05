public class Main {
    public static void main(String[] args) {
        int[] arr = { 13,6,9,1,0,8,2};


        // i=0...7
        print(arr);
        System.out.println("------------------");
        arr[4]=100;
        print(arr);
        System.out.println("-------------------");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=1;
        }
        print(arr);
        System.out.println(" ---- print revers ----------");
        printRevers(arr);


        System.out.println("-------------- print arr2 ------------");
        int[] arr2 = new int[10];
        print(arr2);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("["+i+"]=" + arr[i]);
        }
    }

    public static void printRevers(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println("["+i+"]=" + arr[i]);
        }
    }

}