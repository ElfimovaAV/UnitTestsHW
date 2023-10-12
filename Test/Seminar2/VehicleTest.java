package Seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.Car;
import seminar2.Motorcycle;
import seminar2.Vehicle;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;
    @BeforeEach
    void setUp(){
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Kawasaki", "NINJA H2R", 2020);
    }

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /**
     * - Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public  void testCarHaveFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * - Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void testMotorcycleHaveTwoWheels () {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    /**
     *  Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testCarSpeedInTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testMotorcycleSpeedInTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0)
     */
    @Test
    public void testCarSpeedInParkingMode() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    public void testMotorcycleSpeedInParkingMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }




}