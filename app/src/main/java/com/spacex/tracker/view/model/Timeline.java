package com.spacex.tracker.view.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Timeline implements Serializable {

    private int webcast_liftoff;
    private int go_for_prop_loading;
    private int rp1_loading;
    private int stage1_lox_loading;
    private int stage2_lox_loading;
    private int engine_chill;
    private int prelaunch_checks;
    private int propellant_pressurization;
    private int go_for_launch;
    private int ignition;
    private int liftoff;
    private int maxq;
    private int meco;
    private int stage_sep;
    private int second_stage_ignition;
    private int fairing_deploy;
    private int first_stage_entry_burn;
    private int first_stage_landing;

    @SerializedName("seco-1")
    private int seco1;
    private int second_stage_restart;

    @SerializedName("seco-2")
    private int seco2;

    private int payload_deploy;

    public Timeline(int webcast_liftoff, int go_for_prop_loading, int rp1_loading, int stage1_lox_loading, int stage2_lox_loading, int engine_chill, int prelaunch_checks, int propellant_pressurization, int go_for_launch, int ignition, int liftoff, int maxq, int meco, int stage_sep, int second_stage_ignition, int fairing_deploy, int first_stage_entry_burn, int first_stage_landing, int seco1, int second_stage_restart, int seco2, int payload_deploy) {
        this.webcast_liftoff = webcast_liftoff;
        this.go_for_prop_loading = go_for_prop_loading;
        this.rp1_loading = rp1_loading;
        this.stage1_lox_loading = stage1_lox_loading;
        this.stage2_lox_loading = stage2_lox_loading;
        this.engine_chill = engine_chill;
        this.prelaunch_checks = prelaunch_checks;
        this.propellant_pressurization = propellant_pressurization;
        this.go_for_launch = go_for_launch;
        this.ignition = ignition;
        this.liftoff = liftoff;
        this.maxq = maxq;
        this.meco = meco;
        this.stage_sep = stage_sep;
        this.second_stage_ignition = second_stage_ignition;
        this.fairing_deploy = fairing_deploy;
        this.first_stage_entry_burn = first_stage_entry_burn;
        this.first_stage_landing = first_stage_landing;
        this.seco1 = seco1;
        this.second_stage_restart = second_stage_restart;
        this.seco2 = seco2;
        this.payload_deploy = payload_deploy;
    }

    public int getWebcast_liftoff() {
        return webcast_liftoff;
    }

    public void setWebcast_liftoff(int webcast_liftoff) {
        this.webcast_liftoff = webcast_liftoff;
    }

    public int getGo_for_prop_loading() {
        return go_for_prop_loading;
    }

    public void setGo_for_prop_loading(int go_for_prop_loading) {
        this.go_for_prop_loading = go_for_prop_loading;
    }

    public int getRp1_loading() {
        return rp1_loading;
    }

    public void setRp1_loading(int rp1_loading) {
        this.rp1_loading = rp1_loading;
    }

    public int getStage1_lox_loading() {
        return stage1_lox_loading;
    }

    public void setStage1_lox_loading(int stage1_lox_loading) {
        this.stage1_lox_loading = stage1_lox_loading;
    }

    public int getStage2_lox_loading() {
        return stage2_lox_loading;
    }

    public void setStage2_lox_loading(int stage2_lox_loading) {
        this.stage2_lox_loading = stage2_lox_loading;
    }

    public int getEngine_chill() {
        return engine_chill;
    }

    public void setEngine_chill(int engine_chill) {
        this.engine_chill = engine_chill;
    }

    public int getPrelaunch_checks() {
        return prelaunch_checks;
    }

    public void setPrelaunch_checks(int prelaunch_checks) {
        this.prelaunch_checks = prelaunch_checks;
    }

    public int getPropellant_pressurization() {
        return propellant_pressurization;
    }

    public void setPropellant_pressurization(int propellant_pressurization) {
        this.propellant_pressurization = propellant_pressurization;
    }

    public int getGo_for_launch() {
        return go_for_launch;
    }

    public void setGo_for_launch(int go_for_launch) {
        this.go_for_launch = go_for_launch;
    }

    public int getIgnition() {
        return ignition;
    }

    public void setIgnition(int ignition) {
        this.ignition = ignition;
    }

    public int getLiftoff() {
        return liftoff;
    }

    public void setLiftoff(int liftoff) {
        this.liftoff = liftoff;
    }

    public int getMaxq() {
        return maxq;
    }

    public void setMaxq(int maxq) {
        this.maxq = maxq;
    }

    public int getMeco() {
        return meco;
    }

    public void setMeco(int meco) {
        this.meco = meco;
    }

    public int getStage_sep() {
        return stage_sep;
    }

    public void setStage_sep(int stage_sep) {
        this.stage_sep = stage_sep;
    }

    public int getSecond_stage_ignition() {
        return second_stage_ignition;
    }

    public void setSecond_stage_ignition(int second_stage_ignition) {
        this.second_stage_ignition = second_stage_ignition;
    }

    public int getFairing_deploy() {
        return fairing_deploy;
    }

    public void setFairing_deploy(int fairing_deploy) {
        this.fairing_deploy = fairing_deploy;
    }

    public int getFirst_stage_entry_burn() {
        return first_stage_entry_burn;
    }

    public void setFirst_stage_entry_burn(int first_stage_entry_burn) {
        this.first_stage_entry_burn = first_stage_entry_burn;
    }

    public int getFirst_stage_landing() {
        return first_stage_landing;
    }

    public void setFirst_stage_landing(int first_stage_landing) {
        this.first_stage_landing = first_stage_landing;
    }

    public int getSeco1() {
        return seco1;
    }

    public void setSeco1(int seco1) {
        this.seco1 = seco1;
    }

    public int getSecond_stage_restart() {
        return second_stage_restart;
    }

    public void setSecond_stage_restart(int second_stage_restart) {
        this.second_stage_restart = second_stage_restart;
    }

    public int getSeco2() {
        return seco2;
    }

    public void setSeco2(int seco2) {
        this.seco2 = seco2;
    }

    public int getPayload_deploy() {
        return payload_deploy;
    }

    public void setPayload_deploy(int payload_deploy) {
        this.payload_deploy = payload_deploy;
    }
}
