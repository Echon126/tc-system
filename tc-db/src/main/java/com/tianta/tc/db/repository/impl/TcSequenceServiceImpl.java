package com.tianta.tc.db.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.tianta.tc.db.entity.TcSequence;
import com.tianta.tc.db.mapper.TcSequenceMapper;
import com.tianta.tc.db.repository.TcSequenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-04-20
 */
@Service
public class TcSequenceServiceImpl extends ServiceImpl<TcSequenceMapper, TcSequence> implements TcSequenceService {

}
