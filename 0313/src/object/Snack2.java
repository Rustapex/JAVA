package object;

/* 1. 캡슐화
 *
 * - 클래스 내부의 필드와 메서드를 하나로 묶고,
 *   외부에서 필드에 직접 접근하지 못하도록 제한하는 객체지향의 특징이다.
 * - 필드를 private으로 선언하여 데이터를 보호하고,
 *   public 메서드를 통해 안전하게 접근하도록 한다.
 * - 이를 통해 데이터의 일관성을 유지하고 잘못된 값의 저장을 방지할 수 있다.
 * - 생성자는 객체 생성 시 필드를 초기화하여 객체가 정상적인 상태로 시작하게 한다.
 */
public class Snack2 {
        /*1. 사용자 정의 자료형 */
        private String sName;
        private String sCompany;
        private int sCalories;
        private int sGram;

        // 객체 자신의 필드에 값을 저장하는 인스턴스 메서드
        public void input(String sName, String sCompany, int sCalories, int sGram) {
                this.sName = sName;
                this.sCompany = sCompany;
                this.sCalories = sCalories;
                this.sGram = sGram;
        }
        // 객체 자신의 정보를 출력하는 인스턴스 메서드
        public void print(){
                System.out.println(this.sName);
                System.out.println(this.sCompany);
                System.out.println(this.sCalories);
                System.out.println(this.sGram);
        }
    }

