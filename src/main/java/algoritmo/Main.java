package algoritmo;

public class Main {

    public static void main(String[] args) {
        Analizadortitulo analizador1 = new AnalizadorTitulosImpl1();
        String titulo = "E.T.";
        System.out.println(analizador1.analizar(titulo));
        
        Analizadortitulo analizador2 = new AnalizadorTitulosImpl2();
        String title = "El secreto de sus ojazos tapatios";
        System.out.println(analizador2.analizar(title));
    }
}
