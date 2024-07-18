package me.po0i037e.springbootdeveloper.repository;

import me.po0i037e.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
