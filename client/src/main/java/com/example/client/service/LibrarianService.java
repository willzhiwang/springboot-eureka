package com.example.client.service;

import com.example.client.entity.Librarian;

import java.util.List;

public interface LibrarianService {
    List<Librarian> selectLibrarian();

    int insertLibrarian(Long id, String name, String desc);
    int updateLibrarian(Long id, String name, String desc);
    int deleteLibrarian(Long id);
}
