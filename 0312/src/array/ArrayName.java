package array;


public class ArrayName {
    public static void main(String[] args) {
        String[] names = new String[5]; // 참조형 변수 이므로 null

        inputNames(names); // call by reference
        outputNames(names);
    }
    public static void inputNames(String[] names){
        for(int i=0; i<names.length; i++){
            names[i] = "abc" + i;
        }
    }
    public static void outputNames(String[] names){
        for (String name : names) {
            System.out.println(name);
        }
    }
}
