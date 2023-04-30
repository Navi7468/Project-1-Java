package Utils;

public class potion {
    String name;
    String description;
    String SideEffect;
    float duration;
    float rarity;
    float healthModifier;
    float damageModifier;
    float manaModifier;



    public potion(String name, String description, String SideEffect, float duration, float rarity, float healthModifier, float damageModifier, float manaModifier) {
        this.name = name;
        this.description = description;
        this.SideEffect = SideEffect;
        this.duration = duration;
        this.rarity = rarity;
        this.healthModifier = healthModifier;
        this.damageModifier = damageModifier;
        this.manaModifier = manaModifier;
    }


    public void Use() {
        System.out.println("You used a " + this.name + "!");
    }

    public void Print() {
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);

        if (this.SideEffect != null) {
            System.out.println("Side Effect: " + this.SideEffect);
        }
        if (this.duration != 0) {
            System.out.println("Duration: " + this.duration);
        }
        if (this.rarity != 0) {
            System.out.println("Rarity: " + this.rarity);
        }
        if (this.healthModifier != 0) {
            System.out.println("Health Modifier: " + this.healthModifier);
        }
        if (this.damageModifier != 0) {
            System.out.println("Damage Modifier: " + this.damageModifier);
        }
        if (this.manaModifier != 0) {
            System.out.println("Mana Modifier: " + this.manaModifier);
        }
    }

    public void PrintShort() {
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Duration: " + this.duration);
    }

    public void GenerateRandomPotion() {
    }
}
