# [Bronze I] Odd Man Out (Small) - 12595

[문제 링크](https://www.acmicpc.net/problem/12595)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 378, 정답: 306, 맞힌 사람: 289, 정답 비율: 80.952%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>You are hosting a party with&nbsp;<code>G</code>&nbsp;guests and notice that there is an odd number of guests! When planning the party you deliberately invited only couples and gave each couple a unique number&nbsp;<code>C</code>&nbsp;on their invitation. You would like to single out whoever came alone by asking all of the guests for their invitation numbers.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.<br />
<strong>N</strong>&nbsp;test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing the value&nbsp;<strong>G</strong>&nbsp;the number of guests.</li>
	<li>One line containing a space-separated list of&nbsp;<strong>G</strong>&nbsp;integers. Each integer&nbsp;<strong>C</strong>&nbsp;indicates the invitation code of a guest.</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le; N &le; 50</li>
	<li>0 &lt; C &le; 2147483647</li>
	<li>3 &le; G &lt; 100</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot; followed by the number&nbsp;<code>C</code>&nbsp;of the guest who is alone.</p>