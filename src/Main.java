import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Armas
        ArmaCorta pistola1 = new ArmaCorta("Smith & Wesson Model 29", 9, 50, EstadoArma.EN_USO, true);
        ArmaLarga rifle1 = new ArmaLarga("Remington 700", 7.62, 300, EstadoArma.EN_USO, true, "Alta precisión de disparo", 4);
        ArmaCorta pistola2 = new ArmaCorta("Beretta 92FS", 9, 45, EstadoArma.EN_MANTENIMIENTO, false);
        ArmaLarga rifle2 = new ArmaLarga("Winchester Model 70", 7, 250, EstadoArma.NUEVA, false, "De Patrulla", 2);
        ArmaCorta pistola3 = new ArmaCorta("Glock 19 Gen5", 9, 55, EstadoArma.EN_USO, false);
        ArmaLarga rifle3 = new ArmaLarga("FN SCAR-H", 7.62, 400, EstadoArma.EN_USO, true, "Gran precisión", 5);
        ArmaCorta pistola4 = new ArmaCorta("B&T USW-A1", 9, 220, EstadoArma.NUEVA, true);
        ArmaLarga rifle4 = new ArmaLarga("Heckler & Koch G36", 5.56, 350, EstadoArma.EN_MANTENIMIENTO, true, "Antibandalismo", 3);
        ArmaCorta pistola5 = new ArmaCorta("Sig Sauer P226", 9, 55, EstadoArma.NUEVA, true);
        ArmaLarga rifle5 = new ArmaLarga("Mossberg 590 Tactical", 12, 150, EstadoArma.EN_USO, false, "Control de la Poblacion", 1);

        // Policías
        List<Policia> policias = List.of(
                new Policia("Harry", "Callahan", "P101", pistola1),
                new Policia("Kevin", "Brown", "K903", rifle1),
                new Policia("John", "Mcclane", "L422", pistola2),
                new Policia("Max", "Rockatansky", "E804", rifle2),
                new Policia("Tom", "Ludlow", "L605", pistola3),
                new Policia("Alex", "Murphy", "P306", rifle3),
                new Policia("Gracie", "Hart", "V777", pistola4),
                new Policia("Alice", "Abernathy", "L048", rifle4),
                new Policia("Evelyn", "Salt", "M109", pistola5),
                new Policia("John", "Kimble", "T800", rifle5)
        );

        // Escuadrones
        Escuadron escuadronZonaSur = new Escuadron(
                "Escuadrón de Zona Sur", "Comisaría Quilmes",
                List.of(policias.get(0), policias.get(2), policias.get(5), policias.get(8)),
                List.of(pistola1, rifle1, rifle3, pistola5)
        );

        Escuadron escuadronZonaOeste = new Escuadron(
                "Escuadrón de Zona Oeste", "Comisaría Tres de Febrero",
                List.of(policias.get(1), policias.get(3), policias.get(4), policias.get(7)),
                List.of(pistola2, rifle2, pistola3, rifle4)
        );

        Escuadron escuadronZonaNorte = new Escuadron(
                "Escuadrón de Zona Norte", "Comisaría San Isidro",
                List.of(policias.get(6), policias.get(9)),
                List.of(pistola4, rifle5)
        );

        // Mostrar
        System.out.println("INFORMACIÓN DE GRUPOS");
        System.out.println(escuadronZonaSur);
        System.out.println(escuadronZonaOeste);
        System.out.println(escuadronZonaNorte);

        // Comparación
        System.out.println("\nCOMPARACIÓN ENTRE ARMAS LARGAS");
        compararArmas(rifle1, rifle3);
        compararArmas(rifle2, rifle5);
    }

    public static void compararArmas(Arma a1, Arma a2) {
        System.out.println("Comparación entre " + a1.getMarca() + " y " + a2.getMarca());

        int resultado = a1.compareTo(a2);
        if (resultado > 0) {
            System.out.println(a1.getMarca() + " es de mayor nivel");
        } else if (resultado < 0) {
            System.out.println(a2.getMarca() + " es de mayor nivel");
        } else {
            System.out.println("Ambas armas tienen el mismo nivel");
        }
    }
}

// === Enum ===
enum EstadoArma {
    NUEVA, EN_MANTENIMIENTO, EN_USO
}

// === Clases Armas ===
abstract class Arma implements Comparable<Arma> {
    protected String marca;
    protected double calibre;
    protected int alcanceMetros;
    protected EstadoArma estado;
    protected Policia policiaAsignado;

    public Arma(String marca, double calibre, int alcanceMetros, EstadoArma estado) {
        this.marca = marca;
        this.calibre = calibre;
        this.alcanceMetros = alcanceMetros;
        this.estado = estado;
    }

    public void asignarPolicia(Policia policia) {
        this.policiaAsignado = policia;
    }

    public boolean estaEnCondiciones() {
        return estado == EstadoArma.EN_USO && calibre >= 9;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public int compareTo(Arma otra) {
        return 0; // por defecto sin orden
    }

    @Override
    public String toString() {
        return "Arma: " + marca +
                " | Calibre: " + calibre +
                " | Alcance: " + alcanceMetros +
                "m | Estado: " + estado +
                " | Asignada a: " + (policiaAsignado != null ? policiaAsignado.getNombreCompleto() : "Ninguno");
    }
}

class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(String marca, double calibre, int alcanceMetros, EstadoArma estado, boolean esAutomatica) {
        super(marca, calibre, alcanceMetros, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean puedeDispararMas200m() {
        return alcanceMetros > 200;
    }

    public String esAutomaticaComoTexto() {
        return esAutomatica ? "SI" : "NO";
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Corta" +
                " | Automática: " + esAutomaticaComoTexto() +
                " | Dispara +200m: " + (puedeDispararMas200m() ? "SI" : "NO");
    }
}

class ArmaLarga extends Arma {
    private boolean selloRENAR;
    private String descripcionUso;
    private int nivel;

    public ArmaLarga(String marca, double calibre, int alcanceMetros, EstadoArma estado,
                     boolean selloRENAR, String descripcionUso, int nivel) {
        super(marca, calibre, alcanceMetros, estado);
        this.selloRENAR = selloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public String tieneSelloRENAR() {
        return selloRENAR ? "SI" : "NO";
    }

    @Override
    public int compareTo(Arma otra) {
        if (otra instanceof ArmaLarga) {
            return Integer.compare(this.nivel, ((ArmaLarga) otra).nivel);
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Larga" +
                " | Sello RENAR: " + tieneSelloRENAR() +
                " | Nivel: " + nivel +
                " | Uso: " + descripcionUso;
    }
}

// === Clases Policía y Escuadrón ===
class Policia {
    private String nombre, apellido, legajo;
    private Arma armaAsignada;

    public Policia(String nombre, String apellido, String legajo, Arma armaAsignada) {
        if (armaAsignada == null) {
            throw new IllegalArgumentException("El policía debe tener un arma asignada");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.armaAsignada = armaAsignada;
        armaAsignada.asignarPolicia(this);
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Policía: " + getNombreCompleto() + " | Legajo: " + legajo +
                " | Arma: " + armaAsignada.getMarca();
    }
}

class Escuadron {
    private String nombre, comisaria;
    private List<Policia> policias;
    private List<Arma> armas;

    public Escuadron(String nombre, String comisaria, List<Policia> policias, List<Arma> armas) {
        this.nombre = nombre;
        this.comisaria = comisaria;
        this.policias = policias != null ? policias : new ArrayList<>();
        this.armas = armas != null ? armas : new ArrayList<>();
    }

    public int cantidadArmasEnCondiciones() {
        return (int) armas.stream().filter(Arma::estaEnCondiciones).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n*** " + nombre + " ***\n");
        sb.append("Comisaría: ").append(comisaria).append("\n");
        sb.append("Integrantes: ").append(policias.size()).append("\n");
        sb.append("Armas totales: ").append(armas.size()).append("\n");
        sb.append("Armas en condiciones: ").append(cantidadArmasEnCondiciones()).append("\n");

        sb.append("\n-- Policías --\n");
        policias.forEach(p -> sb.append(p).append("\n"));

        sb.append("\n-- Armas --\n");
        armas.forEach(a -> sb.append(a).append("\n"));

        return sb.toString();
    }
}
