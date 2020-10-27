package com.example.jifen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Basketball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
    }
    public void onBackPressed() {
        super.onBackPressed();
    }
    public void buta1(View view){
        TextView teamAscore = (TextView)findViewById(R.id.teamAscore1);
        int oldScore = Integer.parseInt(teamAscore.getText().toString());
//        int score = Integer.parseInt(view.getTag().toString());
        int score = 3;
        int b = oldScore+score;
        teamAscore.setText(""+b);
    }
    public void buta2(View view){
        TextView teamAscore = (TextView)findViewById(R.id.teamAscore1);
        int oldScore = Integer.parseInt(teamAscore.getText().toString());
//        int score = Integer.parseInt(view.getTag().toString());
        int score = 2;
        teamAscore.setText(""+(score+oldScore));
    }
    public void buta3(View view){
        TextView teamAscore = (TextView)findViewById(R.id.teamAscore1);
        int oldScore = Integer.parseInt(teamAscore.getText().toString());
//        int score = Integer.parseInt(view.getTag().toString());
        int score = 1;
        teamAscore.setText(""+(score+oldScore));
    }
    public void reset(View view) {
        /*
         * 重置比分
         * */
        TextView teamAScore = (TextView) findViewById(R.id.teamAscore);
        TextView teamBScore = (TextView) findViewById(R.id.teamBscore);
        teamAScore.setText("0");
        teamBScore.setText("0");
    }
}
