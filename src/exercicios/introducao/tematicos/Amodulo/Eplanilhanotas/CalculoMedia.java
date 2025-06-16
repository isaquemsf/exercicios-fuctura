package exercicios.introducao.tematicos.Amodulo.Eplanilhanotas;

public class CalculoMedia {
    public static void main(String[] args) {
        String[] materias = {"Português", "Matemática", "Biologia", "Programação"};
        double [] notas = {8.5, 7.5, 10.0, 6.9};
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Matéria: %s | Nota: %.1f%n", materias[i], notas[i]);
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;
        System.out.printf("Média das notas: %.2f", media);
    }
}
