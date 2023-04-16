package org.example;



import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main  {
    public static void main(String[] args) {


        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.connect();

            int reponseCode = connection.getResponseCode();

            if (reponseCode != 200) {
                throw new RuntimeException("HttpResponseCode" + reponseCode);
            } else {
                //Write all json obeject into  string


                String inline = "";
                Scanner scn = new Scanner(url.openStream());

                while (scn.hasNext()) {
                    inline += scn.nextLine();
                }

                //scanner close
                scn.close();

                //Using the JSON simple library parse the string into a json object
                JSONParser parser = new JSONParser();

                JSONObject jsonData = (JSONObject) parser.parse(inline);

                //Get the required object from the above created object
                String  obj2 =  jsonData.get("value").toString();

                System.out.print(obj2);


                //Get the required data using its key

                //System.out.print(inline);

                //JSONArray arr = (JSONArray) jsonData.get("updated_at");


                //System.out.print(arr);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}