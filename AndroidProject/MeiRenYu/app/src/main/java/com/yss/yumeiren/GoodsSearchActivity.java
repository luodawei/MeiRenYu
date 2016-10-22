package com.yss.yumeiren;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/18.
 */
public class GoodsSearchActivity extends Activity {
    private TextView searchhotbtn;
    private TextView searchhistorybtn;
    private LinearLayout hotsearchcaidan;
    private LinearLayout historysearchcaidan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goods_search_layout);
        /*初始化*/
        searchhotbtn= (TextView) findViewById(R.id.search_hot);
        searchhistorybtn= (TextView) findViewById(R.id.search_history);
        hotsearchcaidan= (LinearLayout) findViewById(R.id.hot_search_caidan);
        historysearchcaidan= (LinearLayout) findViewById(R.id.history_search_caidan);

        searchhotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hotsearchcaidan.getVisibility()==View.GONE){
                    historysearchcaidan.setVisibility(View.GONE);
                    hotsearchcaidan.setVisibility(View.VISIBLE);
                    searchhistorybtn.setBackgroundColor(getResources().getColor(R.color.search_bar_false_bg));
                    searchhotbtn.setBackgroundColor(getResources().getColor(R.color.head_green));
                }
            }
        });
        searchhistorybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(searchhistorybtn.getVisibility()==View.GONE){
                    hotsearchcaidan.setVisibility(View.GONE);
                    historysearchcaidan.setVisibility(View.VISIBLE);
                    searchhotbtn.setBackgroundColor(getResources().getColor(R.color.search_bar_false_bg));
                    searchhistorybtn.setBackgroundColor(getResources().getColor(R.color.head_green));
                }
            }
        });
    }
}
