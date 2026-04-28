# [Silver III] Coverity Crossword - 11326

[문제 링크](https://www.acmicpc.net/problem/11326)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 20, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

브루트포스 알고리즘, 구현, 문자열

### 문제 설명

<p>What is your crossword telling you today? Can you scan your code for patterns, in the time it takes to get a cup of coffee? You have just landed a job at Coverity, and your first challenge is to demonstrate your searching and testing abilities. Can you find and analyze code that looks like random strings? Up to ten secret messages are hidden in a crossword of size 8x8, and your task is to determine if they are all present in the code or not.</p>

<p>Secrets are hidden horizontally, from left to right, vertically, from top to bottom, and diagonally, from top-left to bottom-right.</p>

### 입력

<p>The first line of the input contains an integer&nbsp;<strong>T</strong>&nbsp;(1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100), the number of test cases. Then follow&nbsp;<strong>T</strong>&nbsp;test cases. Each case starts with an integer&nbsp;<strong>N</strong>&nbsp;on a line (1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10), the number of words we are searching for. Each of the next&nbsp;<strong>N</strong>&nbsp;lines contains a non-empty string of length at most 8 characters over the alphabet [A-Z], the words we are searching for. Then follows 8 lines, each containing a string of exactly 8 characters over the alphabet [A-Z], the<strong>i</strong>&#39;th horizontal line in the crossword, from left to right, starting from the topmost line down to the bottommost line.</p>

### 출력

<p>For each test case print on a separate line either &quot;Yes&quot; or &quot;No&quot;, the answer to the question &quot;Is it the case that all&nbsp;<strong>N</strong>&nbsp;messages are present in the crossword?&quot;</p>