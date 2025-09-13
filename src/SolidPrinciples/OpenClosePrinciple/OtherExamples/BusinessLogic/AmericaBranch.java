package SolidPrinciples.OpenClosePrinciple.OtherExamples.BusinessLogic;

import SolidPrinciples.OpenClosePrinciple.OtherExamples.implication.BranchEmployees;

public class AmericaBranch implements BranchEmployees {
    @Override
    public String NameOfBranch() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String NameOfEmployee(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    @Override
    public int AverageSalary(int CountMonths, int TotalSalary) {
        return TotalSalary / CountMonths;
    }

}
