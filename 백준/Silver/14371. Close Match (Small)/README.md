# [Silver V] Close Match (Small) - 14371

[문제 링크](https://www.acmicpc.net/problem/14371)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 42, 맞힌 사람: 37, 정답 비율: 56.061%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>You are attending the most important game in sports history. The Oceania Coders are playing the Eurasia Jammers in the Centrifugal Bumble-Puppy world finals. Unfortunately, you were sleep deprived from all the anticipation, so you fell asleep during the game!</p>

<p>The scoreboard is currently displaying both scores, perhaps with one or more leading zeroes (because the scoreboard displays a fixed number of digits). While you were asleep, some of the lights on the scoreboard were damaged by strong ball hits, so one or more of the digits in one or both scores are not being displayed.</p>

<p>You think close games are more exciting, and you would like to imagine that the scores are as close as possible. Can you fill in all of the missing digits in a way that minimizes the absolute difference between the scores? If there is more than one way to attain the minimum absolute difference, choose the way that minimizes the Coders&#39; score. If there is more than one way to attain the minimum absolute difference while also minimizing the Coders&#39; score, choose the way that minimizes the Jammers&#39; score.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;cases follow. Each case consists of one line with two non-empty strings&nbsp;C&nbsp;and&nbsp;J&nbsp;of the same length, composed only of decimal digits and question marks, representing the score as you see it for the Coders and the Jammers, respectively. There will be at least one question mark in each test case.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 200.</li>
	<li>C&nbsp;and&nbsp;J&nbsp;have the same length.</li>
	<li>1 &le; the length of&nbsp;C&nbsp;and&nbsp;J&nbsp;&le; 3.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: c j</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1),&nbsp;<code>c</code>&nbsp;is&nbsp;C&nbsp;with the question marks replaced by digits, and&nbsp;<code>j</code>&nbsp;is&nbsp;J&nbsp;with the question marks replaced by digits, such that the absolute difference between the integers represented by&nbsp;<code>c</code>&nbsp;and&nbsp;<code>j</code>&nbsp;is minimized. If there are multiple solutions with the same absolute difference, use the one in which&nbsp;<code>c</code>&nbsp;is minimized; if there are multiple solutions with the same absolute difference and the same value of&nbsp;<code>c</code>, use the one in which&nbsp;<code>j</code>&nbsp;is minimized.</p>

### 힌트

<p>In sample case #4, note that the answer cannot be&nbsp;<code>15 10</code>; that minimizes the absolute difference, but does not minimize the Coders&#39; score. Nor can the answer be&nbsp;<code>05 10</code>; that minimizes the absolute difference and the Coders&#39; score, but does not minimize the Jammers&#39; score.</p>