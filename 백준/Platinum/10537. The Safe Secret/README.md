# [Platinum II] The Safe Secret - 10537

[문제 링크](https://www.acmicpc.net/problem/10537)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 18, 맞힌 사람: 15, 정답 비율: 51.724%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10537.%E2%80%85The%E2%80%85Safe%E2%80%85Secret/0ab737e2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10537.%E2%80%85The%E2%80%85Safe%E2%80%85Secret/0ab737e2.png" data-original-src="https://www.acmicpc.net/upload/images2/secret.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:138px; width:348px" /></p>

<p>One of the brightest and richest dukes of the nineteenth century built a break-in-proof room for storing his valuables and chose the lock secret code in an ingenious manner. He was so afraid of being robbed that he did not tell anyone the safe secret; he only wrote the way to obtain it on a piece of paper, to be given to his heir on his death.</p>

<ol>
	<li>Look at the bottom of my dukedom ring, which is now yours.</li>
	<li>Write down the numbers and symbols, following a clockwise order, starting at the number closest to the ruby and leaving out the last symbol. That is the first sequence of numbers and symbols. Do the same starting at the next number, with respect to the clockwise order. That is the second sequence of numbers and symbols. Repeat this process, always starting at the next number, until you have started at all numbers. Now you have several sequences of numbers and symbols.</li>
	<li>For each of those sequences of numbers and symbols, do the following.
	<ol style="list-style-type:lower-alpha">
		<li>Replace every ? by a +, a &minus; or a &lowast; symbol. Do that in all possible ways to have several arithmetic expressions.</li>
		<li>Evaluate each of those arithmetic expressions, performing the sums, the differences and the products in any order. Do that in all possible ways to have several values.</li>
		<li>Select the minimum and the maximum of those values.</li>
		<li>Write the digits of the minimum value and append to them the digits of the maximum value. That is the code of the sequence of numbers and symbols.</li>
	</ol>
	</li>
	<li>Concatenate the codes of all sequences of numbers and symbols, respecting the order in which you have obtained the sequences. That sequence of digits is the safe secret.</li>
</ol>

<p>When the duke passed away, his son read the note and tried to find out the safe secret. The first two steps were very easy, because there were only five sequences of numbers and symbols, obtained in the following order:</p>

<pre>
1 ? 5 + 0 ? -2 &minus; -3
5 + 0 ? -2 &minus; -3 &lowast; 1
0 ? -2 &minus; -3 &lowast; 1 ? 5
-2 &minus; -3 &lowast; 1 ? 5 + 0
-3 &lowast; 1 ? 5 + 0 ? -2
</pre>

<p>Then, he moved to the third step and chose to begin with the first sequence of numbers and symbols. Difficulties started in point (a) when he realised that he could create several arithmetic expressions, such as:</p>

<p>1 + 5 + 0 + -2 &minus; -3, 1 &minus; 5 + 0 &lowast; -2 &minus; -3, and 1 &lowast; 5 + 0 &minus; -2 &minus; -3.</p>

<p>So, he decided to understand the remaining rules before completing this task. In point (b), he had to evaluate the arithmetic expressions. It seemed easy. The value of 1 + 5 + 0 + -2 &minus; -3 was 7. But how many different values could he get from 1 &minus; 5 + 0 &lowast; -2 &minus; -3?</p>

<ul>
	<li>If the operations were performed from left to right, ((((1 &minus; 5) + 0) &lowast; -2) &minus; -3), the result would be 11.</li>
	<li>If the operations were performed from right to left, (1 &minus; (5 + (0 &lowast; (-2 &minus; -3)))), the result would be -4.</li>
	<li>If the first difference and the product were performed first, (1 &minus; 5) + (0 &lowast; -2) &minus; -3, the result would be -1.</li>
	<li>And there were so many other alternatives!</li>
</ul>

<p>Almost in despair, he concluded that he had to obtain a huge number of values in the third step. Fortunately, the last rules were actually simple. If -4 was the minimum of the values obtained from the first sequence and 11 was the maximum, the code of the first sequence would be 411. Besides, if the second sequence code was 512, the third sequence code was 613, the fourth sequence code was 714, and the fifth sequence code was 815, the safe secret would be 411512613714815.</p>

<p>Although the duke&rsquo;s son spared no effort in finding the secret, he has never achieved that goal. In fact, no one has managed to open the safe so far. Now that the palace will be transformed into a museum, could you help unveiling the treasure?</p>

<p>Given the sequence of numbers and symbols obtained from the dukedom ring, starting at the number closest to the ruby, following a clockwise order, and including the last symbol, the goal is to find out the safe secret. It is guaranteed that, for the given inputs, any value obtained by the process described above fits in a normal signed 64 bit integer.</p>

### 입력

<p>The first line of the input has one positive integer, k, which is the number of pairs (number, symbol) that form the sequence.</p>

<p>The following line contains 2k elements, n<sub>1</sub>, s<sub>1</sub>, n<sub>2</sub>, s<sub>2</sub>, . . . , n<sub>k</sub>, s<sub>k</sub>, separated by a single space, where n<sub>i</sub> denotes a number and s<sub>i</sub> denotes a symbol that is +, &minus;, &lowast;, or ? (for every i = 1, 2, . . . , k).</p>

### 출력

<p>The output has a single line with the safe secret.</p>

### 제한

<ul>
	<li>2 &le; k &le; 200 Number of pairs (number, symbol) that form the sequence.</li>
	<li>&minus;9 &le; n<sub>i</sub> &le; 9 Number in the sequence.</li>
</ul>