public class PythonTutorial extends AppCompatActivity {

    private String[] python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_tutorial);
        //set the Action bar title
        getSupportActionBar().setTitle("Python");

        python = getResources().getStringArray(R.array.pythonarray);
        RecyclerView recyclerView = findViewById(R.id.python_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        PythonAdapter javaEEAdapter = new PythonAdapter(this,python);
        recyclerView.setAdapter(javaEEAdapter);
    }
