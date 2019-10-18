package ahmedjarada.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Bundle b = getIntent().getExtras();
        TextView someText= (TextView)findViewById(R.id.someText);
        String text= b.getString("someWords", "NaN");
        someText.setText(text);
//        By AJ
    }
}
