# [Silver IV] Missing Vowels - 30608

[문제 링크](https://www.acmicpc.net/problem/30608)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 161, 정답: 68, 맞힌 사람: 54, 정답 비율: 40.000%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>There are many ways to write a word on paper. For example, some writing systems, like Arabic and Hebrew, omit most vowels, although they write some of them.</p>

<p>In this problem, we will only consider strings consisting of English letters and hyphens. Letters &#39;<code>a</code>&#39;, &#39;<code>e</code>&#39;, &#39;<code>i</code>&#39;, &#39;<code>o</code>&#39;, &#39;<code>u</code>&#39;, and &#39;<code>y</code>&#39; are considered to be vowels, while hyphens and all other letters are considered to be consonants. All comparisons are case-insensitive: uppercase and lowercase versions of the same letter are considered equal.</p>

<p>You are given two strings $s$ and $f$, called the <em>short</em> name and the <em>full</em> name, respectively. Your task is to check whether the short name $s$ can be obtained from the full name $f$ by omitting some vowels (possibly none).</p>

### 입력

<p>The first line contains a single string $s$, denoting the short name.</p>

<p>The second line contains a single string $f$, denoting the full name.</p>

<p>Each string is non-empty and consists of at most $1000$ English letters and hyphens.</p>

### 출력

<p>Print &quot;<code>Same</code>&quot; if the short name $s$ can be obtained from the long name $f$ by omitting some vowels, and &quot;<code>Different</code>&quot; otherwise.</p>