package com.alessandra.taco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WordRepositoryImpl implements WordRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSourceProvider dataSourceProvider;

    @Override
    public void createWordTable() {
        jdbcTemplate = new JdbcTemplate(dataSourceProvider.getDataSource());
        jdbcTemplate.execute("CREATE TABLE words (id INT, name VARCHAR)");
    }
}
