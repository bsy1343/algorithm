# [Gold I] Instruction - 10380

[문제 링크](https://www.acmicpc.net/problem/10380)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 31, 정답: 19, 맞힌 사람: 17, 정답 비율: 58.621%

### 분류

백트래킹, 비트 집합, 그래프 이론, 구현, 시뮬레이션, 트리

### 문제 설명

<p>Ingrid is a head of a big railway station and, among other duties, is responsible for routing trains to the right platforms. The station has one entrance, and there are many switches that direct trains to other switches and platforms.</p>

<p>Each switch has one inbound track and two outbound tracks, platforms have one inbound track, and station entrance has one outbound track. Each outbound track is connected to one inbound track and vice versa. Every switch and platform is reachable from station entrance.</p>

<p>Platforms have a rail dead ends and you may assume that trains disappear from the platform immediately after arriving to it.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10380.%E2%80%85Instruction/4bf034e3.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10380.%E2%80%85Instruction/4bf034e3.png" data-original-src="https://www.acmicpc.net/upload/images2/ingrid.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Each morning Ingrid looks at the timetable and writes switch toggling instruction: when and which switch to toggle. She would like to automate this process to save a lot of time.</p>

### 입력

<p>The first line of the input file contains a single integer n &mdash; the total number of switches and platforms on the station (3 &le; n &le; 51).</p>

<p>The i-th of the following n lines describes a switch or a platform with an index i. Description starts with a character &lsquo;p&rsquo; for a platform or &lsquo;s&rsquo; for a switch. Next number q<sub>i</sub> indicates the number of the switch the inbound track is connected to or 0 if it is connected to station entrance (0 &le; q<sub>i</sub> &lt; i). Description of the platform also contains a unique lowercase English letter &mdash; the platform identifier.</p>

<p>Trains spend exactly one minute to move between two connected switches or a switch and a platform. In the morning, each switch is toggled in a way that a train would pass to the one of the two outbound tracks connected to the switch/platform with the lower number.</p>

<p>Next line of the input file contains a single integer m (1 &le; m &le; 1000) &mdash; the number of trains in timetable.</p>

<p>Each of the following m lines contains integer a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 10 000; a<sub>i</sub> &gt; a<sub>i&minus;1</sub>) &mdash; the time in minutes when a train arrives to the station entrance, and the letter p<sub>i</sub> &mdash; identifier of the destination platform for this train.</p>

### 출력

<p>In the first line output integer c &mdash; the number of commands in the switch toggling instruction. For each command, output two integers s<sub>i</sub> and t<sub>i</sub> (1 &le; s<sub>i</sub> &le; n; 0 &le; t<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the number of the switch and the time to toggle it. Assume that the switch is toggled between minutes t<sub>i</sub> &minus; 1 and t<sub>i</sub>.</p>

<p>Output commands in order of non-decreasing time. The number of commands should not exceed 100 000.</p>

### 힌트

<p>Below is the time trace for the first example.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10380.%E2%80%85Instruction/c4148375.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10380.%E2%80%85Instruction/c4148375.png" data-original-src="https://www.acmicpc.net/upload/images2/instruchint.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>