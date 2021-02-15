package com.ocrown.view.jdbc.msgitem;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.msgitem.MixedItemMapper;
import com.ocrown.view.model.msgitem.MixedItem;

import org.springframework.stereotype.Component;

@Component
public class MixedItemTemp extends BeanTemplate<MixedItem> {

    @Override
    public List<MixedItem> listT() {
        String sql="select * from mixeditemtable";
        return jdbctemp.query(sql,new MixedItemMapper());
    }

    @Override
    public List<MixedItem> getT(String id) {
        String sql="select * from mixeditemtable where msgid = ?";
        return jdbctemp.query(sql,new MixedItemMapper(),id);
    }
    
}
