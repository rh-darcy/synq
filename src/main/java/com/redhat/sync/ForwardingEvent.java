/*
 Copyright 2013 Red Hat, Inc. and/or its affiliates.

 This file is part of synq.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.redhat.sync;

import java.util.concurrent.TimeUnit;

public class ForwardingEvent<T> implements Event<T> {
    private final Event<? extends T> event;
    
    public ForwardingEvent(Event<? extends T> event) {
        this.event = event;
    }

    @Override
    public T waitUpTo(long timeout, TimeUnit unit) {
        return event.waitUpTo(timeout, unit);
    }
}
