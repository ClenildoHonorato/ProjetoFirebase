package projetofirebase.projetofirebase.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import projetofirebase.projetofirebase.DAO.ConfiguracaoFirebase;
import projetofirebase.projetofirebase.R;


public class PrincipalActivity extends AppCompatActivity {

    private Button btnAddProduto, btnVerProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnAddProduto = (Button) findViewById(R.id.btnAddProduto);
        btnVerProdutos = (Button) findViewById(R.id.btnVerProdutos);

        btnAddProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarProdutos();
            }
        });

        btnVerProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verProdutos();
            }
        });

    }

    private void verProdutos() {
        Intent intent = new Intent(PrincipalActivity.this, ProdutosActivity.class);
        startActivity(intent);
        finish();
    }

    private void cadastrarProdutos() {
        Intent intent = new Intent(PrincipalActivity.this, CadastroProdutos.class);
        startActivity(intent);
        finish();
    }
}
