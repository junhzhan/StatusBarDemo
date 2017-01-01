package cn.sports39.statusbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityWithNoTitle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_with_no_title);
        TextView content = (TextView)findViewById(R.id.content);
        content.setTextColor(0xFF000000);
        content.setText("在theme中添加windowNoTitlte属性，达到隐藏title的效果，在title不显示的情况下，" +
                "action bar也不会显示");
    }
}
