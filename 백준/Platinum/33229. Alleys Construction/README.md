# [Platinum IV] Alleys Construction - 33229

[문제 링크](https://www.acmicpc.net/problem/33229)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 77, 정답: 33, 맞힌 사람: 26, 정답 비율: 37.681%

### 분류

뤼카 정리, 모듈로 곱셈 역원, 수학, 정수론, 조합론

### 문제 설명

<p>In Andrei's city, people want to socialize as much as possible after the pandemic. The Fund for Providing the City (FPC) has announced that they want to construct alleys to create small social bubbles between households. An alley is a connection between two distinct houses. Each house must be connected with exactly one alley to another house within the same neighbourhood and the alleys may not intersect. Moreover, we know that the number of inhabitants of any neighbourhood will be even and the houses in each neighbourhood are arranged in a circle. The inhabitants want to find out, for each neighbourhood, in how many ways these alleys can be built. For example, in a neighbourhood that has six houses, there are five possible ways of constructing alleys, as shown in Figure A.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33229.%E2%80%85Alleys%E2%80%85Construction/6a8f21e7.png" data-original-src="https://boja.mercury.kr/assets/problem/33229-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 282px; height: 180px;"></p>

<p style="text-align: center;">Figure A.1: For a neighbourhood of six houses, there are five possible ways of constructing alleys. Each black dot represents a house, and each line represents a possible alley.</p>

<p>Calculate in how many possible ways the inhabitants of Andrei's city could construct alleys in each neighbourhood. Because this number can be very high, the answer should be modulo $313109$.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with a single integer $q$ ($1\leq q\leq 10^4$), the number of neighbourhoods.</li>
	<li>$q$ lines, each containing one even number $n$ ($2\leq n\leq 10^{18}$), representing the number of the houses in the neighbourhood.</li>
</ul>

### 출력

<p>Output $q$ lines, each line containing one number: the number of possible ways in which alleys can be built in each neighbourhood. This number should be modulo $313109$.</p>