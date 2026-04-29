# [Silver V] skittles - 34432

[문제 링크](https://www.acmicpc.net/problem/34432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 21, 맞힌 사람: 17, 정답 비율: 100.000%

### 분류

구현

### 문제 설명

<p>[Megan's favorite type of candy is Skittles. She likes every single one of the Skittles flavors, and can't decide which one she likes the best. Because of this, she likes eating her Skittles in batches containing one Skittle of each flavor. Unfortunately, most of the time, the bag of Skittles that she gets doesn't have the same number of each Skittle flavor. In these cases, she eats as many batches with all five flavors as possible. Then, when she can no longer eat a batch containing all five flavors, she eats as many batches as possible with four flavors. She continues in this manner until all the Skittles in the bag are gone.</p>

<p>For example, assume Megan's bag of Skittles has six green (<code>G</code>) Skittles, two orange (<code>O</code>) Skittles, two purple (<code>P</code>) Skittles, two red (<code>D</code>) Skittles, and three yellow (<code>Y</code>) Skittles. Then she can have</p>

<ul>
	<li>two batches consisting of all five Skittle flavors (<code>R</code>, <code>O</code>, <code>Y</code>, <code>G</code>, and <code>P</code>),</li>
	<li>zero batches consisting of four different flavors,</li>
	<li>zero batches consisting of three different flavors,</li>
	<li>one batch consisting of two different flavors (<code>Y</code> and <code>G</code>), and</li>
	<li>three batches consisting of a single flavor (<code>G</code>).</li>
</ul>

<p>The sample input below represents the situation above.</p>

<p>In this problem, determine how many batches of each size Megan will be able to eat as well as what Skittles will be included in each batch of that size.</p>

### 입력

<p>The input consists of a single line with a single string that represents all of the Skittles in the bag that Megan plans to eat. The string consists entirely of "R", "O", "Y", "G", "P" characters representing "red", "orange", "yellow", "green", and "purple" Skittles, respectively. The string is not necessary sorted. The number of Skittles (and therefore characters in the string) will be between $1$ and $1\,000\,000$, inclusive.</p>

### 출력

<p>The output consists of five lines containing two values: an integer and a string.  The integer represents how many batches of the given size that can be eaten, and the string represents the colors present in each batch of that size. The ${n}^{th}$ line represents how many batches of size $5 - (n - 1)$ Megan can eat. (In other words, the lines are sorted by the batch size, descending.)</p>

<p>The color characters in the output must be sorted in the following order: $R&lt;O&lt;Y&lt;G&lt;P$.</p>