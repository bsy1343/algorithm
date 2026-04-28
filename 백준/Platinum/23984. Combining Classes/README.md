# [Platinum IV] Combining Classes - 23984

[문제 링크](https://www.acmicpc.net/problem/23984)

### 성능 요약

시간 제한: 180 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 5, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

이분 탐색, 오프라인 쿼리, 누적 합, 정렬, 스위핑, 두 포인터

### 문제 설명

<p>Supervin is teaching&nbsp;<b>N</b>&nbsp;classes, which are numbered from 1 to&nbsp;<b>N</b>. After giving his most recent exam, he noticed that in each of his classes, the test scores of his students form a sequence of consecutive integers. Therefore, Supervin can summarize the scores for the i-th class as two integers&nbsp;<b>L</b><sub>i</sub>&nbsp;and&nbsp;<b>R</b><sub>i</sub>. This means that the i-th class has&nbsp;<b>R</b><sub>i</sub>&nbsp;-&nbsp;<b>L</b><sub>i</sub>&nbsp;+ 1 students, and for each x (<b>L</b><sub>i</sub>&nbsp;&le; x &le;&nbsp;<b>R</b><sub>i</sub>), there is exactly one student with score x.</p>

<p>Supervin would like to combine the scores from the students from all of his classes and sort the scores in non-increasing order. He has&nbsp;<b>Q</b>&nbsp;questions (numbered from 1 to&nbsp;<b>Q</b>) about this list; for the i-th question, he wants to know what the&nbsp;<b>K</b><sub>i</sub>-th highest score is. (If&nbsp;<b>K</b><sub>i</sub>&nbsp;is greater than the number of students, then the answer for the i-th question is 0.)</p>

<p>Can you help Supervin answer all of his questions? Since there may be many answers, instead of outputting all of them, output proof that you have answered them: the sum of (S<sub>i</sub>&nbsp;&times; i) for all 1 &le; i &le;&nbsp;<b>Q</b>, where S<sub>i</sub>&nbsp;is the answer to the i-th question.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case contains four lines. The first line contains two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>Q</b>&nbsp;as described above. The next three lines each contain six integers in the following format, respectively:</p>

<ul>
	<li><b>X</b><sub>1</sub>&nbsp;<b>X</b><sub>2</sub>&nbsp;<b>A</b><sub>1</sub>&nbsp;<b>B</b><sub>1</sub>&nbsp;<b>C</b><sub>1</sub>&nbsp;<b>M</b><sub>1</sub></li>
	<li><b>Y</b><sub>1</sub>&nbsp;<b>Y</b><sub>2</sub>&nbsp;<b>A</b><sub>2</sub>&nbsp;<b>B</b><sub>2</sub>&nbsp;<b>C</b><sub>2</sub>&nbsp;<b>M</b><sub>2</sub></li>
	<li><b>Z</b><sub>1</sub>&nbsp;<b>Z</b><sub>2</sub>&nbsp;<b>A</b><sub>3</sub>&nbsp;<b>B</b><sub>3</sub>&nbsp;<b>C</b><sub>3</sub>&nbsp;<b>M</b><sub>3</sub></li>
</ul>

<p>These values are used to generate&nbsp;<b>L</b><sub>i</sub>,&nbsp;<b>R</b><sub>i</sub>, and&nbsp;<b>K</b><sub>i</sub>&nbsp;as follows:</p>

<p>We define:</p>

<ul>
	<li><b>X</b><sub>i</sub>&nbsp;= (<b>A</b><sub>1</sub>&nbsp;&times;&nbsp;<b>X</b><sub>i - 1</sub>&nbsp;+&nbsp;<b>B</b><sub>1</sub>&nbsp;&times;&nbsp;<b>X</b><sub>i - 2</sub>&nbsp;+&nbsp;<b>C</b><sub>1</sub>) modulo&nbsp;<b>M</b><sub>1</sub>, for i = 3 to&nbsp;<b>N</b>.</li>
	<li><b>Y</b><sub>i</sub>&nbsp;= (<b>A</b><sub>2</sub>&nbsp;&times;&nbsp;<b>Y</b><sub>i - 1</sub>&nbsp;+&nbsp;<b>B</b><sub>2</sub>&nbsp;&times;&nbsp;<b>Y</b><sub>i - 2</sub>&nbsp;+&nbsp;<b>C</b><sub>2</sub>) modulo&nbsp;<b>M</b><sub>2</sub>, for i = 3 to&nbsp;<b>N</b>.</li>
	<li><b>Z</b><sub>i</sub>&nbsp;= (<b>A</b><sub>3</sub>&nbsp;&times;&nbsp;<b>Z</b><sub>i - 1</sub>&nbsp;+&nbsp;<b>B</b><sub>3</sub>&nbsp;&times;&nbsp;<b>Z</b><sub>i - 2</sub>&nbsp;+&nbsp;<b>C</b><sub>3</sub>) modulo&nbsp;<b>M</b><sub>3</sub>, for i = 3 to&nbsp;<b>Q</b>.</li>
</ul>

<p>We also define:</p>

<ul>
	<li><b>L</b><sub>i</sub>&nbsp;= min(<b>X</b><sub>i</sub>,&nbsp;<b>Y</b><sub>i</sub>) + 1, for i = 1 to&nbsp;<b>N</b>.</li>
	<li><b>R</b><sub>i</sub>&nbsp;= max(<b>X</b><sub>i</sub>,&nbsp;<b>Y</b><sub>i</sub>) + 1, for i = 1 to&nbsp;<b>N</b>.</li>
	<li><b>K</b><sub>i</sub>&nbsp;=&nbsp;<b>Z</b><sub>i</sub>&nbsp;+ 1, for i = 1 to&nbsp;<b>Q</b>.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the sum of (S<sub>i</sub>&nbsp;&times; i) for all 1 &le; i &le;&nbsp;<b>Q</b>, where S<sub>i</sub>&nbsp;is the answer to the i-th question.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 4 &times; 10<sup>5</sup>.</li>
	<li>0 &le;&nbsp;<b>A</b><sub>i</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>i</sub>, for all i.</li>
	<li>0 &le;&nbsp;<b>B</b><sub>i</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>i</sub>, for all i.</li>
	<li>0 &le;&nbsp;<b>C</b><sub>i</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>i</sub>, for all i.</li>
	<li>0 &le;&nbsp;<b>X</b><sub>1</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>1</sub>.</li>
	<li>0 &le;&nbsp;<b>X</b><sub>2</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>1</sub>.</li>
	<li>0 &le;&nbsp;<b>Y</b><sub>1</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>2</sub>.</li>
	<li>0 &le;&nbsp;<b>Y</b><sub>2</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>2</sub>.</li>
	<li>0 &le;&nbsp;<b>Z</b><sub>1</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>3</sub>.</li>
	<li>0 &le;&nbsp;<b>Z</b><sub>2</sub>&nbsp;&lt;&nbsp;<b>M</b><sub>3</sub>.</li>
	<li>1 &le;&nbsp;<b>M</b><sub>i</sub>&nbsp;&le; 10<sup>9</sup>, for all i.</li>
</ul>