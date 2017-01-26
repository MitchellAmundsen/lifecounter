package edu.washington.amundm.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Life player1;
    private Life player2;
    private Life player3;
    private Life player4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1 = new Life((TextView)findViewById(R.id.player1));
        player2 = new Life((TextView)findViewById(R.id.player2));
        player3 = new Life((TextView)findViewById(R.id.player3));
        player4 = new Life((TextView)findViewById(R.id.player4));

    }

    public void onClickAdd1(View v){
        valChange(v, 1);
    }

    public void onClickAdd5(View v){
        valChange(v, 5);
    }

    public void onClickSub1(View v){
        valChange(v, -1);
    }

    public void onClickSub5(View v){
        valChange(v, -5);
    }

    public void valChange(View v, int num){
        Button button = (Button)v;
        String textTag = (String)v.getTag();
        int textId = getResources().getIdentifier(textTag, "id", getPackageName());
        TextView textin = (TextView)findViewById(textId);
        int textnum = Integer.parseInt(textin.getText().toString());
        textnum = textnum + num;
        if(textnum <= 0){
            TextView label = (TextView)findViewById(R.id.label);
            label.setText(textTag + " LOSES!!!");
        }
        textin.setText(Integer.toString(textnum));
    }

}
