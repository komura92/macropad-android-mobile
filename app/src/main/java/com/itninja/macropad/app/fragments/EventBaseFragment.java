package com.itninja.macropad.app.fragments;

import androidx.fragment.app.Fragment;

import com.itninja.macropad.app.api.client.PostData;
import com.itninja.macropad.app.api.model.Message;

import org.json.JSONObject;

public class EventBaseFragment extends Fragment {

    public EventBaseFragment(int fragmentId) {
        super(fragmentId);
    }

    protected void sendMessage(Message messageForIj) {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("action", messageForIj.getAction());
            String jsonString = jsonObject.toString();
            new PostData().execute(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Message getMessage(String action) {
        return new Message(action);
    }
}
