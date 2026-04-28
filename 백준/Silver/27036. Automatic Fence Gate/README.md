# [Silver IV] Automatic Fence Gate - 27036

[문제 링크](https://www.acmicpc.net/problem/27036)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 21, 맞힌 사람: 19, 정답 비율: 19.588%

### 분류

구현, 문자열, 정렬, 시뮬레이션, 파싱

### 문제 설명

<p>Farmer John recently installed an electronic gate between his two fields.  He can control the gate from his home computer by sending it commands such as &quot;raise 10 inches&quot; and &quot;lower 5 inches&quot;.</p>

<p>The gate is considered to be open when it is raised up as high as possible and it is closed when it is lowered to the ground level. FJ had carefully planned the sequence of gate raising and lowering instructions to be sent over the course of the day, but unfortunately a lightning storm scrambled the contents of FJ&#39;s computer.  His list of N (1 &le; N &le; 1000) instructions now appear out of order, for example like the following:</p>

<ul>
	<li>11:30pm raise the gate 5 inches</li>
	<li>10:05am lower the gate 3 inches</li>
	<li>12:03pm raise the gate 6 inches</li>
	<li>04:01am lower the gate 2 inches</li>
	<li>... and so on.</li>
</ul>

<p>FJ had planned to execute these instructions in chronological order starting at midnight (12:00am) and ending at 11:59pm the same day. He remembers that his instructions would have caused the gate to completely close at least once.  Help him determine the total number of minutes the gate would have been closed if he were to execute his instructions in the order he originally planned.</p>

### 입력

<ul>
	<li>Line 1: The single integer N</li>
	<li>Lines 2..1+N: Each line corresponds to an instruction and contains two space-separated fields.  The first is a 7-digit timestamp of the form HH:MMxx where HH denotes hours, MM denotes minutes, and xx is either am or pm. The second entry in each line is an integer indicating the number of inches to raise the gate (negative numbers mean lowering the gate).</li>
</ul>

### 출력

<ul>
	<li>* Line 1: A single integer, giving the number of minutes during the day that the  gate is completely closed.</li>
</ul>

### 힌트

<p>At 1:00am the gate is raised 5 inches, then it is lowered 10 inches at 1:30am, and finally it is raised 1 inch at 1:30pm.</p>

<p>Since we know the gate is closed at some point in time, this must have been the interval from 1:30am to 1:30pm, which lasted for 12 hours (720 minutes).</p>