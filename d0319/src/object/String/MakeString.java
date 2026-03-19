package object.String;

public class MakeString {
    public static void main(String[] args) {

        // literal 영역 str0, str1 저장되고 공유하면서 사용 (내용 , 주소 같음)

        String str0 = "hello";
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = new String("hello"); //new heap memories 사용 (내용은 같을 수 있어도 주소 다름)
        String[] strings = {str0, str1, str2, str3};

        // 두 문자열의 주소와 내용이 같은가?
        if(str2.equals(str3)){ // 두 문자열의 내용 비교
            System.out.println("내용이같다.");
        }

        for(int i=0; i<strings.length-1; i++){
            System.out.printf("str%d 와 str%d의 내용이같은가?(T/F) : %b%n",i, (i+1), strings[i].equals(strings[i+1]));
            System.out.printf("str%d 와 str%d의 주소가 같은가?(T/F) : %b%n", i, (i+1), (strings[i] == strings[i+1]));
        }


    }
}
