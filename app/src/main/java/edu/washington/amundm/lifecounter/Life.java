package edu.washington.amundm.lifecounter;

import android.widget.TextView;

/**
 * Created by Mitchell on 1/25/2017.
 */

public class Life {

    public int score;
    public TextView text;

    public Life(TextView text){
        this.score = 20;
        this.text = text;
        this.text.setText(Integer.toString(this.score));
    }

    public void scoreChange(int val){
        this.score = this.score + val;
        this.text.setText(this.getScore());
    }

    public int getScore(){
        return this.score;
    }
}
