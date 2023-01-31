package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Dadas as seguintes informações sobre minha familia, crie uma lista e ordene esta lista exibindo:
//Roberta - 29 - 1.50;
//Cristiane - 48 - 1.60;
//Lucas - 28 - 2.00;
//(nome - idade - altura;

// List<Familia> minhasFamilia = new ArrayList<>(){{

public class ExemploOrdenacaoList{
    public static void main(String[] args) {
        List<Familia>minhaFamilia = new ArrayList<>(){{
            add(new Familia("Roberta", 29 , 150));
            add(new Familia("Cristiane", 48, 160));
            add(new Familia("Lucas", 28, 200));
        }};        

        System.out.println(minhaFamilia.toString());

        //Mostrar lista pela ordem aleatoria pelo metodo shuffle pela colections.
        System.out.println("--\tOrdem Natural\t---");
        Collections.shuffle(minhaFamilia);
        System.out.println(minhaFamilia);

        //Mostrar lista pela ordem natural nome, apos criada a comparator.
        System.out.println("--\tOrdem natural(nome)\t---");
        Collections.sort(minhaFamilia);
        System.out.println(minhaFamilia.toString());

        //Mostrar lista pela ordem de idade
        System.out.println("--\tOrdem de idade\t---");
        Collections.sort(minhaFamilia, new ComparatorIdade());
        System.out.println(minhaFamilia.toString());

        //Mostrar lista pela ordem de altura.
        System.out.println("--\tOrdem de altura \t---");
        Collections.sort(minhaFamilia, new ComparatorAltura());
        System.out.println(minhaFamilia.toString());

        //Mostrar em ordem de nome/idade/altura.
        System.out.println("--\tOrdem nome/idade/alturat\t---");
        Collections.sort(minhaFamilia, new ComparatorNomeIdadeAltura());
        System.out.println(minhaFamilia.toString());

            
        







        
    }

}
