package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Optional<List<Student>> findByName(String name);

	Optional<List<Student>> findByNameAndStatus(String name, String status);

	@Query(value = "select * from student_table where student_name =:name and status =:status ", nativeQuery = true)
	Optional<List<Student>> getByNameAndStatus(String name, String status);

	@Modifying
	@Query(value = "update student_table set status=:status where student_code = :code", nativeQuery = true)
	public void updateStudentByStatus(String status, String code);

	@Modifying
	@Query(value = "update student_table set status=:status where student_code in (:codes)", nativeQuery = true)
	public void updateStudentByStatusAndCodes(String status, List<String> codes);

	Optional<Student> findByStudentCode(String studentCode);
}
