public class ex004 {
    public static void main(String[] args) {
 
        ItemPedido itemPrincipal = new ItemPedido();
        itemPrincipal.descricao = "Teclado";
        itemPrincipal.precoUnitario = 150.0;
        itemPrincipal.aumentarQuantidade(5);
        System.out.printf("Quantidade Inicial: %d\n", itemPrincipal.getQuantidade());
        itemPrincipal.aumentarQuantidade(-3);
    
        // Imprimindo a quantidade modificada com setter
        System.out.printf("Quantidade Final (Somar -3): %d\n", itemPrincipal.getQuantidade());
    
        // Criando uma nova referência
        ItemPedido itemObservado = itemPrincipal;
        // Verificando a identidade dos objetos
        System.out.println(itemPrincipal == itemObservado);
        itemPrincipal.exibirDados();
    
        // Tentando modificar os dados a partir de itemObservado
        itemObservado.aumentarQuantidade(-10);

        // Exibindo os dados das referências
        System.out.printf("Subtotal itemPrincipal (Somar -10): %.2f\n", itemPrincipal.calcularSubtotal());
        System.out.printf("Subtotal itemObservado (Somar -10): %.2f\n", itemObservado.calcularSubtotal());
    
        // Incrementando o valor de quantidade a partir de itemObservado
        itemObservado.aumentarQuantidade(2);
        // Imprimindo a quantidade das duas referências
        System.out.printf("Quant. itemPrincipal: %d\n", itemPrincipal.getQuantidade());
        System.out.printf("Quant. itemObservado: %d\n", itemObservado.getQuantidade());

        // Exibindo os dados das referências
        System.out.printf("Subtotal itemPrincipal (Somar +2): %.2f\n", itemPrincipal.calcularSubtotal());
        System.out.printf("Subtotal itemObservado (Somar +2): %.2f\n", itemObservado.calcularSubtotal());

        // Verificando a identidade dos objetos
        System.out.println(itemPrincipal == itemObservado);

        // Criando um novo objeto independente
        ItemPedido itemIndependente = new ItemPedido();
        itemIndependente.descricao = "Teclado";
        itemIndependente.precoUnitario = 150.0;
        itemIndependente.aumentarQuantidade(5);

        // Verificando os estados de ambos objetos e suas identidades
        itemPrincipal.exibirDados();
        itemIndependente.exibirDados();
    
        System.out.println(itemPrincipal == itemIndependente);

        // Desafio
        itemIndependente.reduzirQuantidade(2);
        System.out.printf("Quantidade (Reduzir 2): %d\n", itemIndependente.getQuantidade());
    
        itemIndependente.reduzirQuantidade(10);
        System.out.printf("Quantidade (Reduzir 10): %d\n", itemIndependente.getQuantidade());
    
        itemIndependente.reduzirQuantidade(-1);
        System.out.printf("Quantidade (Reduzir -1): %d\n", itemIndependente.getQuantidade()); 
    }
}

