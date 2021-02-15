package com.ocrown.view.jdbc.msgitem;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.msgitem.CollectItemMapper;
import com.ocrown.view.model.msgitem.CollectItem;

import org.springframework.stereotype.Component;

@Component
public class CollectItemTemplate extends BeanTemplate<CollectItem> {

    @Override
    public List<CollectItem> listT() {
        String sql="select * from collectitemtable";
        return jdbctemp.query(sql,new CollectItemMapper());
    }

    @Override
    public List<CollectItem> getT(String id) {
        String sql="select * from collectitemtable where msgid = ?";
        return jdbctemp.query(sql,new CollectItemMapper(),id);
    }
    
}
