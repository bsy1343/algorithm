# [Platinum III] Forest University (Small) - 14350

[문제 링크](https://www.acmicpc.net/problem/14350)

### 성능 요약

시간 제한: 100 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

수학, 확률론, 무작위화

### 문제 설명

<p>The Forest University offers its students&nbsp;N&nbsp;courses, which must all be taken to obtain the degree. The courses can only be taken one at a time - you must complete a course before starting another. Each course is either&nbsp;basic, which means one can take it without any prior knowledge, or&nbsp;advanced, in which case exactly one other course is its&nbsp;prerequisite.</p>

<p>A student must take the prerequisite for a course before taking the course, although they do not need to be taken immediately one after the other. A course might be the prerequisite for multiple other courses. There are no prerequisite cycles. Any sequence of the&nbsp;N&nbsp;courses that meets the rules for prerequisites is valid for obtaining the degree.</p>

<p>When you graduate, the university commemorates the sequence of courses you have taken by printing an abbreviated version of it on your graduation hat. More precisely, this abbreviated version is a string consisting of the first letter of the name of each course you have taken, in the order you have taken them. For example, if you have taken a Coding course and a Jamming course, in that order, your graduation hat will say&nbsp;<code>CJ</code>. It is considered trendy to have certain&nbsp;cool words&nbsp;as a substring of the string on one&#39;s graduation hat.</p>

<p>Consider all possible valid sequences in which the courses can be taken. For each cool word, you need to find the fraction of those sequences that have the cool word as a substring (at least once) of the string on the corresponding graduation hat. Note that we&#39;re interested in the fraction of possible course sequences,&nbsp;not&nbsp;the fraction of possible different graduation hat strings. (Since multiple courses may start with the same letter, there may be fewer possible strings than course sequences.)</p>

<p>Somewhat unusually for Code Jam, we are only looking for an approximate answer to this problem; pay careful attention to the output format.</p>

<h3>Solving this problem</h3>

<p>This problem has only 1 Small input and no Large input. You will be able to retry the input (with a time penalty).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of five lines, in this order, which contain the following:</p>

<ol>
	<li>the number&nbsp;N&nbsp;of courses.</li>
	<li>N&nbsp;integers; the i-th of these integers gives the number of the prerequisite course for the i-th course, or 0 if the i-th course is basic. The courses are numbered from 1 to&nbsp;N.</li>
	<li>N&nbsp;uppercase English letters (without whitespace in between), with the i-th character giving the first letter of the i-th course&#39;s name.</li>
	<li>the number&nbsp;M&nbsp;of cool words.</li>
	<li>M&nbsp;cool words, each of which consists only of uppercase English letters.</li>
</ol>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;M&nbsp;&le; 5.</li>
	<li>The length of each cool word is between 1 and 20.</li>
	<li>Each cool word consists of uppercase English letters only.</li>
	<li>There are no cycles formed by the prerequisites.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y<sub>1</sub>&nbsp;y<sub>2</sub>&nbsp;... y<sub>M</sub></code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y<sub>i</sub></code>&nbsp;is the fraction of valid course sequences that will have the i-th cool word as a substring of the string on the graduation hat.</p>

<p><code>y<sub>i</sub></code>&nbsp;will be considered correct if it is within an absolute error of 0.03 of the correct answer. See the&nbsp;<a href="https://code.google.com/codejam/faq.html#5-9" target="_blank">FAQ</a>&nbsp;for an explanation of what that means, and what formats of real numbers we accept.</p>

### 힌트

<p>The sample output displays one set of acceptable answers to the sample cases. Other answers are possible within the allowed precision.</p>

<p>In sample case #1, course 1 (<code>C</code>) is a basic course that is a prerequisite for the advanced course 2 (<code>J</code>). The only way to complete the courses is to take course 1 and then course 2. This creates the string&nbsp;<code>CJ</code>. So the cool words&nbsp;<code>CJ</code>,&nbsp;<code>C</code>,&nbsp;<code>D</code>, and&nbsp;<code>JC</code>&nbsp;are present as substrings in 1, 1, 0, and 0 out of 1 possible cases, respectively.</p>

<p>In sample case #2, the basic course 1 (<code>B</code>) is a prerequisite for the advanced course 2 (<code>A</code>), and course 3 (<code>A</code>) is another basic course. There are three possible ways of completing the courses:</p>

<ol>
	<li>take course 1, then course 2, then course 3 (string:&nbsp;<code>BAA</code>)</li>
	<li>take course 1, then course 3, then course 2 (string:&nbsp;<code>BAA</code>)</li>
	<li>take course 3, then course 1, then course 2 (string:&nbsp;<code>ABA</code>)</li>
</ol>

<p>The cool words&nbsp;<code>AA</code>,&nbsp;<code>AAB</code>, and&nbsp;<code>ABA</code>&nbsp;are present as substrings in 2, 0, and 1 out of 3 possible cases, respectively.</p>