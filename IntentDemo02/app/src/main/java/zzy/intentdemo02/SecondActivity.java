package zzy.intentdemo02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Author: mz_dream  PC:MZ
 * Time: 2017/3/21 11:20
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        final TextView tv_content = (TextView) findViewById(R.id.tv_content);
        tv_content.setText("hello main");

        Button btnback = (Button) findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "hello Main");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }

    /**
     * 重写方法onBackPressed实现：按back键盘返回数据
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "更高更远");
        setResult(RESULT_OK,intent);
        finish();

    }
}
