# [Platinum IV] Sculpture - 3686

[문제 링크](https://www.acmicpc.net/problem/3686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 19, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Imagine a box, made of copper plate. Imagine a second one, intersecting the first one, and several others, intersecting each other (or not). That is how the sculptor Oto Boxing constructs his sculptures. In fact he does not construct that much, he only makes the design; the actual construction is contracted out to a construction company. For the calculation of the costs of construction the company needs to know the total area of copper plate involved. Parts of a box that are hidden in another box are not realized in copper, of course. (Copper is quite expensive, and prices are rising.) After construction, the total construction is plunged into a bath of chemicals. To prevent this bath from running over, the construction company wants to know the total volume of the construction. Given that a construction is a collection of boxes, you are asked to calculate the area and the volume of the construction.</p>

<p>Some of Oto&rsquo;s designs are connected, others are not. Either way, we want to know the total area and the total volume. It might happen that the boxes completely enclose space that is not included in any of the boxes (see the second example below). Because the liquid cannot enter that space, its volume must be added to the total volume. Copper plate bordering this space is superfluous, of course, so it does not add to the area.</p>

### 입력

<p>On the first line one positive number: the number of testcases, at most 100. After that per testcase:</p>

<ul>
	<li>One line with an integer n (1 &le; n &le; 50): the number of boxes involved.</li>
	<li>n lines with six positive integers x0, y0, z0, x, y, z (1 &le; x0, y0, z0, x, y, z &le; 500): the triple (x0, y0, z0) is the vertex of the box with the minimum values for the coordinates and the numbers x, y, z are the dimensions of the box (x, y and z dimension, respectively). All dimensions are in centimeters. The sides of the boxes are always parallel to the coordinate axes.</li>
</ul>

### 출력

<p>Per testcase:</p>

<ul>
	<li>One line with two numbers separated by single spaces: the total amount of copper plate needed (in cm<sup>2</sup>), and the total volume (in cm<sup>3</sup>).</li>
</ul>