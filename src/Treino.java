import java.util.ArrayList;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TreinoFuncionario> listaFuncionarios = new ArrayList<>();
        System.out.println("Quantos funcionários deseja cadastrar? ");
        int quantidadefuncionarios = scan.nextInt();

        for (int i = 1; i <= quantidadefuncionarios; i++) {
            System.out.println("ID: ");
            int id = scan.nextInt();

            System.out.println("Nome: ");
            String nome = scan.next();

            System.out.println("Salario: ");
            double salario = scan.nextDouble();

            listaFuncionarios.add(new TreinoFuncionario(id,nome,salario));
        }
        for(TreinoFuncionario i : listaFuncionarios){
            System.out.println(i);
        }
        System.out.println("Digite o ID do funcionario que vai receber aumento: ");
        int funcinarioAumentoSalario = scan.nextInt();
        if(listaFuncionarios.contains(funcinarioAumentoSalario)){
            System.out.println("Quanto voce deseja aumentar(em porcentagem): ");
            double aumentoPorcentagem = scan.nextDouble();
            listaFuncionarios.get(0).porcentagemAumentoSalario(aumentoPorcentagem);
        }
        else{
            System.out.println("ID invalido");

        }

    }
}
