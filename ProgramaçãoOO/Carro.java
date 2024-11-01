package ProgramaçãoOO;

public class Carro{
    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    public String cor;

    //Construtor
    public Carro (){
        marca = "Indefinido";
        modelo = "Indefinido";
        ano = 0;
        cor = "Indefinido";
    }
    public Carro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo; 
        this.ano = ano; 
        this.cor = cor;

    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;

    }public int getAno() {
        return ano;
        
    }public String getCor() {
        return cor;
    }
        

}
