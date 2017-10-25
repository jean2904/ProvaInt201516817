package provasi.arqdesis.ftce.usjt.br.provaint201516817;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Autor: Jean Luca
 * RA: 201516817
 */
public class MainActivity extends Activity {
    public static final String CHAVE = "provasi.arqdesis.ftce.usjt.br.provaint201516817.liga";
    EditText txtLigar;

    /**
     * Autor: Jean Luca
     * RA: 201516817
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLigar = (EditText)findViewById(R.id.txt_liga);
    }

    /**
     * Autor: Jean Luca
     * RA: 201516817
     */
    public void ligar(View view){
        String liga = txtLigar.getText().toString();
        Intent intent = new Intent(this, ConverteTelefoneActivity.class);
        intent.putExtra(CHAVE, liga);
        startActivity(intent);
    }
}
