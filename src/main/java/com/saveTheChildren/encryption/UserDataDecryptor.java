package com.saveTheChildren.encryption;

import com.saveTheChildren.UserInformation.model.User;

public class UserDataDecryptor implements Cryptable {
    @Override
    public User userInformationTransformer(User user) {
        user.setFirstName(decryptorHelper(user.getFirstName()));
        user.setLastName(decryptorHelper(user.getLastName()));
        user.setAddress(decryptorHelper(user.getAddress()));
        return user;
    }

    private String decryptorHelper(String string) {
        int key = 6;
        char [] chars = string.toCharArray();
        for(char c: chars){
            c-=key;
        }
        return chars.toString();
    }
}
