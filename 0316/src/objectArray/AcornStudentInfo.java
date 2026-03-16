package objectArray;

public class AcornStudentInfo {
    public static void main(String[] args) {
        AcornStudent stu1 = new AcornStudent("Lisa", 50,50,60,60);
        AcornStudent stu2 = new AcornStudent("Matteo", 60,40,80,70);
        AcornStudent stu3 = new AcornStudent("Paco", 70,50,90,100);
        AcornStudent stu4 = new AcornStudent("Timid", 80,80,100,50);

        AcornStudent[] studentList = new AcornStudent[4];
        /*객체가 만들어진 것이 아니다. 참조형 변수를 배열로 만든 것*/
        studentList = new AcornStudent[]{stu1, stu2, stu3, stu4};

        for(int i=0; i<studentList.length; i++){
            studentList[i].printInfo();
            System.out.println();
        }

        AcornStudent[] studentList2 = {stu1, stu2, stu3, stu4};

        for(int i=0; i<studentList2.length; i++){
            studentList[i].printInfo();
            System.out.println();
        }

        AcornStudent[] studentList3 = new AcornStudent[19];
        studentList3[0] = new AcornStudent("Lisa", 50,50,60,60);
        studentList3[1] = new AcornStudent("Matteo", 60,40,80,70);
        studentList3[2] = new AcornStudent("Paco", 70,50,90,100);
        studentList3[3] = new AcornStudent("Timid", 80,80,100,50);

        for(int i=0; i<studentList3.length; i++){
            studentList[i].printInfo();
            System.out.println();
        }






    }
}
