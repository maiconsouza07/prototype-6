package prototype;

public class Produto implements Prototype<Produto> {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Construtor de cópia
    public Produto(Produto outro) {
        this.nome = outro.nome;
        this.preco = outro.preco;
        this.categoria = outro.categoria;
    }

    @Override
    public Produto clonar() {
        return new Produto(this);
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public String getCategoria() { return categoria; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "Produto{nome='%s', preco=%.2f, categoria='%s'}".formatted(nome, preco, categoria);
    }
}
