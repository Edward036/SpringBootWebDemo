package com.research.repository;

import com.research.mapper.ProjectMapper;
import com.research.model.Pagination;
import com.research.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository{

    @Autowired
    ProjectMapper projectMapper;


    public int insertProject(Project project) {
        return projectMapper.insertProject(project);
    }

    public int deleteProjectById(Integer id) {
        return projectMapper.deleteProjectById(id);
    }

    public int updateProjectById(Project project) {
        return projectMapper.updateProjectById(project);
    }

    public Project getProjectById(Integer id) {
        return projectMapper.getProjectById(id);
    }

    public List<Project> getProjects(Pagination pagination) {
        return projectMapper.getProjects(pagination);
    }

    public Integer getProjectCounts() {
        return projectMapper.getProjectCounts();
    }
}