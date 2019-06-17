package com.example.bikegears.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bikegears.R;

public class LoginFragment extends Fragment implements View.OnClickListener {
    private EditText login_username, login_password;
    private Button login_btn;

    @Override
    public void onClick(View v) {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.activity_login, container, false);
        login_btn=view.findViewById(R.id.login_btn);
        login_username=view.findViewById(R.id.login_username);
        login_password=view.findViewById(R.id.login_password);

        login_btn.setOnClickListener(this);

        return view;
    }


}
