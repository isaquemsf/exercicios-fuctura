package exercicios.recomendados.Clacosrepeticao.lacowhile;

public class ContagemDivisiveisPorQuatro {
    public static void main(String[] args) {
        int num = 30;

        while (num >= 1) {
            if (num % 4 == 0) {
                System.out.print("[" + num + "] ");
            } else {
                System.out.print(num + " ");
            }

            num--;
        }
    }
}
