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
package com.jpexs.decompiler.flash.abc.avm2.parser.script;

import com.jpexs.decompiler.flash.abc.avm2.model.AVM2Item;
import com.jpexs.decompiler.flash.helpers.GraphTextWriter;
import com.jpexs.decompiler.graph.GraphTargetItem;
import com.jpexs.decompiler.graph.model.LocalData;

/**
 *
 * @author JPEXS
 */
public class SlotAVM2Item extends AVM2Item {

    private final int namespace;

    private final boolean isStatic;

    public String var;

    public GraphTargetItem type;

    public String customNamespace;

    public int line;

    public String pkg;

    public int getNamespace() {
        return namespace;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public SlotAVM2Item(String pkg, String customNamespace, boolean isStatic, int namespace, String var, GraphTargetItem type, GraphTargetItem value, int line) {
        super(null, NOPRECEDENCE);
        this.pkg = pkg;
        this.line = line;
        this.namespace = namespace;
        this.value = value;
        this.isStatic = isStatic;
        this.var = var;
        this.type = type;
        this.customNamespace = customNamespace;
    }

    @Override
    public GraphTextWriter appendTo(GraphTextWriter writer, LocalData localData) throws InterruptedException {
        return writer; //TODO
    }

    @Override
    public GraphTargetItem returnType() {
        return type;
    }

    @Override
    public boolean hasReturnValue() {
        return true;
    }
}
