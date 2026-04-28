# [Platinum IV] Hidden Art - 30496

[문제 링크](https://www.acmicpc.net/problem/30496)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 30, 맞힌 사람: 28, 정답 비율: 37.333%

### 분류

수학, 정수론

### 문제 설명

<p>You have recently moved to a new home, and you are almost done decorating it. However, you still feel like something is missing: you need some art on the wall! Since you have already spent most of your budget on the furniture, you decide to go to the cheapest art shop there is: the Budget Art Printing Company (BAPC).</p>

<p>At the BAPC, you can buy infinitely large sheets of paper on which a decoration is printed. Such a decoration consists of a rectangular pattern which is repeated in all directions. This pattern in turn consists of square pixels that are colored white, red, green or blue. After buying a sheet of paper, customers may then cut out a part of the sheet to create their very own artwork.</p>

<p>You have just found a pattern of pixels you like, but before you have it printed you decide to check whether it is possible to cut a <em>beautiful</em> artwork from it. You consider an artwork beautiful if it satisfies the following properties:</p>

<ul>
	<li>It is cut out along pixel boundaries.</li>
	<li>It is a square.</li>
	<li>The pixels in the four corners of the square have four different colors.</li>
</ul>

<p>Is there a beautiful artwork hidden in this infinite sheet printed with the selected pattern?</p>

<p>As an example, consider the first sample input, visualized in Figure H.1. In the infinitely repeated pattern, it is possible to find several beautiful artworks.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/15a540a5-e5c3-4ffb-a365-0dffeb3a420e/-/preview/" style="width: 378px; height: 235px;" /></p>

<p style="text-align: center;">Figure H.1: Visualization of the first sample input. The pattern is shown repeated five times in the horizontal direction and two times in the vertical direction, but remember that it repeats indefinitely in all directions. The three bold outlined squares indicate some possible beautiful artworks.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $h$ and $w$ ($1 \leq h \leq 4000$, $1 \leq w \leq 50$), the height and width of the chosen pattern.</li>
	<li>$h$ lines, each with a string of $w$ characters $c$ ($c \in \{<code>w</code>, <code>r</code>, <code>g</code>, <code>b</code>\}$), describing the pattern.</li>
</ul>

### 출력

<p>If it is possible to cut out a beautiful artwork from the sheet with the selected pattern, output &quot;<code>possible</code>&quot;, otherwise output &quot;<code>impossible</code>&quot;.</p>