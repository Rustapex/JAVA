package array;

import java.util.Arrays;

public class array1D {
    public static void main(String[] args) {

        // str1 : 원본 배열
        String[] str1 = {"Java", "Spring", "SQL"};

        // str2 : str1을 "그대로 참조"하는 배열
        // 새 배열이 만들어지는 것이 아니라, 같은 배열을 같이 바라보는 상태
        String[] str2 = str1;

        // str3 : str1의 내용을 이용해서 "새로운 배열"을 만든 것
        // 배열 자체는 새로 생성됨
        // 즉, str1과 str3는 서로 다른 배열 객체
        String[] str3 = Arrays.copyOf(str1, str1.length);

        System.out.println("=== 처음 상태 ===");
        printArrayInfo("str1", str1);
        printArrayInfo("str2", str2);
        printArrayInfo("str3", str3);

        System.out.println();
        System.out.println("=== 배열 자체 비교 ===");

        // == 는 "값 비교"가 아니라 "같은 대상을 가리키는가"를 확인
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str2 == str3 : " + (str2 == str3));

        System.out.println();
        System.out.println("=== 배열 안의 각 요소 비교 ===");

        // 여기서는 배열의 0번 요소가 같은 String 객체를 참조하는지 확인
        // String 리터럴은 같은 객체를 재사용하는 경우가 많아서 true가 나올 수 있음
        System.out.println("str1[0] == str2[0] : " + (str1[0] == str2[0]));
        System.out.println("str1[0] == str3[0] : " + (str1[0] == str3[0]));

        System.out.println();
        System.out.println("=== str2를 통해 값 변경 ===");

        // str2는 str1과 같은 배열을 참조하므로
        // str2로 값을 바꾸면 str1도 같이 바뀜
        str2[1] = "JPA";

        System.out.println("str2[1] = \"JPA\" 실행 후");
        printArrayInfo("str1", str1);
        printArrayInfo("str2", str2);
        printArrayInfo("str3", str3);

        System.out.println();
        System.out.println("=== str3를 통해 값 변경 ===");

        // str3는 별도의 새 배열이므로
        // str3의 요소를 바꿔도 str1, str2에는 영향이 없음
        str3[2] = "Python";

        System.out.println("str3[2] = \"Python\" 실행 후");
        printArrayInfo("str1", str1);
        printArrayInfo("str2", str2);
        printArrayInfo("str3", str3);

        System.out.println();
        System.out.println("=== 정리 ===");
        System.out.println("1. str2는 str1과 같은 배열을 참조한다.");
        System.out.println("2. str3는 str1의 내용을 복사해서 만든 '새 배열'이다.");
        System.out.println("3. 그래서 str2 수정은 str1에도 반영되지만, str3 수정은 str1에 반영되지 않는다.");
    }

    // 배열 이름과 내용을 출력하는 메서드
    public static void printArrayInfo(String arrayName, String[] arr) {
        System.out.println(arrayName + " 내용 : " + Arrays.toString(arr));
    }
}