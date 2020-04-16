package mr.booroondook.simple_fragments;

import android.os.Bundle;

public class SecondActivity extends LoggingActivity {
    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportFragmentManager().findFragmentById(android.R.id.content) == null) {
            getSupportFragmentManager().beginTransaction().add(android.R.id.content,
                    new SecondFragment()).commit();
        }
    }
}
