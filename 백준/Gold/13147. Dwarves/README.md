# [Gold III] Dwarves - 13147

[문제 링크](https://www.acmicpc.net/problem/13147)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 433, 정답: 190, 맞힌 사람: 136, 정답 비율: 45.033%

### 분류

그래프 이론, 그래프 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Once upon a time, there arose a huge discussion among the dwarves in Dwarfland. The government wanted to introduce an identity card for all inhabitants.</p>

<p>Most dwarves accept to be small, but they do not like to be measured. Therefore, the government allowed them to substitute the field &ldquo;height&rdquo; in their personal identity card with a field &ldquo;relative dwarf size&rdquo;. For producing the ID cards, the dwarves were being interviewed about their relative sizes. For some reason, the government suspects that at least one of the interviewed dwarves must have lied.</p>

<p>Can you help find out if the provided information proves the existence of at least one lying dwarf?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 10<sup>5</sup>), where n is the number of statements;</li>
	<li>n lines describing the relations between the dwarves. Each relation is described by:
	<ul>
		<li>one line with &ldquo;s1 &lt; s2&rdquo; or &ldquo;s1 &gt; s2&rdquo;, telling whether dwarf s1 is smaller or taller than dwarf s2. s1 and s2 are two different dwarf names.</li>
	</ul>
	</li>
</ul>

<p>A dwarf name consists of at most 20 letters from &ldquo;A&rdquo; to &ldquo;Z&rdquo; and &ldquo;a&rdquo; to &ldquo;z&rdquo;. A dwarf name does not contain spaces. The number of dwarves does not exceed 10<sup>4</sup>.</p>

### 출력

<p>Output &ldquo;impossible&rdquo; if the statements are not consistent, otherwise output &ldquo;possible&rdquo;.</p>