# [Gold V] Six Degrees - 11633

[문제 링크](https://www.acmicpc.net/problem/11633)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 53, 정답: 31, 맞힌 사람: 27, 정답 비율: 55.102%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>For years and years, the ICT Senior Service Desk (ISSD) of the university has been confronted with a slow wired network that gives unexpected time-outs and seemingly random slow connection speeds. A new manager has been hired to solve these problems once and for all. The manager does not have any computer science or IT knowledge, but he does happen to have a strong background in sociology. He quickly finds that the network problems only affect devices of old professors with an office in some distant corner of the building.</p>

<p>Obsessed by the idea of six degrees of separation, the new manager proposes a rule to counter the network problems. This rule says that any two devices in the network should be connected via at most 5 intermediary devices. So, given the current lay-out of the university&rsquo;s wired computer network, he decides to prepare a list of all devices of peripheral professors that are currently not able to connect to all other devices within 6 steps. The manager&rsquo;s solution to the network problems is then to disconnect all devices on this list from the wired network at once. He explicitly ignores the fact that, possibly, then disconnecting these devices in a particular order may lead to a network structure such that some devices on the list actually no longer have to be disconnected, or that afterwards additional devices may have to be disconnected or connected to reach the actual desired result.</p>

<p>The board of the university, not having a background in computer science, IT or sociology is also not bothered by whether or not the proposed solution is correct, but will instead only base its decision on whether or not the prepared list of devices to be disconnected is not too long, so that not too many professors would be affected. The board will therefore only approve the plan if no more than 5% of the wired network devices is on the list.</p>

<p>Given the lay-out of the network, in the form of a list of pairs of IP addresses or hostnames representing directly connected devices, determine whether or not the university board will allow the new manager to execute his plan.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line containing an integer 1 &le; M &le; 30,000 denoting the number of (directly) connected pairs of devices (with at most 3,000 unique devices).</li>
	<li>M lines, each line containing two IP addresses or hostnames of (directly) connected devices, represented by two strings of ASCII characters (of length &le; 64) without whitespace.</li>
</ul>

<p>Each pair of connected devices is included once in the input file. All connections are bidirectional. You may assume that all devices in the university network are in the same connected component of devices.</p>

### 출력

<p>For each test case, output one line containing either YES if the plan is allowed to be executed or NO if the plan is not allowed to be executed.</p>