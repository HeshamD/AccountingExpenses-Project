public class Calculator {
    private Employers employerService;
    //Injection
    public Calculator(Employers _employerService){
        employerService = _employerService;
    }
    public float expensesWeekly(){
        return employerService.getPayRate()*employerService.getWorkingHours()*employerService.getWorkingDays();
    }
    public float expensesMonthly(){
        return 4*expensesWeekly();
    }
    public double expensesYearly(){
        return expensesMonthly()*12;
    }
}
