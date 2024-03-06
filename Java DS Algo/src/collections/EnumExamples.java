package collections;

public class EnumExamples {

//    enum Week{
//        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
//    }
    public static void main(String[] args) {
        for(Week day:Week.values()){
            System.out.println(day.num);
        }
    }
}

enum Week{
    Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Saturday(6),Sunday(7);
    int num;
    Week(int num){
        this.num=num;
    }
}
