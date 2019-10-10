package com.example.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * このドメインオブジェクト定義で、
 * Spring DATA JPAを使用してDBインタラクションの処理は特にしなくてOK.
 * JPA以外にもリポジトリ実装がある.
 */
@Data // Lombokのアノテーション
@Entity // JPAのアノテーション
class Employee {

    private @Id @GeneratedValue Long id; // 主キーを示すJPAアノテーション
    private String name;
    private String role;

    Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
