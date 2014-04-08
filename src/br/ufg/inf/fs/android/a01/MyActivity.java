package br.ufg.inf.fs.android.a01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /**
     * Chamado para "inflar" o recurso "menu" contendo
     * os itens do menu de opções.
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    /**
     * Chamado quando se seleciona o item Configurar.
     * Neste caso, apenas exibe uma mensagem por um
     * perído de tempo.
     * @param item
     */
    public void onClickMenuConfigurar(MenuItem item) {
        Toast toast = Toast.makeText(this, "Configurar...", Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * Chamado quando se seleciona o item Sair.
     * Neste caso, termina a aplicação.
     * @param item
     */
    public void onClickMenuSair(MenuItem item) {
        finish();
    }
}
