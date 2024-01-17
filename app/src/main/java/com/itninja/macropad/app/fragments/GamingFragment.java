package com.itninja.macropad.app.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.itninja.macropad.app.R;

public class GamingFragment extends EventBaseFragment {

    public GamingFragment() {
        super(R.layout.gaming_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getView().findViewById(R.id.chromeButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_CHROME"));
        });
        getView().findViewById(R.id.csButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_CS"));
        });
        getView().findViewById(R.id.discordButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_DISCORD"));
        });
        getView().findViewById(R.id.steamButton).setOnClickListener(task -> {
            sendMessage(getMessage("RUN_STEAM"));
        });
        getView().findViewById(R.id.acceptButton).setOnClickListener(task -> {
            sendMessage(getMessage("CLICK_ACCEPT"));
        });
    }
}