package zzy.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnJump = (Button) findViewById(R.id.btnJump);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "若有才华才藏于心 岁月从不败美人";

                Intent intent = new Intent();
                intent.putExtra("content",data);
                intent.setClass(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });
    }
}
