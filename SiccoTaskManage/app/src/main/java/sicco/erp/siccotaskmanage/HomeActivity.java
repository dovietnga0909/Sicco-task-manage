package sicco.erp.siccotaskmanage;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_home);
    }
}
