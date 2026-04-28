# [Platinum V] Cave - 20106

[문제 링크](https://www.acmicpc.net/problem/20106)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 32 MB

### 통계

제출: 103, 정답: 53, 맞힌 사람: 51, 정답 비율: 51.515%

### 분류

이분 탐색

### 문제 설명

<p>While lost on the long walk from the college to the UQ Centre, you have stumbled across the entrance to a secret cave system running deep under the university. The entrance is blocked by a security system consisting of N consecutive doors, each door behind the previous; and N switches, with each switch connected to a different door.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e31ec5b9-9bff-4a31-85a1-8aa8bd2e8cf2/-/preview/" style="width: 425px; height: 194px;" /></p>

<p>The doors are numbered 0, 1, &hellip;, (N -1) in order, with door 0 being closest to you. The switches are also numbered 0, 1, &hellip;, (N - 1) , though you do not know which switch is connected to which door.</p>

<p>The switches are all located at the entrance to the cave. Each switch can either be in an up or down position. Only one of these positions is correct for each switch. If a switch is in the correct position then the door it is connected to will be open, and if the switch is in the incorrect position then the door it is connected to will be closed. The correct position may be different for different switches, and you do not know which positions are the correct ones.</p>

<p>You would like to understand this security system. To do this, you can set the switches to any combination, and then walk into the cave to see which is the first closed door. Doors are not transparent: once you encounter the first closed door, you cannot see any of the doors behind it.</p>

<p>You have time to try 70,000 combinations of switches, but no more. Your task is to determine the correct position for each switch, and also which door each switch is connected to.</p>

### 입력



### 출력



### 제한

<ul>
	<li>1 &le; N &le; 5,000</li>
</ul>