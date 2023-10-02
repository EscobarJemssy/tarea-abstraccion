public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado=0;

    public Ciclista(int identificador, String nombre, int tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;
    }

    abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }
    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimirCiclista(){
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }
}