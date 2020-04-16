package mr.booroondook.simple_fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

public class MainFragment extends LoggingFragment
        implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        view.findViewById(R.id.button_main).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtra(SecondActivity.MESSAGE,
                String.format("%s\n%s\n%s\n%s\n%s\n%s",
                        Build.BRAND, Build.MANUFACTURER, Build.MODEL, Build.PRODUCT,
                        Build.DEVICE, Build.TAGS));
        Objects.requireNonNull(getActivity()).startActivity(intent);
    }
}
