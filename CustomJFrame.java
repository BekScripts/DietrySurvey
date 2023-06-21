import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 * 
 * Initializes all class variables and configures them to it's proper characteristics for the GUI and implements the inner class ActionListner
 *
 */
public class CustomJFrame extends JFrame {

// A SpinnerNumberModel is initialized with it's specific characteristics
SpinnerNumberModel numberModel = new SpinnerNumberModel(15, 0, 50, 1);	

// The private headingLabel is created
private JLabel headingLabel = new JLabel();
// The private firstNamelabel is created
private JLabel firstNameLabel = new JLabel();
// The private lastNameLabel is created
private JLabel lastNameLabel = new JLabel();
// The private phoneNumberLabel is created
private JLabel phoneNumberLabel = new JLabel();
// The private emailLabel is created
private JLabel emailLabel = new JLabel();
// The private dietaryLabel is created
private JLabel dietaryLabel = new JLabel();
// The private genderLabel is created
private JLabel genderLabel = new JLabel();
// The private waterLabel is created
private JLabel waterLabel = new JLabel();
// The private mealsLabel is created
private JLabel mealsLabel = new JLabel();
// The private checkingBoxLabel is created
private JLabel checkBoxLabel = new JLabel();
// The private walkLabel is created
private JLabel walkLabel = new JLabel();
// The private weightLabel is created
private JLabel weightLabel = new JLabel();
// The private firstNameTextField is created
private JTextField firstNameTextField = new JTextField();
// The private lastNameTextField is created
private JTextField lastNameTextField = new JTextField();
// The private phoneNumberTextField is created
private JTextField phoneNumberTextField = new JTextField();
// The private emailTextField is created
private JTextField emailTextField = new JTextField();
// The private maleRadioButton is created with the Male title
private JRadioButton maleRadioButton = new JRadioButton("Male");
// The private femaleRadioButton is created with the Female title
private JRadioButton femaleRadioButton = new JRadioButton("Female");
// The private preferRadioButton is created with the Prefer not to say title
private JRadioButton preferRadioButton = new JRadioButton("Prefer not to say");
// The private radioButtonGroup is created where all the radio buttons will be stored
private ButtonGroup radioButtonGroup = new ButtonGroup();
// The private waterIntakeSpinner is created with it's specific characteristics
private JSpinner waterIntakeSpinner = new JSpinner(numberModel);
// The private mealSlider is created with it's specific characteristics
private JSlider mealSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 3);
// The private wheatCheckBox is created with the Wheat title
private JCheckBox wheatCheckBox = new JCheckBox("Wheat");
// The private sugarCheckBox is created with the the Sugar title
private JCheckBox sugarCheckBox = new JCheckBox("Sugar");
// The private dairyCheckBox is created with the Dairy title
private JCheckBox dairyCheckBox = new JCheckBox("Dairy");
// The private String Array walkOptions is initialized with it's components
private String[] walkOptions = {"Less than 1 Mile", "More than 1 mile but less than 2 miles", "More than 2 miles but less than 1 miles", "More than 1 miles"};
// The private walkComboBox is created with the array walkOptions as it's parameter
private JComboBox walkComboBox = new JComboBox(walkOptions);
// The private weightFormattedTextField is created with it's specific characteristics
private JFormattedTextField weightFormattedTextField = new JFormattedTextField(NumberFormat.getNumberInstance());
// The private clearButton is created with the Clear title
private JButton clearButton = new JButton("Clear");
// The private submitButton is created with the Submit title
private JButton submitButton = new JButton("Submit");
// The private FileHandler constructor is created
private FileHandler fileHandler = new FileHandler();

/**
 * This constructor initializes and configures the class variables components
 */
public CustomJFrame() {
	// A GridBagConstraints constructor is created
	GridBagConstraints constraints = new GridBagConstraints();
	// A GridBagLayout constructor is created
	GridBagLayout layout = new GridBagLayout();
	// The text of the headingLabel is created
	headingLabel.setText("Personal Information: ");
	// The text of the firstNameLabel is created
	firstNameLabel.setText("First Name: ");
	// The text of the lastNameLabel is created
	lastNameLabel.setText("Last Name: ");
	// The text of the phoneNumberLabel is created
	phoneNumberLabel.setText("Phone Number: ");
	// The text of the emailLabel is created
	emailLabel.setText("Email: ");
	// The text of the genderLabel is created
	genderLabel.setText("Sex: ");
	// The text of the dietaryLabel is created
	dietaryLabel.setText("Dietary Questions");
	// The text of the waterLabel is created
	waterLabel.setText("How many cups of water on average do you drink a day?");
	// The text of the mealsLabel is created
	mealsLabel.setText("How many meals on average do you eat a day?");
	// The text of the checkBoxLabel is created
	checkBoxLabel.setText("Do any of these meals regularly contain: ");
    // The text of the walkLabel is created
	walkLabel.setText("On average how many miles do you walk in a day?");
	// The text of the weightLabel is created
	weightLabel.setText("How much do you weigh?");
	// A title for the GUI is created
	this.setTitle("Dietary Survey");
	// A layout for the GUI is created
	this.setLayout(layout);
	// The constraints Grid x value is set to 0
	constraints.gridx = 0;
	// The constraints Grid y value is set to 0
	constraints.gridy =  0;
	// A headingLabel is added to the GUI
	this.add(headingLabel, constraints);
	
	// The constraints Grid y value is set to 1
	constraints.gridy = 1;
	// A firstNameLabel is added to the GUI
	this.add(firstNameLabel, constraints);
	// The firstNameTextField size is set to 18
	firstNameTextField.setColumns(18);
	// The constraints grid x value is set to 1
	constraints.gridx = 1;
	// The firstNameTextField is added to the GUI
	this.add(firstNameTextField, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y value is set to 0
	constraints.gridy = 2;
	// The lastNameLabel is added to the GUI
	this.add(lastNameLabel, constraints);
	// The lastNameTextField size is set to 18
	lastNameTextField.setColumns(18);
	// The constraints Grid x values is set to 1
	constraints.gridx = 1;
	// The lastNameTextField is added to the GUI
	this.add(lastNameTextField, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
    // The constraints Grid y values is set to 3
	constraints.gridy = 3;
	// The phoneNumberLabel is added to the GUI
	this.add(phoneNumberLabel, constraints);
	// The phoneNumberTextField size is set to 18
	phoneNumberTextField.setColumns(18);
	// The constraints Grid x values is set to 1
	constraints.gridx = 1;
	// The phoneNumberTextField is added to the GUI
	this.add(phoneNumberTextField, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 4
	constraints.gridy = 4;
	// The emailLabel is added to the GUI
	this.add(emailLabel, constraints);
	// The emailtextField size is set to 18
	emailTextField.setColumns(18);
	// The constraints Grid x values is set to 1
	constraints.gridx = 1;
	// The emailTextField is added to the GUI
	this.add(emailTextField, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 5
	constraints.gridy = 5;
	// The genderLabel is added to the GUI
	this.add(genderLabel, constraints);
	// The maleRadioButton has a setActionCommand set to Male
	maleRadioButton.setActionCommand("Male");
	// The femaleRadioButton has a setActionCommand set to Female
	femaleRadioButton.setActionCommand("Female");
	// The preferRadioButton has a setActionCommand set to Prefer not to say
	preferRadioButton.setActionCommand("Prefer not to say");
	// The maleRadioButton is added to the radioButtonGroup
	radioButtonGroup.add(maleRadioButton);
	// The femaleRadioButton is added to the radioButtonGroup
	radioButtonGroup.add(femaleRadioButton);
	// The preferRadioButton is added to the radioButtonGroup
	radioButtonGroup.add(preferRadioButton);
	// The constraints Grid x values is set to 1
	constraints.gridx = 1;
	// The maleRadioButton is added to the GUI
	this.add(maleRadioButton, constraints);
	// The constraints Grid y values is set to 6
	constraints.gridy = 6;
	// The femaleRadioButton is added to the GUI
	this.add(femaleRadioButton, constraints);
	// The constraints Grid y values is set to 7
	constraints.gridy = 7;
	// The preferRadioButton is added to GUI
	this.add(preferRadioButton, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 8
	constraints.gridy = 8;
	// The dietaryLabel is added to the GUI
	this.add(dietaryLabel, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 9
	constraints.gridy = 9;
	// The waterLabel is added to the GUI
	this.add(waterLabel, constraints);
	// The constraints Grid y values is set to 10
	constraints.gridy = 10;
	// The waterIntakeSpinner is added to the GUI
	this.add(waterIntakeSpinner, constraints);
	
	// The constraints Grid y values is set to 11
	constraints.gridy = 11;
	// The mealsLabel is added to the GUI
	this.add(mealsLabel, constraints);
	// The constraints Grid y values is set to 12
	constraints.gridy = 12;
	// The mealSlider ticks are painted
	mealSlider.setPaintTicks(true);
	// The mealSlider labels are painted
	mealSlider.setPaintLabels(true);
	// The mealSlider ticks are spaced out by 1 tick
	mealSlider.setMajorTickSpacing(1);
	// The mealSlider is added to the GUI
	this.add(mealSlider, constraints);
	
	// The constraints Grid y values is set to 13
	constraints.gridy = 13;
	// The checkBoxLabel is added to the GUI
	this.add(checkBoxLabel, constraints);
	// The constraints Grid y values is set to 14
	constraints.gridy = 14;
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
    // The wheatCheckBox is added to the GUI
	this.add(wheatCheckBox, constraints);
	// The constraints Grid x values is set to 1
	constraints.gridx = 1;
	// The sugarCheckBox is added to the GUI
	this.add(sugarCheckBox, constraints);
	// The constraints Grid x values is set to 2
	constraints.gridx = 2;
	// The dairyCheckBox is added to the GUI
	this.add(dairyCheckBox, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 15
	constraints.gridy = 15;
	// The walkLabel is added to the GUI
	this.add(walkLabel, constraints);
	// The constraints Grid y values is set to 16
	constraints.gridy = 16;
	// The walkComboBox is added to the GUI
	this.add(walkComboBox, constraints);
	
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 17
	constraints.gridy = 17;
	// The weightLabel is added to the GUI
	this.add(weightLabel, constraints);
	// The constraints Grid y values is set to 18
	constraints.gridy = 18;
    // The weightFormattedTextField size is set to 15
	weightFormattedTextField.setColumns(15);
    // The weightFormattedTextField is added to the GUI
	this.add(weightFormattedTextField, constraints);
    
	// ActionListener constructor is created
	ActionListener actionListener = new InnerActionListener();
	// The constraints Grid x values is set to 0
	constraints.gridx = 0;
	// The constraints Grid y values is set to 19
	constraints.gridy = 19;
	// An ActionListener is added to the clearButton
		clearButton.addActionListener(actionListener);
	// Color constructor is created
		Color yellow = new Color(255, 255, 0);
	    // The color of the clear button is now yellow
		clearButton.setBackground(yellow);
	// The clearButton is added to the GUI
	this.add(clearButton, constraints);
	// The constraints Grid x values is set to 1
	constraints.gridx = 1;
	// The constraints Grid y values is set to 19
	constraints.gridy = 19;
	// An ActionListener is added to the GUI
		submitButton.addActionListener(actionListener);
	// Color constructor is created
		Color green = new Color(0, 255, 0);
	// The submit button is now green	
		submitButton.setBackground(green);
	// The submitButton is added to the GUI
	this.add(submitButton, constraints);
    
}

 

/**
 * Clear the GUI components if clearButton is pressed and if submit button is pressed data is captured and written to the CSV file
 * @param ActionEvent e
 */
class InnerActionListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
	// THe if-statement checks if the clearButton is selected
	if(e.getSource() == clearButton) {
        // clearForm resets GUI
		clearForm();
	}
    // The if-statement checks if the submutButton is pressed
	if(e.getSource() == submitButton) {
    	// A new date format is created
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    	Date date = new Date();
    	// A String dateWritten is created with the new format date
    	String dateWritten = dateFormat.format(date);
    	// A String userGenderButtons is declared
    	String userGenderButtons;
    	// The if statement checks if any of the if statements is selected
    	if(!maleRadioButton.isSelected() &&!femaleRadioButton.isSelected() && !preferRadioButton.isSelected()) {
            // userGenderButtons is equal to null
    		userGenderButtons = null;
        }
        else {
            // The ActionCommand and Selection is checked for each radio button
        	userGenderButtons = radioButtonGroup.getSelection().getActionCommand();
        } 
    	String surveyResult = dateWritten + "," + firstNameTextField.getText() + "," + lastNameTextField.getText() + "," + phoneNumberTextField.getText() + "," + emailTextField.getText() + "," + 
    	 userGenderButtons + "," + (int)waterIntakeSpinner.getValue() + "," + (int)(mealSlider.getValue()) + "," + wheatCheckBox.isSelected() + "," + sugarCheckBox.isSelected() + "," + 
    			dairyCheckBox.isSelected() + "," +  walkComboBox.getSelectedItem() + "," + weightFormattedTextField.getText();
        // clearForm resets GUI
    	clearForm();
    	// surveyResults from the GUI is written to the new CSV file
    	fileHandler.writeResults(surveyResult);
    }
}

/**
 * Clears the components of GUI
 */
private void clearForm() {
	// firstNameTextField is set to null
	firstNameTextField.setText(null);
	// lastNameTextField is set to null
	lastNameTextField.setText(null);
	// phoneNumberTextField is set to null
	phoneNumberTextField.setText(null);
	// emailTextField is set to null
	emailTextField.setText(null);
	// radioButtonGroup clears the selection of the radio buttons
	radioButtonGroup.clearSelection();
	// mealSlider resets the value to 3
	mealSlider.setValue(3);
	// waterIntakeSpinner resets the value to 15
	waterIntakeSpinner.setValue(15);
	// wheatCheckBox is now not selected
	wheatCheckBox.setSelected(false);
	// sugarCheckBox is now not selected
	sugarCheckBox.setSelected(false);
    // dairyCheckBox is now not selected
	dairyCheckBox.setSelected(false);
	// walkComboBox is selected at the first option
	walkComboBox.setSelectedIndex(0);
	// weightFormattedTextField is set to null
	weightFormattedTextField.setText(null);
}
}
}