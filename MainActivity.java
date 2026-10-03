package net.bukharilab.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings; import android.webkit.WebViewClient; import android.content.Intent; import android.net.Uri;
public class MainActivity extends Activity {
 public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); w.setWebViewClient(new WebViewClient(){@Override public boolean shouldOverrideUrlLoading(WebView v,String u){ if(u.startsWith("http")){try{startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(u)));}catch(Exception e){} return true;} return false;}}); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); w.loadUrl("file:///android_asset/index.html"); setContentView(w);}
}