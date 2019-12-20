package com.jackhu.base.service;

import com.jackhu.base.dto.ProviderTestDTO;
import java.util.List;

/**
 * RPC接口
 * @Author jackhu
 * @CreateTime 2019/11/6 23:03
 */
public interface IProviderService {
    List<ProviderTestDTO> queryList();
}