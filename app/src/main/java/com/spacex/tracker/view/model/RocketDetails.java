package com.spacex.tracker.view.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "rocket")
public class RocketDetails {

    @PrimaryKey
    private int id;
    private Boolean active;
    private int stages;
    private int boosters;
    private int cost_per_launch;
    private int success_rate_pct;
    private String first_flight;
    private String country;
    private String company;

    private Height height;
    private Diameter diameter;
    private Mass mass;
    private List<PayloadWeights> payload_weights;
    private FirstStage first_stage;
    private SecondStage second_stage;
    private Engines engines;
    private LandingLegs landing_legs;

    private String wikipedia;
    private String description;
    private String rocket_id;
    private String rocket_name;
    private String rocket_type;

    public RocketDetails(int id, Boolean active, int stages, int boosters, int cost_per_launch, int success_rate_pct, String first_flight, String country, String company, Height height, Diameter diameter, Mass mass, List<PayloadWeights> payload_weights, FirstStage first_stage, SecondStage second_stage, Engines engines, LandingLegs landing_legs, String wikipedia, String description, String rocket_id, String rocket_name, String rocket_type) {
        this.id = id;
        this.active = active;
        this.stages = stages;
        this.boosters = boosters;
        this.cost_per_launch = cost_per_launch;
        this.success_rate_pct = success_rate_pct;
        this.first_flight = first_flight;
        this.country = country;
        this.company = company;
        this.height = height;
        this.diameter = diameter;
        this.mass = mass;
        this.payload_weights = payload_weights;
        this.first_stage = first_stage;
        this.second_stage = second_stage;
        this.engines = engines;
        this.landing_legs = landing_legs;
        this.wikipedia = wikipedia;
        this.description = description;
        this.rocket_id = rocket_id;
        this.rocket_name = rocket_name;
        this.rocket_type = rocket_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getStages() {
        return stages;
    }

    public void setStages(int stages) {
        this.stages = stages;
    }

    public int getBoosters() {
        return boosters;
    }

    public void setBoosters(int boosters) {
        this.boosters = boosters;
    }

    public int getCost_per_launch() {
        return cost_per_launch;
    }

    public void setCost_per_launch(int cost_per_launch) {
        this.cost_per_launch = cost_per_launch;
    }

    public int getSuccess_rate_pct() {
        return success_rate_pct;
    }

    public void setSuccess_rate_pct(int success_rate_pct) {
        this.success_rate_pct = success_rate_pct;
    }

    public String getFirst_flight() {
        return first_flight;
    }

    public void setFirst_flight(String first_flight) {
        this.first_flight = first_flight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    public Mass getMass() {
        return mass;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public List<PayloadWeights> getPayload_weights() {
        return payload_weights;
    }

    public void setPayload_weights(List<PayloadWeights> payload_weights) {
        this.payload_weights = payload_weights;
    }

    public FirstStage getFirst_stage() {
        return first_stage;
    }

    public void setFirst_stage(FirstStage first_stage) {
        this.first_stage = first_stage;
    }

    public SecondStage getSecond_stage() {
        return second_stage;
    }

    public void setSecond_stage(SecondStage second_stage) {
        this.second_stage = second_stage;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public LandingLegs getLanding_legs() {
        return landing_legs;
    }

    public void setLanding_legs(LandingLegs landing_legs) {
        this.landing_legs = landing_legs;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRocket_id() {
        return rocket_id;
    }

    public void setRocket_id(String rocket_id) {
        this.rocket_id = rocket_id;
    }

    public String getRocket_name() {
        return rocket_name;
    }

    public void setRocket_name(String rocket_name) {
        this.rocket_name = rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }

    public void setRocket_type(String rocket_type) {
        this.rocket_type = rocket_type;
    }

    public class Height {
        private double meters;
        private double feet;

        public Height(double meters, double feet) {
            this.meters = meters;
            this.feet = feet;
        }

        public double getMeters() {
            return meters;
        }

        public void setMeters(double meters) {
            this.meters = meters;
        }

        public double getFeet() {
            return feet;
        }

        public void setFeet(double feet) {
            this.feet = feet;
        }
    }

    public class Diameter {
        private double meters;
        private double feet;

        public Diameter(double meters, double feet) {
            this.meters = meters;
            this.feet = feet;
        }

        public double getMeters() {
            return meters;
        }

        public void setMeters(double meters) {
            this.meters = meters;
        }

        public double getFeet() {
            return feet;
        }

        public void setFeet(double feet) {
            this.feet = feet;
        }
    }

    public class Mass {
        private double kg;
        private double lb;

        public Mass(double kg, double lb) {
            this.kg = kg;
            this.lb = lb;
        }

        public double getKg() {
            return kg;
        }

        public void setKg(double kg) {
            this.kg = kg;
        }

        public double getLb() {
            return lb;
        }

        public void setLb(double lb) {
            this.lb = lb;
        }
    }

    public class PayloadWeights {
        private String id;
        private String name;
        private double kg;
        private double lb;

        public PayloadWeights(String id, String name, double kg, double lb) {
            this.id = id;
            this.name = name;
            this.kg = kg;
            this.lb = lb;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getKg() {
            return kg;
        }

        public void setKg(double kg) {
            this.kg = kg;
        }

        public double getLb() {
            return lb;
        }

        public void setLb(double lb) {
            this.lb = lb;
        }
    }

    public class FirstStage {
        private Boolean reusable;
        private int engines;
        private double fuel_amount_tons;
        private int burn_time_sec;

        private ThrustSeaLevel thrust_sea_level;
        private ThrustVacuum thrust_vacuum;

        public FirstStage(Boolean reusable, int engines, double fuel_amount_tons, int burn_time_sec, ThrustSeaLevel thrust_sea_level, ThrustVacuum thrust_vacuum) {
            this.reusable = reusable;
            this.engines = engines;
            this.fuel_amount_tons = fuel_amount_tons;
            this.burn_time_sec = burn_time_sec;
            this.thrust_sea_level = thrust_sea_level;
            this.thrust_vacuum = thrust_vacuum;
        }

        public Boolean getReusable() {
            return reusable;
        }

        public void setReusable(Boolean reusable) {
            this.reusable = reusable;
        }

        public int getEngines() {
            return engines;
        }

        public void setEngines(int engines) {
            this.engines = engines;
        }

        public double getFuel_amount_tons() {
            return fuel_amount_tons;
        }

        public void setFuel_amount_tons(double fuel_amount_tons) {
            this.fuel_amount_tons = fuel_amount_tons;
        }

        public int getBurn_time_sec() {
            return burn_time_sec;
        }

        public void setBurn_time_sec(int burn_time_sec) {
            this.burn_time_sec = burn_time_sec;
        }

        public ThrustSeaLevel getThrust_sea_level() {
            return thrust_sea_level;
        }

        public void setThrust_sea_level(ThrustSeaLevel thrust_sea_level) {
            this.thrust_sea_level = thrust_sea_level;
        }

        public ThrustVacuum getThrust_vacuum() {
            return thrust_vacuum;
        }

        public void setThrust_vacuum(ThrustVacuum thrust_vacuum) {
            this.thrust_vacuum = thrust_vacuum;
        }

        private class ThrustSeaLevel {
            private double kN;
            private double lbf;

            public ThrustSeaLevel(double kN, double lbf) {
                this.kN = kN;
                this.lbf = lbf;
            }

            public double getkN() {
                return kN;
            }

            public void setkN(double kN) {
                this.kN = kN;
            }

            public double getLbf() {
                return lbf;
            }

            public void setLbf(double lbf) {
                this.lbf = lbf;
            }
        }

        private class ThrustVacuum {
            private int kN;
            private int lbf;

            public ThrustVacuum(int kN, int lbf) {
                this.kN = kN;
                this.lbf = lbf;
            }

            public int getkN() {
                return kN;
            }

            public void setkN(int kN) {
                this.kN = kN;
            }

            public int getLbf() {
                return lbf;
            }

            public void setLbf(int lbf) {
                this.lbf = lbf;
            }
        }
    }

    public class SecondStage {
        private int engines;
        private double fuel_amount_tons;
        private int burn_time_sec;

        private Thrust thrust;
        private PayLoads payloads;

        public SecondStage(int engines, double fuel_amount_tons, int burn_time_sec, Thrust thrust, PayLoads payloads) {
            this.engines = engines;
            this.fuel_amount_tons = fuel_amount_tons;
            this.burn_time_sec = burn_time_sec;
            this.thrust = thrust;
            this.payloads = payloads;
        }

        public int getEngines() {
            return engines;
        }

        public void setEngines(int engines) {
            this.engines = engines;
        }

        public double getFuel_amount_tons() {
            return fuel_amount_tons;
        }

        public void setFuel_amount_tons(double fuel_amount_tons) {
            this.fuel_amount_tons = fuel_amount_tons;
        }

        public int getBurn_time_sec() {
            return burn_time_sec;
        }

        public void setBurn_time_sec(int burn_time_sec) {
            this.burn_time_sec = burn_time_sec;
        }

        public Thrust getThrust() {
            return thrust;
        }

        public void setThrust(Thrust thrust) {
            this.thrust = thrust;
        }

        public PayLoads getPayloads() {
            return payloads;
        }

        public void setPayloads(PayLoads payloads) {
            this.payloads = payloads;
        }

        private class Thrust {
            private int kN;
            private int lbf;

            public Thrust(int kN, int lbf) {
                this.kN = kN;
                this.lbf = lbf;
            }

            public int getkN() {
                return kN;
            }

            public void setkN(int kN) {
                this.kN = kN;
            }

            public int getLbf() {
                return lbf;
            }

            public void setLbf(int lbf) {
                this.lbf = lbf;
            }
        }

        private class PayLoads {
            private String option_1;
            private String option_2;

            private CompositeFairing composite_fairing;

            public PayLoads(String option_1, String option_2, CompositeFairing composite_fairing) {
                this.option_1 = option_1;
                this.option_2 = option_2;
                this.composite_fairing = composite_fairing;
            }

            public String getOption_1() {
                return option_1;
            }

            public void setOption_1(String option_1) {
                this.option_1 = option_1;
            }

            public String getOption_2() {
                return option_2;
            }

            public void setOption_2(String option_2) {
                this.option_2 = option_2;
            }

            public CompositeFairing getComposite_fairing() {
                return composite_fairing;
            }

            public void setComposite_fairing(CompositeFairing composite_fairing) {
                this.composite_fairing = composite_fairing;
            }

            private class CompositeFairing {
                private class Height {
                    private double meters;
                    private double feet;

                    public Height(double meters, double feet) {
                        this.meters = meters;
                        this.feet = feet;
                    }

                    public double getMeters() {
                        return meters;
                    }

                    public void setMeters(double meters) {
                        this.meters = meters;
                    }

                    public double getFeet() {
                        return feet;
                    }

                    public void setFeet(double feet) {
                        this.feet = feet;
                    }
                }

                private class Diameter {
                    private double meters;
                    private double feet;

                    public Diameter(double meters, double feet) {
                        this.meters = meters;
                        this.feet = feet;
                    }

                    public double getMeters() {
                        return meters;
                    }

                    public void setMeters(double meters) {
                        this.meters = meters;
                    }

                    public double getFeet() {
                        return feet;
                    }

                    public void setFeet(double feet) {
                        this.feet = feet;
                    }
                }
            }
        }
    }

    public class Engines {

        private int number;
        private String type;
        private String version;
        private String layout;
        private int engine_loss_max;
        private String propellant_1;
        private String propellant_2;

        private ThrustSeaLevel thrust_sea_level;
        private ThrustVacuum thrust_vacuum;

        private double thrust_to_weight;

        public Engines(int number, String type, String version, String layout, int engine_loss_max, String propellant_1, String propellant_2, ThrustSeaLevel thrust_sea_level, ThrustVacuum thrust_vacuum, double thrust_to_weight) {
            this.number = number;
            this.type = type;
            this.version = version;
            this.layout = layout;
            this.engine_loss_max = engine_loss_max;
            this.propellant_1 = propellant_1;
            this.propellant_2 = propellant_2;
            this.thrust_sea_level = thrust_sea_level;
            this.thrust_vacuum = thrust_vacuum;
            this.thrust_to_weight = thrust_to_weight;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getLayout() {
            return layout;
        }

        public void setLayout(String layout) {
            this.layout = layout;
        }

        public int getEngine_loss_max() {
            return engine_loss_max;
        }

        public void setEngine_loss_max(int engine_loss_max) {
            this.engine_loss_max = engine_loss_max;
        }

        public String getPropellant_1() {
            return propellant_1;
        }

        public void setPropellant_1(String propellant_1) {
            this.propellant_1 = propellant_1;
        }

        public String getPropellant_2() {
            return propellant_2;
        }

        public void setPropellant_2(String propellant_2) {
            this.propellant_2 = propellant_2;
        }

        public ThrustSeaLevel getThrust_sea_level() {
            return thrust_sea_level;
        }

        public void setThrust_sea_level(ThrustSeaLevel thrust_sea_level) {
            this.thrust_sea_level = thrust_sea_level;
        }

        public ThrustVacuum getThrust_vacuum() {
            return thrust_vacuum;
        }

        public void setThrust_vacuum(ThrustVacuum thrust_vacuum) {
            this.thrust_vacuum = thrust_vacuum;
        }

        public double getThrust_to_weight() {
            return thrust_to_weight;
        }

        public void setThrust_to_weight(double thrust_to_weight) {
            this.thrust_to_weight = thrust_to_weight;
        }

        private class ThrustSeaLevel {
            private double kN;
            private double lbf;

            public ThrustSeaLevel(double kN, double lbf) {
                this.kN = kN;
                this.lbf = lbf;
            }

            public double getkN() {
                return kN;
            }

            public void setkN(double kN) {
                this.kN = kN;
            }

            public double getLbf() {
                return lbf;
            }

            public void setLbf(double lbf) {
                this.lbf = lbf;
            }
        }

        private class ThrustVacuum {
            private int kN;
            private int lbf;

            public ThrustVacuum(int kN, int lbf) {
                this.kN = kN;
                this.lbf = lbf;
            }

            public int getkN() {
                return kN;
            }

            public void setkN(int kN) {
                this.kN = kN;
            }

            public int getLbf() {
                return lbf;
            }

            public void setLbf(int lbf) {
                this.lbf = lbf;
            }
        }

    }

    public class LandingLegs {
        private int number;
        private String material;

        public LandingLegs(int number, String material) {
            this.number = number;
            this.material = material;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }
}
