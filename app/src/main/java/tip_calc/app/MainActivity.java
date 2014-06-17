package tip_calc.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    public EditText etNum;
    public TextView amtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum = (EditText) findViewById(R.id.etNum);
        amtView = (TextView) findViewById(R.id.amtView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public String getTip(double tip){
        double fieldValue = Double.parseDouble(etNum.getText().toString());
        tip = fieldValue * tip;
        tip = (double)Math.round(tip * 100) / 100;
        return String.valueOf(tip);
    }

    public void on10(View v){
        amtView.setText(getTip(.1));
    }

    public void on15(View v){
        amtView.setText(getTip(.15));
    }

    public void on20(View v){
        amtView.setText(getTip(.2));
    }



}
