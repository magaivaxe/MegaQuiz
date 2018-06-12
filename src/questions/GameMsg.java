/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

/**
 *
 * @author Marcos Gomes
 */
class GameMsg {
    // Constructor
    public GameMsg() {}
    // Final fields - Messages
    final String LINE = "\n------------------------------------------\n";
    final String INSTRUCTIONS = "To exit enter: \"exit\"";
    final String MSG_WELCOME = 
        "\n\n" + LINE +
        "Welcome to Mega Quiz! \n" +
        INSTRUCTIONS + "\n"+
        "Enter the player name: ";
    final String OPTIONS =
        "\nMultiple:\n" +
        "\t1 - Canada;\n" +
        "\t2 - United States;\n" +
        "\t3 - Country - capital;\n" +
        "Objective:\n" +
        "\t4 - Direct response;\n";
    final String MSG_CHOICE =
        "you must choice your Mega Quiz challenge...\n" +
        OPTIONS +
        "Please enter your choice:\n ";
    final String ERROR1 = 
        "\nEnter a number ";
    final String ERROR2 = 
        "among the options!";
    final String START_QUESTION = 
        "\n What is the ";
    final String END_QUESTION = 
        " capital?\n";
}
