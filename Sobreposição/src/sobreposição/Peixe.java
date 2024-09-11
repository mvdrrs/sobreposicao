
package sobreposição;



public class Peixe extends Animal {
    
    private String CorEscama;

    public Peixe(float peso, int idade, int membros) {
        super(peso, idade, membros);
        String corEscama = null;
        this.CorEscama = corEscama;
    }

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
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
    
    
    public void soltarBolha (){
        
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Plancton");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("GluGlu");
        
    }

    @Override
    public String toString() {
        return "Peixe{" +Animal.class.toString() + "\nCorEscama=" + CorEscama + '}';
    }
    
    
}
