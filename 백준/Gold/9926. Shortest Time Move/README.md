# [Gold IV] Shortest Time Move - 9926

[문제 링크](https://www.acmicpc.net/problem/9926)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 15, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

데이크스트라, 다이나믹 프로그래밍, 그래프 이론, 최단 경로

### 문제 설명

<p>The Sea of Sword Coast region can be divided into $n\times n$ regions $(1 \leq n \leq 50)$. Each region has different oceanic characteristics. &gt;From a region, a ship can only move to its north, south, east, or west neighbor (if any). The time needed to move from one region to a neighboring one depends only on the destination region. This duration is represented by a positive integer which is at most 1000. For example, if $t[4,4]=10$, then it takes 10 hours from each of the regions $(3,4)$, $(5,4)$, $(4,5)$, or $(4,3)$ to move to region $(4,4)$.</p>

<p>Turning during the Sea Travel is not easy. Sailors need to handle the change of the wind direction. Ships also need to slow down first and gain momentum later. It is mysterious but true, if a ship is already moving in one particular direction, it will take exactly 3 hours to change course. For example, if t[4,4]=10 and t[4,5]=20, then it takes 30 hours to sail the regions (4,3), (4,4), (4,5); but it takes 3 more hours, or 33 hours, to sail regions (3,4), (4,4), (4,5).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9926.%E2%80%85Shortest%E2%80%85Time%E2%80%85Move/ebc2c357.png" data-original-src="https://upload.acmicpc.net/205a99eb-08ef-4b1b-9257-945cf70eedad/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 207px;" /></p>

<p>Now, the Mage Elminster is at region (1,1) and wishes, within the shortest time, to hurry to the Baldur&#39;s Gate which is located at region ($n,n$). Find what the shortest time is. You must remember to include all turning times.</p>

### 입력

<p>The first line of the input contains the integer $n$. The cost array is given in the subsequent $n$ lines: the second line contains the integers $t[1,1]$, $t[1,2]$, $\cdots$, $t[1,n]$; the third line contains the integers $t[2,1]$, $t[2,2]$, $\cdots$, $t[2,n]$; and so on; finally the $(n+1)$-st line contains the integers $t[n,1]$, $t[n,2]$, $\cdots$, $t[n,n]$. Note that $t[1,1]$ is always 0.</p>

### 출력

<p>The output contains only one integer: the minimum time that Elminster needs to reach Baldur&#39;s Gate.</p>