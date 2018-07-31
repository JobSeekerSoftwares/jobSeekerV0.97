package com.jobseeker.jobseekerusuario;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.jobseeker.jobseekerusuario.Model.Trabalhador;

import java.util.ArrayList;

public class FriendInfo2Activity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private ArrayList<String> wordList;
    private Trabalhador job;
    EditText nome,email, objetivo, perfil, experiencia, formacao, cursos, idiomas, complementar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        wordList = new ArrayList<String>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_info2);
        job = getIntent().getParcelableExtra("friendInfo");
        if(job == null){
            Toast.makeText(getApplicationContext() , "Erro encontrado, nao clique nas opcoes", Toast.LENGTH_SHORT).show();
            wordList.add("Erro");
        }else{
            nome = (EditText) findViewById(R.id.editText21);
            email = (EditText) findViewById(R.id.editText22);
            objetivo = (EditText) findViewById(R.id.editText23);
            perfil= (EditText) findViewById(R.id.editText24);
            experiencia = (EditText) findViewById(R.id.editText25);
            formacao = (EditText) findViewById(R.id.editText26);
            cursos = (EditText) findViewById(R.id.editText27);
            idiomas = (EditText) findViewById(R.id.editText28);
            complementar = (EditText) findViewById(R.id.editText29);
            nome.setText(job.getNome());
            email.setText(job.getEmail());
            objetivo.setText(job.getObjetivo());
            perfil.setText(job.getPerfil());
            experiencia.setText(job.getExperiencia());
            formacao.setText(job.getFormacao());
            cursos.setText(job.getCursoComplementar());
            idiomas.setText(job.getIdiomas());
            complementar.setText(job.getInfoProfissional());

        }


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
