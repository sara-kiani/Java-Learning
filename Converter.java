
class Converter {
    public static String converter(int number){
        return Integer.toString(number);
    }
    public static int convert(String str) {
        return Integer.parseInt(str);
    }

    public static int convert(double number) {
        return (int) Math.round(number);
    }

    public static int convert(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(convert(123));
        System.out.println(convert("456"));
        System.out.println(convert(7.8));
        System.out.println(convert(10, 20));
    }
}
