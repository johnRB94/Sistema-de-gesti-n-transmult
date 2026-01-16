package com.transmult.inventario.Controller;

import com.transmult.inventario.Model.Producto;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;

import com.transmult.inventario.Model.Movimiento;
import com.transmult.inventario.Service.ProductoService;
import com.transmult.inventario.Service.MovimientoService;

import jakarta.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class ReporteController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping("/reportes")
    public String mostrarReportes(Model model, Authentication auth) {
        if (auth == null) {
            return "redirect:/login";
        }

        boolean tieneAcceso = auth.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN") || a.getAuthority().equals("ROLE_SUPERVISOR"));

        if (!tieneAcceso) {
            return "redirect:/inicio";
        }

        List<Producto> productos = productoService.listarTodos();
        List<Movimiento> movimientos = movimientoService.listarTodos();

        model.addAttribute("usuario", auth.getName());
        model.addAttribute("productos", productos);
        model.addAttribute("movimientos", movimientos);

        return "reportes";
    }

    @GetMapping("/exportar-excel-productos")
    public void exportarExcelProductos(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=productos.xlsx");

        List<Producto> productos = productoService.listarTodos();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Productos");

        // Estilo encabezado
        var headerStyle = workbook.createCellStyle();
        var headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);
        headerStyle.setBorderBottom(BorderStyle.THIN);
        headerStyle.setBorderTop(BorderStyle.THIN);
        headerStyle.setBorderLeft(BorderStyle.THIN);
        headerStyle.setBorderRight(BorderStyle.THIN);

        // Estilo celdas normales
        var cellStyle = workbook.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);

        // Crear encabezado
        Row header = sheet.createRow(0);
        String[] columnas = {
                "ID", "Código", "Unidad", "Descripción",
                "Marca", "Categoría", "Inventario", "Precio"
        };
        for (int i = 0; i < columnas.length; i++) {
            var cell = header.createCell(i);
            cell.setCellValue(columnas[i]);
            cell.setCellStyle(headerStyle);
        }

        // Agregar filtros
        sheet.setAutoFilter(new CellRangeAddress(0, 0, 0, columnas.length - 1));

        // Llenar datos
        int rowNum = 1;
        for (Producto producto : productos) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(producto.getId());
            row.createCell(1).setCellValue(producto.getCodigo());
            row.createCell(2).setCellValue(producto.getUnidad());
            row.createCell(3).setCellValue(producto.getDescripcion());
            row.createCell(4).setCellValue(producto.getMarca());
            row.createCell(5).setCellValue(producto.getCategoria());
            row.createCell(6).setCellValue(producto.getInventario());
            row.createCell(7).setCellValue(producto.getPrecio());

            for (int i = 0; i < columnas.length; i++) {
                row.getCell(i).setCellStyle(cellStyle);
            }
        }

        for (int i = 0; i < columnas.length; i++) {
            sheet.autoSizeColumn(i);
        }

        workbook.write(response.getOutputStream());
        workbook.close();
    }

    @GetMapping("/exportar-excel-movimientos")
    public void exportarExcelMovimientos(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=movimientos.xlsx");

        List<Movimiento> movimientos = movimientoService.listarTodos();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Movimientos");

        // Estilo encabezado
        var headerStyle = workbook.createCellStyle();
        var headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);
        headerStyle.setBorderBottom(BorderStyle.THIN);
        headerStyle.setBorderTop(BorderStyle.THIN);
        headerStyle.setBorderLeft(BorderStyle.THIN);
        headerStyle.setBorderRight(BorderStyle.THIN);

        // Estilo celdas normales
        var cellStyle = workbook.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);

        // Crear encabezado
        Row header = sheet.createRow(0);
        String[] columnas = {
                "ID", "Fecha", "Código", "Descripción",
                "Marca", "Unidad", "Entrada", "Salida", "Responsable"
        };
        for (int i = 0; i < columnas.length; i++) {
            var cell = header.createCell(i);
            cell.setCellValue(columnas[i]);
            cell.setCellStyle(headerStyle);
        }

        // Filtros
        sheet.setAutoFilter(new CellRangeAddress(0, 0, 0, columnas.length - 1));

        // Llenar datos
        int rowNum = 1;
        for (Movimiento mov : movimientos) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(mov.getId());
            row.createCell(1).setCellValue(mov.getFecha().toString());
            row.createCell(2).setCellValue(mov.getCodigo());
            row.createCell(3).setCellValue(mov.getDescripcion());
            row.createCell(4).setCellValue(mov.getMarca());
            row.createCell(5).setCellValue(mov.getUnidad());
            row.createCell(6).setCellValue(mov.getEntrada());
            row.createCell(7).setCellValue(mov.getSalida());
            row.createCell(8).setCellValue(mov.getResponsable());

            for (int i = 0; i < columnas.length; i++) {
                row.getCell(i).setCellStyle(cellStyle);
            }
        }

        for (int i = 0; i < columnas.length; i++) {
            sheet.autoSizeColumn(i);
        }

        workbook.write(response.getOutputStream());
        workbook.close();
    }
}
