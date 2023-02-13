public class main {

    public static void main(String[] args) {

        for(Months months: Months.values()){
            System.out.println(months.name());
        }

        System.out.println(Weekday.MONDAY.isWeekDay());
    }
}
