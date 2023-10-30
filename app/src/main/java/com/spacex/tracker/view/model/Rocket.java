package com.spacex.tracker.view.model;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String rocket_id;
    private String rocket_name;
    private String rocket_type;

    private FirstStage first_stage;
    private SecondStage second_stage;
    private Fairings fairings;

    public Rocket(String rocket_id, String rocket_name, String rocket_type, FirstStage first_stage, SecondStage second_stage, Fairings fairings) {
        this.rocket_id = rocket_id;
        this.rocket_name = rocket_name;
        this.rocket_type = rocket_type;
        this.first_stage = first_stage;
        this.second_stage = second_stage;
        this.fairings = fairings;
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

    public Fairings getFairings() {
        return fairings;
    }

    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

    private class FirstStage {

        private List<Cores> cores;

        public FirstStage(List<Cores> cores) {
            this.cores = cores;
        }

        public List<Cores> getCores() {
            return cores;
        }

        public void setCores(List<Cores> cores) {
            this.cores = cores;
        }

        private class Cores {
            private String core_serial;
            private int flight;
            private int block;
            private boolean gridfins;
            private boolean legs;
            private boolean reused;
            private boolean land_success;
            private boolean landing_intent;
            private String landing_type;
            private String landing_vehicle;

            public Cores(String core_serial, int flight, int block, boolean gridfins, boolean legs, boolean reused, boolean land_success, boolean landing_intent, String landing_type, String landing_vehicle) {
                this.core_serial = core_serial;
                this.flight = flight;
                this.block = block;
                this.gridfins = gridfins;
                this.legs = legs;
                this.reused = reused;
                this.land_success = land_success;
                this.landing_intent = landing_intent;
                this.landing_type = landing_type;
                this.landing_vehicle = landing_vehicle;
            }

            public String getCore_serial() {
                return core_serial;
            }

            public void setCore_serial(String core_serial) {
                this.core_serial = core_serial;
            }

            public int getFlight() {
                return flight;
            }

            public void setFlight(int flight) {
                this.flight = flight;
            }

            public int getBlock() {
                return block;
            }

            public void setBlock(int block) {
                this.block = block;
            }

            public boolean isGridfins() {
                return gridfins;
            }

            public void setGridfins(boolean gridfins) {
                this.gridfins = gridfins;
            }

            public boolean isLegs() {
                return legs;
            }

            public void setLegs(boolean legs) {
                this.legs = legs;
            }

            public boolean isReused() {
                return reused;
            }

            public void setReused(boolean reused) {
                this.reused = reused;
            }

            public boolean isLand_success() {
                return land_success;
            }

            public void setLand_success(boolean land_success) {
                this.land_success = land_success;
            }

            public boolean isLanding_intent() {
                return landing_intent;
            }

            public void setLanding_intent(boolean landing_intent) {
                this.landing_intent = landing_intent;
            }

            public String getLanding_type() {
                return landing_type;
            }

            public void setLanding_type(String landing_type) {
                this.landing_type = landing_type;
            }

            public String getLanding_vehicle() {
                return landing_vehicle;
            }

            public void setLanding_vehicle(String landing_vehicle) {
                this.landing_vehicle = landing_vehicle;
            }
        }
    }

    private class SecondStage {
        private int block;
        private List<Payloads> payloads;

        public SecondStage(int block, List<Payloads> payloads) {
            this.block = block;
            this.payloads = payloads;
        }

        public int getBlock() {
            return block;
        }

        public void setBlock(int block) {
            this.block = block;
        }

        public List<Payloads> getPayloads() {
            return payloads;
        }

        public void setPayloads(List<Payloads> payloads) {
            this.payloads = payloads;
        }

        private class Payloads {

            private String payload_id;
            private List<Integer> norad_id;
            private boolean reused;
            private List<String> customers;

            private String nationality;
            private String manufacturer;
            private String payload_type;

            private double payload_mass_kg;
            private double payload_mass_lbs;

            private String orbit;

            private Orbit orbit_params;

            public Payloads(String payload_id, List<Integer> norad_id, boolean reused, List<String> customers, String nationality, String manufacturer, String payload_type, double payload_mass_kg, double payload_mass_lbs, String orbit, Orbit orbit_params) {
                this.payload_id = payload_id;
                this.norad_id = norad_id;
                this.reused = reused;
                this.customers = customers;
                this.nationality = nationality;
                this.manufacturer = manufacturer;
                this.payload_type = payload_type;
                this.payload_mass_kg = payload_mass_kg;
                this.payload_mass_lbs = payload_mass_lbs;
                this.orbit = orbit;
                this.orbit_params = orbit_params;
            }

            public String getPayload_id() {
                return payload_id;
            }

            public void setPayload_id(String payload_id) {
                this.payload_id = payload_id;
            }

            public List<Integer> getNorad_id() {
                return norad_id;
            }

            public void setNorad_id(List<Integer> norad_id) {
                this.norad_id = norad_id;
            }

            public boolean isReused() {
                return reused;
            }

            public void setReused(boolean reused) {
                this.reused = reused;
            }

            public List<String> getCustomers() {
                return customers;
            }

            public void setCustomers(List<String> customers) {
                this.customers = customers;
            }

            public String getNationality() {
                return nationality;
            }

            public void setNationality(String nationality) {
                this.nationality = nationality;
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            public String getPayload_type() {
                return payload_type;
            }

            public void setPayload_type(String payload_type) {
                this.payload_type = payload_type;
            }

            public double getPayload_mass_kg() {
                return payload_mass_kg;
            }

            public void setPayload_mass_kg(double payload_mass_kg) {
                this.payload_mass_kg = payload_mass_kg;
            }

            public double getPayload_mass_lbs() {
                return payload_mass_lbs;
            }

            public void setPayload_mass_lbs(double payload_mass_lbs) {
                this.payload_mass_lbs = payload_mass_lbs;
            }

            public String getOrbit() {
                return orbit;
            }

            public void setOrbit(String orbit) {
                this.orbit = orbit;
            }

            public Orbit getOrbit_params() {
                return orbit_params;
            }

            public void setOrbit_params(Orbit orbit_params) {
                this.orbit_params = orbit_params;
            }

            private class Orbit {

                private String reference_system;
                private String regime;
                private double longitude;
                private double semi_major_axis_km;
                private double eccentricity;
                private double periapsis_km;
                private double apoapsis_km;
                private double inclination_deg;
                private double period_min;
                private double lifespan_years;
                private String epoch;
                private double mean_motion;
                private double raan;
                private double arg_of_pericenter;
                private double mean_anomaly;

                public Orbit(String reference_system, String regime, double longitude, double semi_major_axis_km, double eccentricity, double periapsis_km, double apoapsis_km, double inclination_deg, double period_min, double lifespan_years, String epoch, double mean_motion, double raan, double arg_of_pericenter, double mean_anomaly) {
                    this.reference_system = reference_system;
                    this.regime = regime;
                    this.longitude = longitude;
                    this.semi_major_axis_km = semi_major_axis_km;
                    this.eccentricity = eccentricity;
                    this.periapsis_km = periapsis_km;
                    this.apoapsis_km = apoapsis_km;
                    this.inclination_deg = inclination_deg;
                    this.period_min = period_min;
                    this.lifespan_years = lifespan_years;
                    this.epoch = epoch;
                    this.mean_motion = mean_motion;
                    this.raan = raan;
                    this.arg_of_pericenter = arg_of_pericenter;
                    this.mean_anomaly = mean_anomaly;
                }

                public String getReference_system() {
                    return reference_system;
                }

                public void setReference_system(String reference_system) {
                    this.reference_system = reference_system;
                }

                public String getRegime() {
                    return regime;
                }

                public void setRegime(String regime) {
                    this.regime = regime;
                }

                public double getLongitude() {
                    return longitude;
                }

                public void setLongitude(double longitude) {
                    this.longitude = longitude;
                }

                public double getSemi_major_axis_km() {
                    return semi_major_axis_km;
                }

                public void setSemi_major_axis_km(double semi_major_axis_km) {
                    this.semi_major_axis_km = semi_major_axis_km;
                }

                public double getEccentricity() {
                    return eccentricity;
                }

                public void setEccentricity(double eccentricity) {
                    this.eccentricity = eccentricity;
                }

                public double getPeriapsis_km() {
                    return periapsis_km;
                }

                public void setPeriapsis_km(double periapsis_km) {
                    this.periapsis_km = periapsis_km;
                }

                public double getApoapsis_km() {
                    return apoapsis_km;
                }

                public void setApoapsis_km(double apoapsis_km) {
                    this.apoapsis_km = apoapsis_km;
                }

                public double getInclination_deg() {
                    return inclination_deg;
                }

                public void setInclination_deg(double inclination_deg) {
                    this.inclination_deg = inclination_deg;
                }

                public double getPeriod_min() {
                    return period_min;
                }

                public void setPeriod_min(double period_min) {
                    this.period_min = period_min;
                }

                public double getLifespan_years() {
                    return lifespan_years;
                }

                public void setLifespan_years(double lifespan_years) {
                    this.lifespan_years = lifespan_years;
                }

                public String getEpoch() {
                    return epoch;
                }

                public void setEpoch(String epoch) {
                    this.epoch = epoch;
                }

                public double getMean_motion() {
                    return mean_motion;
                }

                public void setMean_motion(double mean_motion) {
                    this.mean_motion = mean_motion;
                }

                public double getRaan() {
                    return raan;
                }

                public void setRaan(double raan) {
                    this.raan = raan;
                }

                public double getArg_of_pericenter() {
                    return arg_of_pericenter;
                }

                public void setArg_of_pericenter(double arg_of_pericenter) {
                    this.arg_of_pericenter = arg_of_pericenter;
                }

                public double getMean_anomaly() {
                    return mean_anomaly;
                }

                public void setMean_anomaly(double mean_anomaly) {
                    this.mean_anomaly = mean_anomaly;
                }
            }
        }
    }

    private class Fairings {
        private boolean reused;
        private boolean recovery_attempt;
        private boolean recovered;
        private Object ship;

        public Fairings(boolean reused, boolean recovery_attempt, boolean recovered, Object ship) {
            this.reused = reused;
            this.recovery_attempt = recovery_attempt;
            this.recovered = recovered;
            this.ship = ship;
        }

        public boolean isReused() {
            return reused;
        }

        public void setReused(boolean reused) {
            this.reused = reused;
        }

        public boolean isRecovery_attempt() {
            return recovery_attempt;
        }

        public void setRecovery_attempt(boolean recovery_attempt) {
            this.recovery_attempt = recovery_attempt;
        }

        public boolean isRecovered() {
            return recovered;
        }

        public void setRecovered(boolean recovered) {
            this.recovered = recovered;
        }

        public Object getShip() {
            return ship;
        }

        public void setShip(Object ship) {
            this.ship = ship;
        }
    }
}
