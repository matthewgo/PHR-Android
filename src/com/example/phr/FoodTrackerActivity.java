package com.example.phr;

import java.util.ArrayList;
import java.util.List;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.phr.adapter.StatusAdapter;
import com.example.phr.model.Status;

public class FoodTrackerActivity extends Activity {
	
	StatusAdapter statusAdapter;
	ListView mFoodList;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food_tracker);
		mFoodList = (ListView) findViewById(R.id.listViewFoodStatusFeed);
        getActionBar().setDisplayHomeAsUpEnabled(true);
		statusAdapter = new StatusAdapter(getApplicationContext(), generateData());
		mFoodList.setAdapter(statusAdapter);
	}

	private List<Status> generateData() {
		List<Status> list = new ArrayList<Status>();
		
		Status eat = new Status();
		eat.setActionHolder("Eating");
		eat.setActionName("sinigang");
		eat.setDatettime("January 12, 2014 12:34AM");
		eat.setStatus("YUM YUM YUM :)))");
		eat.setActionImgUrl(getResources().getDrawable(R.drawable.icon_food));
		eat.setPostViaImgUrl(getResources().getDrawable(R.drawable.icon_small_facebook));
		list.add(eat);
		
		Status drink = new Status();
		drink.setActionHolder("Drinking");
		drink.setActionName("wine");
		drink.setDatettime("January 12, 2014 12:34AM");
		drink.setStatus("weeeeeeeeeeeeeee");
		drink.setActionImgUrl(getResources().getDrawable(R.drawable.icon_drink));
		drink.setPostViaImgUrl(getResources().getDrawable(R.drawable.icon_small_facebook));
		list.add(drink);
		
		Status eat2 = new Status();
		eat2.setActionHolder("Eating");
		eat2.setActionName("bulalo");
		eat2.setDatettime("January 12, 2014 12:34AM");
		eat2.setStatus("eat today die tom");
		eat2.setActionImgUrl(getResources().getDrawable(R.drawable.icon_food));
		eat2.setPostViaImgUrl(getResources().getDrawable(R.drawable.icon_small_facebook));
		list.add(eat2);
		
		Status drink2 = new Status();
		drink2.setActionHolder("Drinking");
		drink2.setActionName("coffee");
		drink2.setDatettime("January 12, 2014 12:34AM");
		drink2.setStatus("good morning!");
		drink2.setActionImgUrl(getResources().getDrawable(R.drawable.icon_drink));
		drink2.setPostViaImgUrl(getResources().getDrawable(R.drawable.icon_small_facebook));
		list.add(drink2);
		

		list.add(eat);
		list.add(drink);
		list.add(eat2);
		list.add(drink2);
		list.add(eat);
		list.add(drink);
		list.add(eat2);
		list.add(drink2);
		list.add(eat);
		list.add(drink);
		list.add(eat2);
		list.add(drink2);
		list.add(eat);
		list.add(drink);
		list.add(eat2);
		list.add(drink2);
		list.add(eat);
		list.add(drink);
		list.add(eat2);
		list.add(drink2);
		
		return list;
	}
	

}
