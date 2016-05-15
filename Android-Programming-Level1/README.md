This repository contains a sample applications that was used to create a simple graphical user interface with event listeners. 





![output_v0xko3](https://cloud.githubusercontent.com/assets/11635523/15272436/0a372f0e-1a3e-11e6-8970-509e83674b9b.gif)


```java


  Button helloWord ;
  TextView happyCoding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        happyCoding=(TextView)findViewById(R.id.textView);



        helloWord =(Button) findViewById(R.id.button);
        helloWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello World, Hola Mundo",
                        Toast.LENGTH_LONG).show();
                happyCoding.setText("Android............");
            }
        });


```
