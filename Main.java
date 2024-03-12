public class Main
{
    public static void main(String[] args)
    {
        float x = -2;
        float resultado1 = 4 + 3 * x + 5 * x - 10 -x;
        float resultado2 = 5 * x - 4 * x + 10 * x - 10 * x;
        float resultado3 = 10 * x - 20 * x + 10 / x + 5 * x - 3 * x;
        
        System.out.println("O total da equação é: " + resultado1);
        System.out.println("O total da equação é: " + resultado2);
        System.out.println("O total da equação é: " + resultado3);
    }
}