package com.tianta.tc.db.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.tianta.tc.db.entity.TcDataType;
import com.tianta.tc.db.mapper.TcDataTypeMapper;
import com.tianta.tc.db.repository.TcDataTypeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 遥控数据类型表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-04-20
 */
@Service
public class TcDataTypeServiceImpl extends ServiceImpl<TcDataTypeMapper, TcDataType> implements TcDataTypeService {

}
