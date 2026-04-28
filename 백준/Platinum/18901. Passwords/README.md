# [Platinum II] Passwords - 18901

[문제 링크](https://www.acmicpc.net/problem/18901)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 64 MB

### 통계

제출: 128, 정답: 35, 맞힌 사람: 28, 정답 비율: 28.866%

### 분류

방향 비순환 그래프, 자료 구조, 그래프 이론, 그리디 알고리즘, 우선순위 큐, 위상 정렬

### 문제 설명

<p>Johnny is obsessed with computer security: he has a different password for each website, he destroys the printouts, etc. And this is his demise: he realised that he accidentally put the sheet with his passwords to the paper shredder! But what are the odds, this sheet of paper was shredded so that each piece of paper corresponds to one column of text. Moreover, Johnny knows for sure that all passwords consist only of capital letters of English alphabet, they are pairwise different, they all have the same length and they were written down in the lexicographic order. Johnny numbered the columns and put them side by side but he is not sure whether the order he came up with is correct. Help Johnny--write a program that computes how to permute the columns of the text so that words written in rows are lexicographically ordered. If this is possible for many different permutations, choose the one which is lexicographically smallest.</p>

### 입력

<p>First line of the input contains two natural numbers $n, m$ ($1 \le n \cdot m \leq 10^6$), separated by spaces. The following $n$ lines contain $n$ words, one per line. Each one of them consists of $m$ capital letters of the English alphabet.</p>

### 출력

<p>You should write $m$ natural numbers in one line --- the permutation of the columns after which the words in rows are sorted lexicographically. If there are many such permutations, you should write the one that is lexicographically smallest among them. If there is no such a permutation, you should write &quot;<code>NIE</code>&quot; (Polish for &#39;no&#39;) instead.</p>

### 힌트

<p>In Sample 1, after permuting the columns in the described way we obtain words: &quot;<code>MTOEK</code>&quot;, &quot;<code>SKAIA</code>&quot;, which are lexicographically sorted.</p>

<p>In Sample 2 there is no way to permute the columns so that the words obtained in the rows are lexicographically sorted.</p>