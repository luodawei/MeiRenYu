package com.yss.yumeiren;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/19.
 */
public class SettingActivity extends Activity {
    TextView clearhuancun;//清除缓存按钮
    LayoutInflater layoutInflater;//视图转换器
    AlertDialog alertDialog;//弹出框对象
    AlertDialog.Builder builder;//builder对象
    Button yesBtn;//清除缓存确认按钮
    Button noBtn;//清除缓存取消按钮
    TextView exitText;//退出按钮
    TextView exitBtn;//退出登录按钮
    Button canceBtn;//取消取出登录按钮
    TextView fontsetting;

    TextView xiaohao;
    TextView biaozhun;
    TextView dahao;
    TextView teda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_layout);
        clearhuancun= (TextView) findViewById(R.id.clear_huancun);
        exitText= (TextView) findViewById(R.id.exit_text);
        fontsetting= (TextView) findViewById(R.id.font_setting);
        fontsetting.setOnClickListener(onClickListener);
        exitText.setOnClickListener(onClickListener);
        clearhuancun.setOnClickListener(onClickListener);
    }
    //创建ClearDialog方法
    public void createClearDialog(){
        layoutInflater=LayoutInflater.from(this);
        builder=new AlertDialog.Builder(this);
        View view=layoutInflater.inflate(R.layout.clear_huancun_dialog,null);
        //给确认和取消设置监听
        yesBtn= (Button) view.findViewById(R.id.yes);
        noBtn= (Button) view.findViewById(R.id.no);
        yesBtn.setOnClickListener(onClickListener);
        noBtn.setOnClickListener(onClickListener);
        builder.setView(view);
        alertDialog=builder.create();
        Window window=alertDialog.getWindow();
        WindowManager.LayoutParams ip=window.getAttributes();
        window.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL);
        window.setAttributes(ip);
        alertDialog.show();
    }
    //创建ExitDialog方法
    public void createExitDialog(){
        layoutInflater=LayoutInflater.from(this);
        builder=new AlertDialog.Builder(this);
        View view=layoutInflater.inflate(R.layout.exit_dialog_layout,null);
        //给确认和取消设置监听
        exitBtn= (TextView) view.findViewById(R.id.exit_btn);
        canceBtn= (Button) view.findViewById(R.id.cance_btn);
        exitBtn.setOnClickListener(onClickListener);
        canceBtn.setOnClickListener(onClickListener);
        builder.setView(view);
        alertDialog=builder.create();
        Window window=alertDialog.getWindow();
        WindowManager.LayoutParams ip=window.getAttributes();
        window.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL);
        window.setAttributes(ip);
        alertDialog.show();
    }
    //创建字体设置弹出框设置
    public void createFontDialog(){
        layoutInflater=LayoutInflater.from(this);
        builder=new AlertDialog.Builder(this);
        View fontView=layoutInflater.inflate(R.layout.font_listview_item,null);
        xiaohao=(TextView)fontView.findViewById(R.id.font_xiao);
        xiaohao.setOnClickListener(onClickListener);
        biaozhun=(TextView)fontView.findViewById(R.id.font_biaozhun);
        biaozhun.setOnClickListener(onClickListener);
        dahao=(TextView)fontView.findViewById(R.id.font_da);
        dahao.setOnClickListener(onClickListener);
        teda=(TextView)fontView.findViewById(R.id.font_teda);
        teda.setOnClickListener(onClickListener);
        builder.setView(fontView);
        alertDialog=builder.create();
        alertDialog.show();
    }
    //设置点击事件监听
    View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                //清除缓存事件
                case R.id.clear_huancun:
                    createClearDialog();
                    break;
                case R.id.yes:
                    alertDialog.dismiss();
                    Toast.makeText(SettingActivity.this,"恭喜您成功清除缓存",Toast.LENGTH_LONG).show();
                    break;
                case R.id.no:
                    alertDialog.dismiss();
                    Toast.makeText(SettingActivity.this,"恭喜您成功取消清除缓存",Toast.LENGTH_LONG).show();
                    break;
                //退出事件
                case R.id.exit_text:
                    createExitDialog();
                    break;
                case R.id.exit_btn:
                    alertDialog.dismiss();
                    Toast.makeText(SettingActivity.this,"恭喜您成功退出",Toast.LENGTH_LONG).show();
                    break;
                case R.id.cance_btn:
                    alertDialog.dismiss();
                    Toast.makeText(SettingActivity.this,"恭喜您成功取消退出",Toast.LENGTH_LONG).show();
                    break;
                case R.id.font_setting:
                    createFontDialog();
                    break;
                case R.id.font_xiao:
                        xiaohao.setBackground(getResources().getDrawable(R.mipmap.gou_true_image));
                        biaozhun.setBackgroundColor(getResources().getColor(R.color.white));
                        dahao.setBackgroundColor(getResources().getColor(R.color.white));
                        teda.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(SettingActivity.this,"字体大小设置小号",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.font_biaozhun:
                        biaozhun.setBackground(getResources().getDrawable(R.mipmap.gou_true_image));
                        xiaohao.setBackgroundColor(getResources().getColor(R.color.white));
                        dahao.setBackgroundColor(getResources().getColor(R.color.white));
                        teda.setBackgroundColor(getResources().getColor(R.color.white));
                        Toast.makeText(SettingActivity.this,"字体大小设置为标准",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.font_da:
                      /*设置大字体监听*/
                        dahao.setBackground(getResources().getDrawable(R.mipmap.gou_true_image));
                        biaozhun.setBackgroundColor(getResources().getColor(R.color.white));
                        xiaohao.setBackgroundColor(getResources().getColor(R.color.white));
                        teda.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(SettingActivity.this,"字体大小设置为大号",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.font_teda:
                    /*设置特大字体监听*/
                        teda.setBackground(getResources().getDrawable(R.mipmap.gou_true_image));
                        biaozhun.setBackgroundColor(getResources().getColor(R.color.white));
                        dahao.setBackgroundColor(getResources().getColor(R.color.white));
                        xiaohao.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(SettingActivity.this,"字体大小设置为特大号",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.push_message_btn:
                    /*消息推送按钮监听事件*/
                    break;
                case R.id.saving_flow_btn:
                    /*节省流量按钮监听事件*/
                    break;
                case R.id.volume_btn_to_Page:
                    /*设置音量键翻页按钮监听事件*/
                    break;
            }
        }
    };
}
