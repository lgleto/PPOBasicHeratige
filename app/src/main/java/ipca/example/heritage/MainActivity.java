package ipca.example.heritage;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        Aluno aluno= new Aluno("Lourenço", 11, 23234);
        Professor professor = new Professor("Mario", 23);
        Pessoa pessoa = new Aluno("Luis", 22, 2342);



        Log.d("Heranca", "O "+ aluno.getNome() + " tem " + aluno.getIdade() + " anos.");
        Log.d("Heranca", "O cargo do "+ aluno.getNome() + " é " + aluno.cargo() + ".");

        Log.d("Heranca", "O "+ professor.getNome() + " tem " + professor.getIdade() + " anos.");
        Log.d("Heranca", "O cargo do "+ professor.getNome() + " é " + professor.cargo() + ".");

        Log.d("Heranca", "O "+ pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
        Log.d("Heranca", "O cargo do "+ pessoa.getNome() + " é " + pessoa.cargo() + ".");

        List<Pessoa> aula= new ArrayList<>();

        aula.add(aluno);
        aula.add(professor);
        aula.add(pessoa);
        aula.add(new Aluno("José", 52, 235345 ));
        aula.add(new Aluno("Toni", 17, 23423));

        for (Pessoa p : aula ){
            p.adicionarPresenca();
        }

        for (Pessoa p : aula  ){
            Log.d("Heranca", "O "+ p.getNome() + " tem " + p.getPresencas() + " presença(s)");
            if (p instanceof Aluno){
                ((Aluno) p).estadoEstudar(true);
            }
            else if (p instanceof Professor){
                ((Professor) p).estadoLecionar(true);
            }
        }

        Log.d("Heranca", "Adeus.");

    }
}
