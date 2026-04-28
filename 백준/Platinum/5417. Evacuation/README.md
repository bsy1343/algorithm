# [Platinum III] Evacuation - 5417

[문제 링크](https://www.acmicpc.net/problem/5417)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The police of Delft has received a message that a bomb has been placed in the city&rsquo;s highest building. A crisis team is formed, and they decide to evacuate the building as fast as possible. Luckily it is past five, and most people have already left the building. Using the building&rsquo;s security cameras, the crisis team could easily make a list of the people left in the building, and the floors where they stay. The crisis team decides to use a single elevator for evacuation, one that happens to be at the top floor of the building.<br />
To minimize the risk of the bomb being activated by the vibrations of the elevator, the elevator will only move down, and move down only once. An evacuation plan is made, and using the building&rsquo;s intercom, the people in the building are asked to use the stairs (upwards or downwards) to the floor where they will be picked up by the elevator. The elevator happens to be located next to the stairs. Some people on the lower floors may have to leave the building using only the stairs.</p>

<p>The elevator needs a constant time to move down a floor, and to close its doors (time needed to open the doors is ignored). People take a constant time to walk down or up a staircase as well. At the beginning, the doors of the elevator are closed.</p>

<p>Your task is to write a program to make the fastest evacuation plan possible, and calculate how fast everybody in the building can reach the ground floor.</p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>A line with three positive integers, m (m &le; 100): the time it takes the elevator to move down one floor, s (s &le; 100): the time needed for the elevator to close its doors after the last person on a floor has entered the elevator, and w (w &le; 100): the time needed for a person to walk to the next floor either up or down, using the stairway.</li>
	<li>A line with two integers n<sub>f</sub> and n<sub>w</sub>. The number n<sub>f</sub> (0 &lt; n<sub>f </sub>&le; 1000) is the total number of floors in the building (excluding ground level), and n<sub>w</sub> (0 &le; n<sub>w</sub> &le; n<sub>f</sub> + 1) is the number of floors on which people are waiting to be evacuated (these buildings really have huge elevators!).</li>
	<li>n<sub>w</sub> lines, each with one integer, f<sub>i</sub>, the floor on which persons are present (0 &le; f<sub>i </sub>&le; n<sub>f</sub> ). Per test case, all f<sub>i</sub> are unique. According to European convention the ground floor has number 0.</li>
</ul>

<p>You may assume that all people involved will fit into the elevator.</p>

### 출력

<p>For every test case in the input file, the output should contain a single number, on a single line: the time needed to get everybody in the building on the ground floor.</p>