package com.cm_smarthome.myservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.start_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"เข้าสู่ระบบสำเร็จ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MyService.class);
                startService(intent);
            }
        });

        findViewById(R.id.stop_Service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"ออกจากระบบสำเร็จ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MyService.class);
                stopService(intent);
            }
        });

    }

}