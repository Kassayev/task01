package kz.kdt.task;

import kz.kdt.task.dao.DesignerDao;
import kz.kdt.task.dao.DeveloperDao;
import kz.kdt.task.entity.Designer;
import kz.kdt.task.entity.Developer;
import kz.kdt.task.entity.Employee;
import kz.kdt.task.entity.enums.DesignerType;
import kz.kdt.task.entity.enums.DeveloperType;

public class Main {
    public static void main(String[] args) {
        DeveloperDao developerDao = new DeveloperDao();
        DesignerDao designerDao = new DesignerDao();
        Employee developer = new Developer(4L,"Yerzhan", "Yerzhayev", "Turan 20", 50000, "HB", DeveloperType.FRONTEND);
        developerDao.save((Developer) developer);
        //developerDao.findAll();

        Employee designer = new Designer(1L,"Nurzhan", "Nurzhayev", "Turan 20", 50000, "HB", DesignerType.UIUX);
        designerDao.save((Designer) designer);

    }

}
