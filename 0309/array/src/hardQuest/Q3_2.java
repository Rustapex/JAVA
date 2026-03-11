package hardQuest;

public class Q3_2 {
    public static void main(String[] args) {
        int[] Temperatures = {33, 35, 32, 35, 36, 35, 34};
        int sum=0, avgPCnt=0; // avgPCnt : 평균보다 큰 수의 개수 처음에는 0개니까 0으로 초기화
        double avg;
        
//      향상된 for문   
        
//      Temperatures 배열 안에 있는 모든 값 sum에 더하기
        for (int temperature : Temperatures) {
            sum += temperature;
        }
//      위에 코드와 같은 의미의 코드
//      for(int i=0; i< Temperatures.length; i++){
//          sum = sum + Temperatures[i];
//      }  
        
//      avg 가 double형 자료형, sum 과 Temperature은 int형 자료형 
//      그래서 int형 자료 끼리 연산(나눈셈_하면 소수점 부분이 사라진다. -> 그래서 sum을 double형 자료형으로 명시적 형변환
        avg = (double) sum / Temperatures.length;
        
//      모든 값을 돌면서 비교
        for(int i=0; i<Temperatures.length; i++){
//          avg가 double형이니까 형변환 후 대소 비교(평균보다 큰지 비교)
//          위에 설명한 내용과 같은 이유로 형변환(사실 표현 범위 double형 > int형 이라서 자동 형변환 됨)
            if(avg < (double) Temperatures[i] ){
                avgPCnt++; // 평균보다 크다면 개수 하나 추가 avgPCnt = avgPCnt +1; 과 같은 의미
            }
        }
        System.out.printf("배열의 평균 값 %.2f 보다 더 큰 수의 개수는 : %d개 ",
                avg, avgPCnt);
//      이것도 format 출력인데 %.2f가 소숫점 둘째자리 까지만 출력하는거  
//      avg, avgPCnt 평균과 평균보다 큰 수의 개수 출력

    }
}
