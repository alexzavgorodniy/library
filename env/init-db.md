# PosgreSQL
CREATE USER "user"
  WITH
    LOGIN
    NOSUPERUSER
    NOINHERIT
    NOCREATEDB
    NOCREATEROLE
    NOREPLICATION
    PASSWORD 'user';

CREATE DATABASE "library"
  WITH
    OWNER = "user"
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default;

GRANT ALL ON DATABASE "library" TO "user";

GRANT TEMPORARY, CONNECT ON DATABASE "library" TO PUBLIC;

# MariaDB
CREATE USER IF NOT EXISTS 'user' IDENTIFIED BY 'user';

GRANT USAGE ON *.* TO 'user'@localhost IDENTIFIED BY 'user';
GRANT USAGE ON *.* TO 'user'@'%' IDENTIFIED BY 'user';

CREATE DATABASE IF NOT EXISTS `library-db`;
GRANT ALL privileges ON `library-db`.* TO 'user'@localhost;

FLUSH PRIVILEGES;