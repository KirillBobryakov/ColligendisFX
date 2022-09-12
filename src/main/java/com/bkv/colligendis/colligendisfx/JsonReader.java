package com.bkv.colligendis.colligendisfx;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class JsonReader {
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String jsonStr = readAll(rd);
            if(!jsonStr.startsWith("[") && !jsonStr.endsWith("]")){
                return new JSONArray("[" + jsonStr + "]");
            } else {
                return new JSONArray(jsonStr);
            }

        } finally {
            is.close();
        }
    }

}
