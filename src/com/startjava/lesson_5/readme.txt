psql -U artem -d postgres -a -f create_db.sql

windows:   psql -U postgres -d postgres -a -f create_db.sql

сменить кодировку в window: psql \! chcp 1251

windows вызвать консоль SQL shell из Пуск