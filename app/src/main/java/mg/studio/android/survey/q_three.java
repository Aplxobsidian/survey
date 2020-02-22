package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);

    }

    public void to_q_four(View view) {
        RadioGroup r3 = findViewById(R.id.r3);
        if (r3.getCheckedRadioButtonId() != -1) {
            startActivity(new Intent(q_three.this, q_four.class));
        } else {
            Toast.makeText(q_three.this, "Need to select item!", Toast.LENGTH_LONG).show();

        }
    }

}
