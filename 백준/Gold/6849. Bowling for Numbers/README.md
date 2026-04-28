# [Gold III] Bowling for Numbers - 6849

[문제 링크](https://www.acmicpc.net/problem/6849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 22, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>At the Canadian Carnival Competition (CCC), a popular game is Bowling for Numbers. A large number of bowling pins are lined up in a row. Each bowling pin has a number printed on it, which is the score obtained from knocking over that pin. The player is given a number of bowling balls; each bowling ball is wide enough to knock over a few consecutive and adjacent pins.</p>

<p>For example, one possible sequence of pins is: <code>2 8 5 1 9 6 9 3 2</code></p>

<p>If the Alice was given two balls, each able to knock over three adjacent pins, the maximum score Alice could achieve would be 39, the sum of two throws: 2 + 8 + 5 = 15, and 9 + 6 + 9 = 24.</p>

<p>Bob has a strategy where he picks the shot that gives him the most score, then repeatedly picks the shot that gives him the most score from the remaining pins. This strategy doesn&rsquo;t always yield the maximum score, but it is close. On the test data, such a strategy would get a score of 20%.</p>

### 입력

<p>Input consists of a series of test cases. The first line of input is t, 1 &le; t &le; 10, indicating the number of test cases in the file. The first line of each test case contains three integers n k w. First is the integer n, 1 &le; n &le; 30000, indicating the number of bowling pins. The second integer, k, 1 &le; k &le; 500, giving the number of bowling balls available to each player. The third and final integer is w, 1 &le; w &le; n, the width of the bowling ball (the number of adjacent pins it can knock over). The next n lines of each test case each contain a single non-negative integer less than 10000, giving the score of the pins, in order. 20% of the test data will have size n &le; 50.</p>

### 출력

<p>For each test case, output the maximum achievable score by the player. This score is guaranteed to be less than one billion.</p>