public class Main {
    public static void main(String[] args) {

        // Creacion de equipo y ciclistas
        Equipo equipo = new Equipo("Sakurasou", "Japon");
        Velocista velocista = new Velocista(1, "Shinna", 55, 50, 70);
        Escalador escalador = new Escalador(2, "Kanda", 42, 40, 15);
        Contrarelojista contrarelojista = new Contrarelojista(3, "Ryuunosuke", 70, 120);

        equipo.CalcularTiempo(velocista, escalador, contrarelojista);
            
        String nombreContrarelojista = contrarelojista.getNombre(contrarelojista);
        String nombreVelocista = velocista.getNombre(velocista);
        String nombreEscalador = escalador.getNombre(escalador);

        equipo.añadirCiclista(nombreContrarelojista, nombreVelocista, nombreEscalador);
        equipo.listarNombreEquipo();
        equipo.imprimirDatosEquipo();
        equipo.BuscarCiclista(velocista, escalador, contrarelojista); 
    }
}