# [Gold III] Append Sort - 22890

[문제 링크](https://www.acmicpc.net/problem/22890)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 140, 정답: 67, 맞힌 사람: 60, 정답 비율: 51.282%

### 분류

임의 정밀도 / 큰 수 연산, 그리디 알고리즘

### 문제 설명

<p>We have a list of integers X<sub>1</sub>, X<sub>2</sub>, &hellip;, X<sub>N</sub>. We would like them to be in strictly increasing order, but unfortunately, we cannot reorder them. This means that usual sorting algorithms will not work.</p>

<p>Our only option is to change them by appending digits 0 through 9 to their right (in base 10). For example, if one of the integers is 10, you can turn it into 10<strong>0</strong> or 10<strong>9</strong> with a single append operation, or into 10<strong>34</strong> with two operations (as seen in the image below).</p>

<p>Given the current list, what is the minimum number of single digit append operations that are necessary for the list to be in strictly increasing order?</p>

<p>For example, if the list is 100,7,10, we can use 4 total operations to make it into a sorted list, as the following image shows.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c9b1174d-0a57-4144-8c01-d691ac7c0da1/-/preview/" /></p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case is described in two lines. The first line of a test case contains a single integer N, the number of integers in the list. The second line contains N integers X<sub>1</sub>, X<sub>2</sub>, &hellip;, X<sub>N</sub>, the members of the list.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is the minimum number of single digit append operations needed for the list to be in strictly increasing order.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, the input is the same as in the example given in the problem statement. As the image shows, the list can be turned into a sorted list with 4 operations. Notice that the last two integers need to end up with at least 3 digits (requiring at least 3 append operations in total). If all of the final numbers had exactly three digits, the second would be larger than the third because it starts with a 7 instead of a 1. This means we cannot do it with fewer than 4 operations.</p>

<p>In Sample Case #2, notice that the list needs to be in strictly increasing order, so we have to do at least one operation. In this case, any valid append operation to the second integer works.</p>

<p>In Sample Case #3, we can use two append operations to get the list to 4,19,19<strong>3</strong>.</p>

<p>In Sample Case #4, the given list is already in strictly increasing order, so no operations are necessary.</p>