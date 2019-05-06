<?php
// Nombre Archivo <dbconnection.php>
$dbhost = '127.0.0.1';
$dbUser = 'root';
$dbPass = '';
$dbDataBase = 'dbprueba';

$conn = mysqli_connect($dbhost, $dbUser, $dbPass, $dbDataBase);
if (! $conn) {
	die('No es posible conectarse con la bse de datos: ' . mysql_error());
	
}
//else{
//	echo 'Conexion correcta';
//}
?>