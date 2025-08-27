package prototype;

public class Main {
    public static void main(String[] args) {
        // Exercício 1 - Funcionário
        Funcionario f1 = new Funcionario("Ana Lima", "Desenvolvedora", 8500.00);
        Funcionario f2 = f1.clonar();
        f2.setNome("Cópia de " + f2.getNome());
        f2.setSalario(9000.00);

        System.out.println("=== Funcionário ===");
        System.out.println("Original: " + f1);
        System.out.println("Clone   : " + f2);
        System.out.println("São o mesmo objeto? " + (f1 == f2));

        // Exercício 2 - Produto
        Produto p1 = new Produto("Notebook X", 3999.90, "Informática");
        Produto p2 = p1.clonar();
        p2.setPreco(3499.90);
        p2.setNome(p2.getNome() + " (Promoção)");

        System.out.println("\n=== Produto ===");
        System.out.println("Original: " + p1);
        System.out.println("Clone   : " + p2);
        System.out.println("São o mesmo objeto? " + (p1 == p2));
    }
}
