package com.health.fooddietapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.health.fooddietapplication.R;
import com.health.fooddietapplication.adapters.HomeHorAdapter;
import com.health.fooddietapplication.adapters.HomeVerAdapter;
import com.health.fooddietapplication.adapters.UpdateVerticalRec;
import com.health.fooddietapplication.models.HomeHorModel;
import com.health.fooddietapplication.models.HomeVerModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements UpdateVerticalRec {
    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    /////////////////Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView (@NonNull LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        ////////////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.fruitsalad, "Fruit Salad"));
        homeHorModelList.add(new HomeHorModel(R.drawable.saladbowl, "Salad Bowl Veggies"));
        homeHorModelList.add(new HomeHorModel(R.drawable.yogurt, "Yogurt"));
        homeHorModelList.add(new HomeHorModel(R.drawable.drinks, "Drinks"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fish, "Fish Recipes"));
        homeHorModelList.add(new HomeHorModel(R.drawable.bread, "Bread"));
        homeHorModelList.add(new HomeHorModel(R.drawable.meat, "Meat Recipes"));
        homeHorModelList.add(new HomeHorModel(R.drawable.egg, "Egg Recipes"));
        homeHorModelList.add(new HomeHorModel(R.drawable.snacks, "Snacks"));

        HomeHorAdapter HomeHorAdapter = new HomeHorAdapter(this, getActivity(), homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        ////////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(), homeVerModelList);
        homeVerticalRec.setAdapter(homeHorAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));


        return root;
    }

    @Override
    public void callBack (int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter((FragmentActivity) getContext(), list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}