import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Atleta> atletas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Atleta atleta = new Atleta();
            System.out.println("Digite os dados do atleta numero " + (i + 1) + ":");

            System.out.print("Nome: ");
            atleta.setNome(sc.nextLine());

            System.out.print("Sexo (M/F): ");
            atleta.setSexo(sc.next().charAt(0));

            System.out.print("Altura: ");
            atleta.setAltura(sc.nextDouble());

            System.out.print("Peso: ");
            atleta.setPeso(sc.nextDouble());

            atletas.add(atleta);
            sc.nextLine();
        }

        relatorio(atletas);
        sc.close();
    }

    public static void relatorio(ArrayList<Atleta> atletas) {
        double somaPeso = 0;
        double somaAlturaMulheres = 0;
        int contaMulheres = 0;
        int contaHomens = 0;
        Atleta atletaMaisAlto = null;

        for (Atleta atleta : atletas) {
            somaPeso += atleta.getPeso();

            if (atletaMaisAlto == null || atleta.getAltura() > atletaMaisAlto.getAltura()) {
                atletaMaisAlto = atleta;
            }

            if (atleta.getSexo() == 'F') {
                somaAlturaMulheres += atleta.getAltura();
                contaMulheres++;
            } else {
                contaHomens++;
            }
        }

        double pesoMedio = somaPeso / atletas.size();
        double porcentagemHomens = (contaHomens * 100.0) / atletas.size();

        System.out.println("### RELATÓRIO ###");
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
        System.out.println("Atleta mais alto: " + atletaMaisAlto.getNome());
        System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagemHomens);

        if (contaMulheres > 0) {
            double alturaMediaMulheres = somaAlturaMulheres / contaMulheres;
            System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }
    }
}