# banco_edisom

# SCRIPT DO BANCO

Abra o psql(Postgres SQL)

**\l** - Lista os bancos de dados que voce tem
Se não tiver um banco __classes__ crie um com **create database classes;**

**\c classes** - acessa o banco de dados classes 

------------------------------------------------

Coloque o script abaixo no terminal

CREATE TABLE TIME_SLOT(
    TIME_SLOT_ID SERIAL PRIMARY KEY,
    DAY_TIME INTEGER NOT NULL,
    START_TIME TIME NOT NULL,
    END_TIME TIME NOT NULL
);

CREATE TABLE DEPARTMENT(
    ID_DEPT SERIAL PRIMARY KEY,
    NAME_DEPT VARCHAR(50) NOT NULL,
    BUILDING VARCHAR(50) NOT NULL,
    BUDGET NUMERIC NOT NULL
);

CREATE TABLE COURSE(
    ID_COURSE SERIAL PRIMARY KEY,
    TITLE VARCHAR(50) NOT NULL,
    ID_DEPT SERIAL NOT NULL,
    CREDIT NUMERIC NOT NULL,
    FOREIGN KEY (ID_DEPT) REFERENCES DEPARTMENT(ID_DEPT)
);

CREATE TABLE PREREQ(
    ID_PREREQ VARCHAR(50) PRIMARY KEY,
    ID_COURSE SERIAL,
    FOREIGN KEY (ID_COURSE) REFERENCES COURSE(ID_COURSE)
);

CREATE TABLE INSTRUCTOR(
    ID_INSTRUCTOR SERIAL PRIMARY KEY,
    NAME_INSTRUCTOR VARCHAR(50) NOT NULL,
    ID_DEPT SERIAL,
    SALARY NUMERIC NOT NULL,
    FOREIGN KEY (ID_DEPT) REFERENCES DEPARTMENT(ID_DEPT)
);

CREATE TABLE STUDENT(
    ID_STUDENT SERIAL PRIMARY KEY,
    NAME_STUDENT VARCHAR(50) NOT NULL,
    ID_DEPT SERIAL,
    FOREIGN KEY (ID_DEPT) REFERENCES DEPARTMENT(ID_DEPT)
);

CREATE TABLE ADVISOR(
    ID_INSTRUCTOR SERIAL,
    ID_STUDENT SERIAL,
    FOREIGN KEY (ID_INSTRUCTOR) REFERENCES INSTRUCTOR(ID_INSTRUCTOR),
    FOREIGN KEY (ID_STUDENT) REFERENCES STUDENT(ID_STUDENT)
);

CREATE TABLE SECTION(
    ID_SECTION SERIAL PRIMARY KEY,
    ID_COURSE SERIAL,
    SEMESTER_COURSE INTEGER NOT NULL,
    YEAR_COURSE INTEGER NOT NULL,
    BUILDING VARCHAR(50) NOT NULL,
    ROOM_NO INTEGER NOT NULL,
    ID_TIME_SLOT INTEGER
);
