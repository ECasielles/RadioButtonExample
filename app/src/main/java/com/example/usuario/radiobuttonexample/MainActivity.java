package com.example.usuario.radiobuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

/**
 * Clase de ejemplo para RadioButton y RadioGroup
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see AppCompatActivity
 */
public class MainActivity extends AppCompatActivity {

    private View constraintProfessional;
    private View constraintBusiness;
    private RadioGroup rgpOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintProfessional = findViewById(R.id.constraintProfessional);
        constraintBusiness = findViewById(R.id.constraintBusiness);
        rgpOptions = findViewById(R.id.rgpOptions);
        rgpOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int viewId) {
                switch (viewId) {
                    case R.id.rbtBusiness:
                        viewProfessional(false);
                        break;
                    case R.id.rbtProfessional:
                        viewProfessional(true);
                        break;
                }
            }
        });
    }
    /*/**
     * Método que gestiona el evento onClick de los componentes RadioButton
     * @param view Objeto RadioButton activado.*/
    /*
    public void onRadioButtonClicked (View view){
        switch (view.getId()){
            case R.id.rbtBusiness:
                viewProfessional(false);
                break;
            case R.id.rbtProfessional:
                viewProfessional(true);
                break;
        }
    }*/

    /**
     * Método que indica qué ConstraintLayout ha de estar visible según la opción seleccionada
     * @param b
     */
    private void viewProfessional(boolean b){
        constraintProfessional.setVisibility(b ? View.VISIBLE : View.GONE);
        constraintBusiness.setVisibility(b ? View.GONE : View.VISIBLE);
    }
}
