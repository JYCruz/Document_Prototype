class DocumentRegistry {
    private Document pdfPrototype;
    private Document textPrototype;
    private Document spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");

        System.out.println("Creating a Text Document prototype.");
        textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdfDocument() {
        return pdfPrototype.clone();
    }

    public Document createTextDocument() {
        return textPrototype.clone();
    }

    public Document createSpreadsheetDocument() {
        return spreadsheetPrototype.clone();
    }
}
