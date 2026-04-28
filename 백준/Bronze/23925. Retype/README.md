# [Bronze III] Retype - 23925

[문제 링크](https://www.acmicpc.net/problem/23925)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 437, 정답: 300, 맞힌 사람: 271, 정답 비율: 69.133%

### 분류

수학, 사칙연산

### 문제 설명

<p>After spending many hours studying for programming competitions, you decided to take a rest and play video games. You are currently playing an adventure game called Quick Start.</p>

<p>This game has&nbsp;<b>N</b>&nbsp;levels, and you are currently on the&nbsp;<b>K</b>-th level. Unfortunately, you just realized that to beat the boss at the final level, you will need a special sword, which can be picked up at level&nbsp;<b>S</b>. You have already completed that level, but you forgot to pick up the sword at that level.</p>

<p>Now you want to pick up the sword and finish the game in the least amount of time possible, and for that you have two options:</p>

<ol>
	<li>Restart the game and complete all levels again, starting from level 1.</li>
	<li>Move to previous levels until you reach level&nbsp;<b>S</b>, pick up the sword and complete all the remaining levels, starting from level&nbsp;<b>S</b>.</li>
</ol>

<p>Every time you enter a level you have to exit it, either by completing it and going to the next level or by moving to a previous level or by finishing / exiting the game. Exiting any level takes 1 minute. That means, for example, that it took you L minutes to complete the first L levels.</p>

<p>Your task is to discover which option would result in the least amount of total time to finish the game (including the time you have already spent).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>The first (and only) line of each test case contains three integers&nbsp;<b>N</b>,&nbsp;<b>K</b>&nbsp;and&nbsp;<b>S</b>: the number of levels in the game, the current level you are in, and the level where you have to pick up the sword, respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the least amount of total time to finish the game.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>S</b>&nbsp;&lt;&nbsp;<b>K</b>&nbsp;&lt;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, it took you 4 minutes to complete the first 4 levels and enter 5-th level. Restarting the game and completing all levels again would take 11 more minutes (1 minute to restart and 10 to complete 10 levels), which adds up to 15 minutes. The other option would be to move backwards until you reach level 2 (which would take 3 minutes), and then complete all the remaining levels (taking 9 more minutes), which would result in a total of 16 minutes.</p>

<p>In Sample Case #2, it took you 6 minutes to complete the first 6 levels and enter 7-th level. Moving backwards until reaching level 6 (one minute), and then completing all the remaining levels (5 minutes), would take a total of 12 minutes to finish the game.</p>