public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }

    public void adicionaProduto2(Produto produto) {
        this.produto2 = produto;
    }

    public void adicionaProduto3(Produto produto) {
        this.produto3 = produto;
    }

    public void exibirNotaFiscal() {
        System.out.println("Nota Fiscal");

        System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());

        System.out.println("Produtos:");

        if (produto1 != null) {
            System.out.printf("%s - Preço: R$%.2f - Preço Final: R$%.2f%n", produto1.getNome(), produto1.getPreco(), produto1.calcularPrecoFinal());
        }
        if (produto2 != null) {
            System.out.printf("%s - Preço: R$%.2f - Preço Final: R$%.2f%n", produto2.getNome(), produto2.getPreco(), produto2.calcularPrecoFinal());
        }
        if (produto3 != null) {
            System.out.printf("%s - Preço: R$%.2f - Preço Final: R$%.2f%n", produto3.getNome(), produto3.getPreco(), produto3.calcularPrecoFinal());
        }

        double total = 0;
        if (produto1 != null) total += produto1.calcularTotal();
        if (produto2 != null) total += produto2.calcularTotal();
        if (produto3 != null) total += produto3.calcularTotal();

        System.out.printf("Total: R$%.2f%n", total);
    }
}

