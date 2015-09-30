package com.neoranga55.databindingdemo.viewmodels;

import com.neoranga55.databindingdemo.models.ObservableUser;

public class UserFormViewModel {
    private final ObservableUser user;

    public UserFormViewModel() {
        user = new ObservableUser();
    }

    public void setUserName(String name) {
        user.setName(name);
    }

    public void setUserLastName(String lastName) {
        user.setLastName(lastName);
    }
}
