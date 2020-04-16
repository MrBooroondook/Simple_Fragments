package mr.booroondook.simple_fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class LoggingFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(getClass().getName(), "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().getName(), "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(getClass().getName(), "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(getClass().getName(), "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(getClass().getName(), "onResume");
    }

    @Override
    public void onPause() {
        Log.d(getClass().getName(), "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(getClass().getName(), "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(getClass().getName(), "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(getClass().getName(), "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(getClass().getName(), "onDetach");
        super.onDetach();
    }
}
