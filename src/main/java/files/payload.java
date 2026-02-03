package files;

public class payload {
	
	public static String createBug() {
		return "{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"project\": {\r\n"
				+ "      \"key\": \"SCRUM\"\r\n"
				+ "    },\r\n"
				+ "    \"summary\": \"Buttons issue 02(TEST TEST TEST)\",\r\n"
				+ "    \"description\": {\r\n"
				+ "      \"type\": \"doc\",\r\n"
				+ "      \"version\": 1,\r\n"
				+ "      \"content\": [\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"paragraph\",\r\n"
				+ "          \"content\": [\r\n"
				+ "            {\r\n"
				+ "              \"type\": \"text\",\r\n"
				+ "              \"text\": \"Creating an issue via REST API\"\r\n"
				+ "            }\r\n"
				+ "          ]\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    },\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "      \"id\": \"10003\"\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "";
		
	}

}
