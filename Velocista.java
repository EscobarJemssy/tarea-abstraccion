public class Velocista extends Ciclista{
    
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    // Trae los métodos get y set de la clase padre
    protected int getIdentificador(Velocista velocista) {
        return velocista.getIdentificador();
    }
    protected void setIdentificador(int identificador){
        super.setIdentificador(identificador);
    }
    
    protected String getNombre(Velocista velocista){
        return velocista.getNombre();      
    }
    protected void setNombre(String nombre){
        super.setNombre(nombre);
    }

    protected int getTiempoAcumulado(Velocista velocista){
        return velocista.getTiempoAcumulado();
    }
    protected void setTiempoAcumulado(int tiempo){
        super.setTiempoAcumulado(tiempo); 
    }

    //Métodos get y set de la clase Velocista
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    
    protected void imprimirVelocista(){
        super.imprimirCiclista();  // Invoca el método Imprimir de la clase padre(Ciclista)
        System.out.println("La potencia promedio es: " + potenciaPromedio);
        System.out.println("La velocidad promedio es: " + velocidadPromedio);
    }

    protected String imprimirTipo(){
        return "Es un velocista";
    } 
}
