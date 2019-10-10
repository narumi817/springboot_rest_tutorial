package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA のJpaRepositoryを拡張
 * ドメインタイプ : Employee
 * idタイプ      : Long
 *
 */
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
