package sample.textviewbutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ImageButton imageButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // using Components
        editText = (EditText)findViewById(R.id.editText);
        imageButton = (ImageButton)findViewById(R.id.imageButton);
        textView = (TextView)findViewById(R.id.textView);

        // When click on imageButton triggered
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText());
                editText.setText(null);

                // Hide keyboard
                InputMethodManager inputmgr = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputmgr.hideSoftInputFromWindow(editText.getWindowToken(),0);
            }
        });

    }
}
