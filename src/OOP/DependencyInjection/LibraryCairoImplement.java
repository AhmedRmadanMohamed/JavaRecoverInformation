package OOP.DependencyInjection;

public class LibraryCairoImplement implements  LibraryInformation {
    @Override
    public String libraryName(String Name) {
        return Name;
    }

    @Override
    public String address(String Name) {
        return Name;
    }

    @Override
    public int countEmployees(int Count) {
        return Count;
    }
}
