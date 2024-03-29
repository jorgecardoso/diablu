/*
 * OUTWatcher.java
 *
 * Created on 11 de Maio de 2006, 17:18
 *
 * Copyright (C) 2006 CITAR
 * This is part of the DiABlu Project
 * http://diablu.jorgecardoso.org
 * Created by Jorge Cardoso(jccardoso@porto.ucp.pt) & Nuno Rodrigues(nunoalexandre.rodrigues@gmail.com)
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

package citar.diablu.com.interfaces;

import java.util.Vector;
import java.net.InetSocketAddress;

/**
 *
 * @author nrodrigues
 */
public interface OUTWatcher {
    
    public void sendAddDevices(Vector aDevices, InetSocketAddress addr);
    
    public void sendRemoveDevices(Vector rDevices, InetSocketAddress addr);
    
    public void sendDeviceList(Vector lDevices, InetSocketAddress addr);
         
    public void sendDeviceCount(int dCount, InetSocketAddress addr);
    
    public void sendNamesChanged(Vector nDevices, InetSocketAddress addr);
    
}
