# [Platinum I] Necklace - 5836

[문제 링크](https://www.acmicpc.net/problem/5836)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 118, 정답: 41, 맞힌 사람: 36, 정답 비율: 42.857%

### 분류

다이나믹 프로그래밍, 문자열, KMP

### 문제 설명

<p>Bessie the cow has arranged a string of N rocks, each containing a single letter of the alphabet, that she wants to build into a fashionable necklace.</p>

<p>Being protective of her belongings, Bessie does not want to share her necklace with the other cow currently living on her side of the barn. The other cow has a name that is a string of M characters, and Bessie wants to be sure that this length-M string does not occur as a contiguous substring anywhere within the string representing her necklace (otherwise, the other cow might mistakenly think the necklace is for her). Bessie decides to remove some of the rocks in her necklace so that the other cow&#39;s name does not appear as a substring. Please help Bessie determine the minimum number of rocks she must remove.</p>

### 입력

<ul>
	<li>Line 1: The first line is a length-N string describing Bessie&#39;s initial necklace; each character is in the range &quot;a&quot; through &quot;z&quot;.</li>
	<li>Line 2: The second line is the length-M name of the other cow in the barn, also made of characters from &quot;a&quot; to &quot;z&quot;.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum number of stones that need to be removed from Bessie&#39;s necklace so that it does not contain the name of the other cow as a substring.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<ul>
	<li>For at least 20% of test cases, N &lt;= 20.</li>
	<li>For at least 60% of test cases, N &lt;= 1000, M &lt;= 100.</li>
	<li>For all test cases, N &lt;= 10000, M &lt;= 1000.</li>
	<li>For all test cases, M &lt;= N.</li>
</ul>

<h4>Output Details</h4>

<p>The modified necklace should be &quot;abbaa&quot;.</p>