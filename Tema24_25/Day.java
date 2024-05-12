package Tema24_25;

//Create a method that takes a Day enum as a parameter and uses a
//switch case statement to print a message depending on the day input.
public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thurday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String ziASaptamanii;

    Day(String ziASaptamanii){
        this.ziASaptamanii = ziASaptamanii;
    }
    String getZiASaptamanii(){
        return ziASaptamanii;
    }

    public static void afiseazaZiua(Day day){
        switch(day){
            case MONDAY -> System.out.println("I will wake up early today");
            case TUESDAY -> System.out.println("I have dance classes");
            case WEDNESDAY -> System.out.println("Meeting my old pals at 5 o'clock");
            case THURSDAY -> System.out.println("I am going to spend more time programming");
            case FRIDAY -> System.out.println("Ready for a party tonight");
            case SATURDAY -> System.out.println("Really need to relax a bit");
            case SUNDAY -> System.out.println("Let's clean the house");
        }
    }
}
