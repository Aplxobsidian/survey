package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.*;

public class q_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);
    }

    public  void to_q_two(View view){
        RadioGroup r1= findViewById(R.id.r1);
        if (r1.getCheckedRadioButtonId()!=-1){
            startActivity(new Intent(q_one.this,q_two.class));}
        else{
            Toast.makeText(q_one.this,"Need to select item!",Toast.LENGTH_LONG).show();

        }

    }


}
