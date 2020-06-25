public class ConditionExample2 {

    public static void main(String[] args) {
        int value = -7;
//        if (value == 0) {
//            System.out.println("Число равно 0");
//        } else if (value > 0) {
//            System.out.println("Число положительное");
//        } else {
//            System.out.println("Число отрицательное");
//        }

//         byte, short, int, char, String, enum
        switch (value) {
            case -10:
            case -8:
            case -7:
                System.out.println("Число отрицательное");
                break;
            case 0:
                System.out.println("Число равно 0");
                break;
            case 10:
                System.out.println("Число положительное");
                break;
            default:
                System.out.println("Нет такого варианта!");
                break;
        }
    }
}
