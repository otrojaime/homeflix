package algoritmo;

public class AnalizadorTitulosImpl1 implements Analizadortitulo{

    @Override
    public Integer analizar(String title) {
        String palabras[] = title.split(" ");
        if(palabras.length <= 1) {
            System.out.println("POCO ATRACTIVO");
            return -1;
        }
        if(palabras.length == 2) {
            System.out.println("INDIFERENTE");
            return 0;
        }
        System.out.println("ATRACTIVO");
        return 1;
    }
}
