public class Main {
    public static void main(String[] args) {
        int bill = 100;
        int enrollment = 3000;
        if (enrollment>=1000){
            int amount = bill + enrollment + enrollment / 100;
            System.out.println(amount);
        }else{
            int amount = bill + enrollment;
            System.out.println(amount);
        }
    }
}
