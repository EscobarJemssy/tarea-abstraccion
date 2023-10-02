import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    Scanner sc=new Scanner(System.in);

    private String nombreEquipo;
    private String paisEquipo;
    private static double sumaTiempos;
    private ArrayList<String> lista = new ArrayList<String>();

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
    }

    protected String getNombreEquipo() {
        return nombreEquipo;
    }
    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPaisEquipo() {
        return paisEquipo;
    }
    protected void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }

    protected static double getSumaTiempos() {
        return sumaTiempos;
    }
    protected static void setSumaTiempos(double sumaTiempos) {
        Equipo.sumaTiempos = sumaTiempos;
    }

    protected ArrayList<String> getLista(){
        return lista;
    }
    protected void setLista(ArrayList<String> lista){
        this.lista = lista;
    }
  
    protected void añadirCiclista(String nombreContrarelojista, String nombreVelocista, String nombreEscalador){  
        this.lista.add(nombreContrarelojista);
        this.lista.add(nombreVelocista);
        this.lista.add(nombreEscalador);
    }


    protected void listarNombreEquipo() {
        System.out.println("\nNOMBRE DE LOS INTEGRANTES DEL EQUIPO " + nombreEquipo + ":");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
    
    public void imprimirDatosEquipo() {
        System.out.println("\nDATOS DEL EQUIPO: ");
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + paisEquipo);
        System.out.println("Tiempo total de carrera del equipo: " + sumaTiempos + " minutos");
    }

    protected void BuscarCiclista(Velocista velocista, Escalador escalador, Contrarelojista contrarelojista){
        System.out.println("\nINGRESE EL IDENTIFICADOR PARA BUSCAR AL CICLISTA: ");
        int numeroIdentificacion = sc.nextInt();

        if (numeroIdentificacion == velocista.getIdentificador()){
            velocista.imprimirVelocista();
        } else if (numeroIdentificacion == escalador.getIdentificador()){
            escalador.imprimirEscalador();
        } else if (numeroIdentificacion == contrarelojista.getIdentificador()){
            contrarelojista.imprimirContrarelojista();
        } else {
            System.out.println("El ciclista no existe!.");
        }
    }

    protected void CalcularTiempo(Velocista velocista, Escalador escalador, Contrarelojista contrarelojista){
        int tiempoVelocista = velocista.getTiempoAcumulado(velocista);
        int tiempoEscalador = escalador.getTiempoAcumulado(escalador);
        int tiempoContrarelojista = contrarelojista.getTiempoAcumulado(contrarelojista);

        int tiempoTotal = tiempoVelocista + tiempoEscalador + tiempoContrarelojista;
        Equipo.setSumaTiempos(tiempoTotal);
    }
}
