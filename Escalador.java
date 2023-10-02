public class Escalador extends Ciclista {

    private double aceleraciónPromedio;
    private double gradoRampa;

    public Escalador(int identificador, String nombre, int tiempoAcumulado, double aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }

    //Trae los métodos get y set de la clase padre
    protected int getIdentificador(Escalador escalador) {
        return escalador.getIdentificador();
    }
    protected void setIdentificador(int identificador){
        super.setIdentificador(identificador);
    }
    
    protected String getNombre(Escalador escalador){
        return escalador.getNombre();   
    }
    protected void setNombre(String nombre){
        super.setNombre(nombre);
    }

    protected int getTiempoAcumulado(Escalador escalador) {
        return escalador.getTiempoAcumulado();
    }
    protected void setTiempoAcumulado(int tiempo){
        super.setTiempoAcumulado(tiempo); 
    }

    
    //Metodos get y set de la clase Escalador
    protected double getAceleracionPromedio() {
        return aceleraciónPromedio;
    }
    protected void setAceleraciónPromedio(int aceleracion){
        this.aceleraciónPromedio = aceleracion;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }
    protected void setGradoRampa(int grados){
        this.gradoRampa = grados;
    }
 
    protected void imprimirEscalador(){
        super.imprimirCiclista();  // Metodo Imprimir de la clase padre(Ciclista)
        System.out.println("La aceleración promedio es: "+ aceleraciónPromedio);
        System.out.println("El grado de ramapa es:" + gradoRampa);
    }

    protected String imprimirTipo(){
        return "Es un escalador";
    }    
}