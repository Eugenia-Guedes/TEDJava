public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João da Silva", "123.456.789-00");
        Produto produto1 = new Produto("Smartphone", 1500.00, CategoriaProduto.ELETRONICO);
        Produto produto2 = new Produto("Pão", 5.00, CategoriaProduto.ALIMENTO);
        Produto produto3 = new Produto("Caderno", 20.00, CategoriaProduto.PAPELARIA);

        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.adicionaCliente(cliente);
        notaFiscal.adicionaProduto1(produto1);
        notaFiscal.adicionaProduto2(produto2);
        notaFiscal.adicionaProduto3(produto3);

        notaFiscal.exibirNotaFiscal();
    }
}
