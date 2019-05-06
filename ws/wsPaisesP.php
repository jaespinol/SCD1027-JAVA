<?php
// Nombre Archivo <wsPaisesP.php>
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

include('dbconnection.php');
//Creacion de objeto Paises
$objPais = new stdClass();
$Paises=[];
// Parametros
$getId = $_GET['Id'];
//Consulta de Query
$rs = mysqli_query($conn,"SELECT * FROM paises where id = '" . $getId . "'");
if ($rs) 
{
   while ($row = mysqli_fetch_array($rs,MYSQLI_ASSOC)) {
    //echo 'Nombre: '.$row['nombre'];
	$Pais = new stdClass();
    $Pais->ID = $row['id'];
    $Pais->Nombre = utf8_encode($row['nombre']);
    $Pais->Capital = $row['capital'];
    //echo '<br/>';
    //Añadir a la lista
    $Paises[] = $Pais;
   }
}

$objPais->Paises = $Paises; 
//Cerrando conexion
mysqli_close($conn);
//Publicando objeto
echo json_encode($objPais);
?>