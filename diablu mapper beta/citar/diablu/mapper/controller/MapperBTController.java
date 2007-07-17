/*
 * MapperBTController.java
 *
 * Created on 9 de Setembro de 2006, 15:04
 *
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

package citar.diablu.mapper.controller;

/**
 *
 * @author Nuno Rodrigues
 */
public interface MapperBTController {
    
    // start the discovery engine
    public void manualSearch();
    
    // define the engine state with the appropriate delay
    public void automatic(int btDelay);
    
    // stop the discovery engine
    public void stopSearch();        
        
    
}