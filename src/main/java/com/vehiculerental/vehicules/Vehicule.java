package com.vehiculerental.vehicules;

public interface Vehicule {

    /**
     * Récupère l'id du véhicule.
     * @return l'id du véhicule
     */
    public int getId();

    /**
     * Définit l'id du véhicule.
     * @param id l'id du véhicule
     */
    public void setId(int id);

    /**
     * Récupère le numéro d'immatriculation du véhicule.
     * @return le numéro d'immatriculation du véhicule
     */
    public String getRegistrationNumber();

    /**
     * Définit le numéro d'immatriculation du véhicule.
     * @param registrationNumber le numéro d'immatriculation du véhicule
     */
    public void setRegistrationNumber(String registrationNumber);

    /**
     * Récupère la marque du véhicule.
     * @return la marque du véhicule
     */
    public String getBrand();

    /**
     * Définit la marque du véhicule.
     * @param brand la marque du véhicule
     */
    public void setBrand(String brand);

    /**
     * Récupère le modèle du véhicule.
     * @return le modèle du véhicule
     */
    public String getModel();

    /**
     * Définit le modèle du véhicule.
     * @param model le modèle du véhicule
     */
    public void setModel(String model);

    /**
     * Récupère la couleur du véhicule.
     * @return la couleur du véhicule
     */
    public String getColor();

    /**
     * Définit la couleur du véhicule.
     * @param color la couleur du véhicule
     */
    public void setColor(String color);

    /**
     * Récupère le prix de réservation du véhicule.
     * @return le prix de réservation du véhicule
     */
    public int getReservationPrice();

    /**
     * Définit le prix de réservation du véhicule.
     * @param reservationPrice le prix de réservation du véhicule
     */
    public void setReservationPrice(int reservationPrice);

    /**
     * Récupère le tarif kilométrique du véhicule.
     * @return le tarif kilométrique du véhicule
     */
    public int getKilometerPrice();

    /**
     * Définit le tarif kilométrique du véhicule.
     * @param kilometerPrice le tarif kilométrique du véhicule
     */
    public void setKilometerPrice(int kilometerPrice);

    /**
     * Récupère les chevaux fiscaux du véhicule.
     * @return les chevaux fiscaux du véhicule
     */
    public int getFiscalHorsepower();

    /**
     * Définit les chevaux fiscaux du véhicule.
     * @param fiscalHorsepower les chevaux fiscaux du véhicule
     */
    public void setFiscalHorsepower(int fiscalHorsepower);

}
