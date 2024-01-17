package com.itninja.macropad.app.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.itninja.macropad.app.R;

public class DesktopFragment extends EventBaseFragment {

    public DesktopFragment() {
        super(R.layout.desktop_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getView().findViewById(R.id.intellijButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_INTELLIJ"));
        });
        getView().findViewById(R.id.pycharmButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_PYCHARM"));
        });
        getView().findViewById(R.id.androidStudioButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_ANDROID_STUDIO"));
        });
        getView().findViewById(R.id.chromeButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_CHROME"));
        });
        getView().findViewById(R.id.explorerButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_EXPLORER"));
        });
        getView().findViewById(R.id.terminalButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_TERMINAL"));
        });
    }
}