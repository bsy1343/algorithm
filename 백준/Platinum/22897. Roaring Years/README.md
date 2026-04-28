# [Platinum V] Roaring Years - 22897

[문제 링크](https://www.acmicpc.net/problem/22897)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 69, 정답: 22, 맞힌 사람: 22, 정답 비율: 38.596%

### 분류

임의 정밀도 / 큰 수 연산, 이분 탐색, 많은 조건 분기, 수학

### 문제 설명

<p>Something is happening in 2021 that has not happened in over a century. 2021, like 1920 before it, is a roaring year. A year represented by a positive integer y is roaring if the decimal writing (without leading zeroes) of y is the concatenation of the decimal writing (without leading zeroes) of two or more distinct consecutive positive integers, in increasing order. In this case, 2021 is a roaring year because it is the concatenation of 20 and 21.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/38b32175-c778-4048-aaba-ef0d790667c6/-/preview/" style="width: 425px; height: 221px;" /></p>

<p style="text-align: center;"><i>Three calendars from roaring years, marked to show how roaring their years are.</i></p>

<p>Other examples of roaring years are 12, 789, 910, 1234, and 9899100. 2020 was not roaring because the only list of two or more positive integers that concatenate into 2020 is [20,20], and it is not made of consecutive integers. Similarly, there are only three lists for 2019: [20,1,9], [201,9], and [20,19]. The first two are not made of consecutive integers, while the third does not have the integers in increasing order. Thus, 2019 was also not roaring. As a final example, 778 was not a roaring year because [7,78] and [77,8] are not made up of consecutive integers and [7,7,8] is not made up of distinct integers.</p>

<p>Given the current year (which may or may not be roaring), find what the next roaring year is going to be.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T lines follow. Each line represents a test case and contains a single integer Y, the current year.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;z</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;z&nbsp;is the first year strictly after&nbsp;Y&nbsp;that is roaring.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
</ul>

### 힌트

<p>Notice in the last Sample Case that 102 is not a roaring year because [10,2] is not a list of consecutive integers and you cannot write 2 with a leading zero to use [1,02].</p>