//1 - Pacote
package intro;

//2- Referências as bibliotecas

//3 - Classes
public class Medidas {
    // 3.1 - Atributos -> são as características da classe

    // 3.2 - Métodos e Funções -> são os que as coisas sabem fazer

   public static void main(String[] args){
       

    }
    public void calcularAreaModoExtenso(){
        //sout + tab + enter
        System.out.println("Meu código em Java");

        //Cálculo de área -> exemplo o tamanho do tapete ou do piso
        int largura = 4;
        int comprimento = 6;
        int resultado;


        resultado = largura * comprimento;
        System.out.println("A Area do tapete é de " + resultado + "m²");

    }

    public void calcularAreaCompacto(){
        int largura = 4;
        int comprimento = 3;

        System.out.println("A Area do piso é " + largura * comprimento + "m²");
    }
}
