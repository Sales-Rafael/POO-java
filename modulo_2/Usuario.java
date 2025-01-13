public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;
    private int contadorEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimos = new Emprestimo[10]; 
        this.contadorEmprestimos = 0;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (contadorEmprestimos < historicoEmprestimos.length) {
            this.historicoEmprestimos[contadorEmprestimos] = emprestimo;
            contadorEmprestimos++;
        } else {
            System.out.println("Limite de empréstimos alcançado.");
        }
    }
}
