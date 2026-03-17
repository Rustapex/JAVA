package Variable;

public class InstanceVariable {

    /*instance variable 초기화 방법
    * 1. 아무것도도 명시하지 않으면 기본 값으로 초기화됨
    * 2. 명시 접촉 초기화 int kor = 100
    * 3. 최기화 블록() 인스턴스 초기화 블록
    * 4.
    * */
    String name;
    int age;
    int point = 100;

    /*생성자*/
    public InstanceVariable(String name, int age){{
        this.name = name;
        this.age = age;
    }

    }


}
