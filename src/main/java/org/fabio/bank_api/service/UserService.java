package org.fabio.bank_api.service;

import org.fabio.bank_api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
