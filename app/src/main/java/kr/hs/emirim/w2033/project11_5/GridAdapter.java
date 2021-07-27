package kr.hs.emirim.w2033.project11_5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.i01, R.drawable.i02, R.drawable.i03, R.drawable.i04, R.drawable.i05,
                        R.drawable.i06, R.drawable.i07, R.drawable.i08, R.drawable.i09, R.drawable.i10,
                        R.drawable.i01, R.drawable.i02, R.drawable.i03, R.drawable.i04, R.drawable.i05,
                        R.drawable.i06, R.drawable.i07, R.drawable.i08, R.drawable.i09, R.drawable.i10};

    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200,300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);
        return imgv;
    }
}