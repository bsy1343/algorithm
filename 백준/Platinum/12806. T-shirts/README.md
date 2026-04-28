# [Platinum III] T-shirts - 12806

[문제 링크](https://www.acmicpc.net/problem/12806)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Ilya, Ivan and Vlad participate as a team for a long time. There were n contests this year, each one gifting t-shirts. Let&#39;s enumerate t-shirts from 1 to n according to the contest they were given at.</p>

<p>Every boy has a favorite t-shirt, less favorite one, and so on. Specifically, every boy has a permutation of size n which describes the list of his preferences in decreasing order: the first one is the most favorite and the last one is the least favorite.</p>

<p>They are preparing for the next contest and want wear the same t-shirts for it. But their preferences differ, so they decided to do the following: they&#39;ve written numbers from 1 to n on the paper and then take turns crossing out numbers from this list. The last remaining number will be the number of t-shirt they will be wearing.</p>

<p>Everyone is acting optimally, meaning they are trying to make that the number left is the highest possible on their list. Help the team to determine the number of t-shirt which they&#39;ll end up wearing.</p>

### 입력

<p>Input contains multiple test cases. First linne contains number t (1 &le; t &le; 50) &ndash;&mdash; number of test cases. Next lines contain the description of test cases.</p>

<p>Each test is described as follows: first line contains number n (1 &le; n &le; 13) &mdash; number of different t-shirts.</p>

<p>Next line contains a permutation of numbers from 1 to n &mdash; Ilya&#39;s list of preferences.</p>

<p>Next line contains a permutation of numbers from 1 to n &mdash; Ivan&#39;s list of preferences.</p>

<p>Next line contains a permutation of numbers from 1 to n &mdash; Vlad&#39;s list of preferences.</p>

<p>Moves are performed in the following order: first Ilya, then Ivan, then Vlad.</p>

### 출력

<p>For each test case output a single number &mdash; number of t-shirt that Ilya, Ivan and Vlad are going to wear at the contest.</p>

<p>&nbsp;</p>