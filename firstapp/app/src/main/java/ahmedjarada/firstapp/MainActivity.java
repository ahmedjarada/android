package ahmedjarada.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText SomeWords = (EditText) findViewById(R.id.editText);
        final TextView Hello = (TextView) findViewById(R.id.textView);
        SomeWords.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    Hello.setText("HelloWorld");
                } else {
                    Hello.setText(s);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Button Nxtbtn = (Button) findViewById(R.id.btnNxt);
        Nxtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(SomeWords.getText().length()==0){
                    Toast.makeText(getApplicationContext(), "Enter some words in text field!", Toast.LENGTH_SHORT).show();
                    SomeWords.setError("This field is required fill");
                }else{
                    Intent i = new Intent(getApplicationContext(), ShowActivity.class);
                    i.putExtra("someWords", SomeWords.getText().toString());
                    startActivity(i);
//                   By AJ
                }
            }
        });
    }




}

