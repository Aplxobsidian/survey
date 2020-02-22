package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_nine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);

    }


    public  void to_q_ten(View view){
        RadioGroup r9= findViewById(R.id.r9);
        if (r9.getCheckedRadioButtonId()!=-1){
            startActivity(new Intent(q_nine.this,q_ten.class));}
        else{
            Toast.makeText(q_nine.this,"Need to select item!",Toast.LENGTH_LONG).show();
        }

    }
}
