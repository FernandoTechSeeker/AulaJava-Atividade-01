package Aula8;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void fazerBarulho(){
        System.out.println(nome + " está fazendo barulho..");
    }
    
}