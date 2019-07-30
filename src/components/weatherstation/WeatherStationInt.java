//package components.weatherstation;

public interface WeatherStationInt {
   public void storeData(String dataItem, String type);
   public void processData(String dataItem, String type);
   public void sendData();
   public void transferData(String externalDevice);
}
