package com.example.client.service;

import com.example.client.entity.Librarian;
import com.example.client.mapper.LibrarianMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LibrarianServiceImpl implements LibrarianService{
    @Autowired
    private LibrarianMapper librarianMapper;

    @Override
    public List<Librarian> selectLibrarian() {
        // TODO Auto-generated method stub
        return librarianMapper.selectAll();
    }

    @Override
    public int insertLibrarian(Long id, String name, String desc) {
        Librarian librarian = new Librarian();
        librarian.setIntro(desc);
        librarian.setName(name);
        librarian.setId(id);
        return librarianMapper.insert(librarian);
    }

    @Override
    public int updateLibrarian(Long id, String name, String desc) {
        Librarian librarian = new Librarian();
        librarian.setIntro(desc);
        librarian.setName(name);
        librarian.setId(id);
        return librarianMapper.updateByPrimaryKey(librarian);
    }

    public int deleteLibrarian (Long id)
    {
        Librarian librarian = new Librarian();
        librarian.setId(id);
        return librarianMapper.deleteByPrimaryKey(librarian);

    }

}
