package org.example.oct15.testngexamples.testng;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestNG001 {

    @BeforeSuite
    void demo1()
    {
        System.out.println("BeforeSuite");
        // Read data from excel code
    }


    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void test1(){
        System.out.println("Rashi");
        // Test case
    }

    @Test
    void test2(){
        System.out.println("Raksha");
        // Test case
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }


    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
        // Close the SQL Database here
    }

//    public static class AllAnnotation {
//
//
//      //  @BeforeSuite
//    //    void demo1() {
//    //        System.out.println("BeforeSuite");
//    //        // Read data from excel code
//    //    }
//    //
//    //    @BeforeTest
//    //    void demo2() {
//    //        System.out.println("BeforeTest");
//    //    }
//    //
//    //    @BeforeClass
//    //    void demo3() {
//    //        System.out.println("BeforeClass");
//    //    }
//    //
//        @BeforeMethod
//       void demo4() {
//            System.out.println("BeforeMethod");
//        }
//
//        @Test
//        void test1() {
//            System.out.println("Testing 1");
//            //actual Test case
//        }
//
//
//        @Test
//         void test2() {
//            System.out.println("Testing 2");
//            //actual Test case
//        }
//
//
//
//        @AfterMethod
//        void demo6() {
//            System.out.println("AfterMethod");
//        }
//
//    //    @AfterClass
//    //    void demo7() {
//    //        System.out.println("AfterClass");
//    //    }
//    //
//    //    @AfterTest
//    //    void demo8() {
//    //        System.out.println("AfterTest");
//    //    }
//    //
//    //    @AfterSuite
//    //    void demo9() {
//    //        System.out.println("AfterSuite");
//    //        // Close the SQL Database here
//    //    }
//
//
//    }

  //  public static class TestNG003 {

//        @Test
//        public void test1() {
//            System.out.println("Test 1");
//
//            // Verification
//            // Assertion - Expect Result == Actual Result
//
//            // Two Types of Assertion suported by the TesTNG
//
//            // Soft
//            // Hard
//
//            // Rest Assured
//            // id = 1 ,  name = "Pramod" with your Expected Result
//
//            // Rest Assured
//            String name = "Pramod";
//
//    //        SoftAssert softAssert = new SoftAssert();
//    //        softAssert.assertEquals("Pramod",name);
//    //       System.out.println(" Please execute me");
//    //        softAssert.assertAll();
//
//
//            // 80% - Hard Why?  You want to fail the testcase when something is not expected!!
//            Assert.assertEquals("pramod", name, "Failed due to mismatch");
//            System.out.println("End");
//
//        }
//    }

    public static class Rest001 {


        public void Request()

        {
            RestAssured
                    .given().baseUri("https://restful-booker.herokuapp.com/ping").when().get().then().log().all().statusCode(200);
        }
    }
}
