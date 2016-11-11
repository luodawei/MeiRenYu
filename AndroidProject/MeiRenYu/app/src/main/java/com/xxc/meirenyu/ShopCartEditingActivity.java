package com.xxc.meirenyu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yss.yumeiren.R;


/**
 * Created by Administrator on 2016/11/8.
 */
public class ShopCartEditingActivity extends Activity{
    TextView shouye;
    TextView gouwuche;
    TextView dingdan;
    TextView zaixiankefu;
    TextView shop_cart_bianji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_cart_jiesuan);
        shop_cart_bianji = (TextView) findViewById(R.id.shop_cart_editing);
        shouye = (TextView) findViewById(R.id.shouye);
        gouwuche = (TextView) findViewById(R.id.gouwuche);
        dingdan = (TextView) findViewById(R.id.dingdan);
        zaixiankefu = (TextView) findViewById(R.id.zaixiankefu);

        shop_cart_bianji.setOnClickListener(onClickListener);
        shouye.setOnClickListener(onClickListener);
        gouwuche.setOnClickListener(onClickListener);
        dingdan.setOnClickListener(onClickListener);
        zaixiankefu.setOnClickListener(onClickListener);

    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.shouye:
                    break;
                case R.id.gouwuche:
                    break;
                case R.id.dingdan:
                    Intent intent3 = new Intent(ShopCartEditingActivity.this, MyOrderActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.zaixiankefu:
                    break;
                case R.id.shop_cart_editing:
                    Intent intent5 = new Intent(ShopCartEditingActivity.this, ShopCartEmptyActivity.class);
                    startActivity(intent5);
                    break;
            }
        }
    };
}
