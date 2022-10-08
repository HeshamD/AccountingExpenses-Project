public class Main {
    public static void main(String[] args) {
        Employers CME_Group = new Employers("CME-Group",27.0f,"Software Engineer",30,3);
        Calculator CME_Group_Cal = new Calculator(CME_Group);
        System.out.println("Weekly: "+ CME_Group_Cal.expensesWeekly());
        System.out.println("Monthly: "+ CME_Group_Cal.expensesMonthly());
        System.out.println("Yearly: "+ CME_Group_Cal.expensesYearly()
        );
    }
}