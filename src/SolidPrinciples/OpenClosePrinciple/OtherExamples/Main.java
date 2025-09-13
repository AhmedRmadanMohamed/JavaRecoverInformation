package SolidPrinciples.OpenClosePrinciple.OtherExamples;

import SolidPrinciples.OpenClosePrinciple.OtherExamples.BusinessLogic.AmericaBranch;
import SolidPrinciples.OpenClosePrinciple.OtherExamples.BusinessLogic.AustraliaBranch;
import SolidPrinciples.OpenClosePrinciple.OtherExamples.BusinessLogic.CanadaBranch;
import SolidPrinciples.OpenClosePrinciple.OtherExamples.BusinessLogic.EgyptBranch;
import SolidPrinciples.OpenClosePrinciple.OtherExamples.Service.BranchService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BranchService branchService = new BranchService(List.of(new AustraliaBranch(),
                new CanadaBranch(), new EgyptBranch() , new AmericaBranch()));
        System.out.println(branchService.GetEmployeeName("CanadaBranch" , "Ahmed" , "Ramadan")
        +" ---------->"+branchService.AverageSalary("CanadaBranch" , 12, 350000));
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(branchService.GetEmployeeName("AmericaBranch" , "Ahmed" , "Ramadan")
                +" ---------->"+branchService.AverageSalary("CanadaBranch" , 12, 350000));


    }
}
