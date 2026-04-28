# [Platinum IV] Impressive Integers - 20909

[문제 링크](https://www.acmicpc.net/problem/20909)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 114, 정답: 36, 맞힌 사람: 36, 정답 비율: 33.962%

### 분류

기하학, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Recently, Alice and her sister Clara learned about <em>adorable</em> numbers: A positive integer $n$ is called adorable if there exist some integers $a, b,$ and $c$ so that an equilateral triangle with side length $c$ can be tiled with $n$ smaller equilateral triangles, each having a side length of either $a$ or $b$. For instance, $6$ is an adorable number as shown in Figure I.1a below.</p>

<table class="table table-bordered td-center th-center" style="width:100%;">
	<tbody>
		<tr>
			<td style="width:50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20909.%E2%80%85Impressive%E2%80%85Integers/b63f9b9e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20909.%E2%80%85Impressive%E2%80%85Integers/b63f9b9e.png" data-original-src="https://upload.acmicpc.net/171b49ec-12cc-467e-a2aa-875f76aaddfa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 239px; height: 211px;" /></td>
			<td style="width:50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20909.%E2%80%85Impressive%E2%80%85Integers/13d5f033.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20909.%E2%80%85Impressive%E2%80%85Integers/13d5f033.png" data-original-src="https://upload.acmicpc.net/b52b268f-8dc5-43f0-831f-fe2a6ccd4aa2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 239px; height: 211px;" /></td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<th>(a) Visualization of the second sample output.</th>
			<th>(b) Coordinate system used for the output.</th>
		</tr>
	</tfoot>
</table>

<p>They decided to see who can come up with more adorable numbers, but it turns out that checking all the numbers manually is too cumbersome. Therefore, Alice asked you to help her check whether the numbers Clara listed are adorable or not. As she wants to be sure that every number claimed to be adorable really is adorable, she asked you to write a program that, given an integer $n$, determines if it is adorable and if so, outputs a valid tiling as shown in Figure I.1a.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A single positive integer $n$ ($1 \leq n \leq 1\,000$).</li>
</ul>

### 출력

<p>If the given integer $n$ is adorable, output a valid tiling using the following format:</p>

<ul>
	<li>Three integers $a, b, c$ ($1 \leq a, b \leq c \leq 10^9$), such that an equilateral triangle with side length $c$ can be tiled with $n$ equilateral triangles with side lengths $a$ and $b$.</li>
	<li>$n$ lines, each describing one of the triangles and consisting of:
	<ul>
		<li>one of <code>A</code> and <code>B</code>, specifying if the side length of the triangle is $a$ or $b$;</li>
		<li>two integers $x, y$, giving the leftmost corner of the triangle;</li>
		<li>one of <code>U</code> and <code>D</code>, specifying whether the triangle is pointing upwards or downwards.</li>
	</ul>
	These triangles must form a valid tiling of the equilateral triangle with corners at $(0, 0), (0, c),$ and $(c, 0)$, where all coordinates are given using the coordinate system in Figure I.1b.</li>
</ul>

<p>Otherwise, if $n$ is not adorable, output <code>impossible</code>.</p>

<p>If your tiling consists of triangles that all have the same size, you may either use <code>A</code> or <code>B</code> exclusively for all of your triangles, or set $a = b$ and arbitrarily label each triangle with <code>A</code> or <code>B</code>.</p>

<p>It can be shown that for every adorable number in the input range it is possible to construct a tiling according to the above set of rules. You may output any valid tiling.</p>