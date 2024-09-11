
package sobreposição;



public class Reptil extends Animal {   
    
   
    private String corEscama;

    public Reptil(String corEscama, float peso, int idade, int membros,String corAcama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
    

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    

    @Override
    public void locomover() {
        System.out.println("Arrastando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Plantas");
      
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
        
    }

    @Override
    public String toString() {
        return "Reptil{" +Animal.class.toString() + "\ncorEscama=" + corEscama + '}';
    }
    
    
    
}
