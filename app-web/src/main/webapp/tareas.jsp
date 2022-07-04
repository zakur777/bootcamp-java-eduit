<!DOCTYPE html>
<%@page import="ar.com.educacionit.domain.Articulo"%>
<%@page import="java.util.Collection"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clase2 Javascript</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script>
		function agregarTarea() {
			let inputTarea = document.getElementById("tarea");
			console.log(inputTarea);
			let valorDelInput = inputTarea.value;

			//JSON
			let tareas = localStorage.getItem('tareas');

			if (!tareas) {
				tareas = [];
			} else {
				tareas = JSON.parse(tareas);
			}

			//let tareas = [];
			tareas.push(valorDelInput);
			localStorage.setItem('tareas', JSON.stringify(tareas));

			inputTarea.value = '';
			inputTarea.focus();

		}

		//const divTareas = document.getElementById('tareas');

	</script>
</head>
<body>
    <main>
	    <div class="container">
			<div class="row">
				<div class="col">
					<label>Tarea:</label>
					<input type="text" id="tarea">
					<button id="btnAgregar" onclick="agregarTarea()">Agregar tarea</button>
					<div id="tareas">
						vacio
					</div>
				</div>
			</div>
	     </div>
	    </main>
<script>
	const divTareas = document.getElementById('tareas');
	divTareas.innerHTML = 'ya no está vacio';

	let tareasInLocalStorage = localStorage.getItem('tareas');
	let text = '';
	let ul = document.createElement('ul');
	let li = document.createElement('li');

	if(tareasInLocalStorage !== null) {
		tareasInLocalStorage = JSON.parse(tareasInLocalStorage);
		for (let i = 0; i < tareasInLocalStorage.length; i++) {
			text += tareasInLocalStorage[i] + "<br>";
		}
	}
	divTareas.innerHTML = text;
</script>
</body>
</html>