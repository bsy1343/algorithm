# [Bronze I] Alien Sunset - 15027

[문제 링크](https://www.acmicpc.net/problem/15027)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 76, 맞힌 사람: 51, 정답 비율: 56.667%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Following tremendous advances in space flight control software and equally impressive innovations in reality TV crowdfunding, humans have successfully settled a number of planets, moons, asteroids, and various other kinds of funny-shaped rocks across our solar system.</p>

<p>To celebrate, the Galactic President has elected to create a new holiday called &quot;Solar Night&quot;. At the crux of the event, she decrees, every settlement will simultaneously launch colourful fireworks into the darkness of night.</p>

<p>Night, like most things, is a difficult problem in space. Every spacebound object has its own day length and period of rotation. Thankfully all of the settlements did, at least, start their clocks at the same moment. Settlements may have started in daylight or darkness and so it is possible that the first recorded sunrise can be either before or after the first hour of sunset.</p>

<p>By convention, the President&rsquo;s term lasts for exactly 1825 days as measured by the planet with the longest period of rotation. The celebration needs to happen within that time or it will not serve its intended purpose.</p>

<p>Determine how many hours must pass for us to find a suitable time to celebrate Solar Night.</p>

### 입력

<ul>
	<li>One line containing the integer N (1 &le; N &le; 20), the number of settlements.</li>
	<li>N lines, each containing three integers:
	<ul>
		<li>H (2 &le; H &le; 100), the number of hours in this settlement&rsquo;s solar day.</li>
		<li>R and T (0 &le; R, T &le; H &minus; 1, R &ne; T), the hours of sunrise and sunset respectively.</li>
	</ul>
	</li>
</ul>

<p>At sunrise and sunset, a settlement is in darkness. At times strictly in between sunrise and sunset, a settlment is in daylight.</p>

### 출력

<p>Output the number of hours that must pass from when the settlement clocks began until each settlement is in darkness. If no suitable time occurs in the first 1825 days, output impossible.</p>