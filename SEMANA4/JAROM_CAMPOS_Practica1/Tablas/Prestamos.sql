create table Prestamos(
    Prestamo_ID serial primary key,
    Nombre varchar(70) not null ,

    ISBN_fk integer,

    foreign key (ISBN_fk)
        references libros(ISBN),






    Lector_id_fk integer,

    foreign key (Lector_id_fk)
        references Lectores(Lector_id)

);