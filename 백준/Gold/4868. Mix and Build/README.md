# [Gold II] Mix and Build - 4868

[문제 링크](https://www.acmicpc.net/problem/4868)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 20, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

다이나믹 프로그래밍, 그래프 이론, 문자열

### 문제 설명

<p>In this problem, you are given a list of words (sequence of lower case letters). From this list, find the longest chain of words&nbsp;<em>w<sub>1</sub></em>, ...,&nbsp;<em>w<sub>n</sub></em>&nbsp;such that&nbsp;<em>w<sub>i</sub></em>&nbsp;is a&nbsp;<em>mixed extension</em>&nbsp;of&nbsp;<em>w<sub>i-1</sub></em>. A word&nbsp;<em>A</em>&nbsp;is a mixed extension of another word&nbsp;<em>B</em>&nbsp;if&nbsp;<em>A</em>&nbsp;can be formed by adding one letter to&nbsp;<em>B</em>&nbsp;and permuting the result. For example, &quot;ab&quot;, &quot;bar&quot;, &quot;crab&quot;, &quot;cobra&quot;, and &quot;carbon&quot; form a chain of length 5.</p>

### 입력

<p>The input file contains at least two, but no more than 10000 lines. Each line contains a word. The length of each word is at least 1 and no more than 20. All words in the input are distinct.</p>

### 출력

<p>Write the longest chain that can be constructed from the given words. Output each word in the chain on a separate line, starting from the first one. If there are multiple longest chains, any longest chain is acceptable.</p>