# [Silver II] Cake - 24005

[문제 링크](https://www.acmicpc.net/problem/24005)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 138, 정답: 86, 맞힌 사람: 73, 정답 비율: 60.833%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Wheatley is at the best party in the world: it has infinitely many cakes! Each cake is a square with an integer side length (in cm). The party has infinitely many cakes of every possible integer side length. The cakes all have the same depth, so we will only consider their areas.</p>

<p>Wheatley is determined to eat one or more cakes that have a total combined area of&nbsp;<i>exactly</i>&nbsp;<b>N</b>&nbsp;cm<sup>2</sup>. But, since he is health-conscious, he wants to eat as few cakes as possible. Can you help him calculate the minimum number of cakes he can eat?</p>

### 입력

<p>The input starts with one line containing one integer&nbsp;<b>T</b>, which is the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow. Each case consists of one line with one integer&nbsp;<b>N</b>, which is the exact total cake area that Wheatley wants to eat.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of cakes that Wheatley can eat while eating the exact total area&nbsp;<b>N</b>.</p>

### 힌트

<p>In Sample Case #1, the only possible strategy is for Wheatley to eat three cakes of side length 1.</p>

<p>In Sample Case #2, Wheatley can eat one cake of side length 2, which requires fewer cakes than eating four cakes of side length 1.</p>

<p>In Sample Case #3, the best strategy is for Wheatley to eat one cake of side length 2 and one cake of side length 1.</p>