public class Main {
    static void main() {
        SistemaHierarquia sh = new SistemaHierarquia();
        System.out.println("\n===Sistema Pessoa===");
        sh.CadastrarAluno();
        sh.CadastrarProfessor();
        sh.listarPessoas();
    }
}
