public class Condicional {
    public static void main(String[] args) {
        int anoDeLacamento = 2001;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10;
        String tipoPlano = "plus";

        if (anoDeLacamento >= 2001){
            System.out.println("Filmes do momento!");
        } else {
            System.out.println("Filme que vale a pena ver de novo");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Filme pago");
        }
    }
}
