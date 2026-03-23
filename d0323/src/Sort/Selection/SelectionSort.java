package Sort.Selection;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {95, 75, 85, 100, 50};



//        tmp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = tmp;


        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("\n 정렬 후 ==>");
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
