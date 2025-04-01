import java.util.Scanner;

public class GerenciadorNotas {
    public static void main(String[] args) {

        double[] notas=new double[3];

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<notas.length;i++){
            System.out.println("Digite a nota: ");
            notas[i]= sc.nextDouble();
        }

        //double[] notas={5.5, 3.8, 4.8, 10, 7.8};

        double soma=0;
        for(int i=0; i<notas.length; i++){
            soma += notas[i];
        }
        double media=soma/notas.length;
        System.out.println("Media das notas: "+media);

        if(media>=7){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}
