import java.util.Scanner;
public class beecrowd1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double area, n, raio;
        raio = sc.nextDouble();
        n = 3.14159;
        area = (raio*raio)*n;
        System.out.printf("A=%.4f\n", area);

        sc.close();
    }
    
}
