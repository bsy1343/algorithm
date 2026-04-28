# [Gold III] Projects - 9118

[문제 링크](https://www.acmicpc.net/problem/9118)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

수학, 다이나믹 프로그래밍, 확률론, 배낭 문제

### 문제 설명

<p>In a certain week, a company wants to finish m projects. To this end, the company can employ at most n people from the unemployment agency for a period of one week. Each external employee will cost the company salary euro, unless the project in which he/she is involved is not completed in time. In that case no payment is due.</p>

<p>For each project the company knows from experience the probability that the project will be completed within a week, as a function of the number of employees working on it. These probabilities are given as percentages p<sub>ij</sub>, where i (with 1 &le; i &le; m) is the number of the project and j is the number of people working on it. Of course, when nobody is working on a project i, the probability p<sub>i0</sub> is zero percent.</p>

<p>If project i is indeed finished within a week, the company earns reward(i) euro; if it is not ready in time, the company has to pay a fine of punishment(i) euro.</p>

<p>Of course the company wants to maximize its total expected profit -&nbsp;Let p (0 &lt; p &lt; 1) be the probability that a job is finished in time, and let E<sub>1</sub> be the profit in that case. Furthermore, let E<sub>2</sub> be the (negative) profit in case the job is not finished in time. Then the expected profit for this particular job is p&sdot;E<sub>1</sub> + (1 &minus; p)&sdot;E<sub>2</sub> -&nbsp;&nbsp;at the end of the week by finding the optimal number of external employees to hire, and how to divide them over the projects. The optimal number of employees is the total number of people needed to achieve the maximal expected profit. Your task in this matter is to calculate this optimal number of external employees. Remember that at most n people are available. Furthermore: if a person is employed, he/she works on one and only one project.</p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with one integer m with 1 &le; m &le; 100: the number of projects.</li>
	<li>One line with one integer n with 0 &le; n &le; 100: the maximal number of available employees.</li>
	<li>One line with one integer salary with 0 &le; salary &le; 1,000: the salary of one employee. Remember that the salary is given in euros.</li>
	<li>m lines, each line corresponding to a project i, containing n integers p<sub>i1</sub>, p<sub>i2</sub>, &hellip;, p<sub>in</sub> (the percentages, with 0 &le; p<sub>i1</sub>, p<sub>i2</sub>, &hellip;, p<sub>in</sub> &le; 100), followed by two integers corresponding to the reward and the punishment for project i. All values are separated by single spaces. Both reward and punishment are given in euros and are between 0 and 100,000 (boundaries included).</li>
</ul>

### 출력

<p>For every test case in the input file, the output should contain two lines.</p>

<ul>
	<li>The first line contains the maximal expected profit in eurocents.</li>
	<li>The second line contains the total number of external employees that must be hired in order to achieve this maximal expected profit. If the maximal expected profit can be achieved by different (total) numbers of employees, then these different numbers must be given in increasing order. Numbers have to be separated by single spaces.</li>
</ul>