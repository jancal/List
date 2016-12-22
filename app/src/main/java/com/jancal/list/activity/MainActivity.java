package com.jancal.list.activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jancal.list.R;
import com.jancal.list.common.System;
import com.jancal.list.domain.AddItemParam;
import com.jancal.list.domain.Label;
import com.jancal.list.domain.PlanType;
import com.jancal.list.domain.Scope;
import com.jancal.list.repository.DatabaseHelper;
import com.jancal.list.service.ItemOperateService;
import com.jancal.list.service_api.IItemOperateService;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {


    private IItemOperateService iItemOperateService = new ItemOperateService();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化数据库
        System.initDb(openOrCreateDatabase(System.DataBaseName, Context.MODE_PRIVATE, null));


        setContentView(R.layout.activity_main);
        final EditText sum = (EditText) findViewById(R.id.sum);
        final EditText label = (EditText) findViewById(R.id.label);
        final EditText date = (EditText) findViewById(R.id.date);
        final EditText remark = (EditText) findViewById(R.id.remark);
        Button save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sumStr = sum.getText().toString();
                    if (TextUtils.isEmpty(sumStr)) {
                        sum.setError("please input sum");
                    }

                    float sumFloat = Float.parseFloat(sum.getText().toString());
                    String dateStr = date.getText().toString();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    String labelStr = label.getText().toString();
                    String remarkStr = remark.getText().toString();
                    Label label1 = new Label(labelStr, Scope.day, PlanType.in_plan, remarkStr);
//                    iItemOperateService.addItem(new AddItemParam(sumFloat, label1, sdf.parse(dateStr)));
                    iItemOperateService.addItem(null);
                    Toast.makeText(getApplicationContext(), "save successful", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
