# [Platinum V] Extreme Escalator Pogo (Large) - 12530

[문제 링크](https://www.acmicpc.net/problem/12530)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Robbit Downey Hopper is the famous inventor of the dangerous sport of Extreme Escalator Pogo. This sport is very dangerous; please do not try this at home, even if you do own an escalator. In fact, do not try this anywhere!</p>

<p>Extreme Escalator Pogo requires two things -- a jumping device called a pogo stick, and a fast moving escalator with&nbsp;<strong>N</strong>&nbsp;total steps that are rising up at a constant speed. Some of the steps are red, and the others are blue. Robbit starts by jumping onto a blue step in the middle of the escalator, on his pogo stick. He then continues to jump vertically while the escalator steps are moving underneath him. He must land only on the blue steps; if he lands on a red step, he is out, and his challenger Leepie Froggison gets her chance to jump next. Whoever manages to make the highest jump wins this game.</p>

<p>After touching his first blue step, Robbit always jumps up to a height of 1 and then lands on the next step. (It better be blue, or Robbit is out.) During each subsequent jump (except the first one), he has one of 3 choices:</p>

<ul>
	<li>Dampen his jump to decrease the height by 1,</li>
	<li>Jump to the same height as in his current jump, or</li>
	<li>Amplify the jump to increase the height by 1.</li>
</ul>

<p>A jump of height&nbsp;<strong>H</strong>&nbsp;takes exactly enough time for&nbsp;<strong>H</strong>&nbsp;escalator steps to pass underneath Robbit. Jumps of height zero are not allowed, but there is no limit on the maximum height. Escalator steps are on a loop that cycles forever.</p>

<p>Given&nbsp;<strong>N</strong>&nbsp;and the colour of each escalator step, can you help Robbit choose the best possible starting point and sequence of jumps to maximize the highest point that he can reach?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each one contains an integer&nbsp;<strong>N</strong>, followed by an integer&nbsp;<strong>K</strong>, followed by&nbsp;<strong>K</strong>&nbsp;integers in the range between 1 and&nbsp;<strong>N</strong>&nbsp;inclusive that list the blue colored steps. All other steps are red. After step&nbsp;<strong>N</strong>-1, the next step is&nbsp;<strong>N</strong>, then step 1, then step 2,&nbsp;<em>etc.</em></p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100;</li>
	<li>3 &le;&nbsp;<strong>N</strong>;</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>All step numbers will be different and sorted in increasing order.</li>
	<li><strong>N</strong>&nbsp;&le; 10<sup>9</sup>;</li>
	<li><strong>K</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>:&nbsp;<strong>H</strong>&quot;, where&nbsp;<strong>x</strong>&nbsp;is the case number (starting from 1) and&nbsp;<strong>H</strong>&nbsp;is the maximum height that Robbit can reach. If there is no limit, print &quot;infinity&quot; instead of&nbsp;<strong>H</strong>.</p>

### 힌트

<p>In the first sample case, the best Robbit can do is start with step number 2, then jump to step number 3 (height 1), then jump to height 2 and land on the red step number 1. The maximum height reached this way is 2.</p>

<p>In the second sample case, the best strategy is to start with step number 5, then go to 6 (height 1), 8 (height 2), 1 (height 3), again to 5 (height 4) and finally to 10 (height 5), which is red.</p>

<p>In sample case #3, Robbit can start with step number 1 and continue jumping forever. He can reach any height he wishes (unless he gets hungry or goes into Earth orbit).</p>