package com.example.com.androidjsonparser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    /*

    JSONObject

    {
    "User": {
        "name":       "Jonathan",
        "github":     "JonathanMoreno14",
        "location":    "Fort Worth",
        "color":        "Blue",
        "programmer":   true
          }
   }

     */


    /*
     JSON Array

     { "Profile" :
            [
             {"name":"Jonathan",
             "github":"JonathanMoreno14",
             "location":"Texas"
             },
             {"name":"Octocat",
             "github":"octocat",
              "location": "California"
              },
              {
               "name": "John",
               "github":"Doe",
               "location":"Unknown"
              }
            ]
     }



     */

    public static final String JSON_STRING="{\"user\":{\"name\":\"Jonathan\",\"github\":\"JonathanMoreno14\",\"location\":\"Fort Worth\",\"color\":\"Blue\"}}";
    String strArrayJson="{ \"Profile\" :[" +
                        "{\"name\":\"Jonathan\",\"github\":\"JonathanMoreno14\",\"location\":\"Texas\" }," +
                        "{\"name\":\"Octocat\",\"github\":\"Octocat\", \"location\":\"California\"}," +
                       " {\"name\":\"John\",\"github\":\"Doe\", \"location\":\"Unknown\"}" +
                        "] }";
    TextView jsonObjText;
    TextView jsonArrayText;
    Button btnObjParser;
    Button btnArrayParser;
    Button btnCLR;
    JSONArray jsonArray;


    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jsonObjText  =(TextView)findViewById(R.id.textView);
        jsonArrayText  =(TextView)findViewById(R.id.textView2);



        btnObjParser =(Button) findViewById(R.id.button);
        btnObjParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonObjParse();
                Toast.makeText(MainActivity.this, "Parsed JSON Object",
                        Toast.LENGTH_SHORT).show();
                  jsonArrayText.setText("");
            }
        });


        btnArrayParser =(Button) findViewById(R.id.button3);
        btnArrayParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonArrayParse();
                Toast.makeText(MainActivity.this, "Parsed JSON Array",
                        Toast.LENGTH_SHORT).show();
                jsonObjText.setText("");
            }
        });

        btnCLR =(Button) findViewById(R.id.button2);
        btnCLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonObjText.setText("");
                jsonArrayText.setText("");

            }
        });



    }


//JSON Object Method
    public  void jsonObjParse(){
        try{
            JSONObject userObj=(new JSONObject(JSON_STRING)).getJSONObject("user");
            String name=userObj.getString("name");
            String gitHub=userObj.getString("github");
            String location=userObj.getString("location");
            String color=userObj.getString("color");


            String str="User "+"\n"+"Name: "+name+"\n"+"Github: "+gitHub +"\n"+"Location: "+location+"\n"+"Color: "+color ;
            jsonObjText.setText(str);

        }catch (Exception e) {e.printStackTrace();}

    }


//JSON Array Method
    public void jsonArrayParse(){
        try {
            // Create the root JSONObject from the JSON string.
            JSONObject  jsonRootObject = new JSONObject(strArrayJson);

            //Get the instance of JSONArray that contains JSONObjects
            JSONArray jsonArray = jsonRootObject.optJSONArray("Profile");

            //Iterate the jsonArray and print the info of JSONObjects
            for(int i=0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);


                String name = jsonObject.getString("name");
                String github = jsonObject.getString("github");
                String location = jsonObject.getString("location");


                data +=  "Name: "+name+"\n" +"github: "+github+"\n"+"Location: "+location +"\n";
            }
            jsonArrayText.setText("Profile: " +"\n"+data);
        } catch (JSONException e) {e.printStackTrace();}
    }


}






