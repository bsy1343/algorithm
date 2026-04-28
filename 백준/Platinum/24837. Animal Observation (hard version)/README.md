# [Platinum I] Animal Observation (hard version) - 24837

[문제 링크](https://www.acmicpc.net/problem/24837)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 26, 맞힌 사람: 26, 정답 비율: 65.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 누적 합, 느리게 갱신되는 세그먼트 트리, 덱, 덱을 이용한 구간 최댓값 트릭, 덱을 이용한 다이나믹 프로그래밍

### 문제 설명

<p><strong>The only difference between easy and hard versions is the constraint on</strong>&nbsp;$k$.</p>

<p>Gildong loves observing animals, so he bought two cameras to take videos of wild animals in a forest. The color of one camera is red, and the other one&#39;s color is blue.</p>

<p>Gildong is going to take videos for $n$ days, starting from day $1$ to day $n$. The forest can be divided into $m$ areas, numbered from $1$ to $m$. He&#39;ll use the cameras in the following way:</p>

<ul>
	<li>On every odd day ($1$-st, $3$-rd, $5$-th, ...), bring the red camera to the forest and record a video for $2$ days.</li>
	<li>On every even day ($2$-nd, $4$-th, $6$-th, ...), bring the blue camera to the forest and record a video for $2$ days.</li>
	<li>If he starts recording on the $n$-th day with one of the cameras, the camera records for only one day.</li>
</ul>

<p>Each camera can observe $k$ consecutive areas of the forest. For example, if $m=5$ and $k=3$, he can put a camera to observe one of these three ranges of areas for two days: $[1,3]$, $[2,4]$, and $[3,5]$.</p>

<p>Gildong got information about how many animals will be seen in each area each day. Since he would like to observe as many animals as possible, he wants you to find the best way to place the two cameras for $n$ days. <strong>Note that if the two cameras are observing the same area on the same day, the animals observed in that area are counted only once.</strong></p>

### 입력

<p>The first line contains three integers $n$, $m$, and $k$ ($1 \le n \le 50$, $1 \le m \le 2 \cdot 10^4$, $1 \le k \le m$) &ndash;&nbsp;the number of days Gildong is going to record, the number of areas of the forest, and the range of the cameras, respectively.</p>

<p>Next $n$ lines contain $m$ integers each. The $j$-th integer in the $i+1$-st line is the number of animals that can be seen on the $i$-th day in the $j$-th area. Each number of animals is between $0$ and $1000$, inclusive.</p>

### 출력

<p>Print one integer &ndash;&nbsp;the maximum number of animals that can be observed.</p>

### 힌트

<p>The optimal way to observe animals in the four examples are as follows:</p>

<p>Example 1:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1784dcda-9175-4c71-918d-6d6796f4da61/-/preview/" style="height: 267px; width: 332px;" /></p>

<p>Example 2:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d5320fb1-7fe3-46e3-ba22-1ecc0bc06d64/-/preview/" style="height: 200px; width: 200px;" /></p>

<p>Example 3:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c9a774de-fdc2-433a-b506-3a1defabae81/-/preview/" style="height: 200px; width: 200px;" /></p>

<p>Example 4:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c7364ccc-35c7-4910-9421-bb71465d49d9/-/preview/" style="height: 200px; width: 200px;" /></p>