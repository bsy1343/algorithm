# [Gold II] Brain Power - 34649

[문제 링크](https://www.acmicpc.net/problem/34649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 109, 정답: 86, 맞힌 사람: 79, 정답 비율: 82.292%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>You are given a string $s$ consisting of lowercase English letters. Your task is to split $s$ into a sequence of non-empty <strong>substrings</strong> such that no two adjacent substrings in the sequence are <strong>anagrams</strong> of each other. (Two strings are considered anagrams if they contain the same characters with the same frequencies.) Among all such valid splits, you must maximize the number of substrings.</p>

### 입력

<p>The first line of the input contains a single integer $T$, the number of test cases.</p>

<p>The following $T$ lines each describe a test case. Each line contains a single string $s$ consisting of lowercase English letters.</p>

### 출력

<p>For each test case, print a single integer on a new line: the maximum possible number of substrings in a valid split.</p>

### 제한

<ul>
<li>$1 \le T \le 10^5$</li>
<li>$1 \le |s| \le 10^5$ for each test case.</li>
<li>The total length of all strings $s$ over all test cases does not exceed $10^5$.</li>
</ul>