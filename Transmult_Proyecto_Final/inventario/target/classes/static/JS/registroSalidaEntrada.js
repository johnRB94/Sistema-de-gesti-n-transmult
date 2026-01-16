document.getElementById("formMovimiento").addEventListener("submit", function (e) {
  e.preventDefault();
  const form = e.target;
  const formData = new FormData(form);

  fetch('/movimientos/guardar', {
    method: 'POST',
    body: formData
  }).then(response => {
    if (response.redirected) {
      window.location.href = response.url;
    } else {
      alert("Error al registrar movimiento.");
    }
  });
});

document.querySelectorAll('input.mayusculas').forEach(input => {
  input.addEventListener('input', function () {
    this.value = this.value.toUpperCase();
  });
});



function filtrarMovimientos() {
    const fecha = document.getElementById("buscarFechaMov").value;
    const filas = document.querySelectorAll("#tablaMovimientos tbody tr");

    filas.forEach(fila => {
        const fechaFila = fila.children[0].innerText.trim(); 
        fila.style.display = (fecha === "" || fechaFila === fecha) ? "" : "none";
    });
}

function limpiarFiltroMovimientos() {
    document.getElementById("buscarFechaMov").value = "";
    const filas = document.querySelectorAll("#tablaMovimientos tbody tr");
    filas.forEach(fila => fila.style.display = "");
}
