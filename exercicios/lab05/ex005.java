public class ex005 {
    public static void main(String[] args) {
        ItemPedido itemPrincipal = new ItemPedido("Teclado", 150.0, 2);
        ItemPedido itemObservado = itemPrincipal;

        // Criando itemIndependente com valores negativos para verificar o estado
        ItemPedido itemIndependente = new ItemPedido("Mouse", -80.0, -3);
        
        // Exibindo os dados dos objetos
        itemPrincipal.exibirDados();
        itemIndependente.exibirDados();
    
        // Confirmando a identidade das referências
        System.out.println(itemPrincipal == itemObservado);
        System.out.println(itemPrincipal == itemIndependente);
    
        // Aumentando a quantidade em -10 para validar a verificação
        itemPrincipal.aumentarQuantidade(-10);

        // Acessando os campos por meio de getters
        System.out.printf("%s\n", itemPrincipal.getDescricao());
        System.out.printf("%.2f\n", itemPrincipal.getPrecoUnitario());
        System.out.printf("%d\n", itemPrincipal.getQuantidade());

    }
}

