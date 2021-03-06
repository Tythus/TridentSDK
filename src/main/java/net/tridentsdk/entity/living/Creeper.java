/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
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

package net.tridentsdk.entity.living;

import net.tridentsdk.entity.decorate.Hostile;

/**
 * Represents a Creeper
 *
 * @author TridentSDK Team
 */
public interface Creeper extends Hostile {
    /**
     * Whether or not this creeper is powered (Struck by lightning)
     *
     * @return whether or not this creeper is powered
     */
    boolean isElectric();

    /**
     * Set whether or not this creeper is powered
     *
     * @param powered whether the creeper should be powered or not
     */
    void setElectric(boolean powered);

    /**
     * Gets this creeper's explosion radius
     *
     * @return this creeper's explosion radius
     */
    float explosionRadius();

    /**
     * Sets this creeper's explosion radius
     *
     * @param rad radius to change to
     */
    void setExplosionRadius(float rad);
}
