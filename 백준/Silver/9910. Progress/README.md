# [Silver II] Progress - 9910

[문제 링크](https://www.acmicpc.net/problem/9910)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 46, 맞힌 사람: 37, 정답 비율: 88.095%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>An arithmetic progression is an ascending sequence a of n numbers a<sub>1</sub> &lt; a<sub>2</sub> &lt; ... &lt; a<sub>n</sub> such that the difference of two consecutive elements is always the same. &nbsp;Example: The sequence 11 &lt; 21 &lt; 31 &lt; 41 &lt; 51 is an arithmetic progression. &nbsp;A subsequence of an ascending sequence a of n numbers is a sequence b of m numbers, where m &le; n, such that every element of b occurs in a. &nbsp;Example: The sequences 21 &lt; 41 &lt; 51, 11 &lt; 41 and 11 &lt; 21 &lt; 31 &lt; 41 &lt; 51 are three subsequences of the sequence 11 &lt; 21 &lt; 31 &lt; 41 &lt; 51.</p>

<p>Given is an ascending sequence c of k numbers c<sub>1</sub> &lt; c<sub>2</sub> &lt; ... &lt; c<sub>k</sub>, the task is to find the length of a longest arithmetic progression that is a subsequence of c. &nbsp;Note that there may be more than one such longest arithmetic progression, but the length is unique.</p>

<p>Example: Let c be the sequence 1 &lt; 2 &lt; 4 &lt; 5 &lt; 7 &lt; 8 &lt; 9 &lt; 11 &lt; 13 &lt; 14 &lt; 15 &lt; 16. &nbsp;There are many arithmetic progressions that are subsequences of c, such as 2 &lt; 4, 2 &lt; 8 &lt; 14, and 13 &lt; 14 &lt; 15 &lt; 16. &nbsp;The longest arithmetic progression that is a subsequence of c is 5 &lt; 7 &lt; 9 &lt; 11 &lt; 13 &lt; 15, and therefore the answer is 6.</p>

<p>You can assume that the length of the sequence, k, is not smaller than 10 and not bigger than 500, and that the elements of the sequence are positive numbers smaller than 100000.</p>

### 입력

<p>The input consists of the following lines:</p>

<ol>
	<li>The first line contains an integer indicating the number k of elements of c.</li>
	<li>The second line consists of the ascending sequence c, where the elements are separated by spaces.</li>
</ol>

### 출력

<p>The output contains a single positive integer that indicates the length of the longest arithmetic progression that is a subsequence of c.</p>