package array;

import java.util.Arrays;

public class FindFirstname {
    public static void main(String[] args) {
        String[] names = {
                "김건희","고지연","김민정","황스일","이현겸",
                "이용찬","여도현","장해든","박세인","나해수",
                "손영석","송주창","정철진","김재민","엄진희",
                "이정하","김민경","조아진","장윤성","김태준"
        };

        System.out.println(Arrays.toString(names));
        System.out.printf("여기서 성씨가 %s인 사람 수는 : %d", "박", findFirstName(names, "박"));


    }
    public static int findFirstName(String[] names, String firstname){
        int cnt=0;
        for(int i=0; i<names.length; i++){
            if (names[i].startsWith(firstname)) {
                cnt++;
            }
        }
        return cnt;
    }
}
