public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdfDoc1 = registry.createPdfDocument();
        pdfDoc1.open();

        Document textDoc1 = registry.createTextDocument();
        textDoc1.open();

        Document spreadsheetDoc1 = registry.createSpreadsheetDocument();
        spreadsheetDoc1.open();

        Document pdfDoc2 = registry.createPdfDocument();
        pdfDoc2.open();
    }
}
