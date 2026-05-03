import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVeiculo {
    Scanner sc = new Scanner(System.in);
    ArrayList<Veiculo> listaVeiculo = new ArrayList<>();

    public void CadastrarVeiculo() {

        boolean rodar = true;

        while (rodar) {
            System.out.println("\nQual veículo deseja cadastrar?");
            System.out.println("1- Moto.");
            System.out.println("2- Carro.");
            System.out.println("0 - Listar registrados.");
            int opcaoUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    boolean cadastradoMoto = false;

                    while (!cadastradoMoto) {
                        try {
                            System.out.println("Tipo: ");
                            String tipoMoto = sc.nextLine();

                            System.out.println("Marca: ");
                            String marcaMoto = sc.nextLine();

                            System.out.println("Modelo: ");
                            String modeloMoto = sc.nextLine();

                            System.out.println("Ano: ");
                            int anoMoto = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Cilindrada: ");
                            int ccMoto = sc.nextInt();
                            sc.nextLine();

                            listaVeiculo.add(new Moto(tipoMoto, marcaMoto, modeloMoto, anoMoto, ccMoto));

                            System.out.println("Moto cadastrada!");
                            cadastradoMoto = true;

                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                            System.out.println("Tente novamente.\n");
                        }
                    }
                    break;

                case 2:
                    boolean cadastradoCarro = false;

                    while (!cadastradoCarro) {
                        try {
                            System.out.println("Tipo: ");
                            String tipoCarro = sc.nextLine();

                            System.out.println("Marca: ");
                            String marcaCarro = sc.nextLine();

                            System.out.println("Modelo: ");
                            String modeloCarro = sc.nextLine();

                            System.out.println("Ano: ");
                            int anoCarro = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Portas: ");
                            int portasCarro = sc.nextInt();
                            sc.nextLine();

                            listaVeiculo.add(new Carro(tipoCarro, marcaCarro, modeloCarro, anoCarro, portasCarro));

                            System.out.println("Carro cadastrado!");
                            cadastradoCarro = true;

                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                            System.out.println("Tente novamente.\n");
                        }
                    }
                    break;

                case 0:
                    rodar = false;
                    break;

                default:
                    System.out.println("Valor inválido!");
            }
        }
    }

    public void listarVeiculos() {
        for (Veiculo listar : listaVeiculo) {
            System.out.println(listar.ligar());
        }
    }
}