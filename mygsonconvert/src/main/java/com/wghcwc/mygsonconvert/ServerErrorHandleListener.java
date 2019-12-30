package com.wghcwc.retrofitrxjava.gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author wghcwc
 * @date 19-12-30
 */
public interface ServerErrorHandleListener {
     IOException needThrow(JSONObject jsonObject) throws JSONException;

}
