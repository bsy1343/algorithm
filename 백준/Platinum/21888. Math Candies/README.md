# [Platinum I] Math Candies - 21888

[문제 링크](https://www.acmicpc.net/problem/21888)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

수학, 문자열, 접미사 배열과 LCP 배열

### 문제 설명

<p>Little Max&#39;s most favorite activities are eating sweets and solving difficult mathematical riddles. The boy is happy when he finds a puzzle on a candy wrapper, which is a set of non-negative integers that he needs to sum up. Unfortunately, all the numbers on the wrapper are stuck together so that Max can&#39;t understand where one number ends, and where the next one starts.</p>

<p>The boy remembers that there are always exactly $k$ numbers on a wrapper, none of them containing leading zeros. He decided to split this string of digits into numbers on his own. He just needs to insert $k - 1$ delimiters into the string. Max wants to get the most interesting puzzle, the one that has the maximum possible result.</p>

<p>Your task is to find the maximum total sum of $k$ numbers that Max can get by splitting given string.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ --- the number of digits in the string on the wrapper and the number of integers, in which string must be split ($1 \le k \le n \le 5 \cdot 10^5$).</p>

<p>The second line contains a string of $n$ decimal digits.</p>

<p>It&#39;s possible to&nbsp;split the string into integers without any leading zero.</p>

### 출력

<p>Output single integer --- maximum possible result.</p>

### 힌트

<p>In the first sample input splitting with the maximum sum is 52, 8;</p>

<p>In the second sample input splitting with the maximum sum is 90, 5, 0;</p>

<p>Consider all splitting for the third sample input:</p>

<ol>
	<li>0,&nbsp;7, 800 --- valid splitting, sum is 807;</li>
	<li>0, 78,&nbsp;00 --- invalid splitting, there is a leading zero in $00$;</li>
	<li>0, 780,&nbsp;0 --- valid splitting, sum is 780;</li>
	<li>07,&nbsp;8,&nbsp;00 --- invalid splitting, there are leading zeros in $00$ and $07$;</li>
	<li>07,&nbsp;80,&nbsp;0 --- invalid splitting, there is a leading zero in $07$;</li>
	<li>078, 0,&nbsp;0 --- invalid splitting, there is a leading zero in $078$.</li>
</ol>

<p>Thus a splitting with the maximum sum is 0, 7, 800.</p>