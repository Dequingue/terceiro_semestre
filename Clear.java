public class Clear {
    
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

                     /*-------- CODIGO EMCURTADO --------- */

        /*
            try {
               String command = System.getProperty("os.name").toLowerCase().contains("win") ? "cls" : "clear";
                new ProcessBuilder(command).inheritIO().start().waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
         */



    }
    
}
