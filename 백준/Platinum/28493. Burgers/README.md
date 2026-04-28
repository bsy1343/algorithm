# [Platinum III] Burgers - 28493

[문제 링크](https://www.acmicpc.net/problem/28493)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 172, 정답: 53, 맞힌 사람: 42, 정답 비율: 39.252%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Kai the lobster is starting a burger chain selling burgers. He has $n$ ingredients to work with, which are labelled from $1$ to $n$. For each ingredient $i$, he has $x[i]$ portions of ingredient $i$.</p>

<p>He has two recipes for burgers. For each ingredient $i$, the first recipe requires $a[i]$ portions of ingredient $i$ and the second recipe requires $b[i]$ portions of ingredients $i$.</p>

<p>Can you help Kai compute the maximum total number of burgers he can make?</p>

### 입력

<p>The first line of input consists of one integer $n$, the number of different ingredients.</p>

<p>The second line consists of $n$ spaced integers $x[1], x[2], \dots , x[n - 1], x[n]$, the total number of portions Kai has of each ingredient.</p>

<p>The third line consists of $n$ spaced integers $a[1], a[2], \dots , a[n - 1], a[n]$, the number of portions of each ingredient for the first recipe.</p>

<p>The fourth line consists of $n$ spaced integers $b[1], b[2], \dots , b[n - 1], b[n]$, the number of portions of each ingredient for the second recipe.</p>

### 출력

<p>The output should contain a single integer on a single line, the largest number of burgers Kai can make.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 100\,000$</li>
	<li>$1 &le; x[i], a[i], b[i] &le; 10^9$</li>
</ul>