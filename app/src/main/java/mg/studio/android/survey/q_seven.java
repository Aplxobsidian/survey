package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_seven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);
    }

    public void to_q_eight(View view) {
        RadioGroup r7= findViewById(R.id.r7);
        if (r7.getCheckedRadioButtonId()!=-1){
            startActivity(new Intent(q_seven.this,q_eight.class));}
        else{
            Toast.makeText(q_seven.this,"Need to select item!",Toast.LENGTH_LONG).show();

        }
    }
}
