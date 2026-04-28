# [Platinum IV] Corn Fields - 6196

[문제 링크](https://www.acmicpc.net/problem/6196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 59, 맞힌 사람: 53, 정답 비율: 51.456%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Farmer John has purchased a lush new rectangular pasture composed of M by N (1 &lt;= M &lt;= 12; 1 &lt;= N &lt;= 12) square parcels. He wants to grow some yummy corn for the cows on a number of squares. Regrettably, some of the squares are infertile and can&#39;t be planted. Canny FJ knows that the cows dislike eating close to each other, so when choosing which squares to plant, he avoids choosing squares that are adjacent; no two chosen squares share an edge. He has not yet made the final choice as to which squares to plant.</p>

<p>Being a very open-minded man, Farmer John wants to consider all possible options for how to choose the squares for planting. He is so open-minded that he considers choosing no squares as a valid option! &nbsp;Please help Farmer John determine the number of ways he can choose the squares to plant.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: M and N</li>
	<li>Lines 2..M+1: Line i+1 describes row i of the pasture with N space-separated integers indicating whether a square is fertile (1 for fertile, 0 &nbsp;for infertile)</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: One integer: the number of ways that FJ can choose the squares modulo 100,000,000.</li>
</ul>

### 힌트

<p>There are four ways to plant only on one squares (1, 2, 3, or 4), three ways to plant on two squares (13, 14, or 34), 1 way to plant on three squares (134), and one way to plant on no squares. 4+3+1+1=9.</p>