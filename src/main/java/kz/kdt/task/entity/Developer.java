package kz.kdt.task.entity;

import kz.kdt.task.entity.enums.DeveloperType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "developer")
public class Developer extends Employee {
    @Enumerated(EnumType.STRING)
    DeveloperType type;

    public Developer(Long id, String firstName, String lastName, String address, int salary, String project, DeveloperType type) {
        super(id, firstName, lastName, address, salary, project);
        this.type = type;
    }

    public DeveloperType getType() {
        return type;
    }

    public void setType(DeveloperType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Developer{" +
                super.toString() +
                "type=" + type +
                '}';
    }
}
