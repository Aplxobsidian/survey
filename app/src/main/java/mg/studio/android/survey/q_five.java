package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class q_five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);

    }

    public void to_q_six(View view) {
        CheckBox b12 = findViewById(R.id.cb12);
        CheckBox b22 = findViewById(R.id.cb22);
        CheckBox b32 = findViewById(R.id.cb32);
        CheckBox b42 = findViewById(R.id.cb42);
        CheckBox b52 = findViewById(R.id.cb52);
        CheckBox b62 = findViewById(R.id.cb62);
        CheckBox b72 = findViewById(R.id.cb72);

        if ((b12.isChecked()||b22.isChecked()||b32.isChecked()||b42.isChecked()||b52.isChecked()||b62.isChecked()||b72.isChecked())){
            startActivity(new Intent(q_five.this, q_six.class));
        }
        else{
            Toast.makeText(q_five.this, "Need to select item!", Toast.LENGTH_LONG).show();
        }

    }

}
