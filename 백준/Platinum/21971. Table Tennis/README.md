# [Platinum III] Table Tennis - 21971

[문제 링크](https://www.acmicpc.net/problem/21971)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 138, 정답: 13, 맞힌 사람: 5, 정답 비율: 9.615%

### 분류

무작위화, 두 포인터

### 문제 설명

<p>In Little Square&rsquo;s class everyone is obsessed with table tennis. Each person has a distinct non-negative integer score that represents their table tennis skill. His class has N people, and is <em>perfectly balanced</em> with respect to table tennis skill. This means that we can form N/2 teams of two such that the total table tennis skill of each team is equal. Note that this means that N is even.</p>

<p>Unfortunately, K people from Little Triangle&rsquo;s class have snuck into Little Square&rsquo;s classroom. Now there are N + K people in the classroom, each of which has a distinct, non-negative, integer table tennis skill score. Choose N people from among these such that the resulting group is perfectly balanced with respect to table tennis skill.</p>

### 입력

<p>On the first line of the input you will find N and K. On the next line of the input you will find N + K non-negative, distinct integers, in increasing order. These represent the table tennis skill scores of the people in the classroom, after those Little Triangle&rsquo;s class snuck in.</p>

### 출력

<p>Output one line, containing N non-negative, distinct integers, in increasing order. The outputs should be a subset of the table tennis skill scores of the people in the classroom, and should be perfectly balanced. If there are multiple solutions, any one is accepted.</p>

### 제한

<ul>
	<li>1 &le; N &le; 150,000</li>
	<li>1 &le; K &le; 400</li>
	<li>1 &le; <em>table tennis skill score</em> &le; 1,000,000,000</li>
</ul>

### 힌트

<p>In both examples, the output is correct since it has 4 elements, is a subset of the input, and since we can form teams of two of equal table tennis skill (one team with skills 1 and 4, and one team with skills 2 and 3).</p>

<p>In the first example, it would also be correct to output 1, 3, 8, 10 or 2, 4, 8, 10.</p>

<p>In the second example, it would also be correct to output 2, 3, 4, 5 or 3, 4, 5, 6.</p>