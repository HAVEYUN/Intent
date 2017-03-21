package zzy.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Author: mz_dream  PC:MZ
 * Time: 2017/3/21 9:56
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class TwoActivity extends AppCompatActivity {
    private static final String TAG = "TwoActivity";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_activity);
        initInfo();

    }

    //向下一个活动传数据的接收
    private void initInfo() {
        Intent intent = getIntent();
        final String data = intent.getStringExtra("content");
//        Log.i(TAG, "接收MainActivity数据：" + data);

        final TextView tv_content = (TextView) findViewById(R.id.tv_info);
        Button btn = (Button) findViewById(R.id.btngetinfo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              tv_content.setText(data);

            }
        });
    }

}
