package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 1;
        while (i <= printToInclusive) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
