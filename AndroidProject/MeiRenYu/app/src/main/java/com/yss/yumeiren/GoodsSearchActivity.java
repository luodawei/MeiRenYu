package com.yss.yumeiren;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/18.
 */
public class GoodsSearchActivity extends Activity {
    private TextView searchHotBtn;
    private TextView searchHistoryBtn;
    private LinearLayout hotSearchCaiDan;
    private LinearLayout historySearchCaiDan;
    private EditText searchEditText;//搜索框
    private LinearLayout historyMenuLayout;//添加历史搜索菜单页面
    private ArrayList<String> historyMenuArrarList;//存放输入框输入内容的集合
    private int historyNumber=1;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_search_layout);
        /*初始化*/
        searchHotBtn= (TextView) findViewById(R.id.search_hot);
        searchHistoryBtn= (TextView) findViewById(R.id.search_history);
        hotSearchCaiDan= (LinearLayout) findViewById(R.id.hot_search_caidan);
        historySearchCaiDan= (LinearLayout) findViewById(R.id.history_search_caidan);
        searchEditText= (EditText) findViewById(R.id.search_edit_text);
        historyMenuLayout= (LinearLayout) findViewById(R.id.history_menu_layout);
        historyMenuArrarList=new ArrayList<String>();
        str=searchEditText.getText().toString();
        historyMenuArrarList.add(str);
        searchHotBtn.setOnClickListener(new View.OnClickListener() {
            //热门搜索监听事件
            @Override
            public void onClick(View v) {
                searchHotBtn.setBackgroundColor(getResources().getColor(R.color.head_green));
                hotSearchCaiDan.setVisibility(View.VISIBLE);
                searchHistoryBtn.setBackgroundColor(getResources().getColor(R.color.search_bar_false_bg));
                historySearchCaiDan.setVisibility(View.GONE);
            }
        });
        searchHistoryBtn.setOnClickListener(new View.OnClickListener() {
            //历史搜索监听
            @Override
            public void onClick(View v) {
                searchHotBtn.setBackgroundColor(getResources().getColor(R.color.search_bar_false_bg));
                hotSearchCaiDan.setVisibility(View.GONE);
                searchHistoryBtn.setBackgroundColor(getResources().getColor(R.color.head_green));
                historySearchCaiDan.setVisibility(View.VISIBLE);
            }
        });
        //createSearchMenu();
    }
    //创建Textview的方法，用来显示输入框输入过的内容
    public void createSearchMenu(){
        for(int i=0;i<historyMenuArrarList.size();i++){
            TextView historyMenuText=new TextView(this);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(0,15,0,0);
            historyMenuText.setPadding(10,8,10,8);
            historyMenuText.setLayoutParams(layoutParams);
            historyMenuText.setText(historyMenuArrarList.get(i));
            historyMenuText.setGravity(Gravity.CENTER);
            historyMenuText.setBackgroundResource(R.drawable.search_tishi_style);
            historyMenuText.setTextColor(getResources().getColor(R.color.white));
            historyMenuText.setTextSize(15);
            historyMenuLayout.addView(historyMenuText);
        }
    }
}
