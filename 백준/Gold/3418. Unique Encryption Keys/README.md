# [Gold I] Unique Encryption Keys - 3418

[문제 링크](https://www.acmicpc.net/problem/3418)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 52, 맞힌 사람: 30, 정답 비율: 52.632%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The security of many ciphers strongly depends on the fact that the keys are unique and never re-used. This may be vitally important, since a relatively strong cipher may be broken if the same key is used to encrypt several different messages.</p>

<p>In this problem, we will try to detect repeating (duplicate) usage of keys. Given a sequence of keys used to encrypt messages, your task is to determine what keys have been used repeatedly in some specified period.</p>

### 입력

<p>The input contains several cipher descriptions. Each description starts with one line containing two integer numbers M and Q separated by a space. M (1 &le; M &le; 1 000 000) is the number of encrypted messages, Q is the number of queries (0 &le; Q &le; 1 000 000).</p>

<p>Each of the following M lines contains one number K<sub>i</sub> (0 &le; K<sub>i</sub> &le; 2<sup>30</sup>) specifying the identifier of a key used to encrypt the i-th message. The next Q lines then contain one query each. Each query is specified by two integer numbers B<sub>j</sub> and E<sub>j</sub> , 1 &le; B<sub>j</sub> &le; E<sub>j</sub> &le; M, giving the interval of messages we want to check.</p>

<p>There is one empty line after each description. The input is terminated by a line containing two zeros in place of the numbers M and Q.</p>

### 출력

<p>For each query, print one line of output. The line should contain the string &ldquo;OK&rdquo; if all keys used to encrypt messages between B<sub>j</sub> and E<sub>j</sub> (inclusive) are mutually different (that means, they have different identifiers). If some of the keys have been used repeatedly, print one identifier of any such key.</p>

<p>Print one empty line after each cipher description.</p>