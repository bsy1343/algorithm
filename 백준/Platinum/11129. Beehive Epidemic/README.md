# [Platinum II] Beehive Epidemic - 11129

[문제 링크](https://www.acmicpc.net/problem/11129)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 38, 정답: 5, 맞힌 사람: 5, 정답 비율: 26.316%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최대 유량, 이분 매칭

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11129.%E2%80%85Beehive%E2%80%85Epidemic/2185921f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11129/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:287px; width:284px" />In the last couple of months the wretched bee flu has been on the rampage. To battle extinction, the bees of Inner Dreaded Illnessia have set up a system of safe zones in their hives. Sadly, they can&rsquo;t create such zones everywhere (they need somewhere to place the honey as well), so there is always chaos when the bacteria appear in the hive. You need to help the bees, and figure out how many of them can be saved if they organize themselves optimally.</p>

<p>The beehive is a hexagonal grid (see illustration), and a bee can move from the zone where it&rsquo;s located to any neighboring one once every second or it can choose to remain in the same cell (clarification). At the same time, the bacteria will spread from every cell containing it to all its six neighbors once every two seconds. Safe zones stay in the same location (of course). If a bee reaches an empty safe zone before the bacteria does, it can withstand infection by staying there until the danger passes. Due to the functioning of these things, only one bee can stay safe at each of these zones at the same time.</p>

### 입력

<p>The first line of input contains a single number T, the number of test cases to follow. Each test case consists of four lines. The first line contains the numbers N, S and B, the number of bees, safe zones and bacteria, respectively. Then follow three lines describing the initial locations of each of these. The first line describes the locations of the N bees, the second the locations of the S safe zones, while the third describes the locations of the B bacteria. Each line is formatted x<sub>1</sub>y<sub>1</sub>x<sub>2</sub>y<sub>2</sub>...x<sub>k</sub>y<sub>k</sub>, where k represents the amount of locations (N, S or B).</p>

<ul>
	<li>0 &lt; T &le; 150</li>
	<li>0 &lt; N, S &le; 50</li>
	<li>0 &lt; B &le; 1500</li>
	<li>&minus;100 &le; x<sub>i</sub>, y<sub>i</sub> &le; 100</li>
	<li>The bees make up to two moves before the bacteria spread for the first time (and then two more moves before the spread continues, and so on).</li>
	<li>Though only one bee can stay safe at a single safe zone, there is no problem for bees to stay in the same zone (even safe zones).</li>
	<li>The earliest time a bee can be safe at a safe zone is after their first move. That is, they are not hiding &rdquo;just in case&rdquo;.</li>
	<li>The beehive is very large. For the purposes of this problem, assume that the bees won&rsquo;t be able to make it outside (without growing tired and having to take a break until the bacteria catches up).</li>
</ul>

### 출력

<p>For each test case, output one line containing a single number, the maximum amount of bees that can survive the epidemic.</p>