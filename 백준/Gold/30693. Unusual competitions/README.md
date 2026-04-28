# [Gold V] Unusual competitions - 30693

[문제 링크](https://www.acmicpc.net/problem/30693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 41, 맞힌 사람: 40, 정답 비율: 83.333%

### 분류

그리디 알고리즘, 애드 혹, 누적 합

### 문제 설명

<p>The teacher gave Dmitry&#39;s class a very strange task --- she asked every student to come up with a sequence of arbitrary length, consisting only of opening and closing brackets. After that all the students took turns naming the sequences they had invented. When the Dima&#39;s turn come, he suddenly realized that all his classmates got the right bracketed sequence, and whether he got the right bracketed sequence, he did not know.</p>

<p>Dima suspects now that he simply missed the word &quot;right&quot; in the task statement, so now he wants to save the situation by modifying his sequence slightly. More precisely, he can arbitrary amount of times (possibly zero) perform the <em>reorder</em> operation. The reorder operation consists of choosing an arbitrary subsegment of the sequence and then reordering all the characters in it in an arbitrary way. Such operation takes $l$ nanoseconds, where $l$ is the length of the subsegment being reordered. It&#39;s easy to see that reorder operation doesn&#39;t affect the number of opening and closing brackets doesn&#39;t change.</p>

<p>Since Dima will soon have to answer, he wants to make his sequence right as fast as possible. Help him to do this, or determine that it&#39;s impossible.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 10^6$) --- the length of Dima&#39;s sequence.</p>

<p>The second line contains string of length $n$, consisting of characters &quot;<code>(</code>&quot; and &quot;<code>)</code>&quot; only.</p>

### 출력

<p>Print a single integer --- the minimum number of nanoseconds to make the sequence right or &quot;<code>-1</code>&quot; if it is impossible to do so.</p>

### 힌트

<p>A bracketed sequence is called right if by inserting &quot;+&quot; and &quot;1&quot; you can get a well-formed mathematical expression from it. For example, sequences &quot;<code>(())()</code>&quot;, &quot;<code>()</code>&quot; and &quot;<code>(()(()))</code>&quot; are right, while &quot;<code>)(</code>&quot;, &quot;<code>(()</code>&quot; and &quot;<code>(()))(</code>&quot; are not.</p>

<p>In the first example we can firstly reorder the segment from first to the fourth character, replacing it with &quot;<code>()()</code>&quot;, the whole sequence will be &quot;<code>()()())(</code>&quot;. And then reorder the segment from the seventh to eighth character, replacing it with &quot;<code>()</code>&quot;. In the end the sequence will be &quot;<code>()()()()</code>&quot;, while the total time spent is $4 + 2 = 6$ nanoseconds.</p>