/*
 * LegOSCWindowObserver.java
 *
 * Created on 19 de Julho de 2007, 10:48
 *
 *  LegOSC: An OSC gateway to control the NXT Brick.
 *  This is part of the DiABlu Project (http://diablu.jorgecardoso.org)
 *
 *  Copyright (C) 2007  Jorge Cardoso
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *  You can reach me by:
 *  email: jorgecardoso <> ieee org
 *  web: http://jorgecardoso.org
 */

package pt.citar.diablu.legosc;

/**
 *
 * @author Jorge Cardoso
 */
public interface LegOSCWindowObserver {
    
    public void configChanged(String legOSCPort, String appHostname, String appPort, String brickCOM, boolean autoSensor, int autoSensorInterval);
    
    
    /**
     * Indicates that the sensor mapping was changed in the LegOSC Window.
     */    
    public void legOSCWindowSensorMapChanged(String []sensorType);
    
    /**
     * Indicates that the Start button was pressed on the LegOSC Window.
     */
    public void legOSCWindowStartButtonPressed();
}
