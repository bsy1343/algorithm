# [Gold II] Drink Responsibly - 11486

[문제 링크](https://www.acmicpc.net/problem/11486)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 19, 정답 비율: 55.882%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>The University of Lagado is organising events for the upcoming Fresher&rsquo;s week and has been told &mdash; much to the surprise of its staff &mdash; that some of the undergraduates may enjoy a beer tasting. While sourcing a wide variety of drinks for the students to taste, the university realised that in the interests of safety there should be a limit on the alcohol consumption of any student, enforced by a strict limit on the amount any individual is allowed to spend.</p>

<p>In common with many popular establishments, the drinks with varying strengths are served in varying amounts: Either a litre, a half litre or a third of a litre to limit possible intoxication.</p>

<p>The students are looking forward to the event, but in order to make the most of their money and still be bright-eyed and bushy tailed for the first week of morning lectures, they don&rsquo;t wish to get too drunk. How can the students spend all their money and consume in full their self-imposed alcohol limit for the night?</p>

### 입력

<ul>
	<li>One line containing three numbers:
	<ul>
		<li>m (0.00 &le; m &le; 10.00), the amount of money they can spend to two decimal places;</li>
		<li>u (0.0 &le; u &le; 20.0), the number of units they aim to drink to one decimal place;</li>
		<li>d (1 &le; d &le; 8), the number of different drinks available.</li>
	</ul>
	</li>
	<li>Another d lines, each containing:
	<ul>
		<li>up to 20 lowercase latin letters (the name of the drink);</li>
		<li>an integer between 0 and 100 (its strength as a percentage);</li>
		<li>its size (either &lsquo;1/1&rsquo; for a litre, &lsquo;1/2&rsquo; for a half or &lsquo;1/3&rsquo; for a third);</li>
		<li>a real number to two decimal places; its cost.</li>
	</ul>
	</li>
</ul>

<p>Name, strength, price and cost will be separated by spaces</p>

### 출력

<p>If the students&rsquo; aims are possible, write one or more lines, each listing the name of the drink purchased followed by the positive integer count of how many drinks of that type were bought. If there are several solutions, output any.</p>

<p>Otherwise, output a single line containing the word IMPOSSIBLE.</p>