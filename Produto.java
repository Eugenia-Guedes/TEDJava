public class Produto implements Calculavel {
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(String nome, double preco, CategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public double calcularImposto() {
        switch (categoria) {
            case ELETRONICO:
                return preco * 0.20;
            case ALIMENTO:
                return preco * 0.05;
            case PAPELARIA:
                return preco * 0.10;
            default:
                return 0;
        }
    }

    @Override
    public double calcularJuros() {
        return 0;
    }

    @Override
    public double calcularLucro() {
        return preco * 0.30;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }

    @Override
    public double calcularTaxaManuseio() {
        return 2.0;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + calcularImposto() + calcularTaxaManuseio();
    }

    @Override
    public double calcularTotal() {
        return calcularPrecoFinal();
    }
}

