package cn.sports39.statusbar;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button)findViewById(R.id.hideOne);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                getWindow().getDecorView().setSystemUiVisibility(uiOptions);
            }
        });
        Button two = (Button)findViewById(R.id.hideTwo);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
                getWindow().getDecorView().setSystemUiVisibility(uiOptions);
            }
        });

        Button three = (Button)findViewById(R.id.changeStatusColor);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().setStatusBarColor(0x00FF0000);
            }
        });

        Button launchOne = (Button)findViewById(R.id.launchOne);
        launchOne.setText("启动设置了windowNoTitle的Activity");
        launchOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityWithNoTitle.class));
            }
        });

        Button launchTwo = (Button)findViewById(R.id.launchTwo);
        launchTwo.setText("启动不显示actino bar的Activity");
        launchTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityWithNoActionBar.class));
            }
        });
    }
}
