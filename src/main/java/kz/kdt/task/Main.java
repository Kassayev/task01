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
        //менять id у каждого и удалять от сюда после добавление в БД. тут id=4L
        Employee developer = new Developer(4L,"Yerzhan", "Yerzhayev", "Turan 20", 50000, "HB", DeveloperType.FRONTEND);
        developerDao.save((Developer) developer);
        //developerDao.findAll();

        //менять id у каждого и удалять от сюда после добавление в БД, тут id=1L
        Employee designer = new Designer(1L,"Nurzhan", "Nurzhayev", "Turan 20", 50000, "HB", DesignerType.UIUX);
        designerDao.save((Designer) designer);

    }

}
