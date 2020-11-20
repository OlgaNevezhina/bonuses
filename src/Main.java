public class Main {
    public static void main(String[] args) {
        int bill = 100;
        int enrollment = 3000;
        int amount;
        if (enrollment>=1000){
            amount = bill + enrollment + enrollment / 100;
        }else{
            amount = bill + enrollment;
        }
        System.out.println(amount);
    }
}
