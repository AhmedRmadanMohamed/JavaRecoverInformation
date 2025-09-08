package EnumKayWord;

public class EnumExampleMethods {

    public void MethodEnumShapeSimple() {

        EnumKayWordShapeSimple simple = EnumKayWordShapeSimple.FRIDAY;
        if (simple == EnumKayWordShapeSimple.MONDAY) {
            System.out.println("EnumKayWordShapeSimple.MONDAY");
        }
        if (simple == EnumKayWordShapeSimple.FRIDAY) {
            assert simple.equals(EnumKayWordShapeSimple.MONDAY) : "EnumKayWordShapeSimple.FRIDAY";
            System.out.println("EnumKayWordShapeSimple.FRIDAY");
        }


    }


    public void MethodEnumShapeMethod() {
        EnumKayWordShapeMethodicalness enumKayWordShapeMethodicalness = EnumKayWordShapeMethodicalness.ACTIVE;


        switch (enumKayWordShapeMethodicalness) {
            case ACTIVE -> System.out.println("EnumKayWordShapeMethodicalness.ACTIVE");
            case INACTIVE -> System.out.println("EnumKayWordShapeMethodicalness.INACTIVE");
            case PENDING -> System.out.println("EnumKayWordShapeMethodicalness.PENDING");
            default -> System.out.println("Enum value not recognized");
        }

    }


}
