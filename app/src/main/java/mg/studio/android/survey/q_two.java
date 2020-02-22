package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
    }

    public void to_q_three(View view) {
        RadioGroup r2 = findViewById(R.id.r2);
        if (r2.getCheckedRadioButtonId() != -1) {
            startActivity(new Intent(q_two.this, q_three.class));
        } else {
            Toast.makeText(q_two.this, "Need to select item!", Toast.LENGTH_LONG).show();

        }
    }
}