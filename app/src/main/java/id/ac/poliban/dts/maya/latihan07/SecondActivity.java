package id.ac.poliban.dts.maya.latihan07;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //ubah title default pada action bar
        if(getSupportActionBar()!=null)
            getSupportActionBar().setTitle("Second Active");
    }
}
