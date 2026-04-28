# [Platinum II] Interactive Permutation Guessing - 3503

[문제 링크](https://www.acmicpc.net/problem/3503)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 165, 정답: 25, 맞힌 사람: 22, 정답 비율: 14.474%

### 분류

브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>There is a permutation a of size n that you have to guess interactively.</p>

<p>You are allowed to make queries of the following kind. You output any permutation b of size n. The information given back to you is the length of the longest common subsequence of permutations a and b.</p>

### 입력

<p>The first line of the standard input contains integer n, the size of the permutation (1 &le; n &le; 40).</p>

<p>Each of the next lines of the standard input contains response to your query &mdash; the length of the longest common subsequence of the permutation queried by you and the permutation a.</p>

### 출력

<p>Each line of the standard output should contain a space-separated list of integers that form a permutation you&rsquo;re querying.</p>

<p>Your can make at most 5n<sup>2</sup> queries.</p>

<p>You must flush the standard output after printing each line. You must not print any lines after you receive the response n, just exit.</p>