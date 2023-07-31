package com.qa.testrailmanager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;

public class TestRailManager {

	public static String TEST_RUN_ID = "5";
	public static String TEST_RAIL_USERNAME = "jayesh_patle@grhombus.com";
	public static String TEST_RAIL_PASSWORD = "Jayesh123#";

	public static String TEST_RAIL_ENGINE_URL = "https://grhombustech.testrail.io/";

	public static int TEST_CASE_PASS_STATUS = 1;
	public static int TEST_CASE_FAIL_STATUS = 5;

	public static void addResultsForTestCase(String testCaseId, int status, String error) {

		String testRunID = TEST_RUN_ID;
		APIClient client = new APIClient(TEST_RAIL_ENGINE_URL);
		client.setUser(TEST_RAIL_USERNAME);
		client.setPassword(TEST_RAIL_PASSWORD);

		Map<String, Object> data = new HashMap<>();
		data.put("status_id", status);
		data.put("comment", "this test is executed via google automation code" + error);

		try {
			client.sendPost("add_result_for_case/" + testRunID + "/" + testCaseId, data);
		} catch (IOException | APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
