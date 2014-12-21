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
package net.tridentsdk.factory;

import net.tridentsdk.Coordinates;
import net.tridentsdk.base.Substance;
import net.tridentsdk.meta.nbt.CompoundTag;
import net.tridentsdk.meta.nbt.CompoundTagBuilder;
import net.tridentsdk.meta.nbt.NBTBuilder;
import net.tridentsdk.util.Vector;
import net.tridentsdk.window.inventory.Inventory;
import net.tridentsdk.window.inventory.Item;
import net.tridentsdk.window.trade.ItemPair;
import net.tridentsdk.world.ChunkLocation;
import net.tridentsdk.world.World;

/**
 * Factory creation methods for basic API classes
 *
 * @author The TridentSDK Team
 */
public final class TridentFactory {
    private TridentFactory() {
    }

    /* Location */

    /**
     * Creates a Location with no world <p>The created Location's co-ordinates will default to 0.</p>
     *
     * @return Location created instance with no world
     */
    public static Coordinates createLocation() {
        return Coordinates.create(null, 0.0, 0.0, 0.0);
    }

    /**
     * Creates a Location with no specified co-ordinates <p>The created Location's co-ordinates will default to 0.</p>
     *
     * @param world World in which the Location is targeting
     * @return Location with the specified world, but no co-coordinates
     */
    public static Coordinates createLocation(World world) {
        return Coordinates.create(world, 0.0, 0.0, 0.0);
    }

    /**
     * Creates a Location with the specified co-ordinates
     *
     * @param world World
     * @param x     X co-ordinate
     * @param y     Y co-ordinate
     * @param z     Z co-ordinate
     * @return Location
     */
    public static Coordinates createLocation(World world, double x, double y, double z) {
        return Coordinates.create(world, x, y, z);
    }

    /**
     * Creates a Location with the specified co-ordinates and direction
     *
     * @param world World
     * @param x     X co-ordinate
     * @param y     Y co-ordinate
     * @param z     Z co-ordinate
     * @param yaw   Yaw absolute rotation on the x-plane, in degrees
     * @param pitch Pitch absolute rotation on the y-plane, in degrees
     * @return Location
     */
    public static Coordinates createLocation(World world, double x, double y, double z, float yaw, float pitch) {
        return Coordinates.create(world, x, y, z, yaw, pitch);
    }

    /**
     * Creates a Location from an existing Location, and a direction
     *
     * @param location Location
     * @param yaw      Yaw absolute rotation on the x-plane, in degrees
     * @param pitch    Pitch absolute rotation on the y-plane, in degrees
     * @return Location
     */
    public static Coordinates createLocation(Coordinates location, float yaw, float pitch) {
        return Coordinates.create(location.getWorld(), location.getX(), location.getY(), location.getZ(), yaw, pitch);
    }

    /* World */

    public static ChunkLocation createChunkLoc() {
        return ChunkLocation.create(0, 0);
    }

    public static ChunkLocation createChunkLoc(int x, int z) {
        return ChunkLocation.create(x, z);
    }

    /* Utils */

    public static Vector createVector() {
        return new Vector(0, 0, 0);
    }

    public static Vector createVector(double x, double y, double z) {
        return new Vector(x, y, z);
    }

    public static Vector createVector(int x, int y, int z) {
        return new Vector(x, y, z);
    }

    /* Inventory */

    public static Item createItemStack(Substance mat) {
        return new Item(mat);
    }

    public static Item createItemStack(Substance mat, short quantity) {
        return new Item(mat, quantity);
    }

    public static Inventory createInventory() {
        return null; // do this properly
    }

    /* Trade */

    public static ItemPair createItemPair() {
        return new ItemPair(null, null);
    }

    public static ItemPair createItemPair(Item itemStack) {
        return new ItemPair(itemStack);
    }

    public static ItemPair createItemPair(Item itemStack, Item itemStack0) {
        return new ItemPair(itemStack, itemStack0);
    }

    /* NBT */

    public static CompoundTagBuilder<NBTBuilder> createNbtBuilder(String tagName) {
        return NBTBuilder.newBase(tagName);
    }

    public static CompoundTagBuilder<NBTBuilder> createNbtBuilder(CompoundTag base) {
        return NBTBuilder.fromBase(base);
    }

    /* Board not ready */

    /* Possibly create packets */
}