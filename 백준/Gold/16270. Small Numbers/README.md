# [Gold IV] Small Numbers - 16270

[문제 링크](https://www.acmicpc.net/problem/16270)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 144, 정답: 49, 맞힌 사람: 39, 정답 비율: 36.111%

### 분류

수학, 브루트포스 알고리즘, 정수론, 소인수분해

### 문제 설명

<p>Little Vlad has two favorite numbers a and b. Recently, he was taught in school the division and multiplication operations and he immediately started dividing and multiplying his favorite numbers.</p>

<p>He wrote a and b in his notebook and came up with three cool operations which he wants to perform on his numbers:</p>

<ul>
	<li>Divide both numbers by one of their common divisors;</li>
	<li>Divide a by one of his divisor g, multiply b by g;</li>
	<li>Divide b by one of his divisor g, multiply a by g.</li>
</ul>

<p>After performing every operation he erases his old numbers, replacing them with new ones. He may choose to continue performing operations or to stop.</p>

<p>Since Vlad is small, he wants numbers to be smaller. Thus, he is trying to minimize sum of a and b, but can&#39;t handle it on his own. Help him to determine minimum sum that he can obtain by performing these operations and give an example of final a and b with such sum.</p>

### 입력

<p>Input data contains multiple test cases. The first line of input contains integer t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;500).</p>

<p>Each test case is described by a single line containing integers a and b (1&thinsp;&le;&thinsp;a,&thinsp;b&thinsp;&le;&thinsp;10<sup>9</sup>) &mdash; Vlad&#39;s favorite numbers.</p>

### 출력

<p>For each test case output one line &mdash; the pair with the minimum sum that can be obtained by performing operations from the list.</p>