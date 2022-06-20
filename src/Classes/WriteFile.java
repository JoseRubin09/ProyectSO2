/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author Jose Rubin
 */
public class WriteFile {
    
    
    public void writeData(){
        JSONArray data = txtAction.readJson("WinDB.json");
        Map<String, Object> map = (Map<String, Object>) data.get(0);
        JSONObject obj = new JSONObject();
        JSONArray newJson = new JSONArray();
        for (String key2 : map.keySet())
            switch(key2){
                case "GastosSalario1": 
                    break;
            }
        newJson.add(obj);
        
        try {
            FileWriter file = new FileWriter(new File(System.getProperty("user.dir"), "DataHistorica.json"));            
            file.write(newJson.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newJson.toJSONString());
        
    }
}
