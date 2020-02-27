package com.study.minkook.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MinKook on 2017-10-09.
 */

public class DeleteRequest extends StringRequest {

    final static private String URL = "http://dabok407.cafe24.com/ScheduleDelete.php";
    private Map<String, String> parameters;

    public DeleteRequest(String userID, String courseID, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("courseID", courseID);
    }

    @Override
    public Map<String, String> getParams(){
        return  parameters;
    }

}
