document.addEventListener("DOMContentLoaded", () => {

  /* =========================
     MAYÚSCULAS AUTOMÁTICAS
  ========================== */
  document.querySelectorAll("input.mayusculas").forEach(input => {
    input.addEventListener("input", function () {
      this.value = this.value.toUpperCase();
    });
  });

});


/* =========================
   FILTRAR MOVIMIENTOS
========================== */
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
  document.querySelectorAll("#tablaMovimientos tbody tr")
    .forEach(fila => fila.style.display = "");
}


