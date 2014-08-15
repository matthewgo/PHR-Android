package com.example.tools;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONRequestCreator {

	public static JSONObject createJSONRequest(Object object, String message)
			throws JSONException {
		JSONObject json = new JSONObject();
		json.put("data", GSONConverter.convertObjectToJSON(object));
		json.put("message", message);

		JSONObject auth = new JSONObject();
		auth.put("clientID", "9543ED1349084DA816F103234217FED7A8627621");
		auth.put("clientPassword", "Y9xSazM4fHrkNd8tMKPkbjeqKAl4YE8QXGiJ");

		json.put("auth", auth);

		return json;
	}
}