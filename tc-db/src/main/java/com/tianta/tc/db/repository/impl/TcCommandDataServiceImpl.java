package com.tianta.tc.db.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.tianta.tc.db.entity.TcCommandData;
import com.tianta.tc.db.mapper.TcCommandDataMapper;
import com.tianta.tc.db.repository.TcCommandDataService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-04-20
 */
@Service
public class TcCommandDataServiceImpl extends ServiceImpl<TcCommandDataMapper, TcCommandData> implements TcCommandDataService {

}
