package com.neoranga55.databindingdemo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;
import android.text.TextWatcher;

import com.neoranga55.databindingdemo.BR;


public class ObservableUser extends BaseObservable {

    private String name = "";
    private String lastName = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final TextWatcher nameChanged = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            setName(s.toString());
            notifyPropertyChanged(BR.formattedUser);
        }
    };

    public final TextWatcher lastNameChanged = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            setLastName(s.toString());
            notifyPropertyChanged(BR.formattedUser);
        }
    };

    @Bindable
    public String getFormattedUser() {
        return name + " " + lastName;
    }
}
