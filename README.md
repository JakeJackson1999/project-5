# project-5

For this project I started by first making the GUI. I did this so that I could get a sense of where everything was suppose to be and how 
which things need to work with other objects such as textfields. I started making the GUI by making the frame and splitting the frame into
two sides, the left side and the right side. I did this so I could allocate all of the components shown in the documentation to the left 
side and leave the right side for the creative idea protion of the lab. I then broke up the required components of the left side into 
eight rows and used the GridLayout to make the panel into 8 different sections. I set the different components to their corresponding 
panel in order to make the GUI more organized and clean. 

row 1:
In this row I added a sub panel to better organize the components that were going into this section. Since there were only 2 things, the
JLabel for the entering hamming distance and the corresponding textfield, i made the gridlayout of this one to be a 1 by 2 grid so it would
add the components left to right. I later added an action listener to the textfield that would update the slider in the next row to the
number that was put in the text box. This action listener also checks to make sure the number in the textfield is also a number that is on
the slider, if it is not then an error message will appear which I will explain later on during the creative idea portion of this project.

row 2:
This row consists of the slider that shows the possible hammingdistances. For this I created the slide to have values of 1 through 4 while 
incrimenting each tick by one so it only showed numbers 1, 2, 3, and 4 on the slider. I also added a changeListener so that whenever 
the slider was set to any of the numbers, it would update the enter hamming distance textfield.

row 3:
This row has the Show stations button which when pushed will display all of the stations with similar hamming distances in the textarea 
below it. To make this button work I added an action listener that would get the value that the slider was set to and the station that 
was selected in the drop down menu, which I will explain later on, to call a method that would return all of the stations that matched
the hamming distance. The stations would then be displayed in the text area below the button.

row 4:
This row only consisted of the textarea that diplays all of the stations as described in my row 4 discription. 

row 5:
This row consists of a label and a JComboBox. The label describes what the item in the drop down menu is being used for, in this case it
lets the user know that the item in the drop down menu is what is being compared against all of the other stations. By default the drop
down menu has all of the default stations that were given inside of this. I did this by using a buffered reader to read in the given file
and set its contents to an ArrayList, this however was done in another class which I will talk about later. Other stations can also be 
added to this drop down menu with the contents of row 8.

row 6:


My UML: https://www.draw.io/?state=%7B%22ids%22:%5B%221NQDXVOTM4MeMH103X58rqnKiz9wdFWSI%22%5D,%22action%22:%22open%22,%22userId%22:%22107706223316087363629%22%7D#G1NQDXVOTM4MeMH103X58rqnKiz9wdFWSI
