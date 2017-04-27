package jp.ac.chiba_fjb.x15g027.test05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text1 = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);

        text1.setText("あいうえお");
        text2.setText("かきくけこ");
//
//   }text1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                text1.setText("タップされました");
//            }
//        });
        text1.setOnClickListener(this);

}

    @Override
    public void onClick(View v) {
        ((TextView) v).setText("タップされました");
    }}