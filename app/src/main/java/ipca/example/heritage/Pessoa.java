package ipca.example.heritage;

/**
 * Created by lourenco on 13/09/17.
 */

abstract public class Pessoa {

    private String nome;
    private int idade;
    private int presencas=0;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        if (idade > 0)this.idade = idade;
        else this.idade = 0;
    }

    public int getPresencas() {
        return presencas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) this.idade = idade;
    }

    public void adicionarPresenca(){
        presencas++;
    }

    abstract public String cargo();

}
