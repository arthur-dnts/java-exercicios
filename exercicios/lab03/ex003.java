public class ex003 {
    public static void main(String[] args) {
        
        // Criando o objeto
        ItemPedido itemPrincipal = new ItemPedido();
        itemPrincipal.descricao = "Teclado";
        itemPrincipal.precoUnitario = 150.0;
        itemPrincipal.quantidade = 2;

        // Exibindo os dados do objeto
        itemPrincipal.exibirDados();

        // Apontamento de uma nova variável ao objeto
        ItemPedido itemObservado = itemPrincipal;

        // Usando a referência para alterar o objeto
        itemObservado.aumentarQuantidade(3);
        itemObservado.exibirDados();

        // Verificando a identidade das variáveis
        System.out.println(itemPrincipal == itemObservado);

        // Verificando a identidade de variáveis distintas, mas com mesmos valores
        ItemPedido itemIndependente = new ItemPedido();
        itemIndependente.descricao = "Teclado";
        itemIndependente.precoUnitario = 150.0;
        itemIndependente.quantidade = 5;

        System.out.println(itemPrincipal == itemIndependente);

        // Inrementnando a quantidade de itemIndependente
        itemIndependente.aumentarQuantidade(2);

        itemPrincipal.exibirDados();
        itemObservado.exibirDados(); 
        itemIndependente.exibirDados();

        // Desafio

        ItemPedido a = new ItemPedido();
        ItemPedido b = a;
        ItemPedido c = b;

        // 1 objeto, 3 variáveis apontando para o mesmo objeto
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == a);

        // Aumentando a quantidade através de c
        // Como a = b = c, todos irão ter a quantidade igual a 2
        c.aumentarQuantidade(2);
        System.out.println(a.quantidade);
        System.out.println(b.quantidade);
    }
}
