///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Test.Service;
//
///**
// *
// * @author kelly
// */
//
//import Test.Model.Car;
//import Test.Model.CarShow;
//import Test.Utils.StreamUtil;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.StringWriter;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import java.util.Comparator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Properties;
//
//import java.util.stream.Collectors;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.springframework.util.StringUtils;
//
//public class CarShowsProcessor {
//
//    String serverURL;
//    String requestMethod;
//    String requestProperty;
//
//    public CarShowsProcessor() {
//        System.out.println(System.getProperty("user.dir"));
//        try (InputStream input = new FileInputStream("src\\main\\java\\com\\example\\codetest\\config\\config.properties")) {
//            Properties prop = new Properties();
//            prop.load(input);
//            this.serverURL = prop.getProperty("serverURL");
//            this.requestMethod = prop.getProperty("requestMethod");
//            this.requestProperty = prop.getProperty("requestProperty");
//        } catch (IOException ex) {
//
//        }
//
//    }
//
//    private String getJson(String objectName) {
//        try {
//
//            URL url = new URL(this.serverURL);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod(this.requestMethod);
//            conn.setRequestProperty("Accept", this.requestProperty);
//
//            if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + conn.getResponseCode());
//            }
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (conn.getInputStream())));
//
//            String output;
//            StringBuilder jsonString = new StringBuilder();
//            jsonString.append("{\"").append(objectName).append("\":");
//            while ((output = br.readLine()) != null) {
//                jsonString.append(output);
//            }
//            jsonString.append("}");
//
//            conn.disconnect();
//            return jsonString.toString();
//        } catch (MalformedURLException e) {
//        } catch (IOException e) {
//        }
//        return null;
//    }
//
//    private List<CarShow> getCarShows(String jsonFromServer, String objectName) {
//        JSONObject obj = new JSONObject(jsonFromServer);
//        JSONArray arr = obj.getJSONArray(objectName);
//        List<CarShow> carShows = new ArrayList<CarShow>();
//        for (int i = 0; i < arr.length(); i++) {
//            if (null==arr.get(i)) continue;
//            String name = arr.getJSONObject(i).getString("name");
//            JSONArray carArray = arr.getJSONObject(i).getJSONArray("cars");
//            CarShow carShow = new CarShow(name);
//            for (int j = 0; j < carArray.length(); j++) {
//                String make = carArray.getJSONObject(j).getString("make");
//                String model = carArray.getJSONObject(j).getString("model");
//                Car car = new Car(make, model);
//                carShow.getCars().add(car);
//            }
//            carShows.add(carShow);
//        }
//        return carShows;
//    }
//
//    public Map<Car, List<String>> sortAndGroup(List<CarShow> carShows) {
//        if (null==carShows||carShows.isEmpty()) return null;
//        Map<Car, List<String>> carMap = new LinkedHashMap<>();
//        List<Car> carsOfAllShow = carShows.stream()
//                .map(CarShow::getCars)
//                .flatMap(x -> x.stream())
//                .sorted(Comparator.comparing(Car::getMake))
//                .filter(StreamUtil.distinctByKeys(Car::getMake, Car::getModel))
//                .collect(Collectors.toList());
//
//        carsOfAllShow.stream().forEach(y -> {
//            List<String> showNames = new ArrayList<>();
//            carShows.stream().forEach(s -> {
//                if (s.carExistsInShow(y)) {
//                    showNames.add(s.getName());                    
//                }
//            });
//            carMap.put(y, showNames);
//        });
//        return carMap;
//    }
//    
//    public Collection sortAndGroupToCollection(List<CarShow> carShows) {
//        if (null==carShows||carShows.isEmpty()) return null;
//
//        ArrayList<Car> carList = new ArrayList<>();
//
//        List<Car> carsOfAllShow = carShows.stream()
//                .map(CarShow::getCars)
//                .flatMap(x -> x.stream())
//                .sorted(Comparator.comparing(Car::getMake))
//                .filter(StreamUtil.distinctByKeys(Car::getMake, Car::getModel))
//                .collect(Collectors.toList());
//
//        carsOfAllShow.stream().forEach(y -> {
//            List<String> showNames = new ArrayList<>();
//            carShows.stream().forEach(s -> {
//                if (s.carExistsInShow(y)) {
//                    y.setRow(Math.random());
//                    y.setShow(s.getName());
//                    carList.add(y);          
//                }
//            });
//            
//            
//        });
//        return carList;
//    }    
//   
//    
//    public String toJson(Map<Car, List<String>> carMap){
//
//        JSONArray carsArr = new JSONArray();
//        for (Map.Entry entry:carMap.entrySet()){
//            JSONObject obj = new JSONObject();
//            Car car = (Car)entry.getKey();   
//            obj.put("model", car.getModel());
//            obj.put("make",car.getMake());
//            List<String> showNames = (List)entry.getValue();
//            JSONArray arr = new JSONArray();
//            showNames.stream().forEach((s) -> arr.put(s));
//            obj.put("shows", arr);          
//            
//            
//            carsArr.put(obj);
//            
//        }
//        JSONObject obj = new JSONObject();
//        obj.put("cars", carsArr);
//        
//        
//        
//        StringWriter out = new StringWriter();
//        obj.write(out);
//
//        return out.toString();
//        
//    }
//    public Map<Car, List<String>>  processToMap(){
//
//        String objectName = "carshow";
////        String carShowJsonFromServer = getJson(objectName);
//        String carShowJsonFromServer = "{\"carshow\":" + "[{\"name\":\"New York Car Show\",\"cars\":[{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 1\"},{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"Edison Motors\",\"model\":\"\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Melbourne Motor Show\",\"cars\":[{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4S\"},{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 4\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Cartopia\",\"cars\":[{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Hondaka\",\"model\":\"Ellen\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 16\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 4\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 2\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Carographic\",\"cars\":[{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 2\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4\"}]},\n"
//                + "\n"
//                + "]"
//                + "}";
//        if (StringUtils.isEmpty(carShowJsonFromServer)) return null;
//        List<CarShow> carShows = getCarShows(carShowJsonFromServer, objectName);
//        if (null==carShows||carShows.isEmpty()) return null;
//        Map<Car, List<String>> carMap = sortAndGroup(carShows);
//        return carMap;
//    
//
//    }    
//    
//    
//    public Collection<Car>  processToCollection(){
//
//        String objectName = "carshow";
////        String carShowJsonFromServer = getJson(objectName);
//        String carShowJsonFromServer = "{\"carshow\":" + "[{\"name\":\"New York Car Show\",\"cars\":[{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 1\"},{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"Edison Motors\",\"model\":\"\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Melbourne Motor Show\",\"cars\":[{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4S\"},{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 4\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Cartopia\",\"cars\":[{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Hondaka\",\"model\":\"Ellen\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 16\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 4\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 2\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Carographic\",\"cars\":[{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 2\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4\"}]},\n"
//                + "\n"
//                + "]"
//                + "}";
//        if (StringUtils.isEmpty(carShowJsonFromServer)) return null;
//        List<CarShow> carShows = getCarShows(carShowJsonFromServer, objectName);
//        if (null==carShows||carShows.isEmpty()) return null;
//        Collection carMap = sortAndGroupToCollection(carShows);        
//       
//        return carMap;
//    
//
//    }   
//    public String processToJson(){
//
//        return toJson(processToMap());
//    
//
//    }
//    
//
//    public static void main(String[] args) {
//
////	  try {
////		URL url = new URL("http://eacodingtest.digital.energyaustralia.com.au/api/v1/cars");
////		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
////		conn.setRequestMethod("GET");
////		conn.setRequestProperty("Accept", "application/json");
////
////		if (conn.getResponseCode() != 200) {
////			throw new RuntimeException("Failed : HTTP error code : "+ 
////                                conn.getResponseCode());
////		}
////                
////		BufferedReader br = new BufferedReader(new InputStreamReader(
////			(conn.getInputStream())));
////
////		String output;
////                StringBuilder jsonString = new StringBuilder();
////                jsonString.append("{\"carshow\":");
//        String tempStr = "{\"carshow\":" + "[{\"name\":\"New York Car Show\",\"cars\":[{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 1\"},{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"Edison Motors\",\"model\":\"\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Melbourne Motor Show\",\"cars\":[{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4S\"},{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 4\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Cartopia\",\"cars\":[{\"make\":\"Moto Tourismo\",\"model\":\"Cyclissimo\"},{\"make\":\"George Motors\",\"model\":\"George 15\"},{\"make\":\"Hondaka\",\"model\":\"Ellen\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 16\"},{\"make\":\"Moto Tourismo\",\"model\":\"Delta 4\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 2\"}]},\n"
//                + "\n"
//                + "{\"name\":\"Carographic\",\"cars\":[{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Hondaka\",\"model\":\"Elisa\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 2\"},{\"make\":\"Julio Mechannica\",\"model\":\"Mark 4\"}]},\n"
//                + "\n"
//                + "]"
//                + "}";
//        
////		while ((output = br.readLine()) != null) {
////                    jsonString.append(output);
////			System.out.println(output);
////                        
////		}
////                jsonString.append("}");
////                System.out.println(jsonString.toString());
//        JSONObject obj = new JSONObject(tempStr);
////            String showName = obj.getJSONObject("carshow").getString("carshow");
////            System.out.println(showName);
//        String objectName = "carshow";
//
//        CarShowsProcessor processor = new CarShowsProcessor();
//        List<CarShow> carShows = processor.getCarShows(tempStr, objectName);
//
//        Map<Car, List<String>> carMap = processor.sortAndGroup(carShows);
//        String result = processor.toJson(carMap);
//        System.out.println("Output from Service... .... \n");
//        System.out.print(result);
//    }
//
//}
