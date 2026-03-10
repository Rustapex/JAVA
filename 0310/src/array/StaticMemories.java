package array;

import java.util.Scanner;

public class StaticMemories {
    public static void main(String[] args) {

        /*스택(Stack) : Function(method) 안에서 만들어지는 변수들이 사용하는 공간
        - 호출 시 생성 이후 반환 이후 해제(자원반환) 됨
        보통 : 지역변수, 참조변수 자체가 들어감
        아래 하단 코드에서 변수 a,와 arr라는 배열을 가리키는 참조변수
        a = 10
        arr = */

        /*힙(Heap) : 메모리 요청, 메모리 반납 garbage collector가 함
        - new에 의해서만 힙 메모리 사용
        - new : 메모리 할당 요청, 메모리 할당하고 할당됟 메모리의 시작 주소를 반환
            -java에서 배열부터는 new로 heap memories를 사용해 개발
        - Grabage collector : 메모리 반납 수행(프로그램)
        * new로 만든 배열, 객체가 들어간다
        *   arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            ;*/







        /*정적 메모리 : 프로그램 실행 전 메모리의 크기가 정해짐*/
        int a1 = 10;
        int a2 = 20;
        System.out.println(a1);
        System.out.println(a2);

        /*동적 메모리 : 실행 도중에 필요한 크기만큼 새 공간을 만드는 것*/

        int[] kors = new int[5]; //처음 : kors ->[0,0,0]
        kors[0] = 1;
        kors[1] = 2;
        kors[2] = 3; // kors -> [1,2,3]
        /*동적 메모리라고 하는 이유
            new int[3]
            new int[5]
            new int[100]
        이렇게 실행할 때마다 필요한 크기의 배열을 새로 만들어.
        즉 프로그램이 실행되면서
        “그때그때 필요한 크기의 공간을 생성” 하는 거라서 동적이라고 이해하면 돼.
        */

        /*kors라는 참조변수가 생김
        new int[5]로 실제 배열이 메모리에 생성됨
        kors는 그 배열을 가리킴
        배열 본체는 new로 따로 생성*/

        /*new : 실행 도중에 메모리에 새로운 배열 공간을 만든다”는 뜻이야.
        이걸 초심자용으로 보통 동적 메모리 사용이라고 설명해.
        왜냐하면 배열 크기만큼 실제 공간을 실행 시점에 만들기 때문이야.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 입력: ");
        int arrSize = sc.nextInt();
        int[] arr1 = new int[arrSize];

        for (int i : arr1) {
            System.out.println("i = " + i);
        }

    }

}
