# [Platinum V] Cowties - 27061

[문제 링크](https://www.acmicpc.net/problem/27061)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>N cows (3 &le; N &le; 100) are eating grass in the middle of a field. So that they don&#39;t get lost, Farmer John wants to tie them together in a loop so that cow i is attached to cows i-1 and i+1. Note that cow N will be tied to cow 1 to complete the loop.</p>

<p>Each cow has a number of grazing spots she likes and will only be happy if she ends up situated at one of these spots. Given that Farmer John must ensure the happiness of his cows when placing them, compute the shortest length of rope he needs to tie them all in a loop. It is possible for different parts of the loop to cross each other.</p>

### 입력

<ul>
	<li>Line 1: The integer N.</li>
	<li>Lines 2..N+1: Each line describes one cow using several space-separated integers. The first integer is the number of locations S (1 &le; S &le; 40) which are preferred by that cow. This is followed by 2*S integers giving the (x,y) coordinates of these locations respectively. The coordinates lie in the range -100..100.</li>
</ul>

### 출력

<p>A single line containing a single integer, 100 times the minimum length of rope needed (do not perform special rounding for this result).</p>