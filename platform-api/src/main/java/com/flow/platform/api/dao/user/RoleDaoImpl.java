/*
 * Copyright 2017 flow.ci
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
package com.flow.platform.api.dao.user;

import com.flow.platform.api.domain.user.Role;
import com.flow.platform.core.dao.AbstractBaseDao;
import org.springframework.stereotype.Repository;

/**
 * @author lhl
 */

@Repository(value = "roleDao")
public class RoleDaoImpl extends AbstractBaseDao<Integer, Role> implements RoleDao {

    @Override
    protected Class<Role> getEntityClass() {
        return Role.class;
    }

    @Override
    protected String getKeyName() {
        return "id";
    }

    @Override
    public Role get(final String name) {
        return execute(session -> session.createQuery("from Role r where r.name = ?", getEntityClass())
            .setParameter(0, name)
            .uniqueResult());
    }
}