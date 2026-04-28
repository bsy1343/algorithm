# [Silver V] 6789 - 17508

[문제 링크](https://www.acmicpc.net/problem/17508)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 469, 정답: 193, 맞힌 사람: 167, 정답 비율: 40.241%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Jaehyun likes digits. Among the 10 digits, 6, 7, 8, and 9 are his favorite. Therefore, he made a special card set consisting of only 6, 7, 8 and 9.&nbsp;</p>

<p>Currently, Jaehyun has $N\times M$ cards. Jaehyun wants to make a magical $N$ by $M$ matrix of cards. Each row of the matrix should contain $M$ cards. He already arranged his cards in a shape of $N$ by $M$ matrix.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/56e283c5-7f2b-43f0-bbcb-81c15d7bba03/-/preview/" /><br />
&nbsp;</p>

<p style="text-align: center;"><em>Figure 1. Initial state, not point symmetric.</em></p>

<p>To be a magic matrix, the matrix must be point symmetrical: Rotating the matrix 180 degrees results in the same original matrix. For example, 8 is point symmetrical with itself, and 6 and 9 are point symmetrical&nbsp;with each other.</p>

<p>Jaehyun doesn&#39;t want to switch the position of the cards, so his goal is to make the matrix point symmetrical by only rotating the cards in their original positions.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2628d8c3-19f3-474c-a59b-95b79b7ad5b3/-/preview/" /></p>

<p style="text-align: center;"><em>Figure 2. After rotating two cards, they are point symmetric.</em></p>

<p>Find the minimum number of cards you have to turn to make a magic matrix.</p>

### 입력

<p>The first line contains two integers, $N$ and $M$. ($1 \le N,\ M \le 500$)</p>

<p>Each of the next $N$ lines contains a string of $M$ characters which denotes the numbers written in each card. It is guaranteed that each character is one of 6, 7, 8&nbsp;or 9.</p>

### 출력

<p>Print the minimum number of cards you have to turn to make a magic matrix in the first line. If it is not possible to make a magic matrix, print &quot;-1&quot;. (without quotes)</p>