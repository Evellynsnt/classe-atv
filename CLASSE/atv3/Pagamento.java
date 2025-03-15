interface Pagamento {
    void processarPagamento(double valor);
}

public class Pix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}

public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoPix = new Pix();

        pagamentoCartao.processarPagamento(100.0);  
        pagamentoPix.processarPagamento(50.0);    
    }
}
