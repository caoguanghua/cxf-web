package com.mes.cxf.base;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;

public interface IBaseMapper<T>extends BaseMapper<T>,ExampleMapper<T>{

}
