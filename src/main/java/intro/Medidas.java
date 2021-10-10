//1 - Pacote
package intro;

//2- Referências as bibliotecas

//3 - Classes
public class Medidas {
    // 3.1 - Atributos -> são as características da classe

    // 3.2 - Métodos e Funções -> são os que as coisas sabem fazer

   public static void main(String[] args){
        calcularAreaModoCurto();
        calcularAreaModoExtenso();

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

}
