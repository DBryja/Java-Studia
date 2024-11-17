public class Main {
    public static void main(String[] args) {
        Color magenta = new Color(255, 0, 255);
        Color blackHalf = new Color(0, 0, 0, 0.5f);

        System.out.printf("Color: %s, Red: %d, Green: %d, Blue: %d, Alpha: %.2f%n",
                magenta.toString(), magenta.red(), magenta.green(), magenta.blue(), magenta.alpha());

        System.out.printf("Color: %s, Red: %d, Green: %d, Blue: %d, Alpha: %.2f%n",
                blackHalf.toString(), blackHalf.red(), blackHalf.green(), blackHalf.blue(), blackHalf.alpha());
    }
}