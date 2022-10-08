public class ExpensesCategories {
    private String expenseCategoryTitle;

    public ExpensesCategories(String expenseCategoryTitle){
        expenseCategoryTitle = expenseCategoryTitle.trim();
        this.expenseCategoryTitle = expenseCategoryTitle;
    }

    public String getExpenseCategoryTitle() {
        return this.expenseCategoryTitle;
    }

    public void setExpenseCategoryTitle(String expenseCategoryTitle) {
        this.expenseCategoryTitle = expenseCategoryTitle;
    }
}
