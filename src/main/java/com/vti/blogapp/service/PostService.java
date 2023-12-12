package com.vti.blogapp.service;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateForm;
import com.vti.blogapp.form.PostFilterForm;
import com.vti.blogapp.form.PostUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface PostService {
    Page<PostDto> findAll(PostFilterForm form, Pageable pageable);
    PostDto findById(Long id);
    PostDto create(PostCreateForm from);

    PostDto update(PostUpdateForm from, Long id);

    void deleteById(Long id);
}
