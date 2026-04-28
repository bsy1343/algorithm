# [Platinum IV] Grand Central Station - 17800

[문제 링크](https://www.acmicpc.net/problem/17800)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 189, 정답: 54, 맞힌 사람: 20, 정답 비율: 19.231%

### 분류

해싱

### 문제 설명

<p>The city you live in just finished construction of its new transport network, PlusRail. There are n stations and exactly one way to get between any given pair of them; this is because there are only n &minus; 1 direct station:station connections. In other words, the network forms a tree.</p>

<p>You have been hired to put together the signage for each of the stations which shows where on the network a passenger is with a big arrow pointing to the bright red station in the centre.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/29f19b47-783d-4e3c-b2aa-168c8a89c620/-/preview/" style="width: 614px; height: 203px;" /></p>

<p style="text-align: center;">Figure G.1: Illustration of Sample Input 1 and how two designs are reused four times, with the labels painted at different places.</p>

<p>Because the drawings of the network are fairly crude, it is actually possible that you could use the same sign in more than one station, and just write a different permutation of labels for the station names.</p>

<p>If you want to make signage for the whole network, what is the minimum number of unique designs you will need?</p>

### 입력

<ul>
	<li>The first line of input contains the number of stations, n (1 &le; n &le; 3 &times; 10<sup>5</sup>).</li>
	<li>The following n &minus; 1 lines each contain two distinct vertex indices a and b (1 &le; a, b &le; n) indicating that there is a direct route between these stations.</li>
</ul>

### 출력

<p>Output the minimum number of map designs that can be made, such that for any station at least one of these map designs can be re-labelled such that this station is in the centre.</p>