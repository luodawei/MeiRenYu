package meirenyu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.yss.yumeiren.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by David on 2016/10/25.
 */

public class MyFriendsActivity extends Activity {
    List<HashMap<String,Object>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_friends);
        ListView myFriendList = (ListView)findViewById(R.id.my_friend_list);
        list=getData();
        String[] from = {"portrait","nickname","content","time","num"};
        int[] to = {R.id.portrait,R.id.friend_nickname,R.id.chat_content,R.id.chat_time,R.id.message_num};
        myFriendList.setAdapter(new SimpleAdapter(MyFriendsActivity.this,list,R.layout.activity_my_friends_item,from,to));
    }
    public List<HashMap<String,Object>> getData(){
        List<HashMap<String,Object>> list = new ArrayList<HashMap<String, Object>>();
        for (int i=0;i<12;i++){
            HashMap<String,Object> map = new HashMap<String,Object>();
            map.put("portrait",R.mipmap.ic_launcher);
            map.put("nickname","异域至尊");
            map.put("content","你的八块腹肌练得怎么样了？");
            map.put("time","19:12");
            map.put("num","95");
            list.add(map);
        }
        return list;
    }
}
