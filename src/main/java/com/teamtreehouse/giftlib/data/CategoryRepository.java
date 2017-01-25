package com.teamtreehouse.giftlib.data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import com.teamtreehouse.giftlib.model.Category;
import com.teamtreehouse.giftlib.model.Gif;

@Component
public class CategoryRepository {

	private static final List <Category> ALL_CATEGORIES=Arrays.asList(
			new Category(1,"Karin"),
			new Category(2, "Lola"),
			new Category(3, "Hello")
			);
	
	public List<Category> getAllCategories(){
		return ALL_CATEGORIES;
	}
	
	public Category findById (int id){
		for(Category category: ALL_CATEGORIES){
			if (category.getId()==id){
				return category;
			}
		}
		return null;
	}

}
