# [Platinum I] Task - 4820

[문제 링크](https://www.acmicpc.net/problem/4820)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

그래프 이론, 문자열, 최단 경로, 파싱, 벨만–포드

### 문제 설명

<p>In most recipes, certain tasks have to be done before others. For each task, if we are given a list of other tasks that it depends on, then it is relatively straightforward to come up with a schedule of tasks that satisfies the dependencies and produces a stunning dish. Many of us know that this can be solved by some algorithm called toplogical sort.</p>

<p>But life is not so easy sometimes. For example, here is a recipe for making pizza dough:</p>

<ol>
	<li>Mix the yeast with warm water, wait for 5 to 10 minutes.</li>
	<li>Mix the the remaining ingredients 7 to 9 minutes.</li>
	<li>Mix the yeast and the remaining ingredients together for 10 to 15 minutes.</li>
	<li>Wait 90 to 120 minutes for the dough to rise.</li>
	<li>Punch the dough and let it rest for 10 to 15 minutes.</li>
	<li>Roll the dough.</li>
</ol>

<p>In this case, tasks 1 and 2 may be scheduled after the first minute (we always spend the first minute to read the recipe and come up with a plan). The earliest task 3 may be started is at 8 minutes, and task 4 may start at 18 minutes after the start, and so on. This recipe is relatively simple, but if some tasks have many dependent tasks then scheduling can become unmanageable. Sometimes, the recipe may in fact be impossible to execute. For example, consider the following abstract recipe:</p>

<ol>
	<li>task 1</li>
	<li>after task 1 but within 2 minutes of it, do task 2</li>
	<li>at least 3 minutes after task 2 but within 2 minutes of task 1, do task 3</li>
</ol>

<p>In this problem, you are given a number of tasks. Some tasks are related to another based on their starting times. You are asked to assign a starting time to each task to satisfy all constraints if possible, or report that no valid schedule is possible.</p>

### 입력

<p>The input consists of a number of cases. The first line of each case gives the number of tasks n, (1 &le; n &le; 100). This is followed by a line containing a non-negative integer m giving the number of constraints. Each of the next m lines specify a constraint. The two possible forms of constraints are:</p>

<pre>
task i starts at least A minutes later than task j
task i starts within A minutes of the starting time of task j</pre>

<p>where i and j are the task numbers of two different tasks (1 &le; i, j &le; n), and A is a non-negative integer (A &le; 150). The first form states that task i must start at least A minutes later than the start time of task j. The second form states that task i must start no earlier than task j, and within A minutes of the starting time of task j. There may be multiple constraints involving the same pair of tasks. Note that at least and within include the end points (i.e. if task 1 starts at 1 minute and task 2 starts at 4 minutes, then task 2 starts at least 3 minutes later than task 1, and within 3 minutes of the starting time of task 1).</p>

<p>The input is terminated by n = 0.</p>

### 출력

<p>For each case, output a single line containing the starting times of task 1 through task n separated by a single space. Each starting time should specify the minute at which the task starts. The starting time of each task should be positive and less than 1000000. There may be many possible schedules, and any valid schedule will be accepted. If no valid schedule is possible, print Impossible. on a line instead.</p>