package Test2.Q10;

import Sort.Score.MyComparator;

public class MyArrays {
    public static void sort(Object[] arr, MyComparator myComparator) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr.length > 2) {
                for(int j=i+1; j<arr.length; j++){
                    Member member1 = null;
                    Member member2 = null;
                    if (arr[j] instanceof Member && arr[j] instanceof Member) {
                        member1 = (Member) arr[i];
                        member2 = (Member) arr[i];
                    }
                    if (member1.compareTo(member2) > 0) {
                        Object tempO = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tempO;
                    }
                }

            } else {
                return;
            }
        }

        //이거 object가 int형일 경우랑 String일 경우를 나눠서 overload 해야 하는거야?
        // 아니면 if문으로 판단해서 각각의 경우에서 연산하는거야?
    }

}
