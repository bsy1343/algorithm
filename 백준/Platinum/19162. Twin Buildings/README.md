# [Platinum V] Twin Buildings - 19162

[문제 링크](https://www.acmicpc.net/problem/19162)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 41, 맞힌 사람: 40, 정답 비율: 70.175%

### 분류

정렬

### 문제 설명

<p>As you might already know, space has always been a problem in ICPC Jakarta. To cope with this, ICPC Jakarta is planning to build <strong>two</strong> new buildings. These buildings should have a shape of a rectangle of the same size. Now, their problem is to find land to build the buildings.</p>

<p>There are N lands available for sale. The i<sup>th</sup> land has a rectangular shape of size L<sub>i</sub> &times; W<sub>i</sub>. For a good feng shui, the building&rsquo;s side should be parallel to the land&rsquo;s sides.</p>

<p>One way is to build the two buildings on two different lands, one on each land (not necessarily with the same orientation). A building of size A &times; B can be build on the i<sup>th</sup> land if and only if at least one of the following is satisfied:</p>

<ul>
	<li>A &le; L<sub>i</sub> and B &le; W<sub>i</sub>, or</li>
	<li>A &le; W<sub>i</sub> and B &le; L<sub>i</sub>.</li>
</ul>

<p>Alternatively, it is also possible to build two buildings of A &times; B on the i<sup>th</sup> land with the same orientation. Formally, it is possible to build two buildings of A&times;B on the i<sup>th</sup> land if and only if at least one of the following is satisfied:</p>

<ul>
	<li>A &times; 2 &le; L<sub>i</sub> and B &le; W<sub>i</sub>, or</li>
	<li>A &times; 2 &le; W<sub>i</sub> and B &le; L<sub>i</sub>, or</li>
	<li>A &le; L<sub>i</sub> and B &times; 2 &le; W<sub>i</sub>, or</li>
	<li>A &le; W<sub>i</sub> and B &times; 2 &le; L<sub>i</sub>.</li>
</ul>

<p>Your task in this problem is to help ICPC Jakarta to figure out the largest possible buildings they can build given N available lands. Note that ICPC Jakarta has to build two buildings of A &times; B; output the largest possible for A &times; B.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100 000) representing the number of available lands. The next N lines each contains two integers: L<sub>i</sub> W<sub>i</sub> (1 &le; L<sub>i</sub>, W<sub>i</sub> &le; 10<sup>9</sup>) representing the size of the land.</p>

### 출력

<p>Output in a line a number representing the largest building that ICPC Jakarta can build with exactly one decimal point (see sample input/output for clarity).</p>