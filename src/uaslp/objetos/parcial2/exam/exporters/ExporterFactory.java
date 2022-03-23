package uaslp.objetos.parcial2.exam.exporters;

public class ExporterFactory {

    public static Exporter getExporter(ExporterType exporterType){
        return switch (exporterType) {
            case JSON -> new JsonExporter();
            case XML -> new XmlExporter();
            case HTML -> new HtmlExporter();
        };
    }
}