package RecordKayWord;

public class Main {
    public static void main(String[] args) {
        RecordForExample recordForExample = new RecordForExample("Ahmed", 18);
        System.out.println(recordForExample.Name() + " ------> " + recordForExample.Age());
        recordForExample.Method1();
    }
}
