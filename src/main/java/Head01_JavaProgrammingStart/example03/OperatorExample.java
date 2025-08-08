package Head01_JavaProgrammingStart.example03;

public class OperatorExample {
    public static void main(String[] args){
//        double temperature = 30;
//        if(temperature > 40) {
//            System.out.println("폭염입니다.");
//        } else if (temperature <= 40 && temperature > 20) {
//            System.out.println("So Hot");
//        } else if (temperature <= 20 && temperature > 10) {
//            System.out.println("So fresh , So cool");
//        } else {
//            System.out.println("Frezzing Cold");
        int day = 3;

        switch (day){
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
        }
    }
}
