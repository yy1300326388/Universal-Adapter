package com.zsl.universal_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.zsl.universal_listview.baseadapter.OldMyAdapter;
import com.zsl.universal_listview.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 15/5/20.
 */
public class OldActivity extends AppCompatActivity {

    ListView lv_show;

    List<UserEntity> userEntities;

    OldMyAdapter oldMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old);
        initView();
        initData();

    }
    private void initView() {
        lv_show= (ListView) findViewById(R.id.old_lv_show);
    }

    private void initData() {
        String url1="https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2205791892,1328528914&fm=116&gp=0.jpg";
        String url2="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=423453867,55383185&fm=116&gp=0.jpg";
        String url3="https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1326783081,3385552056&fm=111&gp=0.jpg";
        String url4="https://ss0.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1626772706,1767082609&fm=15&gp=0.jpg";
        String url="";
        userEntities=new ArrayList<UserEntity>();
        for (int i=0;i<1000;i++){
            if (i%1==0){
                url=url1;
            }
            if(i%2==0){
                url=url2;
            }
            if(i%3==0){
                url=url3;
            }
            if(i%4==0){
                url=url4;
            }

            UserEntity userEntity=new UserEntity("小花"+i,"女",url,i%20==0);
            userEntities.add(userEntity);
        }

        oldMyAdapter=new OldMyAdapter(OldActivity.this,userEntities);
        lv_show.setAdapter(oldMyAdapter);
    }
}
