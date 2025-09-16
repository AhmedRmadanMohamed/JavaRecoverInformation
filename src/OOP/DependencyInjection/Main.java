package OOP.DependencyInjection;

public class Main {
    public static void main(String[] args) {
        LibraryInformation libraryInformation = new LibraryCairoImplement();
        LibraryService libraryService = new LibraryService(libraryInformation); // this manual DI
        //if need inject this methods on other class add class and inject libraryInformation

        System.out.println(libraryService.libraryName("NameCairo") + "     &&    " + libraryService.address("NY") + "       &&   " + libraryService.countEmployees(20));


    }
}
