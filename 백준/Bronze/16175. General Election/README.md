# [Bronze III] General Election - 16175

[문제 링크](https://www.acmicpc.net/problem/16175)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 530, 정답: 420, 맞힌 사람: 372, 정답 비율: 77.987%

### 분류

구현

### 문제 설명

<p>General Election is over, now it is time to count the votes! There are&nbsp;<i>N</i>&nbsp;(2 &lt;=&nbsp;<i>N</i>&nbsp;&lt;= 5) candidates and&nbsp;<i>M</i>&nbsp;(1 &lt;=&nbsp;<i>M</i>&nbsp;&lt;= 100) vote regions. Given the number of votes for each candidate from each region, determine which candidate is the winner (one with the most votes).&nbsp;</p>

### 입력

<p>The first line of input contains an integer&nbsp;<i>T</i>, the number of test cases follow.</p>

<p>Each test case starts with an integer&nbsp;<i>N</i>&nbsp;and&nbsp;<i>M</i>&nbsp;denoting the number of candidate and number of region. The next&nbsp;<i>M</i>&nbsp;lines each contains&nbsp;<i>N</i>&nbsp;integers,&nbsp;<i>v</i><sub>1</sub>,&nbsp;<i>v</i><sub>2</sub>, ...,&nbsp;<i>v</i><sub>N</sub>&nbsp;(0 &lt;=&nbsp;<i>v</i><sub>i</sub>&nbsp;&lt;= 1000) the number of votes for candidate&nbsp;<i>i</i>.</p>

### 출력

<p>For each test case, output in a line the winning candidate. You may safely assume that the winner is unique.</p>