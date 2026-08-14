public class ex002 {
    public static void main(String[] args) {

        // Declaração de pedidos a partir da classe
        ItemPedido item1 = new ItemPedido();
        ItemPedido item2 = new ItemPedido();

        item1.descricao = "Teclado";
        item1.precoUnitario = 150.0;
        item1.quantidade = 2;
        double subtotal1 = item1.calcularSubtotal();

        item2.descricao = "Mouse";
        item2.precoUnitario = 80.0;
        item2.quantidade = 3;
        double subtotal2 = item2.calcularSubtotal();
        
        // Função que exibe somente o subtotal de cada pedido
        System.out.printf("Subtotal1: %.2f\n", subtotal1);
        System.out.printf("Subtotal2: %.2f\n\n", subtotal2);

        // Imprimindo todas as informações de cada pedido
        item1.exibirDados();
        item2.exibirDados();

        // Aumentando a quantidade de produtos
        item1.aumentarPedido(2);
        System.out.println(); // Quebra de linha
        item1.exibirDados();

        // DESAFIO: Calcular o subtotal de um produto com desconto
        System.out.printf("Item1 com Desconto: %.2f\n", item1.aplicarDesconto(10));
    }
}

