package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LvMathFormula;
    ArrayList<basicMathFormula> alMathFormula;
    private CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LvMathFormula = findViewById(R.id.ListViewMathFormula);
        alMathFormula = newArrayList<>();

        basicMathFormula item1 = new basicMathFormula("Area of rectangle", "length x length","Formula Type: Area");
        basicMathFormula item2 = new basicMathFormula("Area of triangle", "(length x height)/2","Formula Type: Area");
        basicMathFormula item3 = new basicMathFormula("Area of cube","(length x length x length", "Formula Type: Volume");

        alMathFormula.add(item1);
        alMathFormula.add(item2);
        alMathFormula.add(item3);

        caMath = new CustomAdapter(this, R.layout.basic_math_formula, alMathFormula);
        LvMathFormula.setAdapter(caMath);
    }
}
