package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<basicMathFormula> alMathFormula;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<basicMathFormula> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.alMathFormula = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvRectangle);
        TextView tvDate = rowView.findViewById(R.id.tvTriangle);
        TextView tvRating = rowView.findViewById(R.id.tvCube);

        basicMathFormula currentItem = alMathFormula.get(position);
        tvName.setText(currentItem.getRectangleArea());
        tvDate.setText(currentItem.getTriangleArea());
        tvRating.setText(currentItem.getCubeArea());

        return rowView;
    }

}