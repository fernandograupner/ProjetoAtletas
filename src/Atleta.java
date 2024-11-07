import java.util.Scanner;

class Atleta {
     private String nome;
     private char sexo;
     private double altura;
     private double peso;

     // Construtor
     public Atleta() {
     }

     // Métodos get e set conforme explicado em sala
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public char getSexo() {
          return sexo;
     }

     public void setSexo(char sexo) {
          while (sexo != 'M' && sexo != 'F') {
               System.out.println("Valor invalido! Favor digitar F ou M.");
               Scanner sc = new Scanner(System.in);
               sexo = sc.next().charAt(0);
          }
          this.sexo = sexo;
     }

     public double getAltura() {
          return altura;
     }

     public void setAltura(double altura) {
          while (altura <= 0) {
               System.out.println("Valor invalido! Favor digitar um valor positivo.");
               Scanner sc = new Scanner(System.in);
               altura = sc.nextDouble();
          }
          this.altura = altura;
     }

     public double getPeso() {
          return peso;
     }

     public void setPeso(double peso) {
          while (peso <= 0) {
               System.out.println("Valor invalido! Favor digitar um valor positivo.");
               Scanner sc = new Scanner(System.in);
               peso = sc.nextDouble();
          }
          this.peso = peso;
     }
}

