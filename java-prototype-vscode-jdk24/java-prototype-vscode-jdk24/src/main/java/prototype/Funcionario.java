package prototype;

public class Funcionario implements Prototype<Funcionario> {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Construtor de cópia
    public Funcionario(Funcionario outro) {
        this.nome = outro.nome;
        this.cargo = outro.cargo;
        this.salario = outro.salario;
    }

    @Override
    public Funcionario clonar() {
        return new Funcionario(this);
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Funcionario{nome='%s', cargo='%s', salario=%.2f}".formatted(nome, cargo, salario);
    }
}
