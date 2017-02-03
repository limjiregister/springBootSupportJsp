package com.thanks.utils;

import com.thanks.entity.Response;

/**
 * Created by Administrator on 2017/2/3.
 */
public class SomeMthods {

	public static Response response(Object returnData, Integer errorCode) {

		Response response = new Response();
		response.setMsg("");
		response.setErrorCode(errorCode);
		response.setData(returnData);

		return response;
	}

}
