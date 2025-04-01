import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GerenciadorEstoque {
    public static void main(String[] args) {

        String[] estoque= new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<estoque.length;i++){
            System.out.println("Digite o "+(i+1)+"° produto: ");
            estoque[i]=sc.next()+sc.nextLine();
        }
        System.out.println("Digite o produto que deseja verificar no estoque: ");
        String produtoProcurado= sc.next()+sc.nextLine();

        //String produtoProcurado="lampada";

        boolean produtoEncontrado= false;
        int i = 0;
        while (!produtoEncontrado && i < estoque.length){
            if (produtoProcurado == estoque[i]){
                produtoEncontrado=true;
            }
            i++;
        }

        if (produtoEncontrado){
            System.out.println(produtoProcurado+" esta disponivel no estoque");
        }else {
            System.out.println(produtoProcurado+" não esta disponivel no estoque");
        }

    }
}