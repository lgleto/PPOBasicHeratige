package ipca.example.heritage;

/**
 * Created by lourenco on 13/09/17.
 */

public class Aluno extends Pessoa {

    private Boolean estudar;
    private int id;

    public Aluno(String nome, int idade,int id) {
        super(nome, idade);
        this.id=id;
    }

    public void estadoEstudar(Boolean estado){
        this.estudar=estado;
    }

    public boolean estaAEstudar(){
        return this.estudar;
    }


    @Override
    public String cargo() {
        return "Aluno";
    }
}
