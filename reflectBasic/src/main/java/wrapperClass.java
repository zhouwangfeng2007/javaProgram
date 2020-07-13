public class wrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer iInteger = new Integer(10);
        int b = iInteger.intValue();
        int c = iInteger.parseInt("10");
        Integer.parseInt("10");

        System.out.println(Boolean.parseBoolean("0"));
        System.out.println(Boolean.parseBoolean("1"));


    }
}
