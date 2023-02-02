package a;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.JsResult;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

public class a extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_DeviceDefault_Light_NoActionBar);
		WebView v = new WebView(this);
		WebSettings s = v.getSettings();
		
		s.setJavaScriptEnabled(true);
		
		v.setWebViewClient(new WebViewClient());
		v.setWebChromeClient(new WebChromeClient(){
			public boolean onJsAlert(WebView w, String s, JsResult j){
				AlertDialog.Builder b = new AlertDialog.Builder(a.this);
				b.setTitle("Notice");
				b.setMessage(s);
				b.setPositiveButton("Okay", null);
				AlertDialog c = b.create();
				float f = 5f;
				ShapeDrawable d = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f}, null, null));
				d.getPaint().setColor(Color.parseColor("#fefefe"));
				
				c.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.BLACK);
				c.getWindow().setBackgroundDrawable(d);
				c.show();
				return false;
			}
		});
		v.loadUrl("file:///android_asset/index.html");
		setContentView(v);
	}
}
