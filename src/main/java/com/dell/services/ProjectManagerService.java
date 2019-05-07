package com.dell.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dell.Utill.MyBatisUtil;
import com.dell.mapper.ProjectManagerMapper;
import com.dell.model.ProjectManager;


public class ProjectManagerService implements ProjectManagerMapper {

	public List<ProjectManager> findAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ProjectManagerMapper mapper = session.getMapper(ProjectManagerMapper.class);
			return mapper.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}


}





//public List<ProjectManager> getAllUsers() {
//SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//try {
//	ProjectManagerMapper projectManagerMapper = sqlSession.getMapper(ProjectManagerMapper.class);
//	return projectManagerMapper.getAllUsers();
//} finally {
//	sqlSession.close();
//}
//}