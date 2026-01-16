document.getElementById("formProducto").addEventListener("submit", function (e) {
  e.preventDefault();
  const form = e.target;
  const formData = new FormData(form);

  fetch('/productos/guardar', {
    method: 'POST',
    body: formData
  }).then(response => {
    if (response.redirected) {
      window.location.href = response.url;
    } else {
      alert("Error al guardar producto.");
    }
  });
});

document.querySelectorAll('input.mayusculas').forEach(input => {
  input.addEventListener('input', function () {
    this.value = this.value.toUpperCase();
  });
});




function filtrarProductosPorCodigo() {
    const codigo = document.getElementById("buscarCodigoProd").value.trim().toLowerCase();
    const filas = document.querySelectorAll("#tablaProductos tbody tr");

    filas.forEach(fila => {
        const codigoFila = fila.children[1].innerText.toLowerCase();
        fila.style.display = codigo === "" || codigoFila.includes(codigo) ? "" : "none";
    });
}

function limpiarFiltroProductos() {
    document.getElementById("buscarCodigoProd").value = "";
    const filas = document.querySelectorAll("#tablaProductos tbody tr");
    filas.forEach(fila => fila.style.display = "");
}
