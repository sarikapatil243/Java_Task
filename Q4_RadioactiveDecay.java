import java.util.Scanner;

public class Q4_RadioactiveDecay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass of the material:");
        double mass = scanner.nextDouble();
        System.out.println("Enter the half-life time in years:");
        double halfLife = scanner.nextDouble();
        System.out.println("Enter the number of half-lives:");
        int numHalfLives = scanner.nextInt();
        double[] result = decayMass(mass, halfLife, numHalfLives);
        System.out.println("Remaining Mass: " + result[0] + ", Years: " + result[1]);
    }

    public static double[] decayMass(double mass, double halfLife, int numHalfLives) {
        double remainingMass = mass * Math.pow(0.5, numHalfLives);
        double years = halfLife * numHalfLives;
        return new double[]{remainingMass, years};
    }
}