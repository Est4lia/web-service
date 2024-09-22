-- Se requiere listar las mesas disponibles que se encuentran en el momento de la consulta, mostrar las columnas correspondientes al número de la mesa y la cantidad de personas que permite dicha mesa.
SELECT numero_mesa, cantidad_persona
FROM mesas
WHERE disponible = true;
-- Generar un reporte con cada comanda, considerando el total a pagar por cada comanda existente en la base de datos ordenadas de la que tiene más consumo a la que tiene menos consumo.
SELECT id_comanda, SUM(cantidad_producto * precio_unitario)
FROM detalles_comandas
GROUP BY id_comanda
ORDER BY SUM(cantidad_producto * precio_unitario) DESC;
-- Generar un reporte que permita consultar toda la información de una comanda, mostrar por pantalla la mesa a la cual se encuentra asociada y el garzón que gestionó dicho pedido, se debe mostrar rut, nombre y apellido del garzón, fecha de emisión y la propina sugerida de la comanda y el número de la mesa.
SELECT numero_mesa, rut, nombre, apellido, fecha_emision, propina_sugerida
FROM mesas m INNER JOIN comandas c ON m.id_mesa = c.id_mesa
				INNER JOIN garzones g ON c.id_garzon = g.id_garzon;