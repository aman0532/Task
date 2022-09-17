package net.app.springboot.respository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.app.springboot.model.Task;

public interface TaskRepository extends JpaRepository <Task,Long> {

	

	/*@Query("select task from Task task where task.title=?1")
	public Task findByname(String title);

*/
}



