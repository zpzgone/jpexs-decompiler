/*
 *  Copyright (C) 2010-2013 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.asdec.types;

/**
 *
 * @author JPEXS
 */
public class MORPHLINESTYLE2 {

   public int startWidth;
   public int endWidth;
   public int startCapStyle;
   public int joinStyle;
   public static final int ROUND_JOIN = 0;
   public static final int BEVEL_JOIN = 1;
   public static final int MITER_JOIN = 2;
   public boolean hasFillFlag;
   public boolean noHScaleFlag;
   public boolean noVScaleFlag;
   public boolean pixelHintingFlag;
   public boolean noClose;
   public int endCapStyle;
   public static final int ROUND_CAP = 0;
   public static final int NO_CAP = 1;
   public static final int SQUARE_CAP = 2;
   public int miterLimitFactor;
   public RGBA startColor;
   public RGBA endColor;
   public MORPHFILLSTYLE fillType;
}
