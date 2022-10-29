package com.example.statisticsproject.repositories;

import com.example.statisticsproject.exceptions.EntityNotFoundException;
import com.example.statisticsproject.models.Country;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepositoryImp implements CountryRepository{

    private final SessionFactory sessionFactory;
    @Autowired
    public CountryRepositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Country> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Country> query = session.createQuery("from Country", Country.class);
            return query.list();
        }
    }

    @Override
    public Country getByCode(String countryCode) {
        try (Session session = sessionFactory.openSession()) {
            Query<Country> query = session.createQuery("from Country where countryCode = :countryCode",
                    Country.class);
            query.setParameter("countryCode", countryCode);

            List<Country> result = query.list();
            if (result.size() == 0) {
                throw new EntityNotFoundException("Country", "countryCode", countryCode);
            }

            return result.get(0);
        }
    }

}
