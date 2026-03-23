package MyArray;

public interface MyComparator {
    /*두 객체를 비교한 후 in값 반환
    * => 양수이면 두 객체를 교환함.*/
    public int compare(Object o1, Object o2);
}
