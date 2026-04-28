# [Gold II] Museum - 11632

[문제 링크](https://www.acmicpc.net/problem/11632)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 14, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

브루트포스 알고리즘, 기하학, 선분 교차 판정

### 문제 설명

<p>In a new wing of the Rijksmuseum in Amsterdam, there is an exhibition of world treasures. The new wing of the museum consists of rectangular rooms. Each room contains exactly one treasure, where each treasure is placed on a square pedestal which is surrounded by glass and wood.</p>

<p>The curator of the Rijksmuseum is intensely worried about treasures being stolen from the new wing of the museum. He decides to place as many distinct security systems as possible in each of the rooms. A security system is composed out of three identical parts, where each part sends an infrared laser beam and has two receivers for detecting the beams sent out by the two other parts. A security system is functional when its parts are placed such that the laser beams form a triangle. In addition, none of the beams forming the triangle is allowed to be obstructed by the pedestal. If there are two security systems in a room that form the same triangle, they are not distinct.</p>

<p>The security system&rsquo;s parts can only be installed on the pillars that are placed against the walls of the room. There is a pillar placed against the wall of the room per every meter of the wall. Also, a pillar is placed in each corner of the room.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11632/1.png" style="height:186px; width:211px" /></p>

<p>Figure 1: An example of a room with length and width of 1 meter. The pedestal is denoted by the square in the top-right corner of the room. The spots represent the pillars where the security system parts are deployed, while the dashed lines represent the infrared laser beams that are sent out by the security system parts. The pedestal blocks the beam that could be sent from the bottom-left pillar to the top-right pillar and subsequently only 2 of the 4 possible distinct security systems can be placed in this room.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11632/2.png" style="height:233px; width:232px" /></p>

<p>Figure 2: An example of a treasure room with length and width of 2 meters. 13 distinct security systems can be placed in this room.</p>

<p>The curator wishes to know the maximum number of distinct security systems that can be installed in each of the rooms of the museum&rsquo;s new wing.</p>

<p>For this problem, assume that the pillars are point-like objects, that an infinite number of parts can be placed on a single pillar and that height is no factor for this problem.</p>

<p>Given the length and width of a room plus the width and location of the treasure pedestal, determine the maximum number of security systems that can be installed in the given room.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line containing two space-separated integers L (1 &le; L &le; 100) and W (1 &le; W &le; 100), the length and width of the room in meters, respectively.</li>
	<li>One line containing three space-separated floating point numbers X (10<sup>&minus;1</sup> &le; X &le; L&minus;2&middot;10<sup>&minus;1</sup>), Y (10<sup>&minus;1</sup> &le; Y &le; W&minus;2 &middot; 10<sup>&minus;1</sup>) and Ws (10<sup>&minus;1</sup> &le; Ws &le; 100&minus;2 &middot; 10<sup>&minus;1</sup>), the x-coordinate, y-coordinate and width of the square pedestal all in meters. The x- and y-coordinates denote the top-left corner of the pedestal. (x = 0, y = 0) denotes the top-left corner of the room.</li>
</ul>

<p>The square pedestal will always fit inside the room and will always be placed such that there is at least a 10<sup>&minus;1</sup> meters distance between the pedestal and the walls of the room. It is guaranteed that the distance from each corner of the pedestal to a potential laser beam (i.e. a line between two pillars) is at least 10<sup>&minus;4</sup> meters.</p>

### 출력

<p>For each test case, output one line containing a single integer: the maximum number of security systems that can be installed in the room.</p>