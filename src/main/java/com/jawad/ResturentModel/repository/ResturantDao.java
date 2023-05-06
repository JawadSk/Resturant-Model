package com.jawad.ResturentModel.repository;

import com.jawad.ResturentModel.model.Resturant;
import com.jawad.ResturentModel.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResturantDao {

    private final List<Resturant> resturantList;

    public ResturantDao() {
        resturantList = new ArrayList<>();
        resturantList.add(new Resturant("Demo", "Nanded", 7517717798l, "Vegan", 50, Review.OK, 1500));
    }

    public List<Resturant> getAll() {
        return resturantList;
    }

    public boolean add(Resturant resturant) {
        resturantList.add(resturant);
        return true;
    }

    public Resturant remove(int resturantId) {
        return resturantList.remove(resturantId);
    }

    public Resturant update(int resturantId, Resturant updatedResturant) {
        return resturantList.set(resturantId, updatedResturant);
    }
}
