package com.itninja.macropad.app.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.itninja.macropad.app.R;

public class ProgrammingFragment extends EventBaseFragment {

    public ProgrammingFragment() {
        super(R.layout.programming_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getView().findViewById(R.id.switchcaseButton).setOnClickListener(task -> {
            sendMessage(getMessage("SWITCH_CASE_SHORTCUT"));
        });
        getView().findViewById(R.id.crudButton).setOnClickListener(task -> {
            sendMessage(getMessage("GENERATE_CRUD"));
        });
        getView().findViewById(R.id.stacktraceButton).setOnClickListener(task -> {
            sendMessage(getMessage("ANALYZE_STACKTRACE"));
        });
        getView().findViewById(R.id.evaluatorButton).setOnClickListener(task -> {
            sendMessage(getMessage("EVALUATOR_SHORTCUT"));
        });
        getView().findViewById(R.id.mvnBuildButton).setOnClickListener(task -> {
            sendMessage(getMessage("MVN_BUILD"));
        });
        getView().findViewById(R.id.deployButton).setOnClickListener(task -> {
            sendMessage(getMessage("DEV_DEPLOY_SCRIPT"));
        });
    }
}
