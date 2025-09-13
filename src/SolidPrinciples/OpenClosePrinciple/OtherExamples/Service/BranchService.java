package SolidPrinciples.OpenClosePrinciple.OtherExamples.Service;

import SolidPrinciples.OpenClosePrinciple.OtherExamples.implication.BranchEmployees;

import java.util.HashMap;
import java.util.List;

public class BranchService {

    public final HashMap<String, BranchEmployees> branchEmployees = new HashMap<>();


    public BranchService(List<BranchEmployees> BranchEmployees) {
        for (BranchEmployees branch : BranchEmployees) branchEmployees.put(branch.NameOfBranch(), branch);

    }

    public String GetNameBranch(String branchName) {
        BranchEmployees branch = branchEmployees.get(branchName);
        return branch.NameOfBranch();
    }

    public String GetEmployeeName(String NameBranch, String firstName, String lastName) {
        BranchEmployees branch = branchEmployees.get(NameBranch);
        return branch.NameOfEmployee(firstName, lastName);
    }


    public int AverageSalary(String NameBranch, int CountMonths, int TotalSalary) {
        BranchEmployees branch = branchEmployees.get(NameBranch);
        return branch.AverageSalary(CountMonths, TotalSalary);
    }
}
