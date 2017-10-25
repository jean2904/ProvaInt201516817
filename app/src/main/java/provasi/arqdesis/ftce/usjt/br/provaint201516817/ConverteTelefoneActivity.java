package provasi.arqdesis.ftce.usjt.br.provaint201516817;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Autor: Jean Luca
 * RA: 201516817
 */

public class ConverteTelefoneActivity extends Activity{
    public static final String TELEFONE = "provasi.arqdesis.ftce.usjt.br.provaint201516817.telefone";
    String liga;
    EditText telefone;
    Activity activity;

    /**
     * Autor: Jean Luca
     * RA: 201516817
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_telefone);
        activity = this;
        Intent intent = getIntent();
        liga = intent.getStringExtra(MainActivity.CHAVE);
        telefone = (EditText)findViewById(R.id.txt_telefone);
        telefone.setText(liga);
        intent.putExtra(TELEFONE, liga);

    }
}
