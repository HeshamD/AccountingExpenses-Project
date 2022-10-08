import java.security.InvalidParameterException;

public class Expense implements IExpense{
    private String title;
    private double price;
    private double expenseWeekly;

    //composite Relationship
    private ExpensesCategories expenseCategory;

    //just example of Abstraction & Encapsulation
    private String normalizeString(String s){
        s = s.trim();
        return s;
    }

    public double getExpenseWeekly() {
        return this.expenseWeekly;
    }

    private double calculateExpenseWeekly() {
        this.expenseWeekly = this.expenseWeekly + price;
        return this.expenseWeekly;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = normalizeString(title);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //this way we use getters & setters // for validation
        if(price < 0){
            throw new InvalidParameterException("Price shouldn't be zero");
        }
        this.price = price;
    }

    @Override
    public void setExpenseCategory(ExpensesCategories category){
        this.expenseCategory = category;
    }


}
