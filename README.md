# banco_terminal_java

1. Abra o projeto na IDE Eclipse

2. Clique com o botão direito no arquivo postgresql-42.6.0.jar

3. BuildPATH > Configure buildPATH

4. Aplique o conectort do postgres e clique em Aplly and Close

5. Mude as variaveis URL, USER e PASSWORD no arquivo AbstractCRUD

6. Crie um banco postgres chamado **escola**

7. Isnira o script do banco abaixo

CREATE TABLE DEPARTMENT(
    ID_DEPARTMENT SERIAL PRIMARY KEY,
    NAME_DEPARTMENT VARCHAR(50) NOT NULL,
    BUILDING VARCHAR(50) NOT NULL,
    BUDGET NUMERIC NOT NULL
);

CREATE TABLE COURSE(
    ID_COURSE SERIAL PRIMARY KEY,
    TITLE VARCHAR(50) NOT NULL,
    ID_DEPARTMENT INT NOT NULL,
    CREDIT NUMERIC NOT NULL,
    FOREIGN KEY (ID_DEPARTMENT) REFERENCES DEPARTMENT(ID_DEPARTMENT)
);

CREATE TABLE STUDENT(
    ID_STUDENT SERIAL PRIMARY KEY,
    NAME_STUDENT VARCHAR(50) NOT NULL,
    ID_DEPARTMENT INT NOT NULL,
    FOREIGN KEY (ID_DEPARTMENT) REFERENCES DEPARTMENT(ID_DEPARTMENT)
);

