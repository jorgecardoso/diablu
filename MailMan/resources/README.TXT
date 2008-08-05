=====================================
DiABlu Mailman 0.5 (README FILE)
=====================================

LEGAL NOTICE
------------
/*
 * DiABlu Mailman
 * Copyright (C) 2008-2009, CITAR (Research Centre for Science and Technology in Art)
 *
 * This is part of the DiABlu Project, created by Jorge Cardoso - http://diablu.jorgecardoso.eu
 *
 *
 * Contributors:
 * - Pedro Santos <psantos@porto.ucp.pt>
 * - Jorge Cardoso <jccardoso@porto.ucp.pt>
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program;
 * if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307 USA
 */





Running
-------
In most cases just double click the DiABluMailman.jar file.

You can also run it in the command line as "java -jar DiABluMailman.jar".

To run without the GUI use the comand line "java -jar DiABluMailman.jar -hideGUI".





OSC Messages
------------


The list of currently implemented OSC messages that Mailman uses is the following.

Messages your application can listen to:

/Diablu/Mailman/ReceivePath ssss - uuid, original file name, mimetype (may be empty), path to file.

/Diablu/Mailman/OK s - path. Sent in response to other messages to indicate success.

/Diablu/Mailman/SendFailed s[s...s] - path, list of devices. Sent in response to other messages. Indicates which devices didn't recieve the content.

/Diablu/Mailman/WrongArguments. Sent in response to other messages to indicate that the message arguments are incorrect.

/Diablu/Mailman/GroupDefinition sss[s...s] - major device class, minor device classe, brand, list of devices. Sent in response to the "/Diablu/Mailman/GetGroup" message and indicates a list of devices that belong to a certain the group.


Messages that Mailman understans:

/Diablu/Mailman/SendPath -

/Diablu/Mailman/SendPathToGroup -

/Diablu/Mailman/SendPathWithMime -

/Diablu/Mailman/SendPathWithMimeToGroup - 

/Diablu/Mailman/Broadcast -

/Diablu/Mailman/GetGroup - 

/Diablu/Mailman/GetSentFiles -

/Diablu/Mailman/GetRecievedFiles -


Download
--------

You can check the news & download the latest version at:
http://diablu.jorgecardoso.eu


Thanks
------
Hannz Holger Rutz for the NetUtil (OSC) library.