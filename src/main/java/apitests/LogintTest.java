package apitests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import api.constants.FileConstants;
import api.testdata.AddUser;
import api.testdata.UpdateUser;
import api.utils.CommonUtilities;
import apireusableutils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class LogintTest extends APIBaseTest {

	String token;
	
	@BeforeClass
	public void setURI() throws IOException {
		String uri = CommonUtilities.readFileAndReturnString(FileConstants.URI_FILE_PATH);
		RestAssured.baseURI = JsonPath.read(uri, "$.login.prod");
		System.out.println(RestAssured.baseURI);
	}
	
	@Test(enabled = false)
	public void loginTC_01() throws IOException {
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		HashMap<String, String> logincreds = new HashMap<String, String>();
		logincreds.put("username", "chimelaogele@tekarch.com");
		logincreds.put("password", "Admin123");
		
		String endpoint = JsonPath.read(CommonUtilities.readFileAndReturnString(
				FileConstants.URI_FILE_PATH), "$.endpoints.getdata");
		
		Response res1 =  RestUtils.postReq(logincreds, headers, endpoint)
				         .then().assertThat().statusCode(201)
				         .body(matchesJsonSchema(new File(FileConstants.LOGIN_SCHEMA)))
				         .extract().response();
		
		Assert.assertEquals(res1.statusCode(), 201);
	}
	
	@Test(enabled = false)
	public void getData_TC02() throws IOException {
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Token", token);
		headers.put("Content-Type", "application/json");
		
		String endpoint = JsonPath.read(CommonUtilities.readFileAndReturnString(
				FileConstants.URI_FILE_PATH), "$.endpoints.getdata");
		
//		Response res2 = RestUtils.getReq(headers, endpoint).then().assertThat().statusCode(200)
//				.body(matchesJsonSchema(new File(FileConstants.GETDATA_SCHEMA)))
//				.extract().response();
//		
//		Assert.assertEquals(res2.statusCode(), 200);
//		
		Response getUserData = RestUtils.getReq(headers, endpoint).then().statusCode(200).extract().response();
		
		
		List<String> accountNumbers = getUserData.jsonPath().getList("accountno");
		
		System.out.println(accountNumbers.size());
		
		assertThat(accountNumbers.size(), greaterThan(1000));
		
//		System.out.println(getUserData.prettyPrint());
	}
	
	@Test(enabled = false)
	public void addData_TC03() throws IOException {
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Token", token);
		headers.put("Content-Type", "application/json");
		
		String endpoint = JsonPath.read(CommonUtilities.readFileAndReturnString(
				FileConstants.URI_FILE_PATH), "$.endpoints.adddata");
		
		AddUser anu = new AddUser("TA-1333545", "4", "10110", "678947");	
		String sPayload = CommonUtilities.serializeObject(anu);
		
		Response adduserdata = RestUtils.postReq(sPayload, headers, endpoint);
		
		System.out.println(adduserdata.prettyPrint());
	}
	
	@Test(enabled = true)
	public void updateData_TC04() throws IOException {
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Token", token);
		headers.put("Content-Type", "application/json");
		
		String endpoint = JsonPath.read(CommonUtilities.readFileAndReturnString(
				FileConstants.URI_FILE_PATH), "$.endpoints.updatedata");
		
		UpdateUser upd = new UpdateUser("TA-6665542", "2", "322342", "123466", "bIG2m5rqaRu1oEyvl2xZ", "KN7zE7n0DSsbHTMJSw5z"  );	
		String sPayload = CommonUtilities.serializeObject(upd);
		
		Response updateuserdata = RestUtils.putReq(sPayload, headers, endpoint);
		
		System.out.println(updateuserdata.prettyPrint());
		
		Assert.assertEquals(updateuserdata.statusCode(), 200);
	}
	
}
