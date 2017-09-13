package ipca.example.heritage;

/**
 * Created by lourenco on 13/09/17.
 */

public class Professor extends Pessoa {

    Boolean lecionar;

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public void estadoLecionar(Boolean lecionar){
        this.lecionar=lecionar;
    }

    public boolean estaALecionar(){
        return this.lecionar;
    }

    @Override
    public String cargo() {
        return "Professor";
    }
}
