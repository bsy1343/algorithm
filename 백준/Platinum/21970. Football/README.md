# [Platinum III] Football - 21970

[문제 링크](https://www.acmicpc.net/problem/21970)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 46, 맞힌 사람: 42, 정답 비율: 49.412%

### 분류

수학, 게임 이론

### 문제 설명

<p>Little Square&rsquo;s school is organising the annual football match. The two team captains are Little Square and Little Triangle. They will select their teams from the N classes in the school. The team selection works in the following way:</p>

<ul>
	<li>Little Square and Little Triangle alternate picking people in turns. Little Square goes first.</li>
	<li>In a turn, only students from a single class can be chosen.</li>
	<li>In a turn, at least one and at most K students can be chosen.</li>
	<li>In a turn, one must select at most as many students as were selected in the previous turn.</li>
	<li>The captain who selects the last student(s) gets the &rdquo;Fo(1)otball&rdquo; prize.</li>
</ul>

<p>The captains do not care how many students they select overall, and all students are identical when it comes to football skill. They only care about the &rdquo;Fo(1)otball&rdquo; prize. Assuming both have perfect strategy, who wins it ?</p>

### 입력

<p>Each test file will contain multiple test cases, describing different scenarios. On the first line you will find T, the number of testcases. Their descriptions follow. On the first line of a testcase you will find N and K. On the second line of a testcase you will find N positive integers, which represent the sizes of the classes in Little Square&rsquo;s school.</p>

### 출력

<p>Output the answers for the T testcases, each on the same line, not separated by spaces. If Little Square wins the prize in a testcase, output <code>1</code>; output <code>0</code> otherwise.</p>

### 제한

<ul>
	<li>T &le; 100,000</li>
	<li>Let &Sigma;N be the sum of the values of N for all testcases in a testfile. Then &Sigma;N &le; 100,000</li>
	<li>K, <em>size of any class</em> &le; 1,000,000,000</li>
</ul>

### 힌트

<p>In the first test, there are 5 students in total, and exactly one student must be selected on each turn (as K = 1). Thus, selection will last exactly 5 turns, and the last student will be selected on Little Square&rsquo;s turn, and Little Square wins.</p>

<p>In the second test, Little Square can first select two students from the first class. Then, after four further turns in which each captain selects one student (since all the classes have only one student at this point), Little Square wins.</p>

<p>In the third test, one winning strategy has Little square first selecting one student.</p>