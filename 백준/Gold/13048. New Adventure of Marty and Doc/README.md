# [Gold IV] New Adventure of Marty and Doc - 13048

[문제 링크](https://www.acmicpc.net/problem/13048)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

수학, 정렬

### 문제 설명

<p>After Doc&#39;s return from 1885 using time train, he is now excited to try other means of transportation as time machines, so he has created the time airplane! But during the first test of the time airplane, its engines failed, and the airplane crashed. Doc has ejected himself from the cabin and successfully landed using safety parachute, but the airplane has fallen down to a large field and shattered into small parts.</p>

<p>Now the parts of the crashed airplane need to be evacuated and recycled. Marty has drawn the plan of the field, it is a rectangle with n rows and m columns. Each cell of the rectangle contains zero or more parts of the airplane. Marty has decided to put recycling plant at one cell of the field, and bring all parts of the airplane to that cell. A special Doc&#39;s robot will bring all parts of the airplane to the recycling plant. The robot can perform the following three actions:</p>

<ul>
	<li>Move from its current cell to a neighboring cell that shares a side with it.</li>
	<li>If there is an airplane part in the current cell, pick it up. The robot can carry only one part at a time, so if he is already carrying a part, he cannot pick up another one.</li>
	<li>If the robot is in the same cell as the recycling plant and is carrying an airplane part, recycle it.</li>
</ul>

<p>The robot will start from the cell where the recycling plant is located.</p>

<p>Now Marty needs to find out what cell should be used to build the recycling plant to minimize the number of robot&#39;s actions to recycle all the airplane parts. Help him!</p>

### 입력

<p>The first line contains integers n and m (1 &le; n&middot;m &le; 10<sup>6</sup>) &mdash; the size of the field.</p>

<p>The i-th of the following lines contains the description of the i-row of the field: m integers a<sub>i, j</sub> (0 &le; a<sub>i, j</sub> &le; 10<sup>6</sup>) &mdash; the number of airplane parts in the corresponding field cell.</p>

### 출력

<p>Print three integers: r, c and x (1 &le; r &le; n, 1 &le; c &le; m) &mdash; row and column of the optimal position of the recycling plant and the total number of actions that the robot needs to recycle all the airplane parts. If there are several optimal positions for the recycling plant, print any of them.</p>

<p>&nbsp;</p>