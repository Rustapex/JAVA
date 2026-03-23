package Test2.Q10;

public class MyArrays {
    public void sort(Object[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                MyComparable c1 = (MyComparable) arr[i];
                if(c1.compareTo(arr[j]) >0){
                    Object temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
