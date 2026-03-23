package MyArray;

public class MyArrays {


    /*객체가 정렬의 기준을 구현할 수 있도록 하기
    * MyComparable*/
    public static void sort(Object[] object) {
        for(int i=0; i<object.length-1; i++){
            for(int j=i+1; j< object.length; j++){
                if(((MyComparable)object[i]).compareTo(object[j])>0){
                    //기준이 크면, 양수가 전달 되었음

                    Object tmp = object[i];
                    object[i] = object[j];
                    object[j] = tmp;
                }

            }
        }

    }
//    정렬의 기준을MMy comp
    public static void sort(Object object,MyComparator c){}

}
