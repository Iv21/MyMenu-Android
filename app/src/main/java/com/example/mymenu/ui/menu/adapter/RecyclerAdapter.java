package com.example.mymenu.ui.menu.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymenu.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private static final String TAG = "RecyclerAdapter";

    private final OnMenuItemClickListener clickListener;
    private List<Product> coffeeList;

    public RecyclerAdapter(OnMenuItemClickListener listener, List<Product> coffeeList){
        this.clickListener = listener;
        this.coffeeList = coffeeList;

    }

//public RecyclerAdapter(List<String> prices){
    //  this.prices = prices;
//}


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.i(TAG, "onCreateViewHolder: ");

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Product product = coffeeList.get(position);
        holder.textView.setText(product.title);
        holder.imageView.setImageResource(product.imageResId);
        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onMenuItemClick(product);
            }
        });

    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }

// filter za search
    //   @Override
    //   public Filter getFilter() {
    //      return coffeeFilter;
    //  }

    //   Filter coffeeFilter= new Filter() {
    //      @Override
    //       protected FilterResults performFiltering(CharSequence charSequence) {
    //          List<String> filteredList = new ArrayList<>();
    //          if (charSequence.toString().isEmpty()){
    //              filteredList.addAll(coffeeListAll);
    //         }
    //         else {
    //           for (String coffee: coffeeListAll){
    //             if (coffee.toLowerCase().contains(charSequence.toString().toLowerCase())){
    //               filteredList.add(coffee);
    //         }
    //   }
    //   }

    // FilterResults filterResults = new FilterResults();
    //   filterResults.values = filteredList;
    //    return filterResults;
    //   }

    //     @Override
    //      protected void publishResults(CharSequence charSequence, FilterResults results) {
    //      coffeeList.clear();
    //          FilterResults filterResults = new FilterResults();
    //          coffeeList.addAll((Collection<? extends String>) filterResults.values);
    //       notifyDataSetChanged();
    //      }
    //  };

    public class ViewHolder extends RecyclerView.ViewHolder{

        final View rootView;
        ImageView imageView;
        TextView textView,textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rootView =itemView.findViewById(R.id.itemRoot);
            imageView =itemView.findViewById(R.id.imageView);
            textView =itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView);

        }
    }

}




