package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_eleven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);

    }
    public  void to_q_twelve(View view){
        RadioGroup r11= findViewById(R.id.r11);
        if (r11.getCheckedRadioButtonId()!=-1){
            startActivity(new Intent(q_eleven.this,q_twelve.class));}
        else{
            Toast.makeText(q_eleven.this,"Need to select item!",Toast.LENGTH_LONG).show();
        }

    }
}
