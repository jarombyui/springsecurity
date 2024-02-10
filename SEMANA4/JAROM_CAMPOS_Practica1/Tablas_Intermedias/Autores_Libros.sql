create table Autores_Libros(

    Autor_ID_fk integer,

    foreign key (Autor_ID_fk)
        references Autores(Autor_ID),

    ISBN_fk integer,

    foreign key (ISBN_fk)
        references libros(ISBN)

);
/// ESTO ME LO ACEPTO
ALTER TABLE Autores_Libros
ADD COLUMN Autor_ID SERIAL PRIMARY KEY;

/// ESTO ME LO RECHAZO, RECHAZA TENER MAS DE UNA LLAVE PRIMARIA
ALTER TABLE Autores_Libros
ADD COLUMN ISBN SERIAL PRIMARY KEY;