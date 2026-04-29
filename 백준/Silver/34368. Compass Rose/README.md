# [Silver II] Compass Rose - 34368

[문제 링크](https://www.acmicpc.net/problem/34368)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 12, 정답 비율: 100.000%

### 분류

구현, 이분 탐색

### 문제 설명

<p>Your friend Rose works as an intern at the United States Geologic Survey (USGS) on Mines campus. She has taken you up to a geological site in Boulder and given you some locations at which you are to take geological measurements. Her instructions to get to these locations include headings that you're having trouble decoding. These headings are strings consisting of between one and ten cardinal directions (N, S, E, and W) and correspond to an angle that you can set your compass to, to travel in the right direction. For example, the heading WSW corresponds to the angle $247.5^{\circ}$. Rose's instructions include a lot of these headings, but you don't have their corresponding angles memorized, so you decide to write a quick script to do the conversions for you.</p>

<p>Headings are defined as follows.</p>

<ul>
	<li>
	<p>\item Single character headings (N, S, E, and W) correspond to $0^{\circ}$, $180^{\circ}$, $90^{\circ}$, and $270^{\circ}$, respectively.</p>
	</li>
	<li>
	<p>\item Two character headings (NE, NW, SE, SW) correspond to $45^{\circ}$, $315^{\circ}$, $135^{\circ}$, and $225^{\circ}$, respectively.</p>
	</li>
	<li>
	<p>\item Headings of length $n \geq 3$ are composed of a valid heading of length $n - 1$, with one of the characters in that heading prepended to it, to add additional specificity to the heading.</p>

	<p>For example, we take the heading NE ($45^{\circ}$) but would like to add more specificity. We can prepend either N to form NNE ($22.5^{\circ}$, halfway between $0^{\circ}$ and $45^{\circ}$) or E to form ENE ($67.5^{\circ}$, halfway between $90^{\circ}$ and $45^{\circ}$).</p>

	<p>Similarly, we can form NNNE ($12.25^{\circ}$, halfway between $0^{\circ}$ and $22.5^{\circ}$) and ENNE ($33.75^{\circ}$, halfway between $22.5^{\circ}$ and $45^{\circ}$) from NNE by prepending N or E, respectively. However, we cannot prepend S or W (forming SNNE or WNNE) because NNE only contains the cardinal directions N and E, and so we can only prepend those characters to it.</p>
	</li>
</ul>

### 입력

<p>The first line of input contains $1 \leq n \leq 1\,000$, the number of test cases to follow. Each of the following $n$ lines contains a heading $D$ such that $1 \leq |D| \leq 10$, that is, each heading will be at most $10$ characters. You may assume that all headings given follow the definition provided above, and there will not be any invalid headings.</p>

### 출력

<p>You should output $n$ lines, with the $i^{\text{th}}$ line containing a real number, the compass heading (in degrees) corresponding to the given heading $D_i$.</p>

<p>Answers within $10^{-8}$ of the correct answer will be accepted. If a compass heading does not contain a decimal portion, it can be omitted.</p>