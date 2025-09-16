package OOP.DependencyInjection;

public class LibraryService {

    private final LibraryInformation libraryInformation;

    public LibraryService(LibraryInformation libraryInformation) {
        this.libraryInformation = libraryInformation;
    }


    public String libraryName(String Name) {
        return libraryInformation.libraryName(Name);
    }

    public int countEmployees(int Count) {
        return libraryInformation.countEmployees(Count);
    }

    public String address(String Address) {
        return libraryInformation.address(Address);
    }

}
