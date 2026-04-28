# [Gold IV] Myth Busters - 5791

[문제 링크](https://www.acmicpc.net/problem/5791)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 21, 맞힌 사람: 10, 정답 비율: 29.412%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Every train carriage operated by CityRail of Sydney has a unique ID number of four digits. A not so uncommon myth amongst local school pupils is that every ID number can be manipulated by permuting the digits, using brackets and using arithmetic operations from the set {&#39;*&#39; , &#39;/&#39;, &#39;+&#39; , &#39;-&#39;} to calculate the number 10.</p>

<p>Your task is to check the validity of this myth for the carriages operated by CityRail of Sydney and for train carriages from other cities whose ID numbers were collected.</p>

<p>Reminder: The operation &#39;/&#39; refers to integer division. Most of you already know it, but here are two examples: result of 5/2 is 2 and of 2/5 is 0.</p>

### 입력

<p>The input consists of many test cases. The description of each test case consists of:</p>

<ul>
	<li>an integer N (1 &lt; N &lt; 1000), on a line by itself, which indicates the number of IDs collected from one city, and</li>
	<li>N lines that contain a four-digit number each.</li>
</ul>

<p>A zero on a line by itself indicates the end of input and should not be processed.</p>

### 출력

<p>For each test case print the conclusion of your investigation as TRUE or BUSTED as shown in &ldquo;Output for the Sample Input&rdquo; below. Print TRUE if this myth is correct for all carriage ID numbers for that city. Otherwise, BUSTED is to be printed.</p>