package com.example.android.quizapp2;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtCheckBox, txtRadio;
    private Button button;
    private RadioGroup rgGroup1, rgGroup2, rgGroup3;
    private CheckBox chkBox1_Q3, chkBox2_Q3, chkBox3_Q4, chkBox2_Q4;

    final String Q2_Answer = "Alex Tyus";
    int count = 1;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtRadio = (TextView) findViewById(R.id.txtRadio);
        final RadioButton radio1_q1 = (RadioButton) findViewById(R.id.radio1_Q1);
        final RadioButton radio2_q1 = (RadioButton) findViewById(R.id.radio2_Q1);
        final RadioButton radio3_q1 = (RadioButton) findViewById(R.id.radio3_Q1);

        rgGroup1 = (RadioGroup) findViewById(R.id.rgGroup1);


    }
    //If all of the checkboxes were selected, return true

    //If the 1st & 2nd checkbox was selected, return true
    private boolean checkQuestion3() {
        chkBox1_Q3 = (CheckBox) findViewById(R.id.chkBox1_Q3);
        chkBox2_Q3 = (CheckBox) findViewById(R.id.chkBox2_Q3);
        //    chkBox3_Q4 = (CheckBox) findViewById(R.id.chkBox3_Q4);
        if (chkBox1_Q3.isChecked() && chkBox2_Q3.isChecked()) {
            return true;
        }
        return false;
    }
    //Checking the 6th question and returning true if checkbox 2 and 3 were selected
    private boolean checkQuestion4() {
        chkBox3_Q4 = (CheckBox) findViewById(R.id.chkBox3_Q4);
        chkBox2_Q4 = (CheckBox) findViewById(R.id.chkBox2_Q4);
        //    chkBox3_Q4 = (CheckBox) findViewById(R.id.chkBox3_Q4);
        if (chkBox3_Q4.isChecked() && chkBox2_Q4.isChecked()) {
            return true;
        }
        return false;
    }


    @NonNull
    private String checkQuestion2() {
        EditText text_question_4 = (EditText)findViewById(R.id.text_q2);
        return text_question_4.getText().toString();
    }



    public void submitButton(View view) {
        RadioButton radio1_q1 = (RadioButton)findViewById(R.id.radio1_Q1);
        if(radio1_q1.isChecked()){
            count++;}
        if(checkQuestion2().equals(Q2_Answer)){
            count++;}
        if(checkQuestion3()) {
            count++;}
        if(checkQuestion4()){
            count++;}

        Toast.makeText(this,"You've got " + count + " correct answers", Toast.LENGTH_LONG).show();
        txtRadio.setText("You've got " + count + " correct answers");
    }
    //Menu

    }
