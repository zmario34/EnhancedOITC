package tech.zmario.enhancedoitc.connector.storage;

import tech.zmario.enhancedoitc.common.objects.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LocalStorage {

    private final Map<UUID, User> users = new HashMap<>();

    public User getUser(UUID uuid) {
        return users.get(uuid);
    }

    public void addUser(User user) {
        users.put(user.getUuid(), user);
    }

    public void removeUser(UUID uuid) {
        users.remove(uuid);
    }
}
