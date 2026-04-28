# [Gold II] Football - 7678

[문제 링크](https://www.acmicpc.net/problem/7678)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 12, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Consider a single-elimination football tournament involving 2<sup>n</sup> teams, denoted 1, 2, . . ., 2<sup>n</sup>. In each round of the tournament, all teams still in the tournament are placed in a list in order of increasing index. Then, the first team in the list plays the second team, the third team plays the fourth team, etc. The winners of these matches advance to the next round, and the losers are eliminated. After n rounds, only one team remains undefeated; this team is declared the winner.</p>

<p>Given a matrix P = [p<sub>ij</sub>] such that p<sub>ij</sub> is the probability that team i will beat team j in a match determine which team is most likely to win the tournament.</p>

### 입력

<p>The input test file will contain multiple test cases. Each test case will begin with a single line containing n (1 &le; n &le; 7). The next 2<sup>n</sup> lines each contain 2<sup>n</sup> values; here, the jth value on the ith line represents p<sub>ij</sub>. The matrix P will satisfy the constraints that p<sub>ij</sub> = 1.0 &minus; p<sub>ji</sub> for all i &ne; j, and p<sub>ii</sub> = 0.0 for all i. The end-of-file is denoted by a single line containing the number -1.</p>

<p>Note that each of the matrix entries in this problem is given as a floating-point value. To avoid precision problems, make sure that you use either the double data type instead of float.</p>

### 출력

<p>The output file should contain a single line for each test case indicating the number of the team most likely to win. To prevent floating-point precision issues, it is guaranteed that the difference in win probability for the top two teams will be at least 0.01.</p>

### 힌트

<p>In the test case above, teams 1 and 2 and teams 3 and 4 play against each other in the first round; the winners of each match then play to determine the winner of the tournament. The probability that team 2 wins the tournament in this case is:</p>

<p>P(2 wins) = P(2 beats 1)P(3 beats 4)P(2 beats 3) + P(2 beats 1)P(4 beats 3)P(2 beats 4)<br />
= p<sub>21</sub>p<sub>34</sub>p<sub>23</sub> + p<sub>21</sub>p<sub>43</sub>p<sub>24</sub> = 0.9 &middot; 0.6 &middot; 0.4 + 0.9 &middot; 0.4 &middot; 0.5<br />
= 0.396.</p>

<p>The next most likely team to win is team 3, with a 0.372 probability of winning the tournament.</p>