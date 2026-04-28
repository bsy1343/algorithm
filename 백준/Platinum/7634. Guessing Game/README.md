# [Platinum II] Guessing Game - 7634

[문제 링크](https://www.acmicpc.net/problem/7634)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 61, 맞힌 사람: 44, 정답 비율: 53.659%

### 분류

그래프 이론, 최단 경로, 벨만–포드

### 문제 설명

<p>Jaehyun has two lists of integers, namely a<sub>1</sub>, . . . , a<sub>N</sub> and b<sub>1</sub>, . . . , b<sub>M</sub>. Jeffrey wants to know what these numbers are, but Jaehyun won&rsquo;t tell him the numbers directly. So, Jeffrey asks Jaehyun a series of questions of the form &ldquo;How big is a<sub>i</sub> + b<sub>j</sub>?&rdquo; Jaehyun won&rsquo;t even tell him that, though; instead, he answers either &ldquo;It&rsquo;s at least c,&rdquo; or &ldquo;It&rsquo;s at most c.&rdquo; (Right, Jaehyun simply doesn&rsquo;t want to give his numbers for whatever reason.) After getting Jaehyun&rsquo;s responses, Jeffrey tries to guess the numbers, but he cannot figure them out no matter how hard he tries. He starts to wonder if Jaehyun has lied while answering some of the questions. Write a program to help Jeffrey.</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with a line containing three positive integers N, M, and Q, which denote the lengths of the Jaehyun&rsquo;s lists and the number of questions that Jeffrey asked. These numbers satisfy 2 &le; N + M &le; 1,000 and 1 &le; Q &le; 10,000. Each of the next Q lines is of the form <code>i j &lt;= c</code> or <code>i j &gt;= c</code>. The former represents a<sub>i</sub> + b<sub>j</sub> &le; c, and the latter represents a<sub>i</sub> + b<sub>j</sub> &ge; c. It is guaranteed that &minus;1,000 &le; c &le; 1,000.</p>

### 출력

<p>For each test case, print a single line that contains &ldquo;Possible&rdquo; if there exist integers a1, . . . , aN and b1, . . . , bM that are consistent with Jaehyun&rsquo;s answers, or &ldquo;Impossible&rdquo; if it can be proven that Jaehyun has definitely lied (quotes added for clarity).</p>