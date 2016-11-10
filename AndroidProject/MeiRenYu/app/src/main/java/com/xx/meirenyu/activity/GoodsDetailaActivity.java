package com.xx.meirenyu.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yss.yumeiren.R;

/**
 * Created by Administrator on 2016/10/19.
 */
public class GoodsDetailaActivity extends Activity {
    private TextView backBtn;//返回按钮
    private TextView receiveAddress;//收货地址TextView
    private LinearLayout shopClassBtn;//分类选择按钮
    private TextView addToShopCar;//加入购物车按钮
    private TextView buyNowBtn;//立即购买按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_details);
        //初始化控件
        backBtn= (TextView) findViewById(R.id.back_btn);
        receiveAddress= (TextView) findViewById(R.id.receive_address);
        shopClassBtn= (LinearLayout) findViewById(R.id.shop_class_btn);
        addToShopCar= (TextView) findViewById(R.id.add_to_shop_car);
        buyNowBtn= (TextView) findViewById(R.id.buy_now_btn);
        //设置监听
        backBtn.setOnClickListener(onClickListener);
        receiveAddress.setOnClickListener(onClickListener);
        shopClassBtn.setOnClickListener(onClickListener);
        addToShopCar.setOnClickListener(onClickListener);
        buyNowBtn.setOnClickListener(onClickListener);
    }
    View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_btn:
                /*返回按钮*/
                finish();
                break;
            case R.id.receive_address:
                /*收货地址*/
                Toast.makeText(GoodsDetailaActivity.this,"确认您的收货地址",Toast.LENGTH_SHORT).show();
                break;
            case R.id.shop_class_btn:
                /*选择商品分类按钮*/
                Toast.makeText(GoodsDetailaActivity.this,"请选择您的商品类型",Toast.LENGTH_SHORT).show();
                break;
            case R.id.add_to_shop_car:
                /*添加到购物车*/
                Intent intent=new Intent(GoodsDetailaActivity.this,ShopCartJieSuanActivity.class);
                startActivity(intent);
                break;
            case R.id.buy_now_btn:
                /*立即购买*/
                Toast.makeText(GoodsDetailaActivity.this,"请选择您的支付方式",Toast.LENGTH_SHORT).show();
                break;
        }
        }
    };
}
