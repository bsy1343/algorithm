# [Gold III] Fishception - 32575

[문제 링크](https://www.acmicpc.net/problem/32575)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 12, 맞힌 사람: 11, 정답 비율: 35.484%

### 분류

기하학, 정렬

### 문제 설명

<p>A farmer marked a large rectangle on his field using four stakes hammered into the ground at the corners. The rectangle had a non-zero area. His plan was to dig a pond for pike there.</p>

<p>Unfortunately, the next morning, he found out that a new law on the minimum size of the living space for pike was being proposed. He decided to prepare for the new conditions. He pulled the stakes out of the ground and hammered them in at new positions. Because he wanted to use all the already prepared land, he made sure that the previous rectangle was entirely contained within the new, larger one. He was so meticulous, that no point on the boundary of the new rectangle coincided with a point on the boundary of the previous rectangle.</p>

<p>As it often happens, the next morning, he learned that the minimum size of the living space for pike would be even larger than what had been discussed the previous day. So, he repeated the process, pulled the stakes out, and hammered them in at new positions, only to find out the next day that the space needed to be expanded again. This repeated for several days.</p>

<p>Finally, when the time to vote came, the proposed law was unanimously rejected. The farmer then decided to return to the original marked area. He pulled out the stakes, thinking he would simply place them back into the holes left by the stakes. However, he suddenly realized that his entire field was now full of holes from all the constant stake-shifting, and he no longer knew which four points represented the original rectangle. To make matters worse, he received a call from the Land Management Office, urgently requesting the area of the land he planned to use for the pond.</p>

<p>We know the coordinates of all the holes left by the stakes. Help the farmer determine the area of the original, smallest rectangle.</p>

### 입력

<p>The first input line contains one integer $N$ ($4 ≤ N ≤ 2 \cdot 10^5$), the number of stakes. $N$ is always a multiple of $4$. Each of the next $N$ lines contains two integers $x$ and $y$ ($-10^9 ≤ x, y ≤ 10^9$), specifying the coordinates of one stake. No two stakes share the same coordinates.</p>

### 출력

<p>Output one integer specifying the area of the rectangle marked on the first day of the farmer’s efforts.</p>