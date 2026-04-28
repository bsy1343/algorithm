# [Gold V] Alphabet Contest - 22041

[문제 링크](https://www.acmicpc.net/problem/22041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 19, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

그리디 알고리즘

### 문제 설명

<p>Kindergarten graduates participate in English alphabet Olympiad. The main task is to pronounce English letters in the alphabet order without repeats.</p>

<p>Children can start to pronounce letters at any moment, even when the other participant has not finished yet. At the same time, the teacher writes all pronounced letters into one common string. The task is not easy for children and sometimes they make mistakes such as skipping letters. For each participant the number of mistakes they make is the number of skipped letters. The total number of mistakes for all children doesn&rsquo;t exceed $k$. If at some point participant is tired to pronounce letters, (s)he stops, and all the remaining letters are not counted as mistakes.</p>

<p>You know $k$ and the final string, your task is to find the minimum possible number of participants, or say that data is not correct.</p>

### 입력

<p>The first line contains a single integer $k$ ($0 \le k \le 1000$) &mdash; the maximum number of skipped letters.</p>

<p>The second line contains teacher&rsquo;s string $s$ &mdash; all pronounced letters. $s$ consists of capital English letters and the length of the string does not exceed $1000$.</p>

### 출력

<p>Print single word &ldquo;<code>Impossible</code>&rdquo; in a single line if the data is incorrect (it isn&rsquo;t possible to get this line with missing only $k$ letters), otherwise print single integer &mdash; the minimum number of participants in the Olympiad.</p>

### 힌트

<p>In the first example, the rows separately for each participant might look like this:</p>

<ul>
	<li>Participant 1: <code>ABD</code> &mdash; 1 mistake;</li>
	<li>Participant 2: <code>BC</code> &mdash; 1 mistake;</li>
	<li>Participant 3: <code>BD</code> &mdash; 2 mistakes;</li>
	<li>Participant 4: <code>AB</code> &mdash; 0 mistakes;</li>
</ul>

<p>In the second example:</p>

<ul>
	<li>Participant 1: <code>INO</code> &mdash; 12 mistakes;</li>
	<li>Participant 2: <code>NOP</code> &mdash; 13 mistakes;</li>
	<li>Participant 3: <code>LS</code> &mdash; 17 mistakes;</li>
	<li>Participant 4: <code>I</code> &mdash; 8 mistakes;</li>
</ul>