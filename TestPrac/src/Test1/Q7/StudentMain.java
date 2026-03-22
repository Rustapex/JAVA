package Test1.Q7;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("stu1", 100, 80);
        Student student2 = new Student("stu2", 60, 80);
        Student student3 = new Student("stu3", 80, 95);
        Student[] classroom = {student1, student2, student3};


        double avgScore = classroom[0].avgStudent();
        int highScoreIdx = -1;
        for (int i = 0; i < classroom.length; i++) {
            double eachAvg = classroom[i].avgStudent();
            System.out.println(classroom[i].toString());
            System.out.printf("%d번 학생 평균 : %.1f%n", (i + 1), eachAvg);
            if (avgScore <=eachAvg){
                avgScore = eachAvg;
                highScoreIdx = i;
            }
        }
        System.out.printf("가장 평균이 높은 학생의 이름 : %s%n", classroom[highScoreIdx].getName());
    }
}
