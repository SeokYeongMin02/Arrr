package Head01_JavaProgrammingStart.example05;

public class improvedForLoop {
    public static void main(String[] args) {
        int [] score = {90, 85, 42};

        for (int s : score){
            System.out.println("점수 : " + s);
        }
    }
}
