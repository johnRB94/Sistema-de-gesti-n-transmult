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

// cuando el movimiento se guarda correctamente
sessionStorage.setItem("resaltarUltimoMovimiento", "true");

document.addEventListener("DOMContentLoaded", function () {
  const resaltar = sessionStorage.getItem("resaltarUltimoMovimiento");

  if (resaltar) {
    const tabla = document.getElementById("tablaMovimientos");
    if (!tabla) return;

    const filas = tabla.querySelectorAll("tbody tr");
    if (filas.length === 0) return;

    // ✅ último movimiento (fila final)
    const ultimaFila = filas[filas.length - 1];
    ultimaFila.classList.add("table-info"); // azul claro

    // 🔥 se borra para que al refrescar ya no se resalte
    sessionStorage.removeItem("resaltarUltimoMovimiento");
  }
});

function filtrarMovimientosPorProducto() {
  const texto = document
    .getElementById("buscarProductoMov")
    .value.toLowerCase();

  const filas = document.querySelectorAll(
    "#tablaMovimientos tbody tr",
  );

  filas.forEach((fila) => {
    // 👇 columna DESCRIPCIÓN (índice 2)
    const descripcion = fila.children[2].textContent.toLowerCase();

    if (descripcion.includes(texto)) {
      fila.style.display = "";
    } else {
      fila.style.display = "none";
    }
  });
}


function limpiarFiltroMovimientosProducto() {
  document.getElementById("buscarProductoMov").value = "";

  const filas = document.querySelectorAll(
    "#tablaMovimientos tbody tr",
  );

  filas.forEach((fila) => {
    fila.style.display = "";
  });
}


