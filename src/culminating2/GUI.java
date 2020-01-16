/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        if(onesCount == 3 || twosCount == 3 || threesCount == 3 || foursCount == 3 || fivesCount == 3 || sixesCount == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
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
        
        if(onesCount == 4 || twosCount == 4 || threesCount == 4 || foursCount == 4 || fivesCount == 4 || sixesCount == 4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
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
    int rollCount = 3;
    
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
    int playerTwoAcesScore = 0;
    int playerTwoTwosScore = 0;
    int playerTwoThreesScore = 0;
    int playerTwoFoursScore = 0;
    int playerTwoFivesScore = 0;
    int playerTwoSixesScore = 0;
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
        playerOne3ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOne3okActionPerformed(evt);
            }
        });

        playerOne4ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOne4ok.setText("4 of a Kind");

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

        playerOneSmallStraightOut.setEditable(false);
        playerOneSmallStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneSmallStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneSmallStraightOut.setText("0");

        playerOneSmallStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneSmallStraight.setText("sm. straight");

        playerOneLargeStraightOut.setEditable(false);
        playerOneLargeStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneLargeStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneLargeStraightOut.setText("0");

        playerOneLargeStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneLargeStraight.setText("lg. straight");

        playerOneChanceOut.setEditable(false);
        playerOneChanceOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneChanceOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneChanceOut.setText("0");

        playerOneChance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneChance.setText("Chance");

        playerOneYahtzeeOut.setEditable(false);
        playerOneYahtzeeOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneYahtzeeOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerOneYahtzeeOut.setText("0");

        playerOneYahtzee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerOneYahtzee.setText("Yahtzee");

        playerTwo3okOut.setEditable(false);
        playerTwo3okOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwo3okOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwo3okOut.setText("0");

        playerTwo3ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwo3ok.setText("3 of a Kind");

        playerTwo4okOut.setEditable(false);
        playerTwo4okOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwo4okOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwo4okOut.setText("0");

        playerTwo4ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwo4ok.setText("4 of a Kind");

        playerTwoFullHouseOut.setEditable(false);
        playerTwoFullHouseOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoFullHouseOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoFullHouseOut.setText("0");

        playerTwoFullHouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoFullHouse.setText("Full House");

        playerTwoSmallStraightOut.setEditable(false);
        playerTwoSmallStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoSmallStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoSmallStraightOut.setText("0");

        playerTwoSmallStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoSmallStraight.setText("sm. straight");

        playerTwoLargeStraightOut.setEditable(false);
        playerTwoLargeStraightOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoLargeStraightOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoLargeStraightOut.setText("0");

        playerTwoLargeStraight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoLargeStraight.setText("lg. straight");

        playerTwoYahtzeeOut.setEditable(false);
        playerTwoYahtzeeOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoYahtzeeOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoYahtzeeOut.setText("0");

        playerTwoYahtzee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoYahtzee.setText("Yahtzee");

        playerTwoChanceOut.setEditable(false);
        playerTwoChanceOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoChanceOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerTwoChanceOut.setText("0");

        playerTwoChance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerTwoChance.setText("Chance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerOneRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
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
                                .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerOneRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerTwoRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            playerOneRoll.setEnabled(false);
            playerTwoRoll.setEnabled(true);
            playerTwoAces.setEnabled(true);
            playerTwoTwos.setEnabled(true);
            playerTwoThrees.setEnabled(true);
            playerTwoFours.setEnabled(true);
            playerTwoFives.setEnabled(true);
            playerTwoSixes.setEnabled(true);
            playerOneAces.setEnabled(false);
            playerOneTwos.setEnabled(false);
            playerOneThrees.setEnabled(false);
            playerOneFours.setEnabled(false);
            playerOneFives.setEnabled(false);
            playerOneSixes.setEnabled(false);
            rollCount = 3;
            playerOneRoll.setText("Roll 3");
            one.setText("0");
            two.setText("0");
            three.setText("0");
            four.setText("0");
            five.setText("0");
        }
        else
        {
        playerTwoRoll.setEnabled(false);
        
        one.setText(String.valueOf(random.nextInt(7)));
        two.setText(String.valueOf(random.nextInt(7)));
        three.setText(String.valueOf(random.nextInt(7)));
        four.setText(String.valueOf(random.nextInt(7)));
        five.setText(String.valueOf(random.nextInt(7)));
        rollCount = rollCount - 1;
        playerOneRoll.setText("Roll "+rollCount);
        
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
        if(threeOfAKindCheck() == false)
        {
            playerOne3ok.setEnabled(false);
        }
        if(fourOfAKindCheck() == false)
        {
            playerOne4ok.setEnabled(false);
        }
        }
        
    }//GEN-LAST:event_playerOneRollActionPerformed

    private void playerTwoRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerTwoRollActionPerformed
        
        if(rollCount == 0)
        {
            playerOneRoll.setEnabled(true);
            playerTwoRoll.setEnabled(false);
            playerTwoAces.setEnabled(false);
            playerTwoTwos.setEnabled(false);
            playerTwoThrees.setEnabled(false);
            playerTwoFours.setEnabled(false);
            playerTwoFives.setEnabled(false);
            playerTwoSixes.setEnabled(false);
            playerOneAces.setEnabled(true);
            playerOneTwos.setEnabled(true);
            playerOneThrees.setEnabled(true);
            playerOneFours.setEnabled(true);
            playerOneFives.setEnabled(true);
            playerOneSixes.setEnabled(true);
            rollCount = 3;
            playerTwoRoll.setText("Roll 3");
            one.setText("0");
            two.setText("0");
            three.setText("0");
            four.setText("0");
            five.setText("0");
        }
        else
        {
        playerTwoRoll.setEnabled(true);
        
        one.setText(String.valueOf(random.nextInt(7)));
        two.setText(String.valueOf(random.nextInt(7)));
        three.setText(String.valueOf(random.nextInt(7)));
        four.setText(String.valueOf(random.nextInt(7)));
        five.setText(String.valueOf(random.nextInt(7)));
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
        }
    }//GEN-LAST:event_playerTwoRollActionPerformed

    private void playerOneAcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneAcesActionPerformed
        
        if (one.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
        }
        if (two.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
        }
        if (three.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
        }
        if (four.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
        }
        if (five.getText().equals("1"))
        {
            playerOneAcesScore = playerOneAcesScore+1;
        }
        
        playerOneAcesOut.setText(String.valueOf(playerOneAcesScore));
        playerOneAces.setEnabled(false);
        playerOneTwos.setEnabled(false);
        playerOneThrees.setEnabled(false);
        playerOneFours.setEnabled(false);
        playerOneFives.setEnabled(false);
        playerOneSixes.setEnabled(false);
    }//GEN-LAST:event_playerOneAcesActionPerformed

    private void playerOneTwosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneTwosActionPerformed
        
        if (one.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+1;
        }
        if (two.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+1;
        }
        if (three.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+1;
        }
        if (four.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+1;
        }
        if (five.getText().equals("2"))
        {
            playerOneTwosScore = playerOneTwosScore+1;
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
            playerOneThreesScore = playerOneThreesScore+1;
        }
        if (two.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+1;
        }
        if (three.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+1;
        }
        if (four.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+1;
        }
        if (five.getText().equals("3"))
        {
            playerOneThreesScore = playerOneThreesScore+1;
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
            playerOneFoursScore = playerOneFoursScore+1;
        }
        if (two.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+1;
        }
        if (three.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+1;
        }
        if (four.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+1;
        }
        if (five.getText().equals("4"))
        {
            playerOneFoursScore = playerOneFoursScore+1;
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
            playerOneFivesScore = playerOneFivesScore+1;
        }
        if (two.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+1;
        }
        if (three.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+1;
        }
        if (four.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+1;
        }
        if (five.getText().equals("5"))
        {
            playerOneFivesScore = playerOneFivesScore+1;
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
            playerOneSixesScore = playerOneSixesScore+1;
        }
        if (two.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+1;
        }
        if (three.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+1;
        }
        if (four.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+1;
        }
        if (five.getText().equals("6"))
        {
            playerOneSixesScore = playerOneSixesScore+1;
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
        }
        if (two.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
        }
        if (three.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
        }
        if (four.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
        }
        if (five.getText().equals("1"))
        {
            playerTwoAcesScore = playerTwoAcesScore+1;
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
            playerTwoTwosScore = playerTwoTwosScore+1;
        }
        if (two.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+1;
        }
        if (three.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+1;
        }
        if (four.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+1;
        }
        if (five.getText().equals("2"))
        {
            playerTwoTwosScore = playerTwoTwosScore+1;
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
            playerTwoThreesScore = playerTwoThreesScore+1;
        }
        if (two.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+1;
        }
        if (three.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+1;
        }
        if (four.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+1;
        }
        if (five.getText().equals("3"))
        {
            playerTwoThreesScore = playerTwoThreesScore+1;
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
            playerTwoFoursScore = playerTwoFoursScore+1;
        }
        if (two.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+1;
        }
        if (three.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+1;
        }
        if (four.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+1;
        }
        if (five.getText().equals("4"))
        {
            playerTwoFoursScore = playerTwoFoursScore+1;
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
            playerTwoFivesScore = playerTwoFivesScore+1;
        }
        if (two.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+1;
        }
        if (three.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+1;
        }
        if (four.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+1;
        }
        if (five.getText().equals("5"))
        {
            playerTwoFivesScore = playerTwoFivesScore+1;
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
            playerTwoSixesScore = playerTwoSixesScore+1;
        }
        if (two.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+1;
        }
        if (three.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+1;
        }
        if (four.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+1;
        }
        if (five.getText().equals("6"))
        {
            playerTwoSixesScore = playerTwoSixesScore+1;
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
        // TODO add your handling code here:
    }//GEN-LAST:event_playerOne3okActionPerformed

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
    private javax.swing.JButton playerTwoTwos;
    private javax.swing.JTextField playerTwoTwosOut;
    private javax.swing.JButton playerTwoYahtzee;
    private javax.swing.JTextField playerTwoYahtzeeOut;
    private javax.swing.JTextField three;
    private javax.swing.JTextField two;
    // End of variables declaration//GEN-END:variables
}
