# [Silver II] History - 31386

[문제 링크](https://www.acmicpc.net/problem/31386)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

구현, 누적 합

### 문제 설명

<p>Android Vasya likes the history of the ancient world. He likes to read about various superstitions people had at that time.</p>

<p>Recently Vasya came across a superstition concerning his favorite number 13. It turned out, that ancient people considered this number unlucky and avoided it as much as they could:</p>

<ul>
	<li>they wouldn&#39;t sit at table if there were exactly 13 people;</li>
	<li>they didn&#39;t use number 13 in numbering floors of a building: 12-th floor was followed by 14-th one;</li>
	<li>they didn&#39;t do anything important on Friday the 13-th.</li>
</ul>

<p>Vasya was especially amused by the superstition about Friday. How could people think that something bad could happen in such a wonderful day like Friday?</p>

<p>Now Vasya makes a research in the ancient world history covering a period from year $A$ till year $B$. He wonders how many unlucky Fridays this period contains. Help him to cope with this simple task.</p>

### 입력

<p>The only line contains integers $A$ and $B$ ($1919 \leq A \leq B \leq 10^9$). Androids use the Gregorian style for chronology. According to it the year is leap if its number is a multiple of 400 or if it is a multiple of 4 but is not a multiple of 100. In the leap years February is extended to 29 days.</p>

### 출력

<p>For every $k$ from 0 to 12 output how many times in the period from Vasya&#39;s research there was a year with exactly $k$ unlucky Fridays.</p>

### 힌트

<p>In 2015 Fridays are February 13, March 13 and November 13, and in 2016 is May 13 only.</p>