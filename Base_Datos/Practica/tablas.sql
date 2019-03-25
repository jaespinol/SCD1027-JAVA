DROP TABLE IF EXISTS Poblaciones;
DROP TABLE IF EXISTS IdiomasPais;
DROP TABLE IF EXISTS Idiomas;
DROP TABLE IF EXISTS Paises;
DROP TABLE IF EXISTS Capitales;

CREATE TABLE Capitales (
        id INT NOT NULL auto_increment,
        nombre VARCHAR(255) NOT NULL,
        PRIMARY KEY (id)
);

CREATE TABLE Paises (
        id INT NOT NULL auto_increment,
        nombre VARCHAR(64) NOT NULL,
        capital INT NOT NULL,
        PRIMARY KEY (id),
        CONSTRAINT FOREIGN KEY (capital)
            REFERENCES Capitales (id)
);

CREATE TABLE Idiomas (
        id INT NOT NULL auto_increment,
        nombre VARCHAR(255) NOT NULL,
        PRIMARY KEY (id)
);

CREATE TABLE IdiomasPais (
        pais INT NOT NULL,
        idioma INT NOT NULL,
        PRIMARY KEY (pais, idioma),
        CONSTRAINT FOREIGN KEY (pais)
            REFERENCES Paises (id),
        CONSTRAINT FOREIGN KEY (idioma)
            REFERENCES Idiomas (id)
);

CREATE TABLE Poblaciones (
        pais INT NOT NULL,
        anyo YEAR(4) NOT NULL,
        poblacion INT NOT NULL,
        PRIMARY KEY (pais, anyo),
        CONSTRAINT FOREIGN KEY (pais)
            REFERENCES Paises (id)
);
