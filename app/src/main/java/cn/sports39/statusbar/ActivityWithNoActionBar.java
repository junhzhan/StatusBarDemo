package cn.sports39.statusbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityWithNoActionBar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_with_no_action_bar);
        TextView content = (TextView)findViewById(R.id.content);
        content.setText("设置windowActionBar为false，此时不会显示action bar（根本不存在）, 但还会显示title,");

        Button showActionBar = (Button)findViewById(R.id.showActionBar);
        showActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionBar actionBar = getActionBar();
                actionBar.show();
            }
        });
    }
}
