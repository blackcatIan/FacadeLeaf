package com.elfleaf.framework.spring;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 多数据源配置
 * 通过CustomerContextHolder切换
 */
public class DynamicDataSource extends AbstractRoutingDataSource{
    @Override  
    protected Object determineCurrentLookupKey() {  
        return CustomerContextHolder.getCustomerType();  
    }  
}
