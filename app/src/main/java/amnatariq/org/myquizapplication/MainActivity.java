package amnatariq.org.myquizapplication;

        import static java.util.Collections.shuffle;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.SharedPreferences;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.LinkedHashSet;
        import java.util.List;
        import java.util.Random;
        import java.util.Set;

public class MainActivity extends AppCompatActivity

        implements View.OnClickListener {
        private RadioGroup mButton;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mButton = findViewById(R.id.radioGroup);
            mButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View view)
        {
            switch (view.getId()) {
                case R.id.choice1:
                    Toast.makeText(MainActivity.this,"1 is selected ", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.choice2:
                    Toast.makeText(MainActivity.this,"2 is selected ", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.choice3:
                    Toast.makeText(MainActivity.this, "3 is selected ", Toast.LENGTH_SHORT).show();
                    break;
                    // Do something
            }
        }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//    }
//
//    public void onRadioButtonClick(View view)
//    {
//        RadioGroup radioGroup = findViewById(R.id.radioGroup);
//        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
//        Toast.makeText(MainActivity.this,radioButton.getText() + " is selected ", Toast.LENGTH_SHORT).show();
//    }

}