# [Platinum V] Bowling for Numbers++ - 6852

[문제 링크](https://www.acmicpc.net/problem/6852)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Recall that at the Canadian Carnival Competition (CCC), a popular game was Bowling for Numbers. A large number of bowling pins were lined up in a row. Each bowling pin had a number printed on it, which was the score obtained from knocking over that pin. The player was given a number of bowling balls; each bowling ball was wide enough to knock over a few consecutive and adjacent pins.</p>

<p>For example, one possible sequence of pins was:</p>

<p>2 8 5 1 9 6 9 3 2</p>

<p>If Alice was given two balls, each able to knock over three adjacent pins, the maximum score Alice could achieve would be 39, the sum of two throws: 2+8+5 = 15, and 9+6+9 = 24.</p>

<p>Since many, including you, have mastered the art of throwing balls at pins, the old and wise members of the Canadian Carnival Competition Committee have decided to make the game slightly more difficult by introducing the concept of penalty pins.</p>

<p>Penalty pins are pins with a negative score, such that a player&rsquo;s score decreases when they are knocked over. This can change the player&rsquo;s strategy, as the player can use the empty spaces to the left and right of the pins, as well as spaces created by previous throws, to avoid hitting penalty pins. Consider the following example:</p>

<p>2 8 -5 3 5 8 4 8 -6</p>

<p>If Alice was given three balls, each able to knock over three adjacent pins, the maximum score Alice could achieve would be 38, the sum of three throws: 2 + 8, 3 + 5 + 8, and 4 + 8. Alice&rsquo;s first throw is deliberately to the left and catches only the leftmost two pins, avoiding the -5. Alice&rsquo;s second throw hits 3 5 8, and her third throw catches the remaining 4 8, going through the space created by her second throw to avoid the -6.</p>

<p>Bob has a strategy where he picks the shot that gives him the most score, then repeatedly picks the shot that gives him the most score from the remaining pins. This strategy doesn&rsquo;t always yield the maximum score, but is close. On the test data, such a strategy would get a score of 20%.</p>

### 입력

<p>Input consists of a series of test cases. The first line of input is t, 1 &lt;= t &lt;= 10, indicating the number of test cases in the file.</p>

<p>The first line of each test case contains three integers. First is the integer n, 1 &lt;= n &lt;= 10000, indicating the number of bowling pins. The second integer, k, 1 &lt;= k &lt;= 500, giving the number of bowling balls available to each player. The third and final integer is w, 1 &lt;= w &lt;= 100, the width of the bowling ball (the number of adjacent pins it can knock over).</p>

<p>The next n lines of each test case each contain a single integer giving the score of the pins, in order. The scores are in the range &minus;10000...10000 inclusive.</p>

<p>20% of the test data will have size n &le; 50.</p>

### 출력

<p>For each test case, output the maximum achievable score by the player. This score is guaranteed to be less than one billion.</p>