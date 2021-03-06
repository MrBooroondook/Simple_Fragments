package mr.booroondook.simple_fragments;

import android.os.Bundle;

public class MainActivity extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportFragmentManager().findFragmentById(android.R.id.content) == null) {
            getSupportFragmentManager().beginTransaction().add(android.R.id.content,
                    new MainFragment()).commit();
        }
    }
}
