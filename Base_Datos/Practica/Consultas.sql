SELECT * FROM dbprueba.poblaciones;
SELECT * FROM dbprueba.poblaciones where anyo = 2016;
SELECT * FROM dbprueba.poblaciones where anyo between 2010 and 2012;
SELECT * From dbprueba.poblaciones where poblacion > 50000000;
Select * from dbprueba.poblaciones where pais = 10 and anyo < 2010;
Select * from dbprueba.poblaciones where anyo= 2007 or anyo= 2008 having poblacion < 1000000;
Select * from dbprueba.poblaciones where pais = 10 order by anyo desc;

Select anyo, sum(poblacion) as TOTAL from dbprueba.poblaciones where anyo =2016;
Select anyo, avg(poblacion) as PROMEDIO from dbprueba.poblaciones where anyo =2016;
Select pais, max(poblacion), avg(poblacion), min(poblacion) from dbprueba.poblaciones group by pais;
Select distinct idioma from dbprueba.idiomaspais order by idioma desc;

SELECT paises.nombre, capitales.nombre from dbprueba.paises inner join dbprueba.capitales on capitales.id = paises.capital;
select paises.nombre as PAIS, capitales.nombre as CAPITAL from dbprueba.paises inner join dbprueba.capitales on capitales.id = paises.capital;
select paises.nombre from dbprueba.paises inner join dbprueba.idiomaspais on idiomaspais.pais = paises.id where idiomaspais.idioma =1;
select paises.nombre, poblaciones.poblacion from dbprueba.paises inner join dbprueba.idiomaspais on idiomaspais.pais = paises.id inner join dbprueba.poblaciones on poblaciones.pais = paises.id where poblaciones.anyo = 2016 and idiomaspais.idioma =1;







