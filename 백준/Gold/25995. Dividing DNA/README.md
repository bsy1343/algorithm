# [Gold II] Dividing DNA - 25995

[문제 링크](https://www.acmicpc.net/problem/25995)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 152, 정답: 61, 맞힌 사람: 58, 정답 비율: 42.647%

### 분류

그리디 알고리즘, 두 포인터

### 문제 설명

<p>At the Bacteria And Protein Centre, you own a large collection of DNA. In fact, new strands of DNA come in all the time. To organise the vast amount of data, you identify each piece by its unique substrings: substrings that do not already occur in the database.</p>

<p>Your database can quickly determine whether a given piece of DNA occurs as a substring in the database or not. Naturally, if a certain DNA string is found in the database, it also contains all its substrings.</p>

<p>You now want to determine the <em>uniqueness</em> of a given piece of DNA: the maximal number of disjoint substrings it contains that are absent from the database.</p>

<p>You are given the length $n$ of the query string $q_1\dots q_n$, and you can repeatedly ask the database whether it contains the substring $q_i\dots q_{j-1}$.</p>

<p>As an example, consider the first sample interaction. In this case, the database contains strings &quot;<code>TGC</code>&quot; and &quot;<code>CT</code>&quot;, and the query string is &quot;<code>CTGCAA</code>&quot;. It has uniqueness $3$, because it can be split into the new substrings &quot;<code>CTGC</code>&quot;, &quot;<code>A</code>&quot;, and &quot;<code>A</code>&quot;. The new substring &quot;<code>CTGC</code>&quot; cannot be split up further: for example, the subdivision &quot;<code>CT</code>&quot; and &quot;<code>GC</code>&quot; is not allowed, because both substrings occur (possibly as substrings) in the database. Note that the actual characters in the string are not used in the interaction.</p>

<p>You may use at most $2n$ queries to the database.</p>

### 입력



### 출력

