package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_eight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);

    }

    public  void to_q_nine(View view){
        RadioGroup r8= findViewById(R.id.r8);
        if (r8.getCheckedRadioButtonId()!=-1){
            startActivity(new Intent(q_eight.this,q_nine.class));}
        else{
            Toast.makeText(q_eight.this,"Need to select item!",Toast.LENGTH_LONG).show();

        }

    }


}
