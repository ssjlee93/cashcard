package com.example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/*
As part of TDD, writing our test first
 */
@JsonTest
public class CashCardJsonTest {
    @Autowired
    private JacksonTester<CashCard> json;

    // sample simple test
//    @Test
//    void myFirstTest() {
//        assertThat(1).isEqualTo(1);
//    }

    @Test
    void cashCardSerializationTest() throws IOException {
        CashCard cashCard = new CashCard(99L, 100.0);
        assertThat(this.json.write(cashCard)).isEqualToJson("expected.json");
        assertThat(this.json.write(cashCard)).hasJsonPathNumberValue("@.id");
        assertThat(this.json.write(cashCard)).extractingJsonPathNumberValue("@.id")
                .isEqualTo(99);
        assertThat(this.json.write(cashCard)).hasJsonPathNumberValue("@.amount");
        assertThat(this.json.write(cashCard)).extractingJsonPathNumberValue("@.amount")
                .isEqualTo(100.0);
    }

    @Test
    void cashCardDeserializationTest() throws IOException {
        String content = """
                {
                    "id": 99,
                    "amount": 100.0
                }
                """
                ;
        assertThat(this.json.parse(content)).isEqualTo(new CashCard(99L, 100.0));
        assertThat(this.json.parseObject(content).id()).isEqualTo(99L);
        assertThat(this.json.parseObject(content).amount()).isEqualTo(100.0);
    }
}
