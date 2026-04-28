# [Gold V] Juice (Small) - 12661

[문제 링크](https://www.acmicpc.net/problem/12661)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 46, 맞힌 사람: 41, 정답 비율: 85.417%

### 분류

비트마스킹, 브루트포스 알고리즘

### 문제 설명

<p>You are holding a party. In preparation, you are making a drink by mixing together three different types of fruit juice: Apple, Banana, and Carrot. Let&#39;s name the juices A, B and C.</p>

<p>You want to decide what fraction of the drink should be made from each type of juice, in such a way that the maximum possible number of people attending the party like it.</p>

<p>Each person has a minimum fraction of each of the 3 juices they would like to have in the drink. They will only like the drink if the fraction of each of the 3 juices in the drink is greater or equal to their minimum fraction for that juice.</p>

<p>Determine the maximum number of people that you can satisfy.</p>

### 입력

<ul>
	<li>One line containing an integer&nbsp;<strong>T</strong>, the number of test cases in the input file.</li>
</ul>

<p>For each test case, there will be:</p>

<ul>
	<li>One line containing the integer&nbsp;<strong>N</strong>, the number of people going to the party.</li>
	<li><strong>N</strong>&nbsp;lines, one for each person, each containing three space-separated numbers &quot;A B C&quot;, indicating the minimum fraction of each juice that would like in the drink. A, B and C are integers between 0 and 10000 inclusive, indicating the fraction in parts-per-ten-thousand. A + B + C &le; 10000.</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 12</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10</li>
</ul>

### 출력

<ul>
	<li><strong>T</strong>&nbsp;lines, one for each test case in the order they occur in the input file, each containing the string &quot;Case #X: Y&quot; where X is the number of the test case, starting from 1, and Y is the maximum number of people who will like your drink.</li>
</ul>

### 힌트

<p>In the first case, for each juice, we have one person that wants the drink to be made entirely out of that juice! Clearly we can only satisfy one of them.</p>

<p>In the second case, we can satisfy any two of the three preferences.</p>

<p>In the third case, all five people will like the drink if we make it using equal thirds of each juice.</p>