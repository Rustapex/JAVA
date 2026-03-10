package array;

public class arrayDef1 {
    public static void main(String[] args) {


        /*new 의미 : 메모리 할당(할당당 메모리의 시작 주소 반환)
         * C : malloc(size)
         *
         * 참조형 변수 : (배열 객체 문자열) 주소를 저장하는 변수를 말한다.
         * 기본형 변수 : 값을 복사해와서 저장하는 변수를 말한다.*/


        // 1. 배열 참조변수만 선언
        // 아직 실제 배열은 만들어지지 않았다.
        int[] arr1;

        // arr1은 지금 "int 배열을 가리킬 수 있는 변수"일 뿐이다.
        // 아직 new를 사용하지 않았기 때문에 실제 배열 공간은 없다.


        // 2. new를 사용해서 int 5칸짜리 배열 생성
        int[] kors = new int[5];

        // new int[5]의 의미:
        // - int 값을 5개 저장할 수 있는 새로운 배열을 메모리에 만든다.
        // - int 배열이므로 각 칸은 기본값 0으로 자동 초기화된다.
        // - 만들어진 배열을 kors가 참조(가리킴)한다.


        // 3. 배열 생성 직후 기본값 확인
        System.out.println("배열 생성 직후");
        System.out.println("kors[0] = " + kors[0]);
        System.out.println("kors[1] = " + kors[1]);
        System.out.println("kors[2] = " + kors[2]);
        System.out.println("kors[3] = " + kors[3]);
        System.out.println("kors[4] = " + kors[4]);

        // 출력 결과는 모두 0
        // 이유: int 배열은 생성되면 각 칸이 기본값 0으로 초기화됨


        // 4. 각 칸에 값 저장
        kors[0] = 90;
        kors[1] = 85;
        kors[2] = 100;
        kors[3] = 70;
        kors[4] = 95;

        System.out.println();
        System.out.println("값 저장 후");
        System.out.println("kors[0] = " + kors[0]);
        System.out.println("kors[1] = " + kors[1]);
        System.out.println("kors[2] = " + kors[2]);
        System.out.println("kors[3] = " + kors[3]);
        System.out.println("kors[4] = " + kors[4]);


        // 5. 배열 길이 확인
        System.out.println();
        System.out.println("배열의 길이 = " + kors.length);

        // kors.length는 배열의 칸 수를 의미한다.
        // new int[5]로 만들었으므로 길이는 5다.


    }
}
