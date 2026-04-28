# [Platinum V] Crane Truck (Small) - 12127

[문제 링크](https://www.acmicpc.net/problem/12127)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학, 구현, 애드 혹, 시뮬레이션, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>You are in a large storage facility, with 2<sup>40</sup>&nbsp;storage locations arranged in a circle.</p>

<p>A truck with a crane on it moves along the circle of storage locations, picking up or putting down crates according to a program. (The truck has an unlimited supply of crates on board, so it can always put more crates down.)</p>

<p>The program consists of a sequence of these instructions:</p>

<ul>
	<li><code>b</code>&nbsp;: move back one location</li>
	<li><code>f</code>&nbsp;: move forward one location</li>
	<li><code>u</code>&nbsp;: pick up one crate at the current location</li>
	<li><code>d</code>&nbsp;: put down one crate at the current location</li>
	<li><code>(</code>&nbsp;: do nothing</li>
	<li><code>)</code>&nbsp;: if there is more than one crate at the current location, move back to the most recent ( in the sequence of instructions, and continue the program from there. (This doesn&#39;t move the truck.)</li>
</ul>

<p>( and ) instructions in the program will always come in pairs: a ( will be followed later by a matching ). There will be at most two such pairs in the program, and if there are two pairs, they will not be nested &ndash; that is, there will be either:</p>

<ul>
	<li>no ( or ) instructions;</li>
	<li>one ( instruction somewhere in the program, followed later by one ) instruction;</li>
	<li>a ( instruction, followed later by a ) instruction, followed later by another (, and again later by another ).</li>
</ul>

<p>&nbsp;</p>

<p>The sample cases contain examples of each of these.</p>

<p>Each storage location begins with one crate, before the crane truck starts running its program.</p>

<p>Mysteriously, if the truck picks up the last crate at a location, another truck instantly comes along and puts down 256 crates there! Similarly, if the truck puts down a crate at a location, and that location then has 257 crates, another truck instantly drives past and picks up 256 of the crates, leaving one behind! So every location always has between 1 and 256 crates.</p>

<p>How many times will the truck move forward or backward before reaching the end of its program?</p>

<div>&nbsp;</div>

### 입력

<p>One line containing an integer&nbsp;<strong>T</strong>, the number of test cases in the program.</p>

<p><strong>T</strong>&nbsp;lines, each containing a crane truck program with up to 2000 characters.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li>1 &le; the length of the program &le; 2000.</li>
	<li>The program is guaranteed to terminate.</li>
	<li>The program will contain at most one pair of ( and ) instructions.</li>
</ul>

### 출력

<p>T lines, one for each test case, containing &quot;Case #<strong>X</strong>:&nbsp;<strong>Y</strong>&quot; where&nbsp;<strong>X</strong>&nbsp;is the test case number, and&nbsp;<strong>Y</strong>&nbsp;is the number of times the truck moves.</p>