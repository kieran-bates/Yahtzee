/*
 * Kieran Bates
 * January 22, 2020
 * This is a 2 player version of 10-round Yahtzee.
 */

package culminating2;

/**
 *
 * @author kibat6204
 */
import java.util.Random;
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    
    /**
     * Checks for a full house using a bubble sort based algorithm
     * @return 
     */
    public boolean fullHouseCheck()
    {
        int numbers[] = new int[5];
        
        numbers[0] = Integer.parseInt(one.getText());
        numbers[1] = Integer.parseInt(two.getText());
        numbers[2] = Integer.parseInt(three.getText());
        numbers[3] = Integer.parseInt(four.getText());
        numbers[4] = Integer.parseInt(five.getText());
        
        boolean exit = false;
        int temp;
        
        while(exit == false) //repeat until numbers are sorted
        {
            exit = true;
            for(int i=0 ; i<numbers.length-1 ; i++) //Scan the length of the array for numbers out of place
            {
                if(numbers[i]>numbers[i+1]) //If number to the left is less than number to the right
                {
                    //Swap numbers
                    temp = numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i] = temp;
                    exit = false;
                }
            }
        }
        if(numbers[0]==numbers[1] && numbers[2]==numbers[3] && numbers[3]==numbers[4] && numbers[2] == numbers[4]) //Check to see if data meets conditions for full house
        {
            return true;
        }
        else if(numbers[0]==numbers[1] && numbers[1]==numbers[2] && numbers[2]==numbers[0] && numbers[3]==numbers[4])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks for a yahtzee by comparing the contents of each die.  
     * @return 
     */
    public boolean yahtzeeCheck()
    {
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        if(oneReg == twoReg && oneReg == threeReg && oneReg == fourReg && oneReg == fiveReg) //Check to see if data meets conditions for a yahtzee
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks for a large straight using a bubble sort based method
     * @return 
     */
    public boolean largeStraightCheck()
    {
        int numbers[] = new int[5];
        
        numbers[0] = Integer.parseInt(one.getText());
        numbers[1] = Integer.parseInt(two.getText());
        numbers[2] = Integer.parseInt(three.getText());
        numbers[3] = Integer.parseInt(four.getText());
        numbers[4] = Integer.parseInt(five.getText());
        
        boolean exit = false;
        int temp;
        
        while(exit == false) //repeat until numbers are sorted
        {
            exit = true;
            for(int i=0 ; i<numbers.length-1 ; i++) //Scan the length of the array for numbers out of place
            {
                if(numbers[i]>numbers[i+1]) //If number to the left is less than number to the right
                {
                    //Swap numbers
                    temp = numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i] = temp;
                    exit = false;
                }
            }
        }
        //Removes duplicate numbers in the bubble sorted sequence
        if(numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[0] == numbers[3] || numbers[0] == numbers[4])
        {
            numbers[0] = -1;
        }
        if(numbers[1] == numbers[0] || numbers[1] == numbers[2] || numbers[1] == numbers[3] || numbers[1] == numbers[4])
        {
            numbers[1] = -1;
        }
        if(numbers[2] == numbers[0] || numbers[2] == numbers[1] || numbers[2] == numbers[3] || numbers[2] == numbers[4])
        {
            numbers[2] = -1;
        }
        if(numbers[3] == numbers[0] || numbers[3] == numbers[1] || numbers[3] == numbers[2] || numbers[3] == numbers[4])
        {
            numbers[3] = -1;
        }
        if(numbers[4] == numbers[0] || numbers[4] == numbers[1] || numbers[4] == numbers[2] || numbers[4] == numbers[3])
        {
            numbers[4] = -1;
        }
        
        String finalValue = "";
        
        for(int i = 0; i <= 4; i++)
        {
            if(numbers[i] == -1)
            {
                
            }
            else
            {
                finalValue += String.valueOf(numbers[i]); //Print the values that are not duplicates
            }
        }
        
        if(finalValue.equals("12345")||finalValue.equals("23456")) //If sequence meets conditions for large straight
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    
    /**
     * checks for a small straight using a bubble sort method
     * @return 
     */
    public boolean smallStraightCheck()
    {
        int numbers[] = new int[5];
        
        numbers[0] = Integer.parseInt(one.getText());
        numbers[1] = Integer.parseInt(two.getText());
        numbers[2] = Integer.parseInt(three.getText());
        numbers[3] = Integer.parseInt(four.getText());
        numbers[4] = Integer.parseInt(five.getText());
        
        boolean exit = false;
        int temp;
        
        while(exit == false) //repeat until numbers are sorted
        {
            exit = true;
            for(int i=0 ; i<numbers.length-1 ; i++) //Scan the length of the array for numbers out of place
            {
                if(numbers[i]>numbers[i+1]) //If number to the left is less than number to the right
                {
                    //Swap numbers
                    temp = numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i] = temp;
                    exit = false;
                }
            }
        }
        //Remove any duplicate numbers from the sequence
        if(numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[0] == numbers[3] || numbers[0] == numbers[4])
        {
            numbers[0] = -1;
        }
        if(numbers[1] == numbers[0] || numbers[1] == numbers[2] || numbers[1] == numbers[3] || numbers[1] == numbers[4])
        {
            numbers[1] = -1;
        }
        if(numbers[2] == numbers[0] || numbers[2] == numbers[1] || numbers[2] == numbers[3] || numbers[2] == numbers[4])
        {
            numbers[2] = -1;
        }
        if(numbers[3] == numbers[0] || numbers[3] == numbers[1] || numbers[3] == numbers[2] || numbers[3] == numbers[4])
        {
            numbers[3] = -1;
        }
        if(numbers[4] == numbers[0] || numbers[4] == numbers[1] || numbers[4] == numbers[2] || numbers[4] == numbers[3])
        {
            numbers[4] = -1;
        }
        
        String finalValue = "";
        
        for(int i = 0; i <= 4; i++)
        {
            if(numbers[i] == -1)
            {
                
            }
            else
            {
                finalValue += String.valueOf(numbers[i]); //store sequence and jump over duplicates
            }
        }
        
        if(finalValue.equals("1234")||finalValue.equals("2345")||finalValue.equals("3456")||finalValue.equals("12345")||finalValue.equals("23456")||finalValue.equals("12346")) //Check to see if the data meets the conditions for a small straight
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    
    /**
     * checks for a three of a kind by counting how many of each number have been used and seeing if a count totals to three
     * @return 
     */
    public boolean threeOfAKindCheck()
    {
        int onesCount = 0;
        int twosCount = 0;
        int threesCount = 0;
        int foursCount = 0;
        int fivesCount = 0;
        int sixesCount = 0;
            
        if(one.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(one.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(one.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(one.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(one.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(one.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(two.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(two.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(two.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(two.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(two.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(two.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(three.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(three.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(three.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(three.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(three.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(three.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(four.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(four.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(four.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(four.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(four.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(four.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(five.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(five.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(five.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(five.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(five.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(five.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(onesCount >= 3 || twosCount >= 3 || threesCount >= 3 || foursCount >= 3 || fivesCount >= 3 || sixesCount >= 3) //Check to see if conditions are appropriate for a three of a kind
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * counts how many of each number have been used and checks to see if a count adds to four
     * @return 
     */
    public boolean fourOfAKindCheck()
    {
        int onesCount = 0;
        int twosCount = 0;
        int threesCount = 0;
        int foursCount = 0;
        int fivesCount = 0;
        int sixesCount = 0;
            
        if(one.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(one.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(one.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(one.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(one.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(one.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(two.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(two.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(two.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(two.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(two.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(two.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(three.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(three.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(three.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(three.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(three.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(three.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(four.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(four.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(four.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(four.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(four.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(four.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(five.getText().equals("1"))
        {
            onesCount = onesCount+1;
        }
        if(five.getText().equals("2"))
        {
            twosCount = twosCount+1;
        }
        if(five.getText().equals("3"))
        {
            threesCount = threesCount+1;
        }
        if(five.getText().equals("4"))
        {
            foursCount = foursCount+1;
        }
        if(five.getText().equals("5"))
        {
            fivesCount = fivesCount+1;
        }
        if(five.getText().equals("6"))
        {
            sixesCount = sixesCount+1;
        }
        
        if(onesCount == 4 || twosCount == 4 || threesCount == 4 || foursCount == 4 || fivesCount == 4 || sixesCount == 4) //check to see if data meets conditions for a four of a kind
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks to see how many ones are stored in the dice
     * @return 
     */
    public boolean onesCheck()
    {
        if(oneReg == 1||twoReg == 1||threeReg == 1||fourReg == 1||fiveReg == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks to see how many twos are stored in the dice
     * @return 
     */
    public boolean twosCheck()
    {
        if(oneReg == 2||twoReg == 2||threeReg == 2||fourReg == 2||fiveReg == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks to see how many threes are stored in the dice
     * @return 
     */
    public boolean threesCheck()
    {
        if(oneReg == 3||twoReg == 3||threeReg == 3||fourReg == 3||fiveReg == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks to see how many fours are stored in the dice
     * @return 
     */
    public boolean foursCheck()
    {
        if(oneReg == 4||twoReg == 4||threeReg == 4||fourReg == 4||fiveReg == 4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks to see how many fives are stored in the dice
     * @return 
     */
    public boolean fivesCheck()
    {
        if(oneReg == 5||twoReg == 5||threeReg == 5||fourReg == 5||fiveReg == 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks to see how many sixes are stored in the dice
     * @return 
     */
    public boolean sixesCheck()
    {
        if(oneReg == 6||twoReg == 6||threeReg == 6||fourReg == 6||fiveReg == 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    Random random = new Random();
    
    final int rollTotal = 3;
    
    int rollCount = rollTotal;
    final int numberOfRounds = 10;
    int roundCount = 0;
    int jTextField1 = 0;
    int jTextField2 = 0;
    
    int oneReg;
    int twoReg;
    int threeReg;
    int fourReg;
    int fiveReg;
    
    int playerOneAcesScore = 0;
    int playerOneTwosScore = 0;
    int playerOneThreesScore = 0;
    int playerOneFoursScore = 0;
    int playerOneFivesScore = 0;
    int playerOneSixesScore = 0;
    int playerOne3okScore = 0;
    int playerOne4okScore = 0;
    int playerOneSmallStraightScore = 0;
    int playerOneLargeStraightScore = 0;
    int playerOneYahtzeeScore = 0;
    int playerOneFullHouseScore = 0;
    int playerOneChanceScore = 0;
    int playerTwoAcesScore = 0;
    int playerTwoTwosScore = 0;
    int playerTwoThreesScore = 0;
    int playerTwoFoursScore = 0;
    int playerTwoFivesScore = 0;
    int playerTwoSixesScore = 0;
    int playerTwo3okScore = 0;
    int playerTwo4okScore = 0;
    int playerTwoSmallStraightScore = 0;
    int playerTwoLargeStraightScore = 0;
    int playerTwoYahtzeeScore = 0;
    int playerTwoFullHouseScore = 0;
    int playerTwoChanceScore = 0;
    
    int playerOneTotalScore = 0;
    int playerTwoTotalScore = 0;
    
    boolean playerOneChanceUsed = false;
    boolean playerTwoChanceUsed = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        one = new javax.swing.JTextField();
        two = new javax.swing.JTextField();
        three = new javax.swing.JTextField();
        four = new javax.swing.JTextField();
        five = new javax.swing.JTextField();
        playerOneRoll = new javax.swing.JButton();
        playerTwoRoll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerOneAcesOut = new javax.swing.JTextField();
        playerOneAces = new javax.swing.JButton();
        playerOneTwosOut = new javax.swing.JTextField();
        playerOneTwos = new javax.swing.JButton();
        playerOneThreesOut = new javax.swing.JTextField();
        playerOneThrees = new javax.swing.JButton();
        playerOneFoursOut = new javax.swing.JTextField();
        playerOneFours = new javax.swing.JButton();
        playerOneFivesOut = new javax.swing.JTextField();
        playerOneFives = new javax.swing.JButton();
        playerOneSixesOut = new javax.swing.JTextField();
        playerOneSixes = new javax.swing.JButton();
        playerTwoAcesOut = new javax.swing.JTextField();
        playerTwoAces = new javax.swing.JButton();
        playerTwoTwosOut = new javax.swing.JTextField();
        playerTwoTwos = new javax.swing.JButton();
        playerTwoThreesOut = new javax.swing.JTextField();
        playerTwoThrees = new javax.swing.JButton();
        playerTwoFoursOut = new javax.swing.JTextField();
        playerTwoFours = new javax.swing.JButton();
        playerTwoFivesOut = new javax.swing.JTextField();
        playerTwoFives = new javax.swing.JButton();
        playerTwoSixesOut = new javax.swing.JTextField();
        playerTwoSixes = new javax.swing.JButton();
        playerOne3okOut = new javax.swing.JTextField();
        playerOne3ok = new javax.swing.JButton();
        playerOne4ok = new javax.swing.JButton();
        playerOne4okOut = new javax.swing.JTextField();
        playerOneFullHouseOut = new javax.swing.JTextField();
        playerOneFullHouse = new javax.swing.JButton();
        playerOneSmallStraightOut = new javax.swing.JTextField();
        playerOneSmallStraight = new javax.swing.JButton();
        playerOneLargeStraightOut = new javax.swing.JTextField();
        playerOneLargeStraight = new javax.swing.JButton();
        playerOneChanceOut = new javax.swing.JTextField();
        playerOneChance = new javax.swing.JButton();
        playerOneYahtzeeOut = new javax.swing.JTextField();
        playerOneYahtzee = new javax.swing.JButton();
        playerTwo3okOut = new javax.swing.JTextField();
        playerTwo3ok = new javax.swing.JButton();
        playerTwo4okOut = new javax.swing.JTextField();
        playerTwo4ok = new javax.swing.JButton();
        playerTwoFullHouseOut = new javax.swing.JTextField();
        playerTwoFullHouse = new javax.swing.JButton();
        playerTwoSmallStraightOut = new javax.swing.JTextField();
        playerTwoSmallStraight = new javax.swing.JButton();
        playerTwoLargeStraightOut = new javax.swing.JTextField();
        playerTwoLargeStraight = new javax.swing.JButton();
        playerTwoYahtzeeOut = new javax.swing.JTextField();
        playerTwoYahtzee = new javax.swing.JButton();
        playerTwoChanceOut = new javax.swing.JTextField();
        playerTwoChance = new javax.swing.JButton();
        playerOneTotalScoreOut = new javax.swing.JTextField();
        playerTwoTotalScoreOut = new javax.swing.JTextField();
        winnerOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        one.setEditable(false);
        one.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        one.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        one.setText("0");

        two.setEditable(false);
        two.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        two.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        two.setText("0");

        three.setEditable(false);
        three.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        three.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        three.setText("0");

        four.setEditable(false);
        four.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        four.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        four.setText("0");

        five.setEditable(false);
        five.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        five.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        five.setText("0");

        playerOneRoll.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerOneRoll.setText("Roll 3");
        playerOneRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneRollActionPerformed(evt);
            }
        });

        playerTwoRoll.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerTwoRoll.setText("Roll 3");
        playerTwoRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoRollActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Player 2");

        playerOneAcesOut.setEditable(false);
        playerOneAcesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneAcesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneAcesOut.setText("0");

        playerOneAces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneAces.setText("Aces");
        playerOneAces.setEnabled(false);
        playerOneAces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneAcesActionPerformed(evt);
            }
        });

        playerOneTwosOut.setEditable(false);
        playerOneTwosOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneTwosOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneTwosOut.setText("0");

        playerOneTwos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneTwos.setText("Twos");
        playerOneTwos.setEnabled(false);
        playerOneTwos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneTwosActionPerformed(evt);
            }
        });

        playerOneThreesOut.setEditable(false);
        playerOneThreesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneThreesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneThreesOut.setText("0");

        playerOneThrees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneThrees.setText("Threes");
        playerOneThrees.setEnabled(false);
        playerOneThrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneThreesActionPerformed(evt);
            }
        });

        playerOneFoursOut.setEditable(false);
        playerOneFoursOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneFoursOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneFoursOut.setText("0");

        playerOneFours.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneFours.setText("Fours");
        playerOneFours.setEnabled(false);
        playerOneFours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneFoursActionPerformed(evt);
            }
        });

        playerOneFivesOut.setEditable(false);
        playerOneFivesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneFivesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneFivesOut.setText("0");

        playerOneFives.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneFives.setText("Fives");
        playerOneFives.setEnabled(false);
        playerOneFives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneFivesActionPerformed(evt);
            }
        });

        playerOneSixesOut.setEditable(false);
        playerOneSixesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneSixesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneSixesOut.setText("0");

        playerOneSixes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneSixes.setText("Sixes");
        playerOneSixes.setEnabled(false);
        playerOneSixes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneSixesActionPerformed(evt);
            }
        });

        playerTwoAcesOut.setEditable(false);
        playerTwoAcesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoAcesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoAcesOut.setText("0");

        playerTwoAces.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoAces.setText("Aces");
        playerTwoAces.setEnabled(false);
        playerTwoAces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoAcesActionPerformed(evt);
            }
        });

        playerTwoTwosOut.setEditable(false);
        playerTwoTwosOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoTwosOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoTwosOut.setText("0");

        playerTwoTwos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoTwos.setText("Twos");
        playerTwoTwos.setEnabled(false);
        playerTwoTwos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoTwosActionPerformed(evt);
            }
        });

        playerTwoThreesOut.setEditable(false);
        playerTwoThreesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoThreesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoThreesOut.setText("0");

        playerTwoThrees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoThrees.setText("Threes");
        playerTwoThrees.setEnabled(false);
        playerTwoThrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoThreesActionPerformed(evt);
            }
        });

        playerTwoFoursOut.setEditable(false);
        playerTwoFoursOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoFoursOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoFoursOut.setText("0");

        playerTwoFours.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoFours.setText("Fours");
        playerTwoFours.setEnabled(false);
        playerTwoFours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoFoursActionPerformed(evt);
            }
        });

        playerTwoFivesOut.setEditable(false);
        playerTwoFivesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoFivesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoFivesOut.setText("0");

        playerTwoFives.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoFives.setText("Fives");
        playerTwoFives.setEnabled(false);
        playerTwoFives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoFivesActionPerformed(evt);
            }
        });

        playerTwoSixesOut.setEditable(false);
        playerTwoSixesOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoSixesOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoSixesOut.setText("0");

        playerTwoSixes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoSixes.setText("Sixes");
        playerTwoSixes.setEnabled(false);
        playerTwoSixes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoSixesActionPerformed(evt);
            }
        });

        playerOne3okOut.setEditable(false);
        playerOne3okOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOne3okOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOne3okOut.setText("0");

        playerOne3ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOne3ok.setText("3 of a Kind");
        playerOne3ok.setEnabled(false);
        playerOne3ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOne3okActionPerformed(evt);
            }
        });

        playerOne4ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOne4ok.setText("4 of a Kind");
        playerOne4ok.setEnabled(false);
        playerOne4ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOne4okActionPerformed(evt);
            }
        });

        playerOne4okOut.setEditable(false);
        playerOne4okOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOne4okOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOne4okOut.setText("0");

        playerOneFullHouseOut.setEditable(false);
        playerOneFullHouseOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneFullHouseOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneFullHouseOut.setText("0");

        playerOneFullHouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneFullHouse.setText("Full House");
        playerOneFullHouse.setEnabled(false);
        playerOneFullHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneFullHouseActionPerformed(evt);
            }
        });

        playerOneSmallStraightOut.setEditable(false);
        playerOneSmallStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneSmallStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneSmallStraightOut.setText("0");

        playerOneSmallStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneSmallStraight.setText("sm. straight");
        playerOneSmallStraight.setEnabled(false);
        playerOneSmallStraight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneSmallStraightActionPerformed(evt);
            }
        });

        playerOneLargeStraightOut.setEditable(false);
        playerOneLargeStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneLargeStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneLargeStraightOut.setText("0");

        playerOneLargeStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneLargeStraight.setText("lg. straight");
        playerOneLargeStraight.setEnabled(false);
        playerOneLargeStraight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneLargeStraightActionPerformed(evt);
            }
        });

        playerOneChanceOut.setEditable(false);
        playerOneChanceOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneChanceOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneChanceOut.setText("0");

        playerOneChance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneChance.setText("Chance");
        playerOneChance.setEnabled(false);
        playerOneChance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneChanceActionPerformed(evt);
            }
        });

        playerOneYahtzeeOut.setEditable(false);
        playerOneYahtzeeOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneYahtzeeOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneYahtzeeOut.setText("0");

        playerOneYahtzee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneYahtzee.setText("Yahtzee");
        playerOneYahtzee.setEnabled(false);
        playerOneYahtzee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneYahtzeeActionPerformed(evt);
            }
        });

        playerTwo3okOut.setEditable(false);
        playerTwo3okOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwo3okOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwo3okOut.setText("0");

        playerTwo3ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwo3ok.setText("3 of a Kind");
        playerTwo3ok.setEnabled(false);
        playerTwo3ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwo3okActionPerformed(evt);
            }
        });

        playerTwo4okOut.setEditable(false);
        playerTwo4okOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwo4okOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwo4okOut.setText("0");

        playerTwo4ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwo4ok.setText("4 of a Kind");
        playerTwo4ok.setEnabled(false);
        playerTwo4ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwo4okActionPerformed(evt);
            }
        });

        playerTwoFullHouseOut.setEditable(false);
        playerTwoFullHouseOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoFullHouseOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoFullHouseOut.setText("0");

        playerTwoFullHouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoFullHouse.setText("Full House");
        playerTwoFullHouse.setEnabled(false);
        playerTwoFullHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoFullHouseActionPerformed(evt);
            }
        });

        playerTwoSmallStraightOut.setEditable(false);
        playerTwoSmallStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoSmallStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoSmallStraightOut.setText("0");

        playerTwoSmallStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoSmallStraight.setText("sm. straight");
        playerTwoSmallStraight.setEnabled(false);
        playerTwoSmallStraight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoSmallStraightActionPerformed(evt);
            }
        });

        playerTwoLargeStraightOut.setEditable(false);
        playerTwoLargeStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoLargeStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoLargeStraightOut.setText("0");

        playerTwoLargeStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoLargeStraight.setText("lg. straight");
        playerTwoLargeStraight.setEnabled(false);
        playerTwoLargeStraight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoLargeStraightActionPerformed(evt);
            }
        });

        playerTwoYahtzeeOut.setEditable(false);
        playerTwoYahtzeeOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoYahtzeeOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoYahtzeeOut.setText("0");

        playerTwoYahtzee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoYahtzee.setText("Yahtzee");
        playerTwoYahtzee.setEnabled(false);
        playerTwoYahtzee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoYahtzeeActionPerformed(evt);
            }
        });

        playerTwoChanceOut.setEditable(false);
        playerTwoChanceOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoChanceOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoChanceOut.setText("0");

        playerTwoChance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoChance.setText("Chance");
        playerTwoChance.setEnabled(false);
        playerTwoChance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerTwoChanceActionPerformed(evt);
            }
        });

        playerOneTotalScoreOut.setEditable(false);
        playerOneTotalScoreOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneTotalScoreOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneTotalScoreOut.setText("0");
        playerOneTotalScoreOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneTotalScoreOutActionPerformed(evt);
            }
        });

        playerTwoTotalScoreOut.setEditable(false);
        playerTwoTotalScoreOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoTotalScoreOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoTotalScoreOut.setText("0");

        winnerOutput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        winnerOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneTotalScoreOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerTwoTotalScoreOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneAces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneAcesOut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneTwos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneTwosOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneThrees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneThreesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneFours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneFoursOut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneFives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneFivesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerOneSixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerOneSixesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoAces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoAcesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoTwos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoTwosOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoThrees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoThreesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoFours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoFoursOut, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoFives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoFivesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoSixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoSixesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(winnerOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playerOneChance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerOneChanceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOne3ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOne3okOut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOne4ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOne4okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerOneFullHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerOneFullHouseOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneSmallStraight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneSmallStraightOut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerOneLargeStraight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerOneLargeStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playerOneYahtzee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerOneYahtzeeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playerTwoChance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerTwoChanceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwo3ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwo3okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwo4ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwo4okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerTwoFullHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerTwoFullHouseOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoSmallStraight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoSmallStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playerTwoLargeStraight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerTwoLargeStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playerTwoYahtzee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerTwoYahtzeeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(playerTwoTotalScoreOut)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerOneRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerTwoRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(playerOneTotalScoreOut))
                    .addComponent(winnerOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneAcesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneAces, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneTwosOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneTwos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneThreesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneThrees, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneFoursOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneFours, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneFivesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneFives, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneSixesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOneSixes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTwoAcesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoAces, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTwoTwosOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoTwos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTwoThreesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoThrees, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTwoFoursOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoFours, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTwoFivesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoFives, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTwoSixesOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwoSixes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOne3okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOne3ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOne4okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOne4ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOneFullHouseOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOneFullHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOneSmallStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOneSmallStraight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOneLargeStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOneLargeStraight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOneChanceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOneChance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerOneYahtzeeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerOneYahtzee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwo3okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwo3ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwo4okOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwo4ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwoFullHouseOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwoFullHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwoSmallStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwoSmallStraight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwoLargeStraightOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwoLargeStraight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwoChanceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwoChance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playerTwoYahtzeeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerTwoYahtzee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerOneRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneRollActionPerformed
        
        if(rollCount == 0)
        {
            //enable and disable appropriate buttons
            playerOneRoll.setEnabled(false);
            playerTwoRoll.setEnabled(true);
            playerTwoAces.setEnabled(true);
            playerTwoTwos.setEnabled(true);
            playerTwoThrees.setEnabled(true);
            playerTwoFours.setEnabled(true);
            playerTwoFives.setEnabled(true);
            playerTwoSixes.setEnabled(true);
            playerTwoSmallStraight.setEnabled(true);
            playerTwoLargeStraight.setEnabled(true);
            playerTwoYahtzee.setEnabled(true);
            playerTwoFullHouse.setEnabled(true);
            playerTwo3ok.setEnabled(true);
            playerTwo4ok.setEnabled(true);
            playerTwoChance.setEnabled(true);
            playerOneAces.setEnabled(false);
            playerOneTwos.setEnabled(false);
            playerOneThrees.setEnabled(false);
            playerOneFours.setEnabled(false);
            playerOneFives.setEnabled(false);
            playerOneSixes.setEnabled(false);
            playerOneSmallStraight.setEnabled(false);
            playerOneLargeStraight.setEnabled(false);
            playerOneYahtzee.setEnabled(false);
            playerOneFullHouse.setEnabled(false);
            playerOne3ok.setEnabled(false);
            playerOne4ok.setEnabled(false);
            playerOneChance.setEnabled(false);
            rollCount = 3;
            playerOneRoll.setText("Roll 3");
            one.setText("0");
            two.setText("0");
            three.setText("0");
            four.setText("0");
            five.setText("0");
            
            roundCount = roundCount+1;
            if(roundCount == numberOfRounds)
            {
                if(playerOneTotalScore>playerTwoTotalScore)
                {
                    winnerOutput.setText("Player One Wins!");
                }
                if(playerOneTotalScore<playerTwoTotalScore)
                {
                    winnerOutput.setText("Player Two Wins!");
                }
                if(playerOneTotalScore == playerTwoTotalScore)
                {
                    winnerOutput.setText("Tie!");
                }
                playerOneRoll.setEnabled(false);
                playerOneAces.setEnabled(false);
                playerOneTwos.setEnabled(false);
                playerOneThrees.setEnabled(false);
                playerOneFours.setEnabled(false);
                playerOneFives.setEnabled(false);
                playerOneSixes.setEnabled(false);
                playerOne3ok.setEnabled(false);
                playerOne4ok.setEnabled(false);
                playerOneFullHouse.setEnabled(false);
                playerOneSmallStraight.setEnabled(false);
                playerOneLargeStraight.setEnabled(false);
                playerOneChance.setEnabled(false);
                playerOneYahtzee.setEnabled(false);
                playerTwoRoll.setEnabled(false);
                playerTwoAces.setEnabled(false);
                playerTwoTwos.setEnabled(false);
                playerTwoThrees.setEnabled(false);
                playerTwoFours.setEnabled(false);
                playerTwoFives.setEnabled(false);
                playerTwoSixes.setEnabled(false);
                playerTwo3ok.setEnabled(false);
                playerTwo4ok.setEnabled(false);
                playerTwoFullHouse.setEnabled(false);
                playerTwoSmallStraight.setEnabled(false);
                playerTwoLargeStraight.setEnabled(false);
                playerTwoChance.setEnabled(false);
                playerTwoYahtzee.setEnabled(false);
            }
        }
        else
        {
        playerTwoRoll.setEnabled(false);
        
        boolean repeat = true;
        int temp;
        
        //generate random numbers and see if they are zero.  If they are, regenerate
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                one.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                two.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                three.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                four.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                five.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        
        rollCount = rollCount - 1;
        playerOneRoll.setText("Roll "+rollCount);
        
        //store random numbers in variables for processing
        oneReg = Integer.parseInt(one.getText());
        twoReg = Integer.parseInt(two.getText());
        threeReg = Integer.parseInt(three.getText());
        fourReg = Integer.parseInt(four.getText());
        fiveReg = Integer.parseInt(five.getText());
        
        if(onesCheck() == true)
        {
            playerOneAces.setEnabled(true);
        }
        if(onesCheck() == false)
        {
            playerOneAces.setEnabled(false);
        }
        if(twosCheck() == true)
        {
            playerOneTwos.setEnabled(true);
        }
        if(twosCheck() == false)
        {
            playerOneTwos.setEnabled(false);
        }
        if(threesCheck() == true)
        {
            playerOneThrees.setEnabled(true);
        }
        if(threesCheck() == false)
        {
            playerOneThrees.setEnabled(false);
        }
        if(foursCheck() == true)
        {
            playerOneFours.setEnabled(true);
        }
        if(foursCheck() == false)
        {
            playerOneFours.setEnabled(false);
        }
        if(fivesCheck() == true)
        {
            playerOneFives.setEnabled(true);
        }
        if(fivesCheck() == false)
        {
            playerOneFives.setEnabled(false);
        }
        if(sixesCheck() == true)
        {
            playerOneSixes.setEnabled(true);
        }
        if(sixesCheck() == false)
        {
            playerOneSixes.setEnabled(false);
        }
        if(threeOfAKindCheck() == true)
        {
            playerOne3ok.setEnabled(true);
        }
        if(threeOfAKindCheck() == false)
        {
            playerOne3ok.setEnabled(false);
        }
        if(fourOfAKindCheck() == false)
        {
            playerOne4ok.setEnabled(false);
        }
        if(smallStraightCheck() == true)
        {
            playerOneSmallStraight.setEnabled(true);
        }
        if(smallStraightCheck() == false)
        {
            playerOneSmallStraight.setEnabled(false);
        }
        if(largeStraightCheck() == true)
        {
            playerOneLargeStraight.setEnabled(true);
        }
        if(largeStraightCheck() == false)
        {
            playerOneLargeStraight.setEnabled(false);
        }
        if(yahtzeeCheck() == true)
        {
            playerOneYahtzee.setEnabled(true);
        }
        if(yahtzeeCheck() == false)
        {
            playerOneYahtzee.setEnabled(false);
        }
        if(fullHouseCheck() == true)
        {
            playerOneFullHouse.setEnabled(true);
        }
        if(fullHouseCheck() == false)
        {
            playerOneFullHouse.setEnabled(false);
        }
        if(playerOneChanceUsed == false)
        {
            playerOneChance.setEnabled(true);
        }
        if(playerOneChanceUsed == true)
        {
            playerOneChance.setEnabled(false);
        }
        }
        
    }//GEN-LAST:event_playerOneRollActionPerformed

    private void playerTwoRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoRollActionPerformed
        
        if(rollCount == 0)
        {
            
            //enable the buttons
            playerOneRoll.setEnabled(true);
            playerTwoRoll.setEnabled(false);
            playerTwoAces.setEnabled(false);
            playerTwoTwos.setEnabled(false);
            playerTwoThrees.setEnabled(false);
            playerTwoFours.setEnabled(false);
            playerTwoFives.setEnabled(false);
            playerTwoSixes.setEnabled(false);
            playerTwoSmallStraight.setEnabled(false);
            playerTwoLargeStraight.setEnabled(false);
            playerTwoYahtzee.setEnabled(false);
            playerTwoFullHouse.setEnabled(false);
            playerTwo3ok.setEnabled(false);
            playerTwo4ok.setEnabled(false);
            playerTwoChance.setEnabled(false);
            playerOneAces.setEnabled(true);
            playerOneTwos.setEnabled(true);
            playerOneThrees.setEnabled(true);
            playerOneFours.setEnabled(true);
            playerOneFives.setEnabled(true);
            playerOneSixes.setEnabled(true);
            playerOneSmallStraight.setEnabled(true);
            playerOneLargeStraight.setEnabled(true);
            playerOneYahtzee.setEnabled(true);
            playerOneFullHouse.setEnabled(true);
            playerOne3ok.setEnabled(true);
            playerOne4ok.setEnabled(true);
            playerOneChance.setEnabled(true);
            rollCount = 3;
            playerTwoRoll.setText("Roll 3");
            one.setText("0");
            two.setText("0");
            three.setText("0");
            four.setText("0");
            five.setText("0");
            
            roundCount = roundCount+1;
            if(roundCount == numberOfRounds)
            {
                if(playerOneTotalScore>playerTwoTotalScore)
                {
                    winnerOutput.setText("Player One Wins!");
                }
                if(playerOneTotalScore<playerTwoTotalScore)
                {
                    winnerOutput.setText("Player Two Wins!");
                }
                if(playerOneTotalScore == playerTwoTotalScore)
                {
                    winnerOutput.setText("Tie!");
                }
                playerOneRoll.setEnabled(false);
                playerOneAces.setEnabled(false);
                playerOneTwos.setEnabled(false);
                playerOneThrees.setEnabled(false);
                playerOneFours.setEnabled(false);
                playerOneFives.setEnabled(false);
                playerOneSixes.setEnabled(false);
                playerOne3ok.setEnabled(false);
                playerOne4ok.setEnabled(false);
                playerOneFullHouse.setEnabled(false);
                playerOneSmallStraight.setEnabled(false);
                playerOneLargeStraight.setEnabled(false);
                playerOneChance.setEnabled(false);
                playerOneYahtzee.setEnabled(false);
                playerTwoRoll.setEnabled(false);
                playerTwoAces.setEnabled(false);
                playerTwoTwos.setEnabled(false);
                playerTwoThrees.setEnabled(false);
                playerTwoFours.setEnabled(false);
                playerTwoFives.setEnabled(false);
                playerTwoSixes.setEnabled(false);
                playerTwo3ok.setEnabled(false);
                playerTwo4ok.setEnabled(false);
                playerTwoFullHouse.setEnabled(false);
                playerTwoSmallStraight.setEnabled(false);
                playerTwoLargeStraight.setEnabled(false);
                playerTwoChance.setEnabled(false);
                playerTwoYahtzee.setEnabled(false);
            }
        }
        else
        {
        playerTwoRoll.setEnabled(true);
        
        boolean repeat = true;
        int temp;
        
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                one.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                two.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                three.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                four.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            temp = random.nextInt(7);
            if(temp == 0)
            {
                repeat = true;
            }
            else
            {
                five.setText(String.valueOf(temp));
                repeat = false;
            }
        }
        
        rollCount = rollCount - 1;
        playerTwoRoll.setText("Roll "+rollCount);
        
        oneReg = Integer.parseInt(one.getText());
        twoReg = Integer.parseInt(two.getText());
        threeReg = Integer.parseInt(three.getText());
        fourReg = Integer.parseInt(four.getText());
        fiveReg = Integer.parseInt(five.getText());
        
        if(onesCheck() == true)
        {
            playerTwoAces.setEnabled(true);
        }
        if(onesCheck() == false)
        {
            playerTwoAces.setEnabled(false);
        }
        if(twosCheck() == true)
        {
            playerTwoTwos.setEnabled(true);
        }
        if(twosCheck() == false)
        {
            playerTwoTwos.setEnabled(false);
        }
        if(threesCheck() == true)
        {
            playerTwoThrees.setEnabled(true);
        }
        if(threesCheck() == false)
        {
            playerTwoThrees.setEnabled(false);
        }
        if(foursCheck() == true)
        {
            playerTwoFours.setEnabled(true);
        }
        if(foursCheck() == false)
        {
            playerTwoFours.setEnabled(false);
        }
        if(fivesCheck() == true)
        {
            playerTwoFives.setEnabled(true);
        }
        if(fivesCheck() == false)
        {
            playerTwoFives.setEnabled(false);
        }
        if(sixesCheck() == true)
        {
            playerTwoSixes.setEnabled(true);
        }
        if(sixesCheck() == false)
        {
            playerTwoSixes.setEnabled(false);
        }
        if(threeOfAKindCheck() == false)
        {
            playerTwo3ok.setEnabled(false);
        }
        if(fourOfAKindCheck() == false)
        {
            playerTwo4ok.setEnabled(false);
        }
        if(smallStraightCheck() == true)
        {
            playerTwoSmallStraight.setEnabled(true);
        }
        if(smallStraightCheck() == false)
        {
            playerTwoSmallStraight.setEnabled(false);
        }
        if(largeStraightCheck() == false)
        {
            playerTwoLargeStraight.setEnabled(false);
        }
        if(largeStraightCheck() == true)
        {
            playerTwoLargeStraight.setEnabled(true);
        }
        if(yahtzeeCheck() == true)
        {
            playerTwoYahtzee.setEnabled(true);
        }
        if(yahtzeeCheck() == false)
        {
            playerTwoYahtzee.setEnabled(false);
        }
        if(fullHouseCheck() == true)
        {
            playerTwoFullHouse.setEnabled(true);
        }
        if(fullHouseCheck() == false)
        {
            playerTwoFullHouse.setEnabled(false);
        }
        if(playerTwoChanceUsed == false)
        {
            playerTwoChance.setEnabled(true);
        }
        if(playerTwoChanceUsed == true)
        {
            playerTwoChance.setEnabled(false);
        }
        }
    }//GEN-LAST:event_playerTwoRollActionPerformed

    private void playerOneAcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneAcesActionPerformed
        
        //change scores
        if (one.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
            playerOneTotalScore = playerOneTotalScore+1;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (two.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
            playerOneTotalScore = playerOneTotalScore+1;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (three.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
            playerOneTotalScore = playerOneTotalScore+1;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (four.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
            playerOneTotalScore = playerOneTotalScore+1;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (five.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
            playerOneTotalScore = playerOneTotalScore+1;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        
        playerOneAcesOut.setText(String.valueOf(playerOneAcesScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOneAcesActionPerformed

    private void playerOneTwosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneTwosActionPerformed
        
        //adjust scores
        if (one.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+2;
            playerOneTotalScore = playerOneTotalScore+2;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (two.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+2;
            playerOneTotalScore = playerOneTotalScore+2;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (three.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+2;
            playerOneTotalScore = playerOneTotalScore+2;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (four.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+2;
            playerOneTotalScore = playerOneTotalScore+2;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (five.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+2;
            playerOneTotalScore = playerOneTotalScore+2;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        
        playerOneTwosOut.setText(String.valueOf(playerOneTwosScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
    }//GEN-LAST:event_playerOneTwosActionPerformed

    private void playerOneThreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneThreesActionPerformed
        
        if (one.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+3;
            playerOneTotalScore = playerOneTotalScore+3;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (two.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+3;
            playerOneTotalScore = playerOneTotalScore+3;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (three.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+3;
            playerOneTotalScore = playerOneTotalScore+3;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (four.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+3;
            playerOneTotalScore = playerOneTotalScore+3;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (five.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+3;
            playerOneTotalScore = playerOneTotalScore+3;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        
        playerOneThreesOut.setText(String.valueOf(playerOneThreesScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
    }//GEN-LAST:event_playerOneThreesActionPerformed

    private void playerOneFoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneFoursActionPerformed
        
        if (one.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+4;
            playerOneTotalScore = playerOneTotalScore+4;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (two.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+4;
            playerOneTotalScore = playerOneTotalScore+4;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (three.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+4;
            playerOneTotalScore = playerOneTotalScore+4;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (four.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+4;
            playerOneTotalScore = playerOneTotalScore+4;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (five.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+4;
            playerOneTotalScore = playerOneTotalScore+4;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        
        playerOneFoursOut.setText(String.valueOf(playerOneFoursScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
    }//GEN-LAST:event_playerOneFoursActionPerformed

    private void playerOneFivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneFivesActionPerformed
        
        if (one.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+5;
            playerOneTotalScore = playerOneTotalScore+5;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (two.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+5;
            playerOneTotalScore = playerOneTotalScore+5;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (three.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+5;
            playerOneTotalScore = playerOneTotalScore+5;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (four.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+5;
            playerOneTotalScore = playerOneTotalScore+5;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (five.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+5;
            playerOneTotalScore = playerOneTotalScore+5;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        
        playerOneFivesOut.setText(String.valueOf(playerOneFivesScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
    }//GEN-LAST:event_playerOneFivesActionPerformed

    private void playerOneSixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneSixesActionPerformed
        
        if (one.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+6;
            playerOneTotalScore = playerOneTotalScore+6;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (two.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+6;
            playerOneTotalScore = playerOneTotalScore+6;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (three.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+6;
            playerOneTotalScore = playerOneTotalScore+6;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (four.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+6;
            playerOneTotalScore = playerOneTotalScore+6;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        if (five.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+6;
            playerOneTotalScore = playerOneTotalScore+6;
            playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        }
        
        playerOneSixesOut.setText(String.valueOf(playerOneSixesScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
    }//GEN-LAST:event_playerOneSixesActionPerformed

    private void playerTwoAcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoAcesActionPerformed
        if (one.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
            playerTwoTotalScore = playerTwoTotalScore+1;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (two.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
            playerTwoTotalScore = playerTwoTotalScore+1;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (three.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
            playerTwoTotalScore = playerTwoTotalScore+1;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (four.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
            playerTwoTotalScore = playerTwoTotalScore+1;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (five.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
            playerTwoTotalScore = playerTwoTotalScore+1;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        
        playerTwoAcesOut.setText(String.valueOf(playerTwoAcesScore));
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
    }//GEN-LAST:event_playerTwoAcesActionPerformed

    private void playerTwoTwosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoTwosActionPerformed
        if (one.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+2;
            playerTwoTotalScore = playerTwoTotalScore+2;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (two.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+2;
            playerTwoTotalScore = playerTwoTotalScore+2;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (three.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+2;
            playerTwoTotalScore = playerTwoTotalScore+2;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (four.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+2;
            playerTwoTotalScore = playerTwoTotalScore+2;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (five.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+2;
            playerTwoTotalScore = playerTwoTotalScore+2;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        
        playerTwoTwosOut.setText(String.valueOf(playerTwoTwosScore));
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
    }//GEN-LAST:event_playerTwoTwosActionPerformed

    private void playerTwoThreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoThreesActionPerformed
        if (one.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+3;
            playerTwoTotalScore = playerTwoTotalScore+3;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (two.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+3;
            playerTwoTotalScore = playerTwoTotalScore+3;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (three.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+3;
            playerTwoTotalScore = playerTwoTotalScore+3;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (four.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+3;
            playerTwoTotalScore = playerTwoTotalScore+3;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (five.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+3;
            playerTwoTotalScore = playerTwoTotalScore+3;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        
        playerTwoThreesOut.setText(String.valueOf(playerTwoThreesScore));
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
    }//GEN-LAST:event_playerTwoThreesActionPerformed

    private void playerTwoFoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoFoursActionPerformed
        if (one.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+4;
            playerTwoTotalScore = playerTwoTotalScore+4;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (two.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+4;
            playerTwoTotalScore = playerTwoTotalScore+4;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (three.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+4;
            playerTwoTotalScore = playerTwoTotalScore+4;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (four.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+4;
            playerTwoTotalScore = playerTwoTotalScore+4;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (five.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+4;
            playerTwoTotalScore = playerTwoTotalScore+4;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        
        playerTwoFoursOut.setText(String.valueOf(playerTwoFoursScore));
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
    }//GEN-LAST:event_playerTwoFoursActionPerformed

    private void playerTwoFivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoFivesActionPerformed
        if (one.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+5;
            playerTwoTotalScore = playerTwoTotalScore+5;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (two.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+5;
            playerTwoTotalScore = playerTwoTotalScore+5;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (three.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+5;
            playerTwoTotalScore = playerTwoTotalScore+5;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (four.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+5;
            playerTwoTotalScore = playerTwoTotalScore+5;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (five.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+5;
            playerTwoTotalScore = playerTwoTotalScore+5;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        
        playerTwoFivesOut.setText(String.valueOf(playerTwoFivesScore));
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
    }//GEN-LAST:event_playerTwoFivesActionPerformed

    private void playerTwoSixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoSixesActionPerformed
        if (one.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+6;
            playerTwoTotalScore = playerTwoTotalScore+6;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (two.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+6;
            playerTwoTotalScore = playerTwoTotalScore+6;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (three.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+6;
            playerTwoTotalScore = playerTwoTotalScore+6;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (four.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+6;
            playerTwoTotalScore = playerTwoTotalScore+6;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        if (five.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+6;
            playerTwoTotalScore = playerTwoTotalScore+6;
            playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        }
        
        playerTwoSixesOut.setText(String.valueOf(playerTwoSixesScore));
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
    }//GEN-LAST:event_playerTwoSixesActionPerformed

    private void playerOne3okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOne3okActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOne3okScore = playerOne3okScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerOne3okOut.setText(String.valueOf(playerOne3okScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOne3okActionPerformed

    private void playerOneSmallStraightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneSmallStraightActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOneSmallStraightScore = playerOneSmallStraightScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
            
        playerOneSmallStraightOut.setText(String.valueOf(playerOneSmallStraightScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOneSmallStraightActionPerformed

    private void playerOneLargeStraightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneLargeStraightActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOneLargeStraightScore = playerOneLargeStraightScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerOneLargeStraightOut.setText(String.valueOf(playerOneLargeStraightScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOneLargeStraightActionPerformed

    private void playerOneYahtzeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneYahtzeeActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOneYahtzeeScore = playerOneYahtzeeScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerOneYahtzeeOut.setText(String.valueOf(playerOneYahtzeeScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOneYahtzeeActionPerformed

    private void playerOne4okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOne4okActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOne4okScore = playerOne4okScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerOne4okOut.setText(String.valueOf(playerOne4okScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOne4okActionPerformed

    private void playerOneFullHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneFullHouseActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOneFullHouseScore = playerOneFullHouseScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerOneFullHouseOut.setText(String.valueOf(playerOneFullHouseScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
    }//GEN-LAST:event_playerOneFullHouseActionPerformed

    private void playerOneChanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneChanceActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerOneChanceScore = playerOneChanceScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerOneChanceOut.setText(String.valueOf(playerOneChanceScore));
        
        playerOneTotalScore = playerOneTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerOneTotalScoreOut.setText(String.valueOf(playerOneTotalScore));
        
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
        playerOneSmallStraight.setEnabled(false);
        playerOneLargeStraight.setEnabled(false);
        playerOne3ok.setEnabled(false);
        playerOne4ok.setEnabled(false);
        playerOneFullHouse.setEnabled(false);
        playerOneYahtzee.setEnabled(false);
        playerOneChance.setEnabled(false);
        
        playerOneChanceUsed = true;
    }//GEN-LAST:event_playerOneChanceActionPerformed

    private void playerTwo3okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwo3okActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwo3okScore = playerTwo3okScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerTwo3okOut.setText(String.valueOf(playerTwo3okScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
    }//GEN-LAST:event_playerTwo3okActionPerformed

    private void playerTwo4okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwo4okActionPerformed
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwo4okScore = playerTwo4okScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerTwo4okOut.setText(String.valueOf(playerTwo4okScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
    }//GEN-LAST:event_playerTwo4okActionPerformed

    private void playerTwoFullHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoFullHouseActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwoFullHouseScore = playerTwoFullHouseScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerTwoFullHouseOut.setText(String.valueOf(playerTwoFullHouseScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
    }//GEN-LAST:event_playerTwoFullHouseActionPerformed

    private void playerTwoSmallStraightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoSmallStraightActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwoSmallStraightScore = playerTwoSmallStraightScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
            
        playerTwoSmallStraightOut.setText(String.valueOf(playerTwoSmallStraightScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
    }//GEN-LAST:event_playerTwoSmallStraightActionPerformed

    private void playerTwoLargeStraightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoLargeStraightActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwoLargeStraightScore = playerTwoLargeStraightScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerTwoLargeStraightOut.setText(String.valueOf(playerTwoLargeStraightScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
    }//GEN-LAST:event_playerTwoLargeStraightActionPerformed

    private void playerTwoChanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoChanceActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwoChanceScore = playerTwoChanceScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerTwoChanceOut.setText(String.valueOf(playerTwoChanceScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
        
        playerTwoChanceUsed = true;
    }//GEN-LAST:event_playerTwoChanceActionPerformed

    private void playerTwoYahtzeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoYahtzeeActionPerformed
        
        int oneReg = Integer.parseInt(one.getText());
        int twoReg = Integer.parseInt(two.getText());
        int threeReg = Integer.parseInt(three.getText());
        int fourReg = Integer.parseInt(four.getText());
        int fiveReg = Integer.parseInt(five.getText());
        
        playerTwoYahtzeeScore = playerTwoYahtzeeScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        
        playerTwoYahtzeeOut.setText(String.valueOf(playerTwoYahtzeeScore));
        
        playerTwoTotalScore = playerTwoTotalScore + oneReg+twoReg+threeReg+fourReg+fiveReg;
        playerTwoTotalScoreOut.setText(String.valueOf(playerTwoTotalScore));
        
        playerTwoAces.setEnabled(false);
        playerTwoTwos.setEnabled(false);
        playerTwoThrees.setEnabled(false);
        playerTwoFours.setEnabled(false);
        playerTwoFives.setEnabled(false);
        playerTwoSixes.setEnabled(false);
        playerTwoSmallStraight.setEnabled(false);
        playerTwoLargeStraight.setEnabled(false);
        playerTwo3ok.setEnabled(false);
        playerTwo4ok.setEnabled(false);
        playerTwoFullHouse.setEnabled(false);
        playerTwoYahtzee.setEnabled(false);
        playerTwoChance.setEnabled(false);
    }//GEN-LAST:event_playerTwoYahtzeeActionPerformed

    private void playerOneTotalScoreOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneTotalScoreOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerOneTotalScoreOutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField five;
    private javax.swing.JTextField four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField one;
    private javax.swing.JButton playerOne3ok;
    private javax.swing.JTextField playerOne3okOut;
    private javax.swing.JButton playerOne4ok;
    private javax.swing.JTextField playerOne4okOut;
    private javax.swing.JButton playerOneAces;
    private javax.swing.JTextField playerOneAcesOut;
    private javax.swing.JButton playerOneChance;
    private javax.swing.JTextField playerOneChanceOut;
    private javax.swing.JButton playerOneFives;
    private javax.swing.JTextField playerOneFivesOut;
    private javax.swing.JButton playerOneFours;
    private javax.swing.JTextField playerOneFoursOut;
    private javax.swing.JButton playerOneFullHouse;
    private javax.swing.JTextField playerOneFullHouseOut;
    private javax.swing.JButton playerOneLargeStraight;
    private javax.swing.JTextField playerOneLargeStraightOut;
    private javax.swing.JButton playerOneRoll;
    private javax.swing.JButton playerOneSixes;
    private javax.swing.JTextField playerOneSixesOut;
    private javax.swing.JButton playerOneSmallStraight;
    private javax.swing.JTextField playerOneSmallStraightOut;
    private javax.swing.JButton playerOneThrees;
    private javax.swing.JTextField playerOneThreesOut;
    private javax.swing.JTextField playerOneTotalScoreOut;
    private javax.swing.JButton playerOneTwos;
    private javax.swing.JTextField playerOneTwosOut;
    private javax.swing.JButton playerOneYahtzee;
    private javax.swing.JTextField playerOneYahtzeeOut;
    private javax.swing.JButton playerTwo3ok;
    private javax.swing.JTextField playerTwo3okOut;
    private javax.swing.JButton playerTwo4ok;
    private javax.swing.JTextField playerTwo4okOut;
    private javax.swing.JButton playerTwoAces;
    private javax.swing.JTextField playerTwoAcesOut;
    private javax.swing.JButton playerTwoChance;
    private javax.swing.JTextField playerTwoChanceOut;
    private javax.swing.JButton playerTwoFives;
    private javax.swing.JTextField playerTwoFivesOut;
    private javax.swing.JButton playerTwoFours;
    private javax.swing.JTextField playerTwoFoursOut;
    private javax.swing.JButton playerTwoFullHouse;
    private javax.swing.JTextField playerTwoFullHouseOut;
    private javax.swing.JButton playerTwoLargeStraight;
    private javax.swing.JTextField playerTwoLargeStraightOut;
    private javax.swing.JButton playerTwoRoll;
    private javax.swing.JButton playerTwoSixes;
    private javax.swing.JTextField playerTwoSixesOut;
    private javax.swing.JButton playerTwoSmallStraight;
    private javax.swing.JTextField playerTwoSmallStraightOut;
    private javax.swing.JButton playerTwoThrees;
    private javax.swing.JTextField playerTwoThreesOut;
    private javax.swing.JTextField playerTwoTotalScoreOut;
    private javax.swing.JButton playerTwoTwos;
    private javax.swing.JTextField playerTwoTwosOut;
    private javax.swing.JButton playerTwoYahtzee;
    private javax.swing.JTextField playerTwoYahtzeeOut;
    private javax.swing.JTextField three;
    private javax.swing.JTextField two;
    private javax.swing.JLabel winnerOutput;
    // End of variables declaration//GEN-END:variables
}
