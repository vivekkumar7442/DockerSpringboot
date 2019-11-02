
package com.configure.app.appconfig.bean;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "food_nutrition",
    "televisions",
    "landline_phones",
    "tv_video_accessories",
    "software",
    "computer_storage",
    "fragrances",
    "network_components",
    "e_learning",
    "video_players",
    "mens_clothing",
    "music_movies_posters",
    "furniture",
    "bags_wallets_belts",
    "mobiles",
    "kids_clothing",
    "kids_footwear",
    "pet_supplies",
    "mens_footwear",
    "air_coolers",
    "home_entertainment",
    "watches",
    "sunglasses",
    "eyewear",
    "computer_components",
    "laptop_accessories",
    "womens_clothing",
    "mobile_accessories",
    "camera_accessories",
    "air_conditioners",
    "luggage_travel",
    "automotive",
    "tablets",
    "refrigerator",
    "home_improvement_tools",
    "computer_peripherals",
    "stationery_office_supplies",
    "sports_fitness",
    "baby_care",
    "cameras",
    "wearable_smart_devices",
    "audio_players",
    "grooming_beauty_wellness",
    "tablet_accessories",
    "kitchen_appliances",
    "microwave_ovens",
    "laptops",
    "washing_machine",
    "gaming",
    "toys",
    "home_appliances",
    "home_decor_and_festive_needs",
    "home_and_kitchen_needs",
    "jewellery",
    "home_furnishing",
    "desktops",
    "womens_footwear",
    "household_supplies"
})
public class ApiListings {

    @JsonProperty("food_nutrition")
    private FoodNutrition foodNutrition;
    @JsonProperty("televisions")
    private Televisions televisions;
    @JsonProperty("landline_phones")
    private LandlinePhones landlinePhones;
    @JsonProperty("tv_video_accessories")
    private TvVideoAccessories tvVideoAccessories;
    @JsonProperty("software")
    private Software software;
    @JsonProperty("computer_storage")
    private ComputerStorage computerStorage;
    @JsonProperty("fragrances")
    private Fragrances fragrances;
    @JsonProperty("network_components")
    private NetworkComponents networkComponents;
    @JsonProperty("e_learning")
    private ELearning eLearning;
    @JsonProperty("video_players")
    private VideoPlayers videoPlayers;
    @JsonProperty("mens_clothing")
    private MensClothing mensClothing;
    @JsonProperty("music_movies_posters")
    private MusicMoviesPosters musicMoviesPosters;
    @JsonProperty("furniture")
    private Furniture furniture;
    @JsonProperty("bags_wallets_belts")
    private BagsWalletsBelts bagsWalletsBelts;
    @JsonProperty("mobiles")
    private Mobiles mobiles;
    @JsonProperty("kids_clothing")
    private KidsClothing kidsClothing;
    @JsonProperty("kids_footwear")
    private KidsFootwear kidsFootwear;
    @JsonProperty("pet_supplies")
    private PetSupplies petSupplies;
    @JsonProperty("mens_footwear")
    private MensFootwear mensFootwear;
    @JsonProperty("air_coolers")
    private AirCoolers airCoolers;
    @JsonProperty("home_entertainment")
    private HomeEntertainment homeEntertainment;
    @JsonProperty("watches")
    private Watches watches;
    @JsonProperty("sunglasses")
    private Sunglasses sunglasses;
    @JsonProperty("eyewear")
    private Eyewear eyewear;
    @JsonProperty("computer_components")
    private ComputerComponents computerComponents;
    @JsonProperty("laptop_accessories")
    private LaptopAccessories laptopAccessories;
    @JsonProperty("womens_clothing")
    private WomensClothing womensClothing;
    @JsonProperty("mobile_accessories")
    private MobileAccessories mobileAccessories;
    @JsonProperty("camera_accessories")
    private CameraAccessories cameraAccessories;
    @JsonProperty("air_conditioners")
    private AirConditioners airConditioners;
    @JsonProperty("luggage_travel")
    private LuggageTravel luggageTravel;
    @JsonProperty("automotive")
    private Automotive automotive;
    @JsonProperty("tablets")
    private Tablets tablets;
    @JsonProperty("refrigerator")
    private Refrigerator refrigerator;
    @JsonProperty("home_improvement_tools")
    private HomeImprovementTools homeImprovementTools;
    @JsonProperty("computer_peripherals")
    private ComputerPeripherals computerPeripherals;
    @JsonProperty("stationery_office_supplies")
    private StationeryOfficeSupplies stationeryOfficeSupplies;
    @JsonProperty("sports_fitness")
    private SportsFitness sportsFitness;
    @JsonProperty("baby_care")
    private BabyCare babyCare;
    @JsonProperty("cameras")
    private Cameras cameras;
    @JsonProperty("wearable_smart_devices")
    private WearableSmartDevices wearableSmartDevices;
    @JsonProperty("audio_players")
    private AudioPlayers audioPlayers;
    @JsonProperty("grooming_beauty_wellness")
    private GroomingBeautyWellness groomingBeautyWellness;
    @JsonProperty("tablet_accessories")
    private TabletAccessories tabletAccessories;
    @JsonProperty("kitchen_appliances")
    private KitchenAppliances kitchenAppliances;
    @JsonProperty("microwave_ovens")
    private MicrowaveOvens microwaveOvens;
    @JsonProperty("laptops")
    private Laptops laptops;
    @JsonProperty("washing_machine")
    private WashingMachine washingMachine;
    @JsonProperty("gaming")
    private Gaming gaming;
    @JsonProperty("toys")
    private Toys toys;
    @JsonProperty("home_appliances")
    private HomeAppliances homeAppliances;
    @JsonProperty("home_decor_and_festive_needs")
    private HomeDecorAndFestiveNeeds homeDecorAndFestiveNeeds;
    @JsonProperty("home_and_kitchen_needs")
    private HomeAndKitchenNeeds homeAndKitchenNeeds;
    @JsonProperty("jewellery")
    private Jewellery jewellery;
    @JsonProperty("home_furnishing")
    private HomeFurnishing homeFurnishing;
    @JsonProperty("desktops")
    private Desktops desktops;
    @JsonProperty("womens_footwear")
    private WomensFootwear womensFootwear;
    @JsonProperty("household_supplies")
    private HouseholdSupplies householdSupplies;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("food_nutrition")
    public FoodNutrition getFoodNutrition() {
        return foodNutrition;
    }

    @JsonProperty("food_nutrition")
    public void setFoodNutrition(FoodNutrition foodNutrition) {
        this.foodNutrition = foodNutrition;
    }

    @JsonProperty("televisions")
    public Televisions getTelevisions() {
        return televisions;
    }

    @JsonProperty("televisions")
    public void setTelevisions(Televisions televisions) {
        this.televisions = televisions;
    }

    @JsonProperty("landline_phones")
    public LandlinePhones getLandlinePhones() {
        return landlinePhones;
    }

    @JsonProperty("landline_phones")
    public void setLandlinePhones(LandlinePhones landlinePhones) {
        this.landlinePhones = landlinePhones;
    }

    @JsonProperty("tv_video_accessories")
    public TvVideoAccessories getTvVideoAccessories() {
        return tvVideoAccessories;
    }

    @JsonProperty("tv_video_accessories")
    public void setTvVideoAccessories(TvVideoAccessories tvVideoAccessories) {
        this.tvVideoAccessories = tvVideoAccessories;
    }

    @JsonProperty("software")
    public Software getSoftware() {
        return software;
    }

    @JsonProperty("software")
    public void setSoftware(Software software) {
        this.software = software;
    }

    @JsonProperty("computer_storage")
    public ComputerStorage getComputerStorage() {
        return computerStorage;
    }

    @JsonProperty("computer_storage")
    public void setComputerStorage(ComputerStorage computerStorage) {
        this.computerStorage = computerStorage;
    }

    @JsonProperty("fragrances")
    public Fragrances getFragrances() {
        return fragrances;
    }

    @JsonProperty("fragrances")
    public void setFragrances(Fragrances fragrances) {
        this.fragrances = fragrances;
    }

    @JsonProperty("network_components")
    public NetworkComponents getNetworkComponents() {
        return networkComponents;
    }

    @JsonProperty("network_components")
    public void setNetworkComponents(NetworkComponents networkComponents) {
        this.networkComponents = networkComponents;
    }

    @JsonProperty("e_learning")
    public ELearning getELearning() {
        return eLearning;
    }

    @JsonProperty("e_learning")
    public void setELearning(ELearning eLearning) {
        this.eLearning = eLearning;
    }

    @JsonProperty("video_players")
    public VideoPlayers getVideoPlayers() {
        return videoPlayers;
    }

    @JsonProperty("video_players")
    public void setVideoPlayers(VideoPlayers videoPlayers) {
        this.videoPlayers = videoPlayers;
    }

    @JsonProperty("mens_clothing")
    public MensClothing getMensClothing() {
        return mensClothing;
    }

    @JsonProperty("mens_clothing")
    public void setMensClothing(MensClothing mensClothing) {
        this.mensClothing = mensClothing;
    }

    @JsonProperty("music_movies_posters")
    public MusicMoviesPosters getMusicMoviesPosters() {
        return musicMoviesPosters;
    }

    @JsonProperty("music_movies_posters")
    public void setMusicMoviesPosters(MusicMoviesPosters musicMoviesPosters) {
        this.musicMoviesPosters = musicMoviesPosters;
    }

    @JsonProperty("furniture")
    public Furniture getFurniture() {
        return furniture;
    }

    @JsonProperty("furniture")
    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    @JsonProperty("bags_wallets_belts")
    public BagsWalletsBelts getBagsWalletsBelts() {
        return bagsWalletsBelts;
    }

    @JsonProperty("bags_wallets_belts")
    public void setBagsWalletsBelts(BagsWalletsBelts bagsWalletsBelts) {
        this.bagsWalletsBelts = bagsWalletsBelts;
    }

    @JsonProperty("mobiles")
    public Mobiles getMobiles() {
        return mobiles;
    }

    @JsonProperty("mobiles")
    public void setMobiles(Mobiles mobiles) {
        this.mobiles = mobiles;
    }

    @JsonProperty("kids_clothing")
    public KidsClothing getKidsClothing() {
        return kidsClothing;
    }

    @JsonProperty("kids_clothing")
    public void setKidsClothing(KidsClothing kidsClothing) {
        this.kidsClothing = kidsClothing;
    }

    @JsonProperty("kids_footwear")
    public KidsFootwear getKidsFootwear() {
        return kidsFootwear;
    }

    @JsonProperty("kids_footwear")
    public void setKidsFootwear(KidsFootwear kidsFootwear) {
        this.kidsFootwear = kidsFootwear;
    }

    @JsonProperty("pet_supplies")
    public PetSupplies getPetSupplies() {
        return petSupplies;
    }

    @JsonProperty("pet_supplies")
    public void setPetSupplies(PetSupplies petSupplies) {
        this.petSupplies = petSupplies;
    }

    @JsonProperty("mens_footwear")
    public MensFootwear getMensFootwear() {
        return mensFootwear;
    }

    @JsonProperty("mens_footwear")
    public void setMensFootwear(MensFootwear mensFootwear) {
        this.mensFootwear = mensFootwear;
    }

    @JsonProperty("air_coolers")
    public AirCoolers getAirCoolers() {
        return airCoolers;
    }

    @JsonProperty("air_coolers")
    public void setAirCoolers(AirCoolers airCoolers) {
        this.airCoolers = airCoolers;
    }

    @JsonProperty("home_entertainment")
    public HomeEntertainment getHomeEntertainment() {
        return homeEntertainment;
    }

    @JsonProperty("home_entertainment")
    public void setHomeEntertainment(HomeEntertainment homeEntertainment) {
        this.homeEntertainment = homeEntertainment;
    }

    @JsonProperty("watches")
    public Watches getWatches() {
        return watches;
    }

    @JsonProperty("watches")
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    @JsonProperty("sunglasses")
    public Sunglasses getSunglasses() {
        return sunglasses;
    }

    @JsonProperty("sunglasses")
    public void setSunglasses(Sunglasses sunglasses) {
        this.sunglasses = sunglasses;
    }

    @JsonProperty("eyewear")
    public Eyewear getEyewear() {
        return eyewear;
    }

    @JsonProperty("eyewear")
    public void setEyewear(Eyewear eyewear) {
        this.eyewear = eyewear;
    }

    @JsonProperty("computer_components")
    public ComputerComponents getComputerComponents() {
        return computerComponents;
    }

    @JsonProperty("computer_components")
    public void setComputerComponents(ComputerComponents computerComponents) {
        this.computerComponents = computerComponents;
    }

    @JsonProperty("laptop_accessories")
    public LaptopAccessories getLaptopAccessories() {
        return laptopAccessories;
    }

    @JsonProperty("laptop_accessories")
    public void setLaptopAccessories(LaptopAccessories laptopAccessories) {
        this.laptopAccessories = laptopAccessories;
    }

    @JsonProperty("womens_clothing")
    public WomensClothing getWomensClothing() {
        return womensClothing;
    }

    @JsonProperty("womens_clothing")
    public void setWomensClothing(WomensClothing womensClothing) {
        this.womensClothing = womensClothing;
    }

    @JsonProperty("mobile_accessories")
    public MobileAccessories getMobileAccessories() {
        return mobileAccessories;
    }

    @JsonProperty("mobile_accessories")
    public void setMobileAccessories(MobileAccessories mobileAccessories) {
        this.mobileAccessories = mobileAccessories;
    }

    @JsonProperty("camera_accessories")
    public CameraAccessories getCameraAccessories() {
        return cameraAccessories;
    }

    @JsonProperty("camera_accessories")
    public void setCameraAccessories(CameraAccessories cameraAccessories) {
        this.cameraAccessories = cameraAccessories;
    }

    @JsonProperty("air_conditioners")
    public AirConditioners getAirConditioners() {
        return airConditioners;
    }

    @JsonProperty("air_conditioners")
    public void setAirConditioners(AirConditioners airConditioners) {
        this.airConditioners = airConditioners;
    }

    @JsonProperty("luggage_travel")
    public LuggageTravel getLuggageTravel() {
        return luggageTravel;
    }

    @JsonProperty("luggage_travel")
    public void setLuggageTravel(LuggageTravel luggageTravel) {
        this.luggageTravel = luggageTravel;
    }

    @JsonProperty("automotive")
    public Automotive getAutomotive() {
        return automotive;
    }

    @JsonProperty("automotive")
    public void setAutomotive(Automotive automotive) {
        this.automotive = automotive;
    }

    @JsonProperty("tablets")
    public Tablets getTablets() {
        return tablets;
    }

    @JsonProperty("tablets")
    public void setTablets(Tablets tablets) {
        this.tablets = tablets;
    }

    @JsonProperty("refrigerator")
    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    @JsonProperty("refrigerator")
    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @JsonProperty("home_improvement_tools")
    public HomeImprovementTools getHomeImprovementTools() {
        return homeImprovementTools;
    }

    @JsonProperty("home_improvement_tools")
    public void setHomeImprovementTools(HomeImprovementTools homeImprovementTools) {
        this.homeImprovementTools = homeImprovementTools;
    }

    @JsonProperty("computer_peripherals")
    public ComputerPeripherals getComputerPeripherals() {
        return computerPeripherals;
    }

    @JsonProperty("computer_peripherals")
    public void setComputerPeripherals(ComputerPeripherals computerPeripherals) {
        this.computerPeripherals = computerPeripherals;
    }

    @JsonProperty("stationery_office_supplies")
    public StationeryOfficeSupplies getStationeryOfficeSupplies() {
        return stationeryOfficeSupplies;
    }

    @JsonProperty("stationery_office_supplies")
    public void setStationeryOfficeSupplies(StationeryOfficeSupplies stationeryOfficeSupplies) {
        this.stationeryOfficeSupplies = stationeryOfficeSupplies;
    }

    @JsonProperty("sports_fitness")
    public SportsFitness getSportsFitness() {
        return sportsFitness;
    }

    @JsonProperty("sports_fitness")
    public void setSportsFitness(SportsFitness sportsFitness) {
        this.sportsFitness = sportsFitness;
    }

    @JsonProperty("baby_care")
    public BabyCare getBabyCare() {
        return babyCare;
    }

    @JsonProperty("baby_care")
    public void setBabyCare(BabyCare babyCare) {
        this.babyCare = babyCare;
    }

    @JsonProperty("cameras")
    public Cameras getCameras() {
        return cameras;
    }

    @JsonProperty("cameras")
    public void setCameras(Cameras cameras) {
        this.cameras = cameras;
    }

    @JsonProperty("wearable_smart_devices")
    public WearableSmartDevices getWearableSmartDevices() {
        return wearableSmartDevices;
    }

    @JsonProperty("wearable_smart_devices")
    public void setWearableSmartDevices(WearableSmartDevices wearableSmartDevices) {
        this.wearableSmartDevices = wearableSmartDevices;
    }

    @JsonProperty("audio_players")
    public AudioPlayers getAudioPlayers() {
        return audioPlayers;
    }

    @JsonProperty("audio_players")
    public void setAudioPlayers(AudioPlayers audioPlayers) {
        this.audioPlayers = audioPlayers;
    }

    @JsonProperty("grooming_beauty_wellness")
    public GroomingBeautyWellness getGroomingBeautyWellness() {
        return groomingBeautyWellness;
    }

    @JsonProperty("grooming_beauty_wellness")
    public void setGroomingBeautyWellness(GroomingBeautyWellness groomingBeautyWellness) {
        this.groomingBeautyWellness = groomingBeautyWellness;
    }

    @JsonProperty("tablet_accessories")
    public TabletAccessories getTabletAccessories() {
        return tabletAccessories;
    }

    @JsonProperty("tablet_accessories")
    public void setTabletAccessories(TabletAccessories tabletAccessories) {
        this.tabletAccessories = tabletAccessories;
    }

    @JsonProperty("kitchen_appliances")
    public KitchenAppliances getKitchenAppliances() {
        return kitchenAppliances;
    }

    @JsonProperty("kitchen_appliances")
    public void setKitchenAppliances(KitchenAppliances kitchenAppliances) {
        this.kitchenAppliances = kitchenAppliances;
    }

    @JsonProperty("microwave_ovens")
    public MicrowaveOvens getMicrowaveOvens() {
        return microwaveOvens;
    }

    @JsonProperty("microwave_ovens")
    public void setMicrowaveOvens(MicrowaveOvens microwaveOvens) {
        this.microwaveOvens = microwaveOvens;
    }

    @JsonProperty("laptops")
    public Laptops getLaptops() {
        return laptops;
    }

    @JsonProperty("laptops")
    public void setLaptops(Laptops laptops) {
        this.laptops = laptops;
    }

    @JsonProperty("washing_machine")
    public WashingMachine getWashingMachine() {
        return washingMachine;
    }

    @JsonProperty("washing_machine")
    public void setWashingMachine(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    @JsonProperty("gaming")
    public Gaming getGaming() {
        return gaming;
    }

    @JsonProperty("gaming")
    public void setGaming(Gaming gaming) {
        this.gaming = gaming;
    }

    @JsonProperty("toys")
    public Toys getToys() {
        return toys;
    }

    @JsonProperty("toys")
    public void setToys(Toys toys) {
        this.toys = toys;
    }

    @JsonProperty("home_appliances")
    public HomeAppliances getHomeAppliances() {
        return homeAppliances;
    }

    @JsonProperty("home_appliances")
    public void setHomeAppliances(HomeAppliances homeAppliances) {
        this.homeAppliances = homeAppliances;
    }

    @JsonProperty("home_decor_and_festive_needs")
    public HomeDecorAndFestiveNeeds getHomeDecorAndFestiveNeeds() {
        return homeDecorAndFestiveNeeds;
    }

    @JsonProperty("home_decor_and_festive_needs")
    public void setHomeDecorAndFestiveNeeds(HomeDecorAndFestiveNeeds homeDecorAndFestiveNeeds) {
        this.homeDecorAndFestiveNeeds = homeDecorAndFestiveNeeds;
    }

    @JsonProperty("home_and_kitchen_needs")
    public HomeAndKitchenNeeds getHomeAndKitchenNeeds() {
        return homeAndKitchenNeeds;
    }

    @JsonProperty("home_and_kitchen_needs")
    public void setHomeAndKitchenNeeds(HomeAndKitchenNeeds homeAndKitchenNeeds) {
        this.homeAndKitchenNeeds = homeAndKitchenNeeds;
    }

    @JsonProperty("jewellery")
    public Jewellery getJewellery() {
        return jewellery;
    }

    @JsonProperty("jewellery")
    public void setJewellery(Jewellery jewellery) {
        this.jewellery = jewellery;
    }

    @JsonProperty("home_furnishing")
    public HomeFurnishing getHomeFurnishing() {
        return homeFurnishing;
    }

    @JsonProperty("home_furnishing")
    public void setHomeFurnishing(HomeFurnishing homeFurnishing) {
        this.homeFurnishing = homeFurnishing;
    }

    @JsonProperty("desktops")
    public Desktops getDesktops() {
        return desktops;
    }

    @JsonProperty("desktops")
    public void setDesktops(Desktops desktops) {
        this.desktops = desktops;
    }

    @JsonProperty("womens_footwear")
    public WomensFootwear getWomensFootwear() {
        return womensFootwear;
    }

    @JsonProperty("womens_footwear")
    public void setWomensFootwear(WomensFootwear womensFootwear) {
        this.womensFootwear = womensFootwear;
    }

    @JsonProperty("household_supplies")
    public HouseholdSupplies getHouseholdSupplies() {
        return householdSupplies;
    }

    @JsonProperty("household_supplies")
    public void setHouseholdSupplies(HouseholdSupplies householdSupplies) {
        this.householdSupplies = householdSupplies;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
