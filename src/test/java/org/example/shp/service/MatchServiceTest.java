package org.example.shp.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class MatchServiceTest {

    @Test()
    @DisplayName("첫번째 테스트")
    public void test() {
        // given
        long a = 10;
        long expected = 10;

        // when

        // then
        assertThat(a).isEqualTo(expected);
    }
}