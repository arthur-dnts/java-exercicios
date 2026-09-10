public class ex007 {
    public static void main(String[] args) {
        // Criando um pedido vazio
        Pedido vazio = new Pedido();
        System.out.printf("Total: %.2f\n", vazio.calcularTotal());

        // Novo cenário com itens preenchidos
        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        ItemPedido itemTeclado = new ItemPedido(teclado, 2);
        ItemPedido itemMouse = new ItemPedido(mouse, 1);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(itemTeclado);
        pedido.adicionarItem(itemMouse);
        System.out.printf("Total: %.2f\n", pedido.calcularTotal());

        // Desafio
        Pedido desafio = new Pedido();
        desafio.adicionarItem(itemTeclado);
        System.out.printf("Total: %.2f\n", desafio.calcularTotal());
        itemTeclado.aumentarQuantidade(2);
        System.out.printf("Total: %.2f\n", desafio.calcularTotal());
  }
}
