# [Silver II] Magic Maze - 34435

[문제 링크](https://www.acmicpc.net/problem/34435)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 21, 맞힌 사람: 20, 정답 비율: 95.238%

### 분류

구현, 스택, 자료 구조

### 문제 설명

<p>After searching for years, you and your friends have finally found the fabled treasure map and the entrance to its cave. Just as you're about to step in, one of your companions yells, "Wait! Who knows what's on the inside. We should send in a robot to check the path out first." Another responds, "That's a good idea, but there's no way we'll be able to remotely control it through the cave. The walls will block the signal. We need something which can navigate autonomously through the tunnels." Being the only programmer in the expedition, you know what you have to do.  Given a list of actions you get from the map, output the directions the robot should step in. There are $3$ types of actions:</p>

<ul>
	<li>
	<p>Cardinal Actions: "Move North", "Move South", "Move East", and "Move West". For each of these, you take one step in the direction given. For example, if you receive "Move North" as your input, you output a step to the North.</p>
	</li>
	<li>
	<p>Transformation Actions: "Change Direction to Direction" where each "Direction" is a cardinal direction. For example, if you receive "Change North to West", every "Move North" action should output a step to the West. Note that this transformation is not transitive. In the example provided, if a "Change West to East" action came next, "Move North" would still be a step to the West.</p>

	<p>You do not take a step when you receive a Transformation Direction. In addition, a Transformation Action does not affect future Transformation Actions. For example, if you receive: "Change North to South" "Change South to East" "Move North" "Move South" then you would take one step South and one step East.</p>
	</li>
	<li>
	<p>Untransform Actions: "Get rid of last $n$ transformation action(s)" where $n$ is some integer. For example, if you had the following sequence of actions: "Change North to South" "Change West to East" "Get rid of last $1$ transformation action(s)" "Move West" "Move North" then you would take one step West and one step South. Similar to Transformation Actions, you do not take a step when you see an Untransform Action.</p>
	</li>
</ul>

<p>While you code up a solution for the robot, your fellow adventurers speculate why the cave has these space bending properties.</p>

### 입력

<p>The first line gives you a number $n$, where $1 ≤ n ≤ 1\,000\,000$. This number tells you how many actions are coming. The next $n$ lines each contain one action. A Cardinal Action is of the form "Move Direction", where Direction is either North, South, East, or West. A Transformation Action is of the form "Change Direction to Direction" where each Direction is a cardinal direction. Finally, an Untransform Action is of the form "Get rid of last $m$ transformation action(s)", where $m$ will be some integer greater than $0$. When you see an Untransform Action of $m$ actions, you can assume that there will be at least $m$ actions to undo.</p>

### 출력

<p>For each step, output the actual direction you would move in. Every line you output should be a cardinal direction: North, South, East, or West.</p>