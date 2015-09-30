package com.neoranga55.databindingdemo.viewmodels;

import android.view.View;

import com.neoranga55.databindingdemo.models.ObservableUser;

public class UserFormViewModel {
    private final ObservableUser mUser;
    private final UserFormView mUserFormView;

    public UserFormViewModel(UserFormView userFormView) {
        mUserFormView = userFormView;
        mUser = new ObservableUser();
    }

    public ObservableUser getUser() {
        return mUser;
    }

    public void setUserName(String name) {
        mUser.setName(name);
    }

    public void setUserLastName(String lastName) {
        mUser.setLastName(lastName);
    }

    public View.OnClickListener clearUserDataListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mUserFormView.cleanUserDataFields();
        }
    };

    public interface UserFormView {
        public void cleanUserDataFields();
    }
}
