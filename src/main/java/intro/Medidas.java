//1 - Pacote
package intro;

//2- Referências as bibliotecas

import java.util.Scanner;

//3 - Classes
public class Medidas {
    // 3.1 - Atributos -> são as características da classe

    // 3.2 - Métodos e Funções -> são os que as coisas sabem fazer

   public static void main(String[] args){

       //Utilizar a classe Scanner do java para ler a escolha do usuário no console
       Scanner scanner = new Scanner(System.in);
       System.out.println("M E N U  D E  O P Ç Õ E S ");
       System.out.println("C - Calcular Area Modo Curto");
       System.out.println("E - Calcular Area Modo Extendo");
       System.out.println("I - Calcular o IfSimples");
       System.out.println("D - Contar Até Dez");
       System.out.println("R - Contar Até Zero");
       System.out.println("Qual a opção desejada: ");
       String opcao = scanner.next();

       // String opcao = "orange";


        switch (opcao){
            case "I":
            case "i":
                System.out.println("Você escolheu executar o método IfSimples");
                ifSimples();
                break;

            case "C":
            case "c":
                System.out.println("Você escolheu executar o método Curto");
                calcularAreaModoCurto();
                break;

            case "E":
            case "e":
                System.out.println("Você escolheu executar o método Extenso");
                calcularAreaModoExtenso();
                break;

            case "D":
            case "d":
                System.out.println("Você escolheu executar o método Contar Até Dez");
                contarAteDez();
                break;

            case "R":
            case "r":
                System.out.println("Você escolheu executar o método Contagem Regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu executar nenhum valor");
                break;
        }

    }

    public static void ifSimples(){
        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else{
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoCurto(){
        //sout + tab + enter
        System.out.println("Cálculo de Area Modo Curto");


        //Cálculo de área -> exemplo o tamanho do tapete ou do piso
        int largura = 4;
        int comprimento = 6;
        int resultado;


        resultado = largura * comprimento;
        System.out.println("A Area do tapete é de " + resultado + "m²");
        System.out.println("*****************************");

    }

    public static void calcularAreaModoExtenso(){
        //sout + tab + enter
        System.out.println("Cálculo de Area Modo Extenso");

        //Cálculo de área -> exemplo o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 8;
        resultado = largura * comprimento;
        System.out.println("A Area do tapete é de " + resultado + "m²");

    }

    public static void contarAteDez(){
       //Loops ou repetições
        System.out.println("Contagem Crescente");

        for(int numero =1; numero<=10; numero++){
            System.out.println(numero);
        }

    }

    public static void contagemRegressiva(){
        System.out.println("Conragem Regressiva");

        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }


}
