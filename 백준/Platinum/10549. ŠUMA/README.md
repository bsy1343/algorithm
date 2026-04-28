# [Platinum IV] ŠUMA - 10549

[문제 링크](https://www.acmicpc.net/problem/10549)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 13, 맞힌 사람: 13, 정답 비율: 30.233%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>Mirko lives in a big enchanted forest where trees are very tall and grow really quickly. That forest can be represented as an N&middot;N matrix where each field contains one tree.</p>

<p>Mirko is very fond of the trees in the enchanted forest. He spent years observing them and for each tree measured how many meters it grew in a year. The trees grow continuously. In other words, if the tree grows 5 meters in a year, it will grow 2.5 meters in half a year.</p>

<p>Apart from trees, Mirko likes mushrooms from the enchanted forest. Sometimes, he eats suspicious colorful mushrooms and starts thinking about peculiar questions. Yesterday, this unfortunate thing happened and he wondered what would be the size of the largest connected group of trees that are all of equal height if the trees continue to grow at the same speed they&rsquo;re growing at that moment.</p>

<p>Mirko quickly measured the current height of all trees in the forest and asked you to answer his question.</p>

<ul>
	<li>Two trees are adjacent if their fields in the matrix share a common edge.</li>
	<li>Two trees are connected if there is a sequence of adjacent trees that leads from the first to the second.</li>
	<li>A group of trees is connected if every pair of trees in the group is connected.</li>
</ul>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 700).</p>

<p>After the first line, N lines follow, each of them containing N integers.</p>

<p>The i<sup>th</sup> line contains integers h<sub>ij</sub> (1 &le; h<sub>ij</sub> &le; 10<sup>6</sup>), the initial height of tree in the i<sup>th</sup> row and j<sup>th</sup> column, given in meters.</p>

<p>After that, N more lines follow with N integers.</p>

<p>The i<sup>th</sup> line contains integers v<sub>ij</sub> (1 &le; v<sub>ij</sub> &le; 10<sup>6</sup>), the growth speed of the tree in the i<sup>th</sup> row and j<sup>th</sup> column, given in meters.</p>

<p>Warning: Please use faster input methods beacuse the amount of input is very large. (For example, use scanf instead of cin in C++ or BufferedReader instead of Scanner in Java.)</p>

### 출력

<p>The first and only line of output must contain the required number from the task.</p>

### 힌트

<p>Clarification of the second example: after 8 months (two thirds of a year), the trees located at (0, 0), (0, 1) and (1, 0) will be 13/3 meters in height.</p>