# [Silver II] Avoid Anagrams - 23534

[문제 링크](https://www.acmicpc.net/problem/23534)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 64 MB

### 통계

제출: 99, 정답: 54, 맞힌 사람: 40, 정답 비율: 48.780%

### 분류

수학, 조합론

### 문제 설명

<p>A pair of strings form an <em>anagram</em> if the first of them can be transformed into the second by a permutation of letters. For example, &quot;<code>listen</code>&quot; and &quot;<code>silent</code>&quot; form an anagram, but &quot;<code>master</code>&quot; and &quot;<code>nearest</code>&quot; do not.</p>

<p>A subsequence of string $s = s_1 s_2 \dots s_n$ is a string $s_{a_1} s_{a_2} \dots s_{a_k}$, where $1 \le a_1 &lt; a_2 &lt; \dots &lt; a_k \le n$.</p>

<p>Given string $s$, determine the maximal number of its subsequences which can be written down such that no pair of strings in the resulting list does form an anagram.</p>

### 입력

<p>A single line containing string $s$ of at most $60$ small latin letters.</p>

### 출력

<p>Print one number --- the answer.</p>

### 힌트

<p>In the first sample the resulting list of strings may be: &quot;<code>j</code>&quot;, &quot;<code>o</code>&quot;, &quot;<code>jj</code>&quot;, &quot;<code>jo</code>&quot;, &quot;<code>oo</code>&quot;, &quot;<code>jjo</code>&quot;, &quot;<code>joo</code>&quot;, &quot;<code>jojo</code>&quot;.</p>