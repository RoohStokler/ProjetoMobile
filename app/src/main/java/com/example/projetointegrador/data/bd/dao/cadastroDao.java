package com.example.projetointegrador.data.bd.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projetointegrador.data.bd.entity.cadastroEntity;

import java.util.List;

@Dao
public interface cadastroDao {

    @Insert
    void insertAll(cadastroEntity... cadastro);

    @Query("SELECT * FROM cadastro")
    List<cadastroEntity> getAll();

    @Query("SELECT * FROM cadastro WHERE id IN (:id)")
    List<cadastroEntity> loadAllByIds(int[] id);

    @Query("SELECT * FROM cadastro WHERE nomeCompleto LIKE :first AND " +
            "cpf LIKE :last LIMIT 1")
    cadastroEntity findByName(String first, String last);

    @Update
    void updateAll(cadastroEntity cadastroEntity);

    @Delete
    void delete(cadastroEntity cadastroEntity);
}
