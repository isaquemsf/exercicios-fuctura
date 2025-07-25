package exercicios.recomendados.Clacosrepeticao.lacowhile;

public class ContagemDeCincoEmCinco {
    public static void main(String[] args) {
        int num = 100;

        while (num >= 0) {
            System.out.print(num + " ");
            num -= 5;
        }

        System.out.println("Acabou!");
    }
}
