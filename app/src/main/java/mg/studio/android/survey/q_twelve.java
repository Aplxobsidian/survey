package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_twelve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);

    }
    public  void to_fin(View view){
        RadioGroup r12= findViewById(R.id.r12);
        if (r12.getCheckedRadioButtonId()!=-1){
            startActivity(new Intent(q_twelve.this,fin.class));}
        else{
            Toast.makeText(q_twelve.this,"Need to select item!",Toast.LENGTH_LONG).show();
        }

    }
}
