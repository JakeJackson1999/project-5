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
the slider was set to any of the numbers, it would update the enter hamming distance textfield. For this row i also added a feature
that would say what the slider was set to which I will talk about later on.

row 3:
This row has the Show stations button which when pushed will display all of the stations with similar hamming distances in the textarea 
below it. To make this button work I added an action listener that would get the value that the slider was set to and the station that 
was selected in the drop down menu, which I will explain later on, to call a method that would return all of the stations that matched
the hamming distance. The stations would then be displayed in the text area below the button. I also set this button to the left side
of the panel by adding in a sub panel that had the borderLayout so I could set it to the west side of the panel. This button would also
have a message pop up on the right panel saying that it was "Showing Stations".

row 4:
This row only consisted of the textarea that diplays all of the stations as described in my row 4 discription. I made this 
text area scrollable because depending on the hamming distance and the station being compared, there can me many stations
with similar distances.

row 5:
This row consists of a label and a JComboBox, in this I added in a sub panel to help organize this contents for this row. The label describes what the item in the drop down menu is being used for, in this case it
lets the user know that the item in the drop down menu is what is being compared against all of the other stations. By default the drop
down menu has all of the default stations that were given inside of this. I did this by using a buffered reader to read in the given file and set its contents to an ArrayList, this however was done in another class which I will talk about later. Other stations can also be added to this drop down menu with the contents of row 8.

row 6:
for this row I did a similar thing as row 3 in that I created a subclass with a borderlayout so I could set the calculate hamming 
distance button to the left side of the panel. This button, using an action listener, took the station that was selected in the drop
menu in row 5 and used that to find the distance between that and all of the other stations. The distance would be shown in the next 
row by individual nodes. This button would alsohave a message pop up on the right panel saying that it was "Calculating Hamming
Distance".

row 7:
This row consists of a subpanel that stores 5 different JLabels and 5 different textfields with purpose of displaying the number of 
stations that share the same number of nodes as the station that is selected in the drop down menu. This was done by clicking the
calculate hamming distance button in row 6. By clicking the button, the individual contents would be displayed in the corresponding
textfields.

row 8:
this row consisted of a button and textarea that are used to add a new station the the list of stations in the drop down menu. This was
done by using an action listener on the button that when pressed it would take the station in the text area and determine if the station
had the right length and also checked if the station already existed in the list. If it already existed or if it had the wrong length,
a corresponding error message would appear on the right side. If it passed both of those conditions it would be added to the list of 
stations in the drop down menu.

The next and only other class I created was the HammingDistance class which was responsilbe for all of the calculations and reading in
the file of stations.

First I initialized the ArrayList of type string hammingArray, which would store all of the station names, compare and 
message variables of type String were also initialized. I then went on to creating different methods that had different purposes. 

The first method I created was the HammingDistance constructor which read in the file of station names and set the names to the
hammingArray ArrayList by using a buffered reader and a for loop to add each station to different indexes of hammingArray.

The next method was getStations which returned the ArrayList of station names that was originally used to set the contents of the drop
down menu in the GUI class.

The next method was the getSameStation that would return all of the stations with similar hamming distances as the given station and 
the slider value that determined what distance we were looking for. To do this I used a for loop to iterate through each station and
compare the individual characters to the given station's and if it matched the distance we were looking for it would be added to a new
arraylist. The new array list was then returned after looking at each station.

The next method was the addStation method which would add the given station to list of other stations. I first check to see if the 
station was already in the list, if it was a message would display saying that it was already in the list and would not add it to
the list. If the station was not in the existing list then it would be added. The updated list would then be returned.

The next method was the getMessage method which would return the message in the addStation method so it could be used in the GUI class. 

the final method of this class was the getDistanceBetween method. This method would return an int array with each index storing the 
number of stations that had a certain distance from the given stations. Similar to the getSimilar method, i used the given station and 
compared each character to all of the stations in the array and determine its distance from them. If the distance was 0 it would go in 
the first index of the array, if the distance was 1 it would go in the second index, if the distance was 2 it would go in the third
index, if the distance was 3 it would go in the fourth index, and if the distance was 4 it would go in the fifth index. The array was
returned and used to fill out the distance textfields in row 7 of the GUI class.

The last thing I did for this project was the creative section on the right side of the GUI frame. For this I decided to set up a
message board that would display certain messages depending on what the user did. I did this by splitting the panel into eight equal
parts and adding a label saying what that side was for and a button that would clear the panel to the first section of the panel. 
The rest of the panel was filled with text areas that would display messages to the user. I did this because if for example the user was 
trying to add a station that was already in the list or a station that didn't have the right length, I wanted the user to see why the station 
wasn't being added. The same goes for the enter hamming distance text field. I added some additional messages for the slider and when
the user pushed the show stations and calculate hd buttons. Finally, I added a clear messages button that would erase all of the 
messages except for the value of the slider. I decided to keep the slider message because in addition to the textbox and slider itself I
thought it would be nice for the user to see a message saying what the slider was set to. The clear message button used an action 
listener that would clear the appropriate text areas when pressed by setting each text area, excpet for the silder text area, to "" which would clear any messages. 

Below I have a link to the UML I created.

My UML: https://www.draw.io/?state=%7B%22ids%22:%5B%221NQDXVOTM4MeMH103X58rqnKiz9wdFWSI%22%5D,%22action%22:%22open%22,%22userId%22:%22107706223316087363629%22%7D#G1NQDXVOTM4MeMH103X58rqnKiz9wdFWSI
