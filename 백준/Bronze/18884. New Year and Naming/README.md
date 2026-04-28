# [Bronze II] New Year and Naming - 18884

[문제 링크](https://www.acmicpc.net/problem/18884)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 282, 정답: 249, 맞힌 사람: 221, 정답 비율: 90.204%

### 분류

구현, 문자열

### 문제 설명

<p>Happy new year! The year 2020 is also known as <em>Year Gyeongja</em>&nbsp;(경자년, <em>gyeongja-nyeon</em>) in Korea. Where did the name come from? Let&#39;s briefly look at the <em>Gapja</em>&nbsp;system, which is traditionally used in Korea to name the years.</p>

<p>There are two sequences of $n$ strings $s_1, s_2, s_3, \ldots, s_{n}$ and $m$ strings $t_1, t_2, t_3, \ldots, t_{m}$. These strings contain only lowercase letters. There might be duplicates among these strings.</p>

<p>Let&#39;s call a concatenation of strings $x$ and $y$ as the string that is obtained by writing down strings $x$ and $y$ one right after another without changing the order. For example, the concatenation of the strings &quot;<code>code</code>&quot; and &quot;<code>forces</code>&quot;&nbsp;is the string &quot;<code>codeforces</code>&quot;.</p>

<p>The year 1 has a name which is the concatenation of the two strings $s_1$ and $t_1$. When the year increases by one, we concatenate the next two strings in order from each of the respective sequences. If the string that is currently being used is at the end of its sequence, we go back to the first string in that sequence.</p>

<p>For example, if $n = 3, m = 4, s = $ {&quot;<code>a</code>&quot;, &quot;<code>b</code>&quot;, &quot;<code>c</code>&quot;}, $t =$ {&quot;<code>d</code>&quot;, &quot;<code>e</code>&quot;, &quot;<code>f</code>&quot;, &quot;<code>g</code>&quot;}, the following table denotes the resulting year names. Note that the names of the years may repeat.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/18884.%E2%80%85New%E2%80%85Year%E2%80%85and%E2%80%85Naming/0b21b17f.png" data-original-src="https://upload.acmicpc.net/e8f0bd53-840b-4b1c-8511-f5c6e8702ef1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 415px; height: 200px;" /></p>

<p>You are given two sequences of strings of size $n$ and $m$ and also $q$ queries. For each query, you will be given the current year. Could you find the name corresponding to the given year, according to the <em>Gapja</em>&nbsp;system?</p>

### 입력

<p>The first line contains two integers $n, m$ ($1 \le n, m \le 20$).</p>

<p>The next line contains $n$ strings $s_1, s_2, \ldots, s_{n}$. Each string contains only lowercase letters, and they are separated by spaces. The length of each string is at least $1$ and at most $10$.</p>

<p>The next line contains $m$ strings $t_1, t_2, \ldots, t_{m}$. Each string contains only lowercase letters, and they are separated by spaces. The length of each string is at least $1$ and at most $10$.</p>

<p>Among the given $n + m$ strings may be duplicates (that is, they are not necessarily all different).</p>

<p>The next line contains a single integer $q$ ($1 \le q \le 2\,020$).</p>

<p>In the next $q$ lines, an integer $y$ ($1 \le y \le 10^9$) is given, denoting the year we want to know the name for.</p>

### 출력

<p>Print $q$ lines. For each line, print the name of the year as per the rule described above.</p>

### 힌트

<p>The first example denotes the actual names used in the <em>Gapja</em>&nbsp;system. These strings usually are either a number or the name of some animal.</p>