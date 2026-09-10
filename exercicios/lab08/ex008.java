public class ex008 {
    public static void main(String[] args) {
 
        // Novo cenário com itens preenchidos
        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(teclado, 2);
        pedido.adicionarItem(mouse, 1);
        System.out.printf("Total: %.2f\n", pedido.calcularTotal());
        
        Pedido pedido2 = new Pedido();
        pedido2.adicionarItem(teclado, 1);
        System.out.printf("Total: %.2f\n", pedido2.calcularTotal());

    }
}
