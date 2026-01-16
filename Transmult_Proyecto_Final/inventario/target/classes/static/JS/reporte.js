document.getElementById('btnGenerarReporteProductos').addEventListener('click', () => {
  generarPDF('tablaReporteProductos', 'Reporte_Productos.pdf');
});

document.getElementById('btnGenerarReporteMovimientos').addEventListener('click', () => {
  generarPDF('tablaReporteMovimientos', 'Reporte_Movimientos.pdf');
});

function generarPDF(idTabla, nombreArchivo) {
  const tabla = document.getElementById(idTabla);
  if (!tabla || tabla.rows.length <= 1) {
    alert("No hay datos para generar el PDF.");
    return;
  }

  const contenido = `
    <div style="font-family:Arial;">
      <h2 style="text-align:center;">${nombreArchivo.replace(/_/g, ' ').replace('.pdf', '')}</h2>
      ${tabla.outerHTML}
    </div>
  `;

  html2pdf().from(contenido).set({
    margin: 10,
    filename: nombreArchivo,
    image: { type: 'jpeg', quality: 0.98 },
    html2canvas: { scale: 2 },
    jsPDF: { unit: 'mm', format: 'a4', orientation: 'landscape' }
  }).save();
}
