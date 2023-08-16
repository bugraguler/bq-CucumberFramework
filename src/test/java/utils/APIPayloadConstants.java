package utils;
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

}
