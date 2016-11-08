###Sample Project


This repository contains a sample application that was used to create a simple graphical user interface with event listeners. 





![output_v0xko3](https://cloud.githubusercontent.com/assets/11635523/15272436/0a372f0e-1a3e-11e6-8970-509e83674b9b.gif)

####MainActivity.java code

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


###hello World

![helloworld](https://cloud.githubusercontent.com/assets/11635523/20042664/f5888cde-a443-11e6-9748-caf57cc79747.gif)

####MainActivity.java code

```java

 Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);

            }
        });

    }


```


###Material Design Portfolio

![materialdesignportfolio](https://cloud.githubusercontent.com/assets/11635523/20086874/581e8fba-a539-11e6-984c-5e6b6e67048d.gif)

####MainActivity.java code

```java

 private Toolbar mGeneralToolbar;
    CollapsingToolbarLayout collapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mGeneralToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mGeneralToolbar);

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_tool);

        collapsingToolbar.setTitle(mGeneralToolbar.getTitle());

    }


```
####Dependencies

```gradle

    compile 'com.android.support:design:25.0.0'
    compile 'com.android.support:cardview-v7:25.0.0'
    compile 'de.hdodenhof:circleimageview:2.1.0'

```
