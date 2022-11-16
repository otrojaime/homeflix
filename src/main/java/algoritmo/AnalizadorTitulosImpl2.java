package algoritmo;

public class AnalizadorTitulosImpl2 implements Analizadortitulo {

    @Override
    public Integer analizar(String title) {
        int vocales = title.replaceAll("[^AEIOUaeiou]", "").length();
        if(vocales < 8) {
            System.out.println("POCO ATRACTIVO");
            return -1;
        }
        if(vocales >= 9 && vocales <= 12) {
            System.out.println("INDIFERENTE");
            return 0;
        }
        System.out.println("ATRACTIVO");
        return 1;
    } 
}
