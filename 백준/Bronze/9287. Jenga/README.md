# [Bronze II] Jenga - 9287

[문제 링크](https://www.acmicpc.net/problem/9287)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 320, 정답: 234, 맞힌 사람: 204, 정답 비율: 72.857%

### 분류

구현, 문자열

### 문제 설명

<p>You are writing a computer program that will play Jenga, but first you need to figure out what boards are legal! Given a set of possible jenga boards, determine if each board is standing or if it has fallen over. A board falls over if any two consecutive blocks in a row (not column) are both missing, including within the top row. Assume that even two consecutive missing blocks on the top row makes the tower &rdquo;Fallen.&rdquo;</p>

### 입력

<p>The first line of input is the number of test cases that follow.</p>

<p>Each input case will start with a single integer representing the height of the Jenga tower. Each row in the tower appears on a single line and represents the blocks currently still in the board for that row. A &rsquo;1&rsquo; represents the block being present, a &rsquo;0&rsquo; represents a removed block.</p>

<p>There will be between 1 and 100 test cases, each with one jenga board of height between 1 and 20.</p>

### 출력

<p>For each case, output the line &ldquo;Case x:&rdquo; where x is the case number, on a single line followed by a single space and either the word &rdquo;Fallen&rdquo; or &rdquo;Standing&rdquo;</p>