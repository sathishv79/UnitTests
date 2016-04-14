package com.networked.unittests;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestClass {
    @Test
    public void test1() {
        assertThat(Long.valueOf(1), is(1L));
    }

    @Test
    public void test2() {
        Customer customer = new Customer("John", "First Road");
        assertThat(customer.getName(), is("John"));
        assertThat(customer.getAge(), is(nullValue()));
        assertThat(customer, allOf(
                hasProperty("name", is("John")),
                hasProperty("address", is("First Road"))
        ));
    }

    public static class Customer {
        private String name;
        private String address;
        private Integer age;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Customer(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


    }
}
