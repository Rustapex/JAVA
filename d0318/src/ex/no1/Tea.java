package ex.no1;

public class Tea extends Drink{
    private String teaType;
    private int steepTime;

    public Tea(){
        super();
        this.teaType = null;
        this.steepTime = 0;
    }

    public Tea(String menuName, int price, String temp, int shotCount, String teaType, int steepTime){
        super(menuName, price, temp, shotCount);
        this.teaType = teaType;
        this.steepTime = steepTime;
    }

    private void setTeaType(String teaType){
        this.teaType = teaType;
    }
    private void setSteepTime(int steepTime){
        this.steepTime = steepTime;
    }

    public void steepTea(){
        String teaType;
        int steepTime;
        System.out.println("차를 더 우리시겠습니까? Y/N");
        String isSteep = sc.nextLine();
        if(isSteep.equals("Y")){
            System.out.println("우리기를 선택하셨습니다.");
            System.out.println("차의 종류를 입력하세요");
            teaType = sc.nextLine();
            setTeaType(teaType);
            System.out.println("차를 우릴 시간을 입력하세요");
            steepTime = Integer.parseInt(sc.nextLine());
            setSteepTime(steepTime);
            int newPrice = getPrice() + 2000;
            setPrice(newPrice);
            String newName = teaType + getMenuName();
            setMenuName(newName);
        } else{
            setTeaType("none");
            setSteepTime(0);
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", teaType ; " +teaType + ", steepTime : " + steepTime;
    }
}
