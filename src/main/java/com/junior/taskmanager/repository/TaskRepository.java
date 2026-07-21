package com.junior.taskmanager.repository;

import com.junior.taskmanager.entity.Task;
import com.junior.taskmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
