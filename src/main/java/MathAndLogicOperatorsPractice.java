public class MathAndLogicOperatorsPractice {

   public static void main(String[] args) {
        int Aint = 10;
        int Bint = 20;
        boolean Abln = true;
        boolean Bbln = false;
        double Cdbl = 13.54321;


        System.out.println("\nМатематические операторы. a=10 and b=20");
        System.out.println("b - a = " + (Bint - Aint));
        System.out.println("b * a = " + (Bint * Aint));
        System.out.println("b / a = " + (Bint / Aint));
        System.out.println("a % b = " + (Aint % Bint));
        System.out.println("b++ = " + (++Bint));
        System.out.println("b-- = " + (--Bint));

        System.out.println("\nОператоры сравнения");
        System.out.println("a = b - " + (Aint == Bint));
        System.out.println("a не равно b - " + (Aint != Bint));
        System.out.println("a > b - " + (Aint > Bint));
        System.out.println("a < b - " + (Aint < Bint));
        System.out.println("a >= b - " + (Aint >= Bint));
        System.out.println("a <= b - " + (Aint <= Bint));

        System.out.println("\nПереполнение по типам данных");
        System.out.println("Перепеоление byte до 128 результат = " + ((byte) (128)));
        System.out.println("Перепеоление byte до -129 результат = " + ((byte) (-129)));
        System.out.println("Перепеоление short до 32768 результат = " + ((short) (32768)));
        System.out.println("Перепеоление short до -32769 результат = " + ((short) (-32769)));
        System.out.println("Перепеоление long до 9223372036854775808 результат = " + ((long) (9223372036854775807L + 1)));
        System.out.println("Перепеоление long до -9223372036854775809 результат = " + ((long) (-9223372036854775808L - 1)));
        System.out.println("Перепеоление положительного максимума float результат = " + ((float) (3.4028235 * Math.pow(10, 38) * 2)));
        System.out.println("Перепеоление отрицательного максимума double результат = " + ((double) (-1.7976931348623157 * Math.pow(10, 308) * 2)));

        System.out.println("\nЛогические операторы. a=true and b=false");
        System.out.println("a И b истина или ложь - " + (Abln && Bbln));
        System.out.println("a ИЛИ b истина или ложь - " + (Abln || Bbln));
        System.out.println("Противоположное (логический оператор НЕ) для (a И b) истина или ложь - " + (!(Abln && Bbln)));

        System.out.println("\nВычимление комбинаций типов данных int и double. a=10 и с=13.54321");
        System.out.println("с - a = " + (Cdbl - Aint));
        System.out.println("c * a = " + (Cdbl * Aint));
        System.out.println("c / a = " + (Cdbl / Aint));
        System.out.println("c % a = " + (Cdbl % Aint));
    }


}
