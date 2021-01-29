package com.saveTheChildren.encryption;

import com.saveTheChildren.UserInformation.model.User;

public class UserDataEncryptor implements Cryptable {
    @Override
    public User userInformationTransformer(User user) {
        user.setFirstName(encryptorHelper(user.getFirstName()));
        user.setLastName(encryptorHelper(user.getLastName()));
        user.setAddress(encryptorHelper(user.getAddress()));
        return user;
    }

    private String encryptorHelper(String string){
        int key = 6;
        char [] chars = string.toCharArray();
        for(char c: chars){
            c+=key;
            System.out.print(c);
        }
        return chars.toString();
    }


}
