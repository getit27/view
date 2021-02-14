package com.ocrown.view.jdbc.converse;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.converse.WeworkConverseMapper;
import com.ocrown.view.model.converse.WeworkConverse;

import org.springframework.stereotype.Component;

@Component
public class WeworkJdbcTemplate extends BeanTemplate<WeworkConverse> {

    @Override
    public List<WeworkConverse> listT() {
        String sql="select * from weworkconversetable";
        return jdbctemp.query(sql,new WeworkConverseMapper());
    }

    @Override
    public WeworkConverse getT(String id) {
        String sql="select * from weworkconversetable where msgid = ?";
        return jdbctemp.queryForObject(sql,new Object[]{id},new WeworkConverseMapper());
    }
    
}
