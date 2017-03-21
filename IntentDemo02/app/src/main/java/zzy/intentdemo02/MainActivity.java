package zzy.intentdemo02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//返回数据给上一个活动
public class MainActivity extends AppCompatActivity {
    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button) findViewById(R.id.btntotwo);
         tv_content = (TextView) findViewById(R.id.tv_content);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                /**
                 * startActivityForResult()
                 *方法也是用于启动活动的，但这个方法期望在活动销毁的时候能够返回一个结果给上一个活动。
                 *startActivityForResult() 方法接收两个参数，第一个参数还是 Intent，第二个参数是请求码，
                 * 用于在之后的回调中判断数据的来源。
                 */

                startActivityForResult(intent, 1);

            }
        });

    }

    /**
     * onActivityResult() 方法带有三个参数
     * 第一个参数 requestCode，即我们在启动活动时传入的请求码。
     * 第二个参数 resultCode，即我们在返回数据时传入的处理结果。
     * 第三个参数 data，即携带着返回数据的 Intent。
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

//        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("MainActivity 接收返回结果：", returnedData);
                    tv_content.setText(returnedData);

                }
                break;
            default:
        }

    }

}
