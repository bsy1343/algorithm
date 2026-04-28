# [Bronze I] DISPLEJ - 8977

[문제 링크](https://www.acmicpc.net/problem/8977)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 382, 정답: 248, 맞힌 사람: 211, 정답 비율: 66.984%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>The game &quot;display&quot; is gaining popularity in casinos around the world. The game is run on a big screen visible to all players. A single integer is displayed on the screen, which changes every minute.&nbsp;</p>

<p>The players attempt to determine the sum of K consecutive numbers, starting from the B-th displayed number. More precisely, if X<sub>n</sub> is the n-th number displayed (starting with X<sub>1</sub>), then players try to determine the sum X<sub>B</sub> + X<sub>B+1</sub> + ... + X<sub>B+K&minus;1</sub>.&nbsp;</p>

<p>Mirko is thrilled with this game and often spends five or six hours calculating sums and growing in debt. Recently he realized that the numbers on screen follow a precise pattern; the same sequence of N integers repeats over and over.&nbsp;</p>

<p>Help Mirko to find the sought sum, given the sequence of number repeating.&nbsp;</p>

### 입력

<p>The first line contains three integers N, K and B, 1 &le; N &le; 100, 1 &le; K &le; 100, 1 &le; B &le; 10<sup>9</sup>.&nbsp;</p>

<p>The second line contains N non-negative integers less than 100, separated by spaces. This is the sequence that keeps repeating on screen.&nbsp;</p>

### 출력

<p>Output the sum on a single line.&nbsp;</p>

### 힌트

<p>In the first example, the tenth number displayed is 0, followed by 6 and 8. The sum is 14.</p>