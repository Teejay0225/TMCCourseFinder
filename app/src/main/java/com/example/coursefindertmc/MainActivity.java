package com.example.coursefindertmc;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;

public class MainActivity extends Activity {

    private Button button, popup;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonUrl);

        button.setOnClickListener(new OnClickListener() {

            @Override

            public void onClick(View arg) {

                Intent intent = new Intent(getApplicationContext(), WebViewTmcActivity.class);

                startActivity(intent);

            }

        });

        popup = findViewById(R.id.buttonPopup);

        popup.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), PopUpTmcActivity.class);
                startActivity(intent);
            }
        });

    }

}