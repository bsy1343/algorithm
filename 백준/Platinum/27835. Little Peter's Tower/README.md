# [Platinum III] Little Peter's Tower - 27835

[문제 링크](https://www.acmicpc.net/problem/27835)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>My little brother Peter likes playing with his building set. He has a huge bag containing cylinder-shaped building blocks of various dimensions. He wants to build a very tall tower out of them. But that is not as simple as it looks.</p>

<p>For each two integers <b>0 &lt; r &le; R</b> and <b>0 &lt; h &le; H</b> there are infinitely many cylinder-shaped building blocks with base radius <b>r</b> and height <b>h</b> in his bag. He is building the tower by following the following rule:</p>

<p><i>Each minute he draws one block from his bag. Then he has to decide among two options: either he places this block on top of his current tower (or on the floor if this is the first block to be used), or he returns the block into his bag.</i></p>

<p>He may only place the block on top of the current tower if its base radius is less than or equal to the radius of the top of the the tower. If the block he picked out of the bag is too large to fit on top of the tower, he has to return it to the bag.</p>

<p>Peter can not predict or influence the dimensions of the block he will draw from the bag. For each block type (radius <b>r</b> and height <b>h</b>) the probability that he will draw it in the next minute is equal to <b>1/(R*H)</b>.</p>

<p>Peter&#39;s goal is to build a tower that&#39;s as tall as possible. However, he needs to eat and sleep (or at least his mother claims so). Thus his playing time is limited, and Peter knows the exact number of minutes he has left.</p>

<p>Peter is already an experienced tower builder, and he decided to use the building strategy that will maximize the average height of the complete tower.</p>

<p>Given the maximum dimensions of a building block and the time Peter has to build his tower, compute the maximum average height of the complete tower. (The maximum is taken over all decision strategies and average is taken over the drawn block dimensions.)</p>

### 입력

<p>The first line of the input file contains an integer <b>T</b> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of a single line with three positive integers: <b>R</b> (maximum base radius of a building block), <b>H</b> (maximum height of a building block) and <b>T</b> (time in minutes he has to build his tower).</p>

### 출력

<p>For each test case output a single line with a single (real) number &ndash; the answer for that test case.</p>

<p>Each number in the output file should have sufficiently many decimal places. We recommend printing all results rounded to seven decimal places. Your output will be considered correct if each number has an absolute or relative error less than 10<sup>-6</sup>.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 147</li>
</ul>