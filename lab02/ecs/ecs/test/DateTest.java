import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class DateTest{

  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }
  @Test
  void nextDate_sample1() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }
  @Test
  void nextDate_sample2() {
    Date d = new Date(2005,04,15);
    assertEquals(new Date(2005,04,16), d.nextDate());
  }
  @Test
  void nextDate_sample3() {
    Date d = new Date(1901,07,20);
    assertEquals(new Date(1901,07,21), d.nextDate());
  }
  @Test
  void nextDate_sample4() {
    Date d = new Date(3456,03,27);
    assertEquals(new Date(3456,03,28), d.nextDate());
  }
  @Test
  void nextDate_sample5() {
    Date d = new Date(1500,02,17);
    assertEquals(new Date(1500,02,18), d.nextDate());
  }
  @Test
  void nextDate_sample6() {
    Date d = new Date(1700,06,29);
    assertEquals(new Date(1700,06,30), d.nextDate());
  }
  @Test
  void nextDate_sample7() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }
  @Test
  void nextDate_sample8() {
    Date d = new Date(3453,01,29);
    assertEquals(new Date(3453,01,30), d.nextDate());
  }
  @Test
  void nextDate_sample9() {
    Date d = new Date(444,02,29);
    assertEquals(new Date(444,03,01), d.nextDate());
  }
  @Test
  void nextDate_sample_a() {
    Date d = new Date(2005,04,30);
    assertEquals(new Date(2005,05,01), d.nextDate());
  }
  @Test
  void nextDate_sampl2_b() {
    Date d = new Date(3453,01,30);
    assertEquals(new Date(3453,01,31), d.nextDate());
  }
  @Test
  void nextDate_sample_c() {
    Date d = new Date(3456,03,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }
  @Test
  void nextDate_sample_d() {
    Date d = new Date(1901,10,31);
    assertEquals(new Date(1901,11,01), d.nextDate());
  }
  @Test
  void nextDate_sample_e() {
    Date d = new Date(3453,01,31);
    assertEquals(new Date(3453,02,01), d.nextDate());
  }
  @Test
  void nextDate_sample_f() {
    Date d = new Date(3456,12,31);
    assertEquals(new Date(3457,01,01), d.nextDate());
  }
  @Test
  void nextDate_sample_g() {
    Date d = new Date(1500,02,31);
    assertEquals("IllegalArgumentException", d.nextDate());
  }
  @Test
  void nextDate_sample_h() {
    Date d = new Date(1500,02,29);
    assertEquals("IllegalArgumentException", d.nextDate());
  }
  @Test
  void nextDate_sample_i() {
    Date d = new Date(-1,10,20);
    assertEquals("IllegalArgumentException", d.nextDate());
  }
  @Test
  void nextDate_sample_j() {
    Date d = new Date(1458,15,12);
    assertEquals("IllegalArgumentException", d.nextDate());
  }
  @Test
  void nextDate_sample_k() {
    Date d = new Date(1975,06,-50);
    assertEquals("IllegalArgumentException", d.nextDate());
  }
  

}