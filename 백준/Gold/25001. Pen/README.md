# [Gold V] Pen - 25001

[문제 링크](https://www.acmicpc.net/problem/25001)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 115, 정답: 46, 맞힌 사람: 41, 정답 비율: 49.398%

### 분류

자료 구조, 문자열, 스택

### 문제 설명

<p>Johnny loves order and is very upset by untidy parentheses. Lately he saw a string &quot;<code>){([]</code>&quot;, which annoyed him since it was not a correct bracket sequence. Fortunately, Johnny had a pen in his pocket and he could add &#39;<code>(</code>&#39; at the beginning and &#39;<code>)}</code>&#39; at the end. Then he could sleep soundly again, since the string &quot;<code>(){([])}</code>&quot; is a correct bracket sequence.</p>

<p>Johnny took on repairing bracket sequences to be his life&#39;s mission. He will do this by adding new parentheses at the beginning and at the end of sequences he finds, so as to make them correct. Since his pen is running out of ink, Johnny would like to add the least possible number of brackets which will accomplish this. Help him! Write a program which will read a bracket sequence and either compute a shortest possible corrected bracket sequence for it and write it to standard output, or say that there is no way to correct it.</p>

<p>Correct bracket sequences are defined recursively as follows:</p>

<ul>
	<li>the empty sequence is a correct bracket sequence,</li>
	<li>if $S$ and $T$ are correct bracket sequences, then their concatenation $ST$ is also a correct bracket sequence,</li>
	<li>if $S$ is a correct bracket sequence, then $(S)$, $[S]$ and $\{S\}$ are all also correct bracket sequences.</li>
</ul>

### 입력

<p>The first and only line of input contains a nonempty sequence consisting of characters <code>(</code>, <code>)</code>, <code>[</code>, <code>]</code>, <code>{</code>, <code>}</code> and having length at most $1\,000\,000$; this is the bracket sequence that Johnny wants corrected.</p>

### 출력

<p>The output should contain a corrected input sequence. If there are many possible ways to correct the input sequence that have the same minimum length, output any of them.</p>

<p>If it is impossible to correct the input sequence, output the word <code>NIE</code>.</p>

### 힌트

<p>First example is the one from the problem statement.</p>

<p>In the second example, sequence cannot be repaired.</p>