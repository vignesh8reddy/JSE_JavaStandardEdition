package JDBCStandaloneApplication.service;

import JDBCStandaloneApplication.dao.IStudentDao;
import JDBCStandaloneApplication.dto.Student;
import JDBCStandaloneApplication.factory.StudentDaoFactory;

public class StudentServiceImpl implements IStudentService{

    IStudentDao studentDao;

    @Override
    public String save(Student student) {
        studentDao = StudentDaoFactory.getStudentDao();
        return studentDao.save(student);

    }

    @Override
    public Student findById(Integer sid) {
        studentDao = StudentDaoFactory.getStudentDao();
        return studentDao.findById(sid);
    }

    @Override
    public String updateById(Student student) {
        studentDao = StudentDaoFactory.getStudentDao();
        return studentDao.updateById(student);
    }

    @Override
    public String deleteById(Integer sid) {
        studentDao = StudentDaoFactory.getStudentDao();
        return studentDao.deleteById(sid);
    }


}
