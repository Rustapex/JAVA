package 실기시험손영석.Q5;

public class Q5 {
    public static void printHelloJava(char[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o',' ','j','a','v','a'};
        printHelloJava(arr);
    }

}
