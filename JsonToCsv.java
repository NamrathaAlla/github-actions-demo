package java;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonToCsv{
    public static void main(String myHelpers[]){
        String jsonString = "cisco_moveit.json";

        JSONObject output;
        try {
            output = new JSONObject(jsonString);


            JSONArray docs = output.getJSONArray("infile");

            File file=new File("/tmp2/fromJSON.csv");
            String csv = CDL.toString(docs);
            FileUtils.writeStringToFile(file, csv);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }

}

