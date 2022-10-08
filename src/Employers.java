import javax.lang.model.type.NullType;
import java.security.InvalidParameterException;

public class Employers implements IValidateInput,IValidateInputNum{
    private String companyName;
    private float payRate;
    private String position;
    private int workingDays;

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        if(workingDays > 6 || workingDays < 0){
            throw new InvalidParameterException("Invalid input passed");
        }
        this.workingDays = workingDays;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        validateNumber(workingHours);
        this.workingHours = workingHours;
    }

    private float workingHours;

    public Employers() {
    }

    public Employers(String companyName, float payRate, String position,float workingHours,int workingDays) {
        if(workingDays > 6 || workingDays < 0){
            throw new InvalidParameterException("Invalid input passed");
        }
        this.companyName = validateString(companyName);
        validateNumber(payRate);
        validateNumber(workingHours);
        this.workingHours = workingHours;
        this.workingDays = workingDays;
        this.payRate = payRate;
        this.position = validateString(position);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = validateString(companyName);
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        validateNumber(payRate);
        this.payRate = payRate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {

        this.position = validateString(position);
    }

    @Override
    public String validateString(String input) {
        String expression = "//[`!@#$%^&*()_+-=[]{};':|,.<>/?~]/";
        if(input == null){
            throw new NullPointerException("Can't pass null");
        }
        if(input.contains(expression)){
            throw new IllegalArgumentException("You can't have special Character");
        }
        input = input.trim();

        return input;
    }

    @Override
    public void validateNumber(float input) {
        if (input <0){
            throw new IllegalArgumentException("You can't have negative");
        }
    }
}
