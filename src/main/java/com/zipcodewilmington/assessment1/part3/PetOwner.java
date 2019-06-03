package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

        private String ownerName;
        private ArrayList<Pet> ownedPets;

    public PetOwner(String name, Pet... pets) {
        ownerName = name;

        ownedPets = new ArrayList<>(0);

        if(pets != null){
            for(Pet newPet : pets){
                ownedPets.add(newPet);
                newPet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        ownedPets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i < ownedPets.size(); i++){
            if(ownedPets.get(i) == pet){
                ownedPets.set(i, null);
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return (pet.getOwner() == this);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = ownedPets.get(0).getAge();
        for(Pet x : ownedPets){
            if(x.getAge() < youngest) youngest = x.getAge();
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = ownedPets.get(0).getAge();
        for(Pet x : ownedPets){
            if(x.getAge() > oldest) oldest = x.getAge();
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer s = 0;
        for(Pet x : ownedPets){
            s += x.getAge();
        }
        return (float)s / ownedPets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        Integer count = 0;
        for(Pet x : ownedPets){
            if(x != null) count++;
        }
        return count;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return ownedPets.toArray(new Pet[0]);
    }
}