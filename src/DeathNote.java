//Создать класс записной книжки, в котором хранятся записи дел.
//        Создать в этом классе метод, который выводит частотный словарь для определенной записи
//        (запись можно определить по номеру/индексу)


import java.util.Date;

public class DeathNote {
    private String name;
    private Date dateDeath;
    private String descriptionDeath;

    public DeathNote(String name, Date dateDeath, String descriptionDeath) {
        this.name = name;
        this.dateDeath = dateDeath;
        this.descriptionDeath = descriptionDeath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateDeath() {
        return dateDeath;
    }

    public void setDateDeath(Date dateDeath) {
        this.dateDeath = dateDeath;
    }

    public String getDescriptionDeath() {
        return descriptionDeath;
    }

    public void setDescriptionDeath(String descriptionDeath) {
        this.descriptionDeath = descriptionDeath;
    }

    @Override
    public String toString() {
        return "DeathNote{" +
                "name='" + name + '\'' +
                ", dateDeath=" + dateDeath +
                ", descriptionDeath='" + descriptionDeath + '\'' +
                '}';
    }

    public void greetings() {
        System.out.println("Hello, " + name + ". " + "I want to play a game with you :)");
    }

}
