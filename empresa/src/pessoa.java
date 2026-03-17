public class pessoa {

    //Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;

    /*
        MÉTODO CONSTRUTOR
        O método construtor é sempre chamado quando se cria um novo objeto
        apartir da classe.
        Nele, podemos exibir que determinados valores sejam informados para
        que a exixtemcia do objeto seja possivel.
        O método contrutor SEMPRE tem o MESMO NOME DA CLASSE.
    */
    public pessoa(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone
    ) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    //Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + "anos. ");
    }

    public void fazerAniversario() {
        this.idade++; //incrementa a idade
        System.out.println("Feliz aniversario, " + this.nome + "! Agora você tem " + this.idade + "anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
    }

    public String exibirDados() {
        // \n significa quebra de linha
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nE-mail: " + this.email +
                "\nTelefone: " + this.telefone;

    }
}
