# [Gold II] Picking Up the Dice - 32021

[문제 링크](https://www.acmicpc.net/problem/32021)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

조합론, 다이나믹 프로그래밍, 배낭 문제, 수학

### 문제 설명

<p>Two players are playing a game with a set of $K$ six-sided dice. One player calls out a number in the range $K\ldots 6K$ and the other tries to roll that number.  After the first roll, the player is allowed to pick up any number ($0\ldots K$) of dice and re-roll them.</p>

<p>Given the number of dice, the target number the player wants to roll, and the set of numbers the player obtained on the first roll, what number of dice should the player pick up to maximize their chances of getting the target number on the second roll?</p>

### 입력

<p>Input begins with a line containing $2$ integers, $K$, the number of dice, and $T$, the target number.  $2 \leq K \leq 24$, $K \leq T \leq 6K$.</p>

<p>The next line contains $K$ integers, indicating the numbers that were rolled on each of the dice on the first roll.   All will be integers in the range $1\ldots 6$.</p>

### 출력

<p>Print a single line containing an integer denoting the number of dice that the roller should pick up and re-roll in order to maximize the chances of getting an overall sum of $T$. (The roller will be able to choose which dice to pick up, but you are only asked to print the number of dice, not which ones.)</p>

<p>If there are more than one numbers of dice that can be picked up to achieve the same probability of getting to $T$, print the smallest such value.</p>