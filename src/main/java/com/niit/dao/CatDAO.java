package com.niit.dao;
import java.util.List;

import com.niit.model.*;
public interface CatDAO 
{
public List < Category >getAllCategory();
public boolean save(Category c);
public boolean deleteById(int cat_id);
public boolean update(Category c);
public Category getById(int cat_id);
}
