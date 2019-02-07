package com.example.guru_guru;

import android.provider.BaseColumns;

public final class ActivityDBCreate {
    private ActivityDBCreate() {
    }

    public static class ActivityTime implements BaseColumns {
        public static final String TABLE_NAME = "Activity";
        public static final String COLUMN_TIME = "Login name";

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TIME + " TEXT, ";
    }
}
