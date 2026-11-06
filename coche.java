public class Coche {

    private String marca;
    private int velocidad;

    public Coche(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " va a " + velocidad + " km/h");
    }

    public void frenar() {
        velocidad -= 10;
        System.out.println(marca + " va a " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        Coche coche = new Coche("Seat");
        coche.acelerar();
        coche.acelerar();
        coche.frenar();
    }
}