package com.yss.yumeiren;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*这个是客服聊天页面的Activity*/
/**
 * Created by Administrator on 2016/10/22.
 */
public class ServicerActivity extends Activity {
    boolean isServicer=false;//布尔值来判断是谁发的消息
    String[] from={"userHeadImage","userMessage"};
    int[] to={R.id.user_head_image,R.id.message};
    String[] dataStr= {
            "商品名称",
            "请输入关键字",
            "热门搜索",
            "初学者瑜伽服"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_servicer);
        List<HashMap<String,Object>> list=getMessageDate();
        ListView serviceMessageListView= (ListView) findViewById(R.id.servicer_listview);
        if(isServicer){
            SimpleAdapter simpleAdapter=new SimpleAdapter(this,
                    list,
                    R.layout.servicer_message,
                    from,
                    to);
            serviceMessageListView.setAdapter(simpleAdapter);
        }else{
            SimpleAdapter simpleAdapter=new SimpleAdapter(this,
                    list,
                    R.layout.user_message,
                    from,
                    to);
            serviceMessageListView.setAdapter(simpleAdapter);
        }

    }
    List<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
    public List<HashMap<String,Object>> getMessageDate(){
            for (int i=0;i<dataStr.length;i++){
                HashMap<String,Object> map=new HashMap<String,Object>();
                map.put("userHeadImage",R.mipmap.ic_launcher);
                map.put("userMessage",dataStr[i]);
                list.add(map);
                if(i>2){
                    isServicer=true;
                }
            }
        return list;
    }
}
