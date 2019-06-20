package com.example.bikegears.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bikegears.Dashboard;
import com.example.bikegears.R;
import com.example.bikegears.model.User;
import com.example.bikegears.url.Url;

import java.util.List;

import API.BikeGearsApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    private void CheckUser() {
        final String userName = login_username.getText().toString();
        final String passWord = login_password.getText().toString();
        BikeGearsApi bikeGearsApi = Url.getInstance().create(BikeGearsApi.class);
        Call<List<User>> listCall = bikeGearsApi.getUsers();

        listCall.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> usersList = response.body();
                for(User users:usersList){
                    String dbUname = users.getRegister_username();
                    String dbPass = users.getRegister_password();

                    if(userName.equals(dbUname) && passWord.equals(dbPass)){
                        Toast.makeText(getActivity(), "Successfully Login", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getContext(), Dashboard.class);
                        startActivity(i);
                        getActivity().finish();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(getActivity(), "Username or Password incorrect", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
