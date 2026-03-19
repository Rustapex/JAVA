package object.String;

public class ComparisonString {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        /*
String 비교 메서드 : 기준문자열.compareTo(비교문자열)

의미
- 두 문자열을 사전 순(유니코드 순)으로 비교한다.
- 문자열 내용이 같으면 0 반환
- 기준 문자열이 비교 문자열보다 사전 순으로 뒤에 있으면 양수 반환
- 기준 문자열이 비교 문자열보다 사전 순으로 앞에 있으면 음수 반환

쉽게 생각하기
- "기준문자열 - 비교문자열"의 위치 관계를 알려주는 느낌
- 기준이 더 크면 양수
- 기준이 더 작으면 음수
- 같으면 0
비교 방법
- 문자열의 첫 글자부터 한 글자씩 비교한다.
- 다른 글자가 처음 나오는 지점에서 결과가 결정된다.
- 앞부분이 모두 같으면 길이 차이로 비교된다.

예시
"ab".compareTo("abc") -> 음수
// 앞의 "ab"까지는 같음
// 그런데 기준 문자열이 더 짧으므로 앞에 온다고 판단

주의
- 대문자와 소문자는 다르게 비교된다.
- 유니코드 값을 기준으로 비교하므로
  "A"와 "a"는 같지 않다.

예시
"A".compareTo("a") -> 음수
// 대문자 A가 소문자 a보다 앞에 위치

언제 사용?
- 문자열 정렬 기준을 만들 때
- 두 문자열의 크고 작음을 비교할 때
- 사전 순으로 앞/뒤를 판단할 때
*/


        System.out.printf("%s 와 %s의 두 문자열 중 %s가 %s보다 앞에 있으면 양수, 아니면 음수  %d%n", str1, str2, str1, str2,
                str1.compareTo(str2));

        String[] arr = {"banana", "apple", "tomato"};
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        /*Arrays.sort(arr)*/
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }


}
