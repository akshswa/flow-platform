/*
 * Copyright 2018 fir.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.api.events;

import com.flow.platform.domain.v1.Cmd;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Event represent cmd been enqueue
 *
 * @author yang
 */
public class CmdSentEvent extends ApplicationEvent {

    @Getter
    private final Cmd cmd;

    public CmdSentEvent(Object source, Cmd cmd) {
        super(source);
        this.cmd = cmd;
    }
}