/*
 *  Copyright (C) 2010-2015 JPEXS, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.tags.base;

import com.jpexs.decompiler.flash.SWF;
import com.jpexs.helpers.ByteArrayRange;

/**
 *
 * @author JPEXS
 */
public abstract class CharacterTag extends CharacterIdTag {

    protected String className;

    public CharacterTag(SWF swf, int id, String name, ByteArrayRange data) {
        super(swf, id, name, data);
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String getName() {
        String nameAppend = "";
        if (exportName != null) {
            nameAppend = ": " + exportName;
        }
        if (className != null) {
            nameAppend = ": " + className;
        }
        return tagName + " (" + getCharacterId() + nameAppend + ")";
    }

    @Override
    public String getExportFileName() {
        String result = super.getExportFileName();
        return result + (className != null ? "_" + className : "");
    }

    @Override
    public String getCharacterExportFileName() {
        return getCharacterId() + (exportName != null ? "_" + exportName : "") + (className != null ? "_" + className : "");
    }
}
