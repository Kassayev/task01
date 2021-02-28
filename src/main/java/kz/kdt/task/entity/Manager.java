package kz.kdt.task.entity;

import kz.kdt.task.entity.enums.ManagerType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager extends Employee{
    @Enumerated(EnumType.STRING)
    private ManagerType type;

    public ManagerType getType() {
        return type;
    }

    public void setType(ManagerType type) {
        this.type = type;
    }

    public Manager(Long id, String firstName, String lastName, String address, int salary, String project, ManagerType type) {
        super(id, firstName, lastName, address, salary, project);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                "type=" + type +
                '}';
    }
}
