package utils;

import org.json.JSONObject;

//we provide body for crud operations
public class APIPayloadConstants {
    public static String generateTokenPayload(){
        String generateToken = "{\n" +
                "  \"email\": \"batch12team@test.com\",\n" +
                "  \"password\": \"Test@123\"\n" +
                "}";
        return generateToken;
    }

    public static String createEmployeePayload(){
        String createEmployee = "{\n" +
                "  \"emp_firstname\": \"Burak\",\n" +
                "  \"emp_lastname\": \"Kut\",\n" +
                "  \"emp_middle_name\": \"mmm\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"1988-08-08\",\n" +
                "  \"emp_status\": \"QA\",\n" +
                "  \"emp_job_title\": \"Probation\"\n" +
                "}";
        return createEmployee;
    }
    //passing the body from json object
    public static String createEmployeePayloadViaJson(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname","Burak");
        obj.put("emp_lastname","Kut");
        obj.put("emp_middle_name","xxx");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","1988-08-08");
        obj.put("emp_status","QA");
        obj.put("emp_job_title","Tester");
        return obj.toString();
    }

    public static String createEmployeeDynamic(String firstName, String lastName, String middleName, String gender, String dob, String status, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname",firstName);
        obj.put("emp_lastname",lastName);
        obj.put("emp_middle_name",middleName);
        obj.put("emp_gender",gender);
        obj.put("emp_birthday",dob);
        obj.put("emp_status",status);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }

}
