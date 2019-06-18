package com.stackroute.UserAuthentication.jwt;



import com.stackroute.UserAuthentication.domain.User;

import java.util.Map;
@FunctionalInterface
public interface SecurityTokenGenrator
{
    Map<String, String> generateToken(User user);
}
