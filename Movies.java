class Movies {
    public static void main(String[] args) {

        String[] titles = { "Indiana Jones et les aventuriers de l'arche perdue", "Indiana Jones et le temple maudit",
                "Indiana Jones et la dernière croisade" };

        String[] title1 = { "Harrison Ford", "Denholm Elliott", "Karen Allen" };
        String[] title2 = { "Harrison Ford", "Jonathan Ke Quan", "Kate Capshaw" };
        String[] title3 = { "Harrison Ford", "Denholm Elliott", "John Rhys-Davies" };

        String[][] actors;
        actors = new String[][] { title1, title2, title3 };

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Dans le film " + titles[i] + ", Les principaux acteurs sont "
                    + actors[i][0] + ", "
                    + actors[i][1] + ", "
                    + actors[i][2] + ".");
        }
    }
}