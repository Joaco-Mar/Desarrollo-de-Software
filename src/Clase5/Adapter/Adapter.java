package Clase5.Adapter;

public class Adapter implements ISensorCelsius{
    @Override
    public double leerTemperatura() {
        String oldTemp=new OldFahrenheitSensor().obtenerTemperaturaXML();
        double fahrenheitNum=Integer.parseInt(oldTemp.replace("<temp>", "").replace("</temp>", ""));
        double newTemp = (fahrenheitNum-32)*5/9;
        return newTemp;
    }
}
