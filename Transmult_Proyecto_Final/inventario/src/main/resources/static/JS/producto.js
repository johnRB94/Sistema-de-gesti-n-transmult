document.addEventListener("DOMContentLoaded", () => {

  /* =========================
     SUBMIT DEL FORMULARIO
  ========================== */
  const form = document.getElementById("formProducto");

  form.addEventListener("submit", function (e) {
    e.preventDefault();

    // Validación HTML
    if (!form.checkValidity()) {
      form.reportValidity();
      return;
    }

    const formData = new FormData(form);

    fetch("/productos/guardar", {
      method: "POST",
      body: formData
    })
      .then(response => {
        if (response.redirected) {

          // 👉 Mostrar toast
          const toastEl = document.getElementById("toastProducto");
          const toast = new bootstrap.Toast(toastEl, {
            delay: 3000 // 1 segundo
          });
          toast.show();

          // 👉 Redirigir luego de 1 segundo
          setTimeout(() => {
            window.location.href = response.url;
          }, 3000);

        } else {
          alert("Error al guardar producto.");
        }
      })
      .catch(error => {
        console.error(error);
        alert("Error de conexión con el servidor.");
      });
  });

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
   FILTRO POR CÓDIGO
========================== */
function filtrarProductosPorCodigo() {
  const codigo = document
    .getElementById("buscarCodigoProd")
    .value.trim()
    .toLowerCase();

  const filas = document.querySelectorAll("#tablaProductos tbody tr");

  filas.forEach(fila => {
    const codigoFila = fila.children[1].innerText.toLowerCase();
    fila.style.display =
      codigo === "" || codigoFila.includes(codigo) ? "" : "none";
  });
}

function limpiarFiltroProductos() {
  document.getElementById("buscarCodigoProd").value = "";
  const filas = document.querySelectorAll("#tablaProductos tbody tr");
  filas.forEach(fila => (fila.style.display = ""));
}

/* =========================
   EDITAR PRODUCTO
========================= */
function abrirEditarProducto(btn) {
  const id = btn.dataset.id;
  const descripcion = btn.dataset.descripcion;
  const inventario = btn.dataset.inventario;

  document.getElementById("editId").value = id;
  document.getElementById("editDescripcion").value = descripcion;
  document.getElementById("editInventario").value = inventario;

  new bootstrap.Modal(
    document.getElementById("editarProductoModal")
  ).show();
}

function guardarEdicionProducto() {
  const id = document.getElementById("editId").value;
  const descripcion = document.getElementById("editDescripcion").value;
  const inventario = document.getElementById("editInventario").value;

  fetch(`/productos/editar/${id}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({
      descripcion: descripcion,
      inventario: Number(inventario)
    })
  })
  .then(res => {
    if (!res.ok) throw new Error();
    location.reload();
  })
  .catch(() => alert(" Error al editar el producto"));
}

/* =========================
   ELIMINAR PRODUCTO
========================= */
function eliminarProducto(btn) {
  const id = btn.dataset.id;

  if (!confirm("¿Seguro que deseas eliminar este producto?")) return;

  fetch(`/productos/eliminar/${id}`, {
    method: "DELETE"
  })
  .then(res => {
    if (!res.ok) throw new Error();
    location.reload();
  })
  .catch(() => alert(" Error al eliminar el producto"));
}

// Cuando el producto se agrega correctamente
sessionStorage.setItem("resaltarUltimoProducto", "true");

document.addEventListener("DOMContentLoaded", function () {
  const resaltar = sessionStorage.getItem("resaltarUltimoProducto");

  if (resaltar) {
    const tabla = document.getElementById("tablaProductos");
    if (!tabla) return;

    const filas = tabla.querySelectorAll("tbody tr");
    if (filas.length === 0) return;

    // ✅ ÚLTIMO PRODUCTO (el más reciente)
    const ultimaFila = filas[filas.length - 1];
    ultimaFila.classList.add("table-info"); // azul claro

    // 🔥 para que desaparezca al refrescar
    sessionStorage.removeItem("resaltarUltimoProducto");
  }
});

