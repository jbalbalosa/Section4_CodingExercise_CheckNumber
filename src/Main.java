public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("-- Udemy: Java Programming Masterclass --");
        System.out.println("-- Expressions and Statements          --");
        System.out.println("-- Code Blocks                         --");
        System.out.println("-----------------------------------------");

        checkNumber(0);

    }

    public static void checkNumber(int number){
        String value = "zero";
        if(number > 0) {
            value = "positive";
        } else if (number < 0 ){
            value = "negative";
        }
        System.out.println(value);
    }
}