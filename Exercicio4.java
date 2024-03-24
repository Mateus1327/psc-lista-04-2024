public class Exercicio4 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0; 

        double taxaCrescimentoA = 3; 
        double taxaCrescimentoB = 1.5; 


        while (popA < popB) {
            popA += popA * (taxaCrescimentoA / 100);
            popB += popB * (taxaCrescimentoB / 100);
            anos++; // incrementa os anos
        }

        System.out.println("População do país A: " + popA);
        System.out.println("População do país B: " + popB);
        System.out.println("O país A ultrapassou o país B após " + anos + " anos.");
        
    }
}