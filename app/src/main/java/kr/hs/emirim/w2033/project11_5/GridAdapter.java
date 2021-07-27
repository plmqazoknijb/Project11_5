package kr.hs.emirim.w2033.project11_5;

import android.app.AlertDialog;
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
    int[] titleIds = {R.string.posterID_1, R.string.posterID_2, R.string.posterID_3, R.string.posterID_4, R.string.posterID_5,
                        R.string.posterID_6, R.string.posterID_7, R.string.posterID_8, R.string.posterID_9, R.string.posterID_10,
                        R.string.posterID_1, R.string.posterID_2, R.string.posterID_3, R.string.posterID_4, R.string.posterID_5,
                        R.string.posterID_6, R.string.posterID_7, R.string.posterID_8, R.string.posterID_9, R.string.posterID_10,};

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

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context,R.layout.dialog1,null);
                ImageView imgvLarge= dialogView.findViewById(R.id.imgv_large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle(titleIds[pos]);
                dialog.setIcon(R.drawable.movie);
                dialog.setView(dialogView);
                dialog.setNegativeButton("close",null);
                dialog.show();
            }
        });

        return imgv;
    }
}
