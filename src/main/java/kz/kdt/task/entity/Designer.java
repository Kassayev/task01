package kz.kdt.task.entity;

import kz.kdt.task.entity.enums.DesignerType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "designer")
public class Designer extends Employee{
    @Enumerated(EnumType.STRING)
    private DesignerType type;

    public Designer(Long id, String firstName, String lastName, String address, int salary, String project, DesignerType type) {
        super(id, firstName, lastName, address, salary, project);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Designer{" +
                super.toString() +
                "type=" + type +
                '}';
    }
}
