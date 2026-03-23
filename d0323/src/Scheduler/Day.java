package Scheduler;

// 일정정보 한 개 저장 타입 설계
// public Class Day extends Object
public class Day {
    private String name;
    private String time;

    public Day(){
        this.name = "DayName";
        this.time = "12:00";
    }

    public Day(String name, String time) {
//        super(); object 의 클래스 상속받음(자동)
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "일정명: " + name + ", 시간: " + time;
    }
}

