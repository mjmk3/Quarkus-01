package org.acme.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.Model.User;

/**
 * @author MJ Makki
 * @version 1.0
 * @license SkyLimits, LLC (<a href="https://www.skylimits.tech">SkyLimits, LLC</a>)
 * @email m.makki@skylimits.tech
 * @since long time ago
 */

public interface UserRepository extends PanacheRepository<User> {
}
