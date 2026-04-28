# [Gold III] Flipping Switches - 13765

[문제 링크](https://www.acmicpc.net/problem/13765)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

(분류 없음)

### 문제 설명

<p>Having recently moved into a new home, you discover that its wiring is a bit messed up. A number of lights are controlled by a number of switches in a peculiar way. Every switch has two states: up and down (there is no use calling them on and off ). Some experiments reveal that each light depends on three switches, at least one of which must be in the correct state for the light to shine. Of course, the opposite state of the same switch might be correct for another light.</p>

<p>Your first impulse was to set the switches so that as many lights as possible shine. However, your cook (who is an expert in circuitry) seems to have the opinion that this would be quite hard, so you settle for a more modest aim. Set the switches to a state so that flipping any single switch to its opposite state does not make more lights shine than before the flip.</p>

### 입력

<p>The input will contain multiple test cases.</p>

<p>The first line of input contains the number of test cases t (1 &le; t &le; 25).</p>

<p>Each test case starts with a line containing the number of lights m (1 &le; m &le; 4 000) and the number of switches n (3 &le; n &le; 4 000). Each of the next m lines contains three distinct integers s<sub>1</sub>, s<sub>2</sub> and s<sub>3</sub> (1 &le; s<sub>i</sub> &le; n), each of which is preceded by a + or - character. Line i gives the switches that control light i and their correct positions, where + means up and - means down. Light i will shine if at least one of the specified switches is set to its correct position.</p>

### 출력

<p>Output one line with a setting of the switches so that flipping any one of them does not make more lights shine. Give the setting as a string of n characters, each of which is + or -. Character i specifies the state of switch i. If more than one setting satisfies the constraints, display any such setting.</p>