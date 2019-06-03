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
        private String name;
        private ArrayList<Pet> pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = new ArrayList<>();
        if(pets != null) {
            for (int i = 0; i < pets.length; i++) {
                this.pets.add(pets[i]);
                this.pets.get(i).setOwner(this);
            }
        }
    }

//    if(pets != null) {
//        this.pets = new ArrayList<>(Arrays.asList(pets));
//        for(Pet x : pets){
//            x.setOwner(this);
//        }
//    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i < this.pets.size();){
            if(this.pets.get(i) == pet){
                this.pets.remove(i);
            } else {
                i++;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this == pet.getOwner();
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = pets.get(0).getAge();
        for(Pet x : pets){
            if(x.getAge() < youngest) youngest = x.getAge();
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = pets.get(0).getAge();
        for(Pet x : pets){
            if(x.getAge() > oldest) oldest = x.getAge();
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer s = pets.get(0).getAge();
        for(int i = 1; i < pets.size(); i++){
            s += pets.get(i).getAge();
        }
        return (float)(s / pets.size());
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        Integer count = pets.size();
        for(Pet x : pets){
            if(x == null) count--;
        }
        return count;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets.toArray(new Pet[0]);
    }
}
