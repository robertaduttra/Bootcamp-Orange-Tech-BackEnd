package collections.list;
// Dada uma lista com 5 notas de um aluno, faça o que se pede abaixo.

// List<Double> notas = new ArrayList<>();        

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas");
        List<Double> notas = new ArrayList<>();
        notas.add(8.0);
        notas.add(9.5);
        notas.add(7.5);
        notas.add(7.0);
        notas.add(5.0);

        System.out.println(notas.toString());

        // posição da nota 5 pode ser 5.0 ou 5d para indiccar que é um double.
        System.out.println("Exiba posição da nota 5 " + notas.indexOf(5d) + "º posicao");
        System.out.println("Posição da nota 9.5 " + notas.indexOf(9.5) + "º posicao");
        System.out.println(" Posição da nota 8.0 " + notas.indexOf(8d) + "º posicao");

        // no add escolhe o que tem o indice e o elemento.
        System.out.println("Adicione na lista a nota 4.0 na posição 4: ");
        notas.add(4, 4.0);
        System.out.println(notas);

        // usando set para substituir.
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // notas.set(5, 6d);
        // caso não tenhamos a posição usar o indexOf
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        // informando se na lista tem a nota 8(metodo contains) e informando a posição
        // da mesma.
        System.out.println(
                "Confira se a nota 8.0 está na lista: " + notas.contains(8.0) + notas.indexOf(8.0) + " º posicao");

        // exibindo pelo for each somente o valor dos elementos.
        System.out.println("Exibindo na ordem que foram informadas");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        // metodo contrario ao do indexof, exibindo pela posição e retornando o
        // elemento.
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        // nao tem metodo nativo, por isso iremos usar o collections para exibir a maior
        // e menor nota.
        System.out.println(" Exiba a menor nota " + Collections.min(notas));

        System.out.println(" Exiba a maior nota " + Collections.max(notas));

        // soma das notas iterator permite percorrer a collection
        Iterator<Double> iterator = notas.iterator();
        // inicia o contador em 0.
        Double soma = 0d;
        // enquanto o iterator tem proximo.
        while (iterator.hasNext()) {
            // o iterator retorna um double que vai p variavel next.
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(" A soma das notas é " + soma);

        // metodo size para comparar com o tamanho total.
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        // metodo remove com retorno do elemento.
        System.out.println("Remova a nota 8: ");
        notas.remove(8d);
        System.out.println(notas);
        // metodo remove com retorno do index.
        System.out.println("Remova a nota no posição 0 : ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        // variavel next é igual ao iterator, se o next for maior que 7 exclua.
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next > 7)
                iterator1.remove();
        }
        System.out.println(notas);       

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }

}
