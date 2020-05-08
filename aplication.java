package codigo3;


import javax.print.DocFlavor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class aplication {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat data = new SimpleDateFormat("dd/mm/yyyy");

        List<produto> lista = new ArrayList<>();


        System.out.print("Entre com quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Insira dados abaixo: ");
            System.out.print("produto e comum(C), usado(U), ou importado(I)Escolha uma das opçoes entre parenteses: ");
            char decisao = sc.next().charAt(0);
            System.out.print("Insira nome: ");
            String nome = sc.next();
            System.out.print("Insira valor: ");
            double valor = sc.nextDouble();

            if (decisao == 'C') {
                produto a = new produto(nome, valor);
                lista.add(a);

            } else if (decisao == 'I') {
                System.out.print("Insira frete: ");
                double frete = sc.nextDouble();
                produto a = new produtoImportado(nome, valor, frete);
                lista.add(a);

            } else if (decisao == 'U') {
                System.out.print("Insira data de fabricaçao: ");
                Date a = data.parse(sc.next());
                produto b = new produtoUsado(nome, valor, a);
                lista.add(b);
            }
        }
        for (produto in : lista) {
            System.out.print("\n" + in.preço_tag());
        }
    }
}
