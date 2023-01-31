package collections.list;

import java.util.Comparator;

public class Familia implements Comparable<Familia>{
    private String nome;
    private Integer idade;
    private Integer altura;

    public Familia(String nome, Integer idade, Integer altura){
        this.nome=nome;
        this.idade=idade;
        this.altura=altura;
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }    
    public Integer getAltura(){
        return altura;
    }
     
    @Override
    public String toString() {
         return "[" + " nome  = " + nome + ", idade = " + idade + ", altura = " + altura + "]";
    }
   
    @Override
    public int compareTo(Familia familia){
        return this.getNome().compareToIgnoreCase(familia.getNome());
       
    }


}

//comparando as idades
class ComparatorIdade implements Comparator<Familia>{

    @Override
    public int compare(Familia f1, Familia f2) {
            return Integer.compare(f1.getIdade(),f2.getIdade());            
    }   


}

//comparando as alturas
class ComparatorAltura implements Comparator<Familia>{

    @Override
    public int compare(Familia f1, Familia f2) {
          return Integer.compare(f1.getAltura(),f2.getAltura());
    }
}

class ComparatorNomeIdadeAltura implements Comparator<Familia>{

    @Override
    public int compare(Familia f1, Familia f2) {   
        int nome = f1.getNome().compareToIgnoreCase(f2.getNome());
        if(nome!=0) return nome;

        Integer.compare(f1.getIdade(),f2.getIdade());
        int idade = 0;
        if(idade!=0) return idade;       
        return Integer.compare(f1.getAltura(),f2.getAltura());
    }



}

