public class Main {
    public static void main(String[] args) {
        System.out.println("---HOUSE---");
        Family house = new House("Asanbekov Baiman", 1000);
        Family house2 = new House("Turatbekov Joloman", 3000);
        Family house3 = new House("Mamatkarimova Mamatjan", 5000);
        Family house4 = new House("Janubekova Roza", 4000);
        Family house5 = new House("Asanabekov Abdumalik", 2000);
        Family[] housew = {house, house2, house3, house4, house5};
        for (Family family : housew) {
            System.out.println(family);
            System.out.println(family.house());
        }
        System.out.println("---Batir---");
        Family batir = new Batir("Asko", 5000);
        Family batir2 = new Batir("Tako", 5000);
        Family batir3 = new Batir("Mako", 5000);
        Family[] batirr = {batir, batir2, batir3};
        for (Family f : batirr) {
            System.out.println(f);
            System.out.println(f.batir());
        }
        System.out.println("---Hotel--");
        Family hotel = new Hotel("Bael", 55000);
        Family hotel2 = new Hotel("Erjigit", 55000);
        Family[] hotell = {hotel, hotel2};
        for (Family d : hotell) {
            System.out.println(d);
            System.out.println(d.hotel());
        }
    }
}