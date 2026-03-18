package Practice;

public class FamilyMain {
    public static void main(String[] args) {
        GrandParent[] family = new GrandParent[3];

        family[0] = new GrandParent();
        family[1] = new Parent(); // upcasting
        family[2] = new Child();  // upcasting

        for (int i = 0; i < family.length; i++) {

            System.out.println(family[i].toString());

            /*부모형으로 참조시 부모 클래스에 있는 메서드만 보인다.*/
            family[i].sayHello();
//                family[i].work(); 불가능(자식[Parent]의 메서드 사용 x)
//                family[i].study(); 불가능(자식[Parent]의 자식[Child] 메서드 사용 x

            if (family[i] instanceof Child) {
                Child child = (Child) family[i];
                child.study();
                System.out.println("-------------------");
                child.showAllInfo();
                System.out.println("-------------------");
            } else if (family[i] instanceof Parent) {
                Parent parent = (Parent) family[i];
                parent.work();
            }
            System.out.println();
        }
    }
}
