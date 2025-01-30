package com.primeux.skillflowai.user.logic.model;

import java.util.Set;

public record User(Long id, String username, String password, Set<Role> roles) {
}
