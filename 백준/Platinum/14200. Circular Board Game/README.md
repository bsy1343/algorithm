# [Platinum I] Circular Board Game - 14200

[문제 링크](https://www.acmicpc.net/problem/14200)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 오일러 피 함수

### 문제 설명

<p>In the city of Bigwood there is a popular board game named Expo in which the board has a circular shape with N cells (1 to N). This game, same as many other board games, is played using tokens and a die. Players take turn to roll a K-sided die but the movement based on the number rolled is not that simple. The rule is that, assuming the side S has appeared, you move your token expo(S) cells forward. Where expo\( (S) = S^{(S-1)^{(S-2)^{...^{(2)^{(1)}}}}} \)&nbsp;. As the board is circular, the movement will continue when we reach to the last cell. The goal is to put your token in the last cell starting from the first one. (Ofcourse not in the middle of a movement)</p>

<p>Brad and Pete are playing this game. But as you may have noticed, for larger amounts of S, it might take a lifetime (or even much much more!) to move the token from one cell to the next one for expo(S) times. Actually, their grandfathers couldn&rsquo;t finish the game they had started when they were young in the traditional way. So Brad and Pete are playing on behalf of their grandfathers and expect you to help. Find the destination cell for a given side S on the die, starting from Mth cell.</p>

### 입력

<p>The first line of input contains one integer T (1 &le; T &le; 256), which is the number of test cases.</p>

<p>For each test case: three space separated integers S (1 &le; S &le; 10<sup>9</sup>), M, and N (1 &le; M &le; N &le; 10<sup>9</sup>).</p>

### 출력

<p>For each test, print a single line containing the place token lies on the board after the movement.</p>