package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);

    }

    public void to_q_five(View view) {
        CheckBox b1 = findViewById(R.id.cb1);
        CheckBox b2 = findViewById(R.id.cb2);
        CheckBox b3 = findViewById(R.id.cb3);
        CheckBox b4 = findViewById(R.id.cb4);
        CheckBox b5 = findViewById(R.id.cb5);
        CheckBox b6 = findViewById(R.id.cb6);
        CheckBox b7 = findViewById(R.id.cb7);

        if ((b1.isChecked()||b2.isChecked()||b3.isChecked()||b4.isChecked()||b5.isChecked()||b6.isChecked()||b7.isChecked())){
            startActivity(new Intent(q_four.this, q_five.class));
        }
        else{
            Toast.makeText(q_four.this, "Need to select item!", Toast.LENGTH_LONG).show();
        }

    }
}
