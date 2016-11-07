package meirenyu;

import android.app.Activity;
import android.os.Bundle;
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
}
