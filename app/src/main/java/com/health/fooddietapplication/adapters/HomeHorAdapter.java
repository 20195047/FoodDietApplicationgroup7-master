package com.health.fooddietapplication.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.health.fooddietapplication.R;
import com.health.fooddietapplication.models.HomeHorModel;
import com.health.fooddietapplication.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {


    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;
    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    public HomeHorAdapter(FragmentActivity activity, List<HomeHorModel> homeHorModelList) {

    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.id.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check){
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad1,"Fruit Salad","10:00 - 10:30","23% per 0.5 cup serving"));
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad2,"Sour Fruit Salad", "10:00 - 10:30","20% per 0.5 cup serving"));
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad3,"Finger-Tip Fruit Salad", "10:00 - 10:30","15% per 0.5 cup serving"));
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad4,"Ice Cream Fruit Salad", "10:00 - 10:30","28% per 0.5 cup serving"));
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad5,"Honey Lime Fruit Salad", "10:00 - 10:30","25% per 0.5 cup serving"));
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad6,"Canned Fruit Salad", "10:00 - 10:30","30% per 0.5 cup serving"));
            homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad7,"Banana Fruit Salad", "10:00 - 10:30","18% per 0.5 cup serving"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){


                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad1,"Fruit Salad","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad2,"Sour Fruit Salad", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad3,"Finger-Tip Fruit Salad", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad4,"Ice Cream Fruit Salad", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad5,"Honey Lime Fruit Salad", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad6,"Canned Fruit Salad", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruitsalad7,"Banana Fruit Salad", "10:00 - 10:30","18% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);


                    } else if (position ==1) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl1,"Chicken Salad","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl2,"Veggie Salad", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl3,"Mushroom Salad", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl4,"Meat Salad", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl5,"Bacon Salad", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl6,"Spinach Salad", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saladbowl7,"Ham & Cheese Salad", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);


                    } else if (position ==2) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt1,"Strawberry Yogurt","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt2,"Blackberry Yogurt", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt3,"Raspberry Yogurt", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt4,"Coffee Yogurt", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt5,"Berries Yogurt", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt6,"Lemon Yogurt", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yogurt7,"Vanilla Yogurt", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position ==3) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.drinks1,"Mango Drinks","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drinks2,"Banana Shake Drinks", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drinks3,"Pineapple Juice Drinks", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drinks4,"Strawberry Shake Drinks", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drinks5,"Coconut Milkshake Drinks", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drinks6,"Blackberry Shake Drinks", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drinks7,"Lemon Juice Drinks", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position ==4) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fish1,"Tuna Fish","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fish2 ,"Baked Salmon Fish", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fish3,"Mediterranean Baked Fish", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fish4,"Trout with Garlic Lemon Butter Herb Sauce", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fish5,"Cod Fish Fillets With Leek Sprouts Recipe", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fish6,"Bulanglang na Bangus", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fish7,"Lemony Grilled Salmon", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position ==5) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.bread1,"Banana Almond Bread","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bread2 ,"Whole Grain Bread", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bread3,"Scrumptious Bread", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bread4,"Banana Choco Dip Bread", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bread5,"Cranberry Lemon Quick Bread", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bread6,"Wheat Bread", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bread7,"Milk Bread", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position ==6) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.meat1,"Italiano Meatloaf","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.meat2 ,"Vegetable Jambalaya", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.meat3,"Stuffed Peppers ala Chicken", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.meat4,"Meatballs veggies salad", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.meat5,"Chickpea Curry", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.meat6,"Avant-Garde", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.meat7,"Pea & Potato Curry", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position ==7) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.egg1,"Salsa Scrambled","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.egg2 ,"Egg with Spinach and Whole Grain Bread", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.egg3,"Egg Salad", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.egg4,"Egg & Tomatoes", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.egg5,"Egg-Broccoli", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.egg6,"Spanish Baked Egg", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.egg7,"Bacon & Spinach Baked Egg", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position ==8) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.snacks1,"Popcorn","10:00 - 10:30","23% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.snacks2 ,"Sunflower Seeds", "10:00 - 10:30","20% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.snacks3,"Flavored Nuts", "10:00 - 10:30","15% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.snacks4,"Treats", "10:00 - 10:30","28% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.snacks5,"Apple, Grapes and half-sandwich", "10:00 - 10:30","25% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.snacks6,"Sticked-Fruits", "10:00 - 10:30","30% per 0.5 cup serving"));
                        homeVerModels.add(new HomeVerModel(R.drawable.snacks7,"Avocado Toast with Egg", "10:00 - 10:30","30% per 0.5 cup serving"));

                        updateVerticalRec.callBack(position,homeVerModels);
                }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
            }
        }

    }
    @Override
    public int getItemCount () {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.salad_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
