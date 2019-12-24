package com.example.elasticsearch.dao;

import com.example.elasticsearch.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ly
 * @date 2019/12/23
 */
public interface UserDao extends ElasticsearchRepository<User,Integer> {

}
