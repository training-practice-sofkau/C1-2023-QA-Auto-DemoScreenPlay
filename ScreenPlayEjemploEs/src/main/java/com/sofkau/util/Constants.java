package com.sofkau.util;

import com.sofkau.models.User;

public class Constants {
    private static final User user = User.getInstance();

    public static final String ACTOR = "Purchaser";
    public static final String LOGGED_IN_AS = String.format("Logged in as %s", user.getName());
}
