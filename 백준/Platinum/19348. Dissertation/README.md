# [Platinum II] Dissertation - 19348

[문제 링크](https://www.acmicpc.net/problem/19348)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 30, 맞힌 사람: 21, 정답 비율: 39.623%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 최장 공통 부분 수열 문제

### 문제 설명

<p>A professor suspects that a student&#39;s dissertation was plagiarized from a certain book. In order to test that, he wants to compute the longest common subsequence of&nbsp;the dissertation and the book. He doesn&#39;t have a program to do it, so he asked you to write such a program as an assignment for the algorithms course.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 10^9$). The descriptions of the test cases follow.</p>

<p>Each test case is given on two lines. The first line contains a string of length between $1$ and $1\,000\,000$ consisting of lowercase Latin letters: the text of the book. The second line contains a string of length between $1$ and $1000$ consisting of lowercase Latin letters: the text of the dissertation.</p>

<p>The sum of lengths of the books in all test cases is at most $10\,000\,000$. The sum of lengths of the dissertations in all test cases is at most $30\,000$.</p>

### 출력

<p>For each test case, output the length of the longest common subsequence of the book and the dissertation.</p>