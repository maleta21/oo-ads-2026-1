import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        teste01();
//        teste02();
//        teste03();
//         prova1();
          teste04();
    }

    public static void teste01() {
        // Criação do primeiro objeto de pessoa
//        pessoa pessoa1 = new pessoa(
//                "Gervásio Gomes Garcia",
//                54,
//                "123.456.789-01",
//                "gervasio.garcia@empresa.com.br",
//                "(16) 98765-4321"
//        );

        // Atribuindo valores aos atributos
//        pessoa1.nome = "Gervásio Gomes Garcia";
//        pessoa1.idade = 54;
//        pessoa1.cpf = "123.456.789-01";
//        pessoa1.email = "gervasio.garcia@empresa.com.br";
//        pessoa1.telefone = "(16) 98765-4321";

        // Chamando o método para exibir os dados da pessoa 1
//        System.out.println(pessoa1.exibirDados());
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        pessoa1.fazerAniversario();
//
//        // Chamando a apresentação da pessoa, que reflete a nova idade
//        pessoa1.apresentar();
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Atualizando o e-mail
//        pessoa1.atualizarEmail("ggarcia@outlook.com");
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Exibindo novamente os dados para conferir as alterações feitas
//        System.out.println(pessoa1.exibirDados());
//
//        // Alterando novamente o e-mail por meio de manipulação direta
//        // do valor do atributo
//        pessoa1.email = "garcia.gervasio@bol.com.br";
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Exibindo novamente os dados para conferir as alterações feitas
//        System.out.println(pessoa1.exibirDados());
//
//        System.out.println("*".repeat(80));
//
//        // Vamos criar o primeiro objeto da classe Funcionario
//        Funcionario func1 = new Funcionario(
//                "Veneranda Vieira",
//                26,
//                "987.654.321-09",
//                "veneranda@empresa.com.br",
//                "(36) 91234-5678",
//                "F0123",
//                "Assistente Financeiro",
//                3500.00,
//                "Gerência Financeira"
//        );
//
//        // Dando valor aos atributos do funcionário
//        // (inclui atributos herdados de Pessoa)
//        func1.nome = "Veneranda Vieira";
//        func1.idade = 26;
//        func1.cpf = "987.654.321-09";
//        func1.email = "veneranda@empresa.com.br";
//        func1.telefone = "(36) 91234-5678";
//        //----//
//        func1.matricula = "F0123";
//        func1.cargo = "Assistente Financeiro";
//        func1.salarioBase = 3500.00;
//        func1.departamento = "Gerência Financeira";
//        func1.dataAdmissao = new Date();
//
//        // Exibindo os dados do funcionário
//        System.out.println(func1.exibirDados());
//
//        System.out.println("-".repeat(80));
//
//        func1.fazerAniversario();
//
//        // Exibindo os dados novamente para verificar mudança de idade
//        System.out.println(func1.exibirDados());
//
//        System.out.println("-".repeat(80));
//
//        // Calculando o salário de Veneranda
//        Double salarioFinal = func1.calcularSalario();
//        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
//    }

//    public static void teste02() {

//        System.out.println("%".repeat(80));
//
//        Pessoa p = new Pessoa();
//        System.out.println("Exibindo dados de uma pessoa...");
//        System.out.println(p.exibirDados());
//
//        Funcionario f = new Funcionario();
//        System.out.println("Exibindo dados de um funcionário...");
//        System.out.println(f.exibirDados());
    }

//    public static void teste03() {
//
//        System.out.println("=== CONTAS NORMAIS ===");
//
//        ContaBancaria c1 = new ContaBancaria("Matheus", 1000.0);
//        ContaBancaria c2 = new ContaBancaria("João", 2000.0);
//        ContaBancaria c3 = new ContaBancaria("Maria", 3000.0);
//
//        c1.depositar(500.0);
//        c1.sacar(200.0);
//
//        c2.depositar(300.0);
//        c2.sacar(1000.0);
//
//        c3.depositar(1000.0);
//        c3.sacar(500.0);
//
//        c1.exibirSaldo();
//        c2.exibirSaldo();
//        c3.exibirSaldo();
//
//
//        System.out.println("\n=== CONTAS ESPECIAIS ===");
//
//        ContaEspecial e1 = new ContaEspecial("Carlos", 1000.0, 500.0);
//        ContaEspecial e2 = new ContaEspecial("Ana", 2000.0, 1000.0);
//        ContaEspecial e3 = new ContaEspecial("Lucas", 3000.0, 1500.0);
//
//        e1.depositar(200.0);
//        e1.sacar(300.0);
//
//        e2.depositar(500.0);
//        e2.sacar(2500.0);
//
//        e3.depositar(1000.0);
//        e3.sacar(2000.0);
//
//        // saldo com limite
//        e1.exibirSaldo();
//        e2.exibirSaldo();
//        e3.exibirSaldo();
//
//        // saldo real
//        e1.exibirSaldoReal();
//        e2.exibirSaldoReal();
//        e3.exibirSaldoReal();
//    }

//    public static void prova1() {
//
//        System.out.println("\n=== TESTE ESTUDANTES ===");
//
//        Estudante e1 = new Estudante(
//                "Carlos",
//                20,
//                "111.111.111-11",
//                "carlos@gmail.com",
//                "(16)11111-1111",
//                "Rh"
//        );
//        e1.nota1 = 7.0;
//        e1.nota2 = 8.0;
//
//        Estudante e2 = new Estudante(
//                "Ana",
//                22,
//                "222.222.222-22",
//                "ana@gmail.com",
//                "(16)22222-2222",
//                "Engenharia"
//        );
//        e2.nota1 = 5.0;
//        e2.nota2 = 6.0;
//
//        Estudante e3 = new Estudante(
//                "João",
//                19,
//                "333.333.333-33",
//                "joao@gmail.com",
//                "(16)33333-3333",
//                "Direito"
//        );
//        e3.nota1 = 4.0;
//        e3.nota2 = 5.0;
//
//        Estudante e4 = new Estudante(
//                "Matheus Gondim Martins",
//                21,
//                "460.038.468-79",
//                "matheus20041126@gmail.com",
//                "(16)98859-8937",
//                "Análise e Desenvolvimento de Sistemas"
//        );
//        e4.nota1 = 10.0;
//        e4.nota2 = 9.5;
//
//        System.out.println("\n--- Estudante 1 ---");
//        System.out.println(e1.exibirDados());
//
//        System.out.println("\n--- Estudante 2 ---");
//        System.out.println(e2.exibirDados());
//
//        System.out.println("\n--- Estudante 3 ---");
//        System.out.println(e3.exibirDados());
//
//        System.out.println("\n--- Estudante 4 ---");
//        System.out.println(e4.exibirDados());
//    }

    public static void teste04() {
        ContaBancaria c1 = new ContaBancaria(987, "Zeferino Zacarias", 500.00);
        c1.exibirSaldo();

        c1.sacar(350.00);
        c1.exibirSaldo();

        // Atributo "saldo" foi privatizado
        // Mudanças no saldo agora só podem ser feitas por meio dos
        // métodos depositar() e sacar()
        //c1.saldo = -100.00;
        //c1.exibirSaldo();

        c1.depositar(200.00);
        c1.exibirSaldo();

        ContaBancaria c2 = new ContaBancaria(654, "Yuri Yamashita", 850.00);
        c2.exibirSaldo();

        c2.setNumConta(40);
        System.out.println("Conta de %s agora tem o número %d.".formatted(c2.titular, c2.getNumConta()));
    }
}