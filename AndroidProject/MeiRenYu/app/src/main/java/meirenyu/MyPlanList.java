package meirenyu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.yss.yumeiren.R;

import java.util.HashMap;
import java.util.List;

import meirenyu.adapter.MyPlanAdapter;

/**
 * Created by David on 2016/10/23.
 */

public class MyPlanList extends Activity {
    List<HashMap<String,Object>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_plan_list);
        ListView listView = (ListView)findViewById(R.id.my_plan_list);
        listView.setAdapter(new MyPlanAdapter(this));
    }
    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent;
            switch (position){
                case 0:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 5:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 6:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;
                case 7:
                    intent = new Intent(MyPlanList.this,MyPlanDetail.class);
                    startActivity(intent);
                    break;

            }
        }
    };
}
