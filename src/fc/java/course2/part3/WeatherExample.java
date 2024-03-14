package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey ="";
        String city ="Seoul";
        String urlString ="";
        try{
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET"); //get방식으로 요청
            connection.setRequestProperty("Accept","application/json"); //json 형식으로 받음

            int responseCode = connection.getResponseCode(); //200이라면 정상적으로 받은 것
            if(responseCode ==200) {
               BufferedReader in  =new BufferedReader( new InputStreamReader (connection.getInputStream()) );
               //스트림 연결, 입출력 관련 스트림
                String inputLine;
                StringBuffer content = new StringBuffer();
                while((inputLine = in.readLine()) != null){
                    content.append(inputLine);
                    //인풋라인에서 스트림버퍼에 저장.
                }
                in.close();
                //streamBuffer가 어떤 내용인지 출력
                System.out.println("content.toString() = " + content.toString());
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                //스트링으로 읽어온 후 json-> object
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                System.out.println("temp = " + temp);
                connection.disconnect();
            }else{
                //200아닐시, 응답안됨

            }
        }catch (Exception e){
            e.printStackTrace(); //에러메세지 출력
        }
    }
}
