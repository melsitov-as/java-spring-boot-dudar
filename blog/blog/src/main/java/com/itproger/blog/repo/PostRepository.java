package com.itproger.blog.repo;

import org.springframework.data.repository.CrudRepository;

import com.itproger.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
