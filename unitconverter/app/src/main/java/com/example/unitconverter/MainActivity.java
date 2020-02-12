package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKG, txtLb, txtKm, txtMi, txtLi, txtGa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKG = findViewById(R.id.txtKG);
        txtLb = findViewById(R.id.txtLb);
        txtKm = findViewById(R.id.txtKm);
        txtMi = findViewById(R.id.txtMi);
        txtLi = findViewById(R.id.txtLi);
        txtGa = findViewById(R.id.txtGa);



        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKG = s.toString();
                Log.i("UnitConverter", "Value in txtKG = " + strKG);

                if (!txtKG.isFocused()) return;
                if (strKG.length() == 0) return;


                try {
                    double valKG = Double.parseDouble(strKG);
                    double valLb = valKG*2.2;
                    String strLb = Double.toString(valLb);
                    Log.i("UnitConverter", "Value in txtLb = " + strLb);

                    MainActivity.this.txtLb.setText(strLb);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLb = s.toString();
                Log.i("UnitConverter", "Value in txtLb = " + strLb);

                if (!txtLb.isFocused()) return;
                if (strLb.length() == 0) return;

                try {
                    double valLb = Double.parseDouble(strLb);
                    double valKG = valLb/2.2;
                    String strKG = Double.toString(valKG);
                    Log.i("UnitConverter", "Value in txtKG = " + strKG);

                    MainActivity.this.txtKG.setText(strKG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKm = s.toString();
                Log.i("UnitConverter", "Value in txtKm = " + strKm);

                if (!txtKm.isFocused()) return;
                if (strKm.length() == 0) return;


                try {
                    double valKm = Double.parseDouble(strKm);
                    double valMi = valKm*0.621;
                    String strMi = Double.toString(valMi);
                    Log.i("UnitConverter", "Value in txtMi = " + strMi);

                    MainActivity.this.txtMi.setText(strMi);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
        txtMi.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strMi = s.toString();
                Log.i("UnitConverter", "Value in txtMi = " + strMi);

                if (!txtMi.isFocused()) return;
                if (strMi.length() == 0) return;


                try {
                    double valMi = Double.parseDouble(strMi);
                    double valKm = valMi/0.621;
                    String strKm = Double.toString(valKm);
                    Log.i("UnitConverter", "Value in txtKm = " + strKm);

                    MainActivity.this.txtKm.setText(strKm);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLi.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLi = s.toString();
                Log.i("UnitConverter", "Value in txtLi = " + strLi);

                if (!txtLi.isFocused()) return;
                if (strLi.length() == 0) return;


                try {
                    double valLi = Double.parseDouble(strLi);
                    double valGa = valLi/3.785;
                    String strGa = Double.toString(valGa);
                    Log.i("UnitConverter", "Value in txtGa = " + strGa);

                    MainActivity.this.txtGa.setText(strGa);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtGa.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strGa = s.toString();
                Log.i("UnitConverter", "Value in txtGa = " + strGa);

                if (!txtGa.isFocused()) return;
                if (strGa.length() == 0) return;


                try {
                    double valGa = Double.parseDouble(strGa);
                    double valLi = valGa*3.785;
                    String strLi = Double.toString(valLi);
                    Log.i("UnitConverter", "Value in txtLi = " + strLi);

                    MainActivity.this.txtLi.setText(strLi);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

    }
}
