public class EnumDemo {
    public void EnumDemoBasic()
    {

        enum Season {SUMMER,WINTER,SPRING,RAINY}
        enum Month {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
        enum Day {SUN,MON,TUE,WED,THU,FRI,SAT}

        Season vacation;
        Month birthMonth;
        Day birthDay;

        vacation = Season.WINTER;
        birthMonth = Month.JAN;
        birthDay = Day.TUE;

        System.out.println("I was born in the month of ");
        System.out.println(birthMonth);
        System.out.println("The day was");
        System.out.println(birthDay);
        System.out.println(birthMonth);
        System.out.println("is the");
        System.out.println(birthMonth.ordinal());
        System.out.println("-th month of the year");



    }
}
