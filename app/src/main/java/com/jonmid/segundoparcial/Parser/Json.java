package com.jonmid.segundoparcial.Parser;

import com.jonmid.segundoparcial.Models.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Json {

    public static List<User> parserJsonUser(String content) throws Exception {
        JSONArray myArray = new JSONArray(content);
        List<User> myUser = new ArrayList<>();

        for (int i=0; i<myArray.length(); i++){
            JSONObject item = myArray.getJSONObject(i);


        }

        return myUser;
    }

}
