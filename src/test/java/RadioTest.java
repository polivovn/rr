import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void customizingTheCurrentStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void jumpForwardTo0After9() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void GoBackTo9After0() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void stationShouldNotBeMoreThan10() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMustNotBeBelow0() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theMaximumVolumeOfSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumVolumeOfSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundChouldNotDeMoreThan100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundMustNotDeDelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
