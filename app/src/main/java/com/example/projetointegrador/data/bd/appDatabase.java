package com.example.projetointegrador.data.bd;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.projetointegrador.data.bd.dao.cadastroDao;
import com.example.projetointegrador.data.bd.entity.cadastroEntity;

abstract class appDatabase {

    @Database(entities = {cadastroEntity.class}, version = 1)
    public abstract static class AppDatabase extends RoomDatabase {
        public abstract cadastroDao userDao();

        public static AppDatabase INSTANCE;

        public static AppDatabase getDBistance(Context context) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "AppDB")
                        .allowMainThreadQueries()
                        .build();
            }
            return INSTANCE;
        }

    }
}
