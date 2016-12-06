package evh98.com.materialcountdown;

import android.app.DatePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class NewCountdownActivity extends AppCompatActivity {

    private EditText tf_name;
    private Button b_date;
    private Button b_time;
    private Button b_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_countdown);

        tf_name = (EditText) findViewById(R.id.tf_form_name);
        b_date = (Button) findViewById(R.id.b_form_date);
        b_time = (Button) findViewById(R.id.b_form_time);
        b_color = (Button) findViewById(R.id.b_form_color);
    }

    public void onFormNameClick(View view) {
        tf_name.setCursorVisible(true);
    }

    public void onFormDateClick(View view) {

    }

    public void onFormTimeClick(View view) {

    }
}