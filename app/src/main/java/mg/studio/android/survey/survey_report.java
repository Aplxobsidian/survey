package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.content.Context;
import android.content.SharedPreferences;

public class survey_report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_report);





    }
    public void getresult(View view){


        TextView r1 = findViewById(R.id.rep_one);
        TextView r2 = findViewById(R.id.rep_two);
        TextView r3 = findViewById(R.id.rep_three);
        TextView r4 = findViewById(R.id.rep_four);
        TextView r5 = findViewById(R.id.rep_five);
        TextView r6 = findViewById(R.id.rep_six);
        TextView r7 = findViewById(R.id.rep_seven);
        TextView r8 = findViewById(R.id.rep_eight);
        TextView r9 = findViewById(R.id.rep_nine);
        TextView r10 = findViewById(R.id.rep_ten);
        TextView r11 = findViewById(R.id.rep_eleven);
        TextView r12 = findViewById(R.id.rep_twelve);



        SharedPreferences mySharedPreferences = this.getSharedPreferences("MYPREFERENCENAME", Context.MODE_PRIVATE);
        String s1 = "Q1: Buy new brand "+mySharedPreferences.getString("q_one", "");
        String s2 ="Q2: Current phone cost "+mySharedPreferences.getString("q_two","");
        String s3 ="Q3: Phone cell network "+mySharedPreferences.getString("q_three","");
        String s4 ="Q4: Current function "+mySharedPreferences.getString("q_four","");
        String s5 ="Q5: Often function "+mySharedPreferences.getString("q_five","");
        String s6 ="Q6: Expected function "+mySharedPreferences.getString("q_six","");
        String s7 ="Q7: To buy new phone  "+mySharedPreferences.getString("q_seven","");
        String s8 ="Q8: Buy new brand "+mySharedPreferences.getString("q_eight","");
        String s9 ="Q9: Most important "+mySharedPreferences.getString("q_nine","");
        String s10 ="Q10: Age  "+mySharedPreferences.getString("q_ten","");
        String s11 ="Q11: Gender "+mySharedPreferences.getString("q_eleven","");
        String s12 ="Q12: Money earn per month "+mySharedPreferences.getString("q_twelve","");

        r1.setText(s1);
        r2.setText(s2);
        r3.setText(s3);
        r4.setText(s4);
        r5.setText(s5);
        r6.setText(s6);
        r7.setText(s7);
        r8.setText(s8);
        r9.setText(s9);
        r10.setText(s10);
        r11.setText(s11);
        r12.setText(s12);






    }

    public void  to_fin(View view){

        startActivity(new Intent(survey_report.this,fin.class));


    }

}
