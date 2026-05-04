import java.util.ArrayList;
import java.util.Scanner;

public class gPagamento {
    Scanner sc = new Scanner(System.in);
    ArrayList <Pagamento> listaPag = new ArrayList<>();

    public void registrarBoleto(){
       boolean rodar = false;
        while (rodar) {
            try {

                System.out.println("====Boleto====");
                System.out.println("1- Valor: ");
                double valorBoleto = sc.nextDouble();
                sc.nextLine();

                System.out.println("2- Data de pagamento: ");
                String dataPagamento = sc.nextLine();

                System.out.println("3- Vencimento: ");
                String vencimento = sc.nextLine();

                listaPag.add(new Boleto(valorBoleto, dataPagamento, vencimento));

                rodar = false;

            }catch (IllegalArgumentException error){
                System.out.println(error.getMessage());
                rodar = true;
            }



        }



    }


}
