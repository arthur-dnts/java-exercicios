public class ex006 {
    public static void main(String[] args) {
        
        // Criação dos objetos
        Produto teclado = new Produto("Teclado", 150.0);
        // Produto invalido = new Produto("Teste", -10.0); // Caso teste
        // System.out.println(invalido.getDescricao());
        // System.out.println(invalido.getPreco());
        
        // Criando um novo objeto a partir de ItemPedido
        ItemPedido itemPrincipal = new ItemPedido(teclado, 2);
        ItemPedido itemObservado = itemPrincipal;
        ItemPedido itemIndependente = new ItemPedido(teclado, 1);

        // Exibindo dados dos objetos
        System.out.println("- Item Principal ------------------");
        System.out.printf("Descrição: %s\n", itemPrincipal.getProduto().getDescricao());
        System.out.printf("Preço: %.2f\n", itemPrincipal.getProduto().getPreco());
        System.out.printf("Subtotal: %.2f\n", itemPrincipal.calcularSubtotal());
        System.out.println("-----------------------------------");
    
        System.out.println("- Item Independente ---------------");
        System.out.printf("Descrição: %s\n", itemIndependente.getProduto().getDescricao());
        System.out.printf("Preço: %.2f\n", itemIndependente.getProduto().getPreco());
        System.out.printf("Subtotal: %.2f\n", itemIndependente.calcularSubtotal());
        System.out.println("-----------------------------------");

        // Verificando a identidade dos itens
        System.out.printf("itemPrincipal == itemObservado: %b\n", (itemPrincipal == itemObservado));
        System.out.printf("itemPrincipal == itemIndependente: %b\n", (itemPrincipal == itemIndependente));
        // System.out.printf("teclado == itemPrincipal: %b\n", (teclado == itemPrincipal));
        System.out.printf("itemPrincipal.getProduto() == itemIndependente.getProduto(): %b\n", (itemPrincipal.getProduto() == itemIndependente.getProduto()));

        // Adicionando um novo produto
        Produto outroTeclado = new Produto("Teclado", 150.0);
        ItemPedido itemOutroProduto = new ItemPedido(outroTeclado, 2);

        System.out.println(teclado == outroTeclado);
        System.out.println(itemPrincipal.getProduto() == itemOutroProduto.getProduto());
        System.out.println(itemOutroProduto.calcularSubtotal());

        // Desafio
        Produto mouse = new Produto("Mouse", 80.0);
        ItemPedido mousePrimario = new ItemPedido(mouse, 3);
        ItemPedido mouseSecundario = new ItemPedido(mouse, 5);

        // Exibindo os dados de cada ItemPedido
        mousePrimario.exibirDados();
        mouseSecundario.exibirDados();

        // Validando a identidade dos itens
        System.out.println(mousePrimario == mouseSecundario);
    }
}
