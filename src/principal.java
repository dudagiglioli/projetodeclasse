import java.util.Scanner;

public class principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       classe classe = new classe();

//cliente
        System.out.print("Nome do Cliente: ");
        classe.nomecompleto = sc.next();
        System.out.print("Email do Cliente: ");
        classe.email = sc.next();
        System.out.print("Número de Celular do Cliente: ");
        classe.cel = sc.next();

        System.out.println();

//produto
        System.out.print("Nome do Produto: ");
        classe.nome1 = sc.next();
        System.out.print("Preço do Produto: ");
        classe.p1 = sc.nextDouble();
        System.out.print("Qtde de Produto: ");
        classe.qtde1 = sc.nextInt();

        System.out.print("Nome do Produto 2: ");
        classe.nome2 = sc.next();
        System.out.print("Preço do Produto 2: ");
        classe.p2 = sc.nextDouble();
        System.out.print("Qtde de Produto 2: ");
        classe.qtde2 = sc.nextInt();

        System.out.println();

//vendedor
        System.out.print("Nome do Vendedor: ");
        classe.nome = sc.next();

        System.out.println();

        //final
        System.out.println("QUEM COMPROU --> " + classe.getNomecompleto());
        System.out.println("O QUE COMPROU (1) --> " + classe.getNome1());
        System.out.println("O QUE COMPROU (2) --> " + classe.getNome2());
        System.out.println("TOTAL DA COMPRA --> " + classe.getTotal());
        System.out.println("QUEM VENDEU --> " + classe.getNome());
        System.out.println("COMISSÃO DO VENDEDOR --> " + classe.getComissao());
    }
}
