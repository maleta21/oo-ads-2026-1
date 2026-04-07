public class Estudante extends pessoa {

    public String Curso;
    public Double nota1;
    public Double nota2;

    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String Curso
    ) {
        super(nome, idade, cpf, email, telefone);

        if (Curso == null || Curso.isEmpty()) {
            throw new IllegalArgumentException("O curso deve ser informado.");
        }

        this.Curso = Curso;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public Double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String Situacao() {
        return (calcularMedia() >= 6.0) ? "APROVADO" : "REPROVADO";
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nCurso: " + this.Curso +
                "\nNota 1: " + this.nota1 +
                "\nNota 2: " + this.nota2 +
                "\nMédia Final: " + calcularMedia() +
                "\nSituação: " + Situacao();
    }
}