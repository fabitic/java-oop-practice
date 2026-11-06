public class coche {

    private String marca;
    private int velocidad;

    public coche(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " va a " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        coche coche = new coche("Seat");
        coche.acelerar();
        coche.acelerar();
    }
}