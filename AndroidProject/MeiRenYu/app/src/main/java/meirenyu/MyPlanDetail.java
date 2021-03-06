package meirenyu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yss.yumeiren.R;

/**
 * Created by David on 2016/10/23.
 */

public class MyPlanDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_plan_detail);
        ImageView btnBack = (ImageView)findViewById(R.id.btn_back);
        //这个跳转方式应该是错的
        btnBack.setOnClickListener(onClickListener);

    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.btn_back:
                    intent = new Intent(MyPlanDetail.this,MyPlanList.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
