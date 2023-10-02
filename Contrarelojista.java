public class Contrarelojista  extends Ciclista{
    private double velocidadMáxima;

    public Contrarelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMáxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMáxima = velocidadMáxima;
    }

    // Trae los métodos get y set de la clase padre
    protected int getIdentificador(Contrarelojista contrarelojista) {
        return contrarelojista.getIdentificador();
    }
    protected void setIdentificador(int identificador) {
        super.setIdentificador(identificador);
    }
    
    protected String getNombre(Contrarelojista contrarelojista){
        return contrarelojista.getNombre();
    }
    protected void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    protected int getTiempoAcumulado(Contrarelojista contrarelojista){
        return contrarelojista.getTiempoAcumulado();
    }
    protected void setTiempoAcumulado(int tiempo) {
        super.setTiempoAcumulado(tiempo);
    }
    
    //Métodos get y set de la clase Contrarelojista
    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }
    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

  
    protected void imprimirContrarelojista(){
        super.imprimirCiclista();   //Método Imprimir de la clase padre(Ciclista)
        System.out.println("La velocidad Máxima es: " + velocidadMáxima);
    }

    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
