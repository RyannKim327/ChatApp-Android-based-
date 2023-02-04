package a;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class a extends Activity {
	EditText username, password;
	Button login;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_DeviceDefault_Light_NoActionBar);
		SharedPreferences pref = getSharedPreferences("mpop.revii.chatapp.PREFERENCES", MODE_PRIVATE);
		LinearLayout layout = new LinearLayout(this);
		setContentView(layout);
	}
}
