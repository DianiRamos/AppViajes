package ambrosio.modelos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import ambrosio.modelos.modelos.Lugar;

/**
 * Created by liz on 18/10/2017.
 */

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.ViewHolder>{

    ArrayList<Lugar> lugares;
    Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);

        }
    }
}
