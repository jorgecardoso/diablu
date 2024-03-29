=====================================
DiABlu Mailman 0.5 (README FILE)
=====================================

LEGAL NOTICE
------------

DiABlu Mailman
Copyright (C) 2008-2009, CITAR (Research Centre for Science and Technology in Art)

This is part of the DiABlu Project, created by Jorge Cardoso - http://diablu.jorgecardoso.eu

Contributors:
- Pedro Santos <psantos@porto.ucp.pt>
- Jorge Cardoso <jccardoso@porto.ucp.pt>

This program is free software; you can redistribute it and/or modify it under the terms of the
GNU General Public License as published by the Free Software Foundation; either version 2 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program;
if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
MA 02111-1307 USA
 





Running
-------
In most cases just double click the DiABluMailman.jar file.

You can also run it in the command line as "java -jar DiABluMailman.jar".

To run without the GUI use the comand line "java -jar DiABluMailman.jar -hideGUI".


Mailman has been tested on Windows and Mac OS X.


OSC Messages
------------


The list of currently implemented OSC messages that Mailman uses is the following.

Messages your application can listen to:

/Diablu/Mailman/ReceivePath ssss
Arguments: uuid, friendly name, original file name, mimetype (may be empty), path to file.

/Diablu/Mailman/OK s
Atguments: path.
Description: Sent in response to other messages to indicate success.

/Diablu/Mailman/SendFailed s[s...s] 
Arguments: path, list of devices
Description: Sent in response to other messages. Indicates which devices didn't receive the content.

/Diablu/Mailman/WrongArguments
Description: Sent in response to other messages to indicate that the message arguments are incorrect.

/Diablu/Mailman/GroupDefinition sss[s...s]
Arguments: major device class, minor device classe, brand, list of devices
Description: Sent in response to the "/Diablu/Mailman/GetGroup" message and indicates a list of devices that belong to a certain the group.

/Diablu/Mailman/FileNotFound
Description: Indicates that the file to be sent does not exist.

/Diablu/Mailman/SentToDevices [s...s]
Arguments: list of devices
Description: Indicates which devices received a given file.
   
/Diablu/Mailman/NoFilesSent
Description: Indicates that the file was not sent to any device.

/Diablu/Mailman/FilesSent [s...s]
Arguments: list of files
Description: Indicates the files that were sent to a device.

/Diablu/Mailman/UnknownDevice
Description: Indicates that the device specified is not known (malformed device UUID)

/Diablu/Mailman/NoFilesReceived
Description: Indicates that no file was received from the device.

/Diablu/Mailman/FilesSent [s...s]
Arguments: list of files
Description: Indicates the files that were received from a device.

Messages that Mailman understans:

/Diablu/Mailman/SendPath s[s...s]

Arguments: path to file, list of devices
Description: Sends a file indicated by a path to a device, or list o devices.
Responses:
    - /Diablu/Mailman/OK
    - /Diablu/Mailman/SendFailed
    - /Diablu/Mailman/WrongArguments
    - /Diablu/Mailman/FileNotFound


/Diablu/Mailman/SendPathToGroup ssss 

Arguments: path to file, major device classe, minor device class, brand
Description: Sends a file to a group o devices defined by de major device classe, minor device class and brand.
Responses: 
    - /Diablu/Mailman/WrongArguments 
    - /Diablu/Mailman/SentToDevices
    - /Diablu/Mailman/NoFilesSent


/Diablu/Mailman/SendPathWithMime ss[s...s]

Arguments: path to file, mimetype, list of devices
Description: Similar to /Diablu/Mailman/SendPath but enables the user to define the mimetype of the file.
Responses:
    - /Diablu/Mailman/OK
    - /Diablu/Mailman/SendFailed
    - /Diablu/Mailman/WrongArguments
    - /Diablu/Mailman/FileNotFound


/Diablu/Mailman/SendPathWithMimeToGroup sssss

Arguments: path to file, mimetype, major device classe, minor device class, brand
Description: Similar to /Diablu/Mailman/SendPathToGroup but enables the user to define the mimetype of the file.
Responses: 
    - /Diablu/Mailman/WrongArguments 
    - /Diablu/Mailman/SentToDevices
    - /Diablu/Mailman/NoFilesSent

/Diablu/Mailman/Broadcast sssii 
Arguments: path to file, major device class, minor device class, brand, total time, time between discoveries
Description: Sends the desired file to every device that is found that belongs to the defined group. The file will be sent 
Responses: 
    - /Diablu/Mailman/WrongArguments 
    - /Diablu/Mailman/SentToDevices
    - /Diablu/Mailman/NoFilesSent

/Diablu/Mailman/BroadcastWithMime ssssii
Arguments: path to file, mimetype, major device class, minor device class, brand, total time, time between discoveries
Description: Sends the desired file to every device that is found that belongs to the defined group. The file will be sent 
Responses: 
    - /Diablu/Mailman/WrongArguments 
    - /Diablu/Mailman/SentToDevices
    - /Diablu/Mailman/NoFilesSent

/Diablu/Mailman/GetGroup sss
Arguments: major device class, minor device class, brand
Description: Searches for all devices that belong to the specified group
Respones:
    - /Diablu/Mailman/GroupDefinition
    - /Diablu/Mailman/WrongArguments 
 

/Diablu/Mailman/GetSentFiles s
Arguments: device
Description: Returns all files sent to a device
Respones:
    - /Diablu/Mailman/FilesSent
    - /Diablu/Mailman/NoFilesSent
    - /Diablu/Mailman/UnknownDevice
    - /Diablu/Mailman/WrongArguments 

/Diablu/Mailman/GetReceivedFiles s 
Arguments: device
Description: Returns all files received from a device
Respones:
    - /Diablu/Mailman/FilesReceived
    - /Diablu/Mailman/NoFilesReceived
    - /Diablu/Mailman/UnknownDevice
    - /Diablu/Mailman/WrongArguments 



Device Classes
--------

The following are the possible values for "major" and "minor" parameters in the OSC messages. 
This list was taken from the "Bluetooth for Java" book by Bruce Hopkins.

Major Classes 
	- Minor Class(es)

"Simulated" 
	- No minor class
"Misc. major device" 
	- No minor class
"Computer"
	- "Unassigned, misc"
	- "Desktop"
	- "Server"
	- "Laptop"
	- "Sub-laptop"
	- "PDA"
	- "Watch size"
	- "Not classified"
"Phone"
	- "Unassigned, misc"
	- "Cellular"
	- "Household cordless"
	- "Smartphone"
	- "Not classified"
"LAN/network acess point"
	- "Fully available"
	- "1-17% utilized"
	- "17-33% utilized"
	- "33-50% utilized"
	- "50-76% utilized"
	- "76-83% utilized"
	- "83-99% utilized"
	- "100% utilized, no service available"
	- "Not classified"
"Audio/video device"
	- "Unassigned, misc"
	- "Headset"
	- "Hands-free device"
	- "Microphone"
	- "VCR"
	- "Video game system"
	- "Not classified"
"Computer peripheral"
	- "Keyboard"
	- "Mouse, trackball, etc"
	- "Remote control"
	- "Not classified"
"Imaging Device"
	- "Display device"
	- "Camera"
	- "Scanner"
	- "Printer"
	- "Not classified"
"Unclassified major device"
	- No minor class
"Not classified"
	- No minor class


Files
-----

The following files are required for this application to work properly. The first
three files are distributed with the aplication, others are created during runtime.

mimetypes.txt - This file contais a list of mimetypes, and the coorrespondent file 
extensions. If this file isn't present the default mimetype of a file will not be 
present in the "SentPath" type of messages.

oui.txt - This file contains a list of manufacturers of Bluetooth devices, as well
as their assigned Bluetooth addresses. If this file is not present, the "SendtoGroup"
type of messages will not work. The "GetGroup" message will allways return zero
results.

README.txt - This file.


The following files are created by the application, if they are not present:

log.txt - This file contains a registry of all events that took place while the
application was working. Each line corresponds to an even and has the following
structure:

	logType [date@time] message.


devices.txt - This file contains the information about every device that interacted
with the application, ass well as any files sent or received by them.

config.ini - This file contains the properties of the application and can be used
to configure the followin parameters:
	
	- Repository directory
	- Remote application hostname
	- Remote application port
	- Mailman port



Download
--------

You can check the news & download the latest version at:
http://diablu.jorgecardoso.eu


Known Issues
------------
Mailman isn't able to receive files that have illegal characters in the filename.


Thanks
------
Hannz Holger Rutz for the NetUtil (OSC) library.
