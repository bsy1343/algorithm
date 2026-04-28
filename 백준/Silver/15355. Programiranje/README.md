# [Silver II] Programiranje - 15355

[문제 링크](https://www.acmicpc.net/problem/15355)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 228, 정답: 132, 맞힌 사람: 114, 정답 비율: 64.407%

### 분류

누적 합

### 문제 설명

<p>Little Leticija is preparing for a programming exam. Even though she has solved a lot of tasks, there&rsquo;s one still left unsolved, so she is asking you for help. You are given the word S and Q queries. In each query, you are given positive integers A, B, C and D. Let&rsquo;s say that word X consists of letters between positions A and B in word S, and word Y from letters between positions C and D in word S. For each query, you must answer if it is possible to somehow rearrange the letters in word Y and obtain word X.</p>

### 입력

<p>The first line of input contains the word S (1 &le; |S| &le; 50 000). |S| denotes the number of characters in word S, which consists of lowercase letters of the English alphabet. The second line of input contains the positive integer Q (1 &le; Q &le; 50 000).</p>

<p>Each of the following Q lines contains four integers A, B, C i D (1 &le; A &le; B &le; |S| and 1 &le; C &le; D &le; |S|) from the task.</p>

### 출력

<p>For each query, output &ldquo;DA&rdquo; (Croatian for yes) if it is possible, and &ldquo;NE&rdquo; (Croatian for no) if it is not.</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​third​ ​test​ ​case: In the first query, X=&rdquo;vovo&rdquo;, and Y=&rdquo;devo&rdquo;. In the second query, X=&rdquo;odev&rdquo;, and Y=&rdquo;devo&rdquo;.</p>