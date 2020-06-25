public class FunctionExample3 {

//  [модификаторы] возвращ. название([параметры]) {//}
    public static void main(String[] args) {
        int value;
        value = 10;
//        if (value == 0) {
//            System.out.println("Число равно 0");
//        } else if (value > 0) {
//            System.out.println("Число положительное");
//        } else {
//            System.out.println("Число отрицательное");
//        }
//        char ttt = 't';
        boolean test = isPositive(100, 't');
        System.out.println(test);
    }

    public static boolean isPositive(int value, char charValue) {
        return value > 0;
//        if (test) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
