# [Platinum II] Programming Contest - 8341

[문제 링크](https://www.acmicpc.net/problem/8341)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그리디 알고리즘, 제곱근 분할법

### 문제 설명

<p>Byteman is preparing for the final round of an individual programming contest. During his preparation, he has read both the&nbsp;<b>terms and conditions</b>&nbsp;and&nbsp;<b>organizational rules</b>&nbsp;very carefully and discovered that there will be exactly n&nbsp;tasks in the final round and each of those tasks will be from one of k&nbsp;topics. There can be multiple tasks from the same topic. Byteman knows well all participants of the final round and for each participant he can say what is her&nbsp;<i>skill</i>&nbsp;in each field. Skill is expressed as a positive integer, the greater it is, the higher the skill.</p>

<p>Each task in the final round will have a certain difficulty, represented by a positive integer. Byteman assumes that a task will be solved only by those contestants, whose skill is no less than the difficulty of the task. For each solved task a contestant scores a number of points equal to the difference between her skill and the difficulty of the task. The final ranking is based on the number of the tasks solved (a contestant who solves more tasks is always ranked higher than someone who solves less). Contestants with the same number of tasks solved are sorted basing on their numbers of points (the more points one scores, the higher she is ranked).</p>

<p>Byteman, instead of training hard, started to think whether there exists such a problemset for which he will win. He has problems with determining that and he would like to prepare a bit after all, so he asked you for help. You may assume that if Byteman is tied for the first place, he does not win.</p>

### 입력

<p>The first line of standard input contains a single integer t&nbsp;(1 &le; t &le; 10), the number of test cases. The following lines contain the descriptions of all test cases.</p>

<p>In the first line of each test case there are three positive integers n, m&nbsp;and k&nbsp;(1 &le; n &le; 400, 1 &le; k&middot;m &le; 400), separated by single spaces and representing the numbers of tasks, contestants and topics respectively. m&nbsp;lines follow, each of which describes a contestant. In the&nbsp;i<sup>th</sup>&nbsp;line, there are k&nbsp;integers from the interval [1, 1000], separated by single spaces, representing the skills of i<sup>th</sup>&nbsp;contestant in all topics. The first of those m&nbsp;lines describes Byteman.</p>

### 출력

<p>Write t&nbsp;lines to the standard output, one line per each test case. The answer for a single test case is either&nbsp;<tt>TAK</tt>&nbsp;(meaning YES) or&nbsp;<tt>NIE</tt>&nbsp;(meaning NO), depending on whether Byteman has a chance of winning the final round.</p>

### 힌트

<p>For the first test case, one possible set of tasks that allows Byteman win is: a task from the first topic with difficulty 5, a task from the second topic with difficulty 20 and a task from the third topic with difficulty 75. In such case, the final scores are as follows.</p>

<ol>
	<li>Byteman (contestant 1): 3 tasks, 170 points</li>
	<li>Contestant 6: 3 tasks, 160 points</li>
	<li>Contestant 4: 3 tasks, 100 points</li>
	<li>Contestant 2: 2 tasks, 360 points</li>
	<li>Contestant 3: 2 tasks, 355 points</li>
	<li>Contestant 5: 2 tasks, 160 points</li>
</ol>

<p>For the second test case no required choice of tasks exists.</p>