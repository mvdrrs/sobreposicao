
package sobreposição;


public class Ave extends Animal {
    
    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena=corPena;
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    public void fazerNinho() {
        
        
        
    }

    @Override
    public void locomover() {
        System.out.println("Voar");
       
    }

    @Override
    public void alimentar() {
        System.out.println("Minhoca");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Barulho de Ave");
       
    }

    @Override
    public String toString() {
        return "Ave{" +Animal.class.toString() + "\ncorPena=" + corPena + '}';
    }
    
    
}
