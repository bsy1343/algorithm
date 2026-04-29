# [Platinum I] Seagull Population - 35121

[문제 링크](https://www.acmicpc.net/problem/35121)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 17, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>An island on an extrasolar planet is famous as a good bird-watching spot, where you can see many seagull-lookalikes (simply called seagulls hereafter) throughout a year. The planet is quite similar to the Earth, but the number of days in a year is different.</p>

<p>Each seagull comes to the island exactly once a year, stays for a while, and leaves exactly once a year as well. Each seagull has its own schedule of coming and leaving the island, and quite punctually sticks to the schedule. That is, every year, it comes to the island on the same day of the year. Also, every year, it leaves on the same day of the year. Seagulls come to the island early in the morning and leave late in the afternoon. Seagulls that have come to the island may leave on the same day. On the other hand, seagulls may leave the island on one day and come again on the next day.</p>

<p>Members of the bird-watching club count the number of seagulls staying on the island every day around noon. Their counting is perfect, so that all seagulls present at that time are counted without any omission or duplication. However, the seagulls look so similar that identifying individuals is not possible.</p>

<p>Note that seagulls that leave the island on one evening and come again on the next morning are counted on all days in a year.</p>

<p>Given the daily counts of seagulls throughout a year, you want to know the total number of seagulls visiting the island. Since seagulls are indistinguishable, it is not possible to know the exact number. For example, if the counts are one on two consecutive days, the number of seagulls may be one or two. The minimum possible number is the only valuable information you can obtain.</p>

<p>Determine the minimum possible number of individual seagulls counted at least once in a year. If this minimum is small enough, also show a possible list of their stay periods that attains this minimum.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$</p>

<p>$b_1$ $b_2$ $\cdots$ $b_n$</p>
</blockquote>

<p>The integer $n$ ($2 ≤ n ≤ 2 \times 10^5$) is the number of days in one year on that planet. Days are numbered from $1$ to $n$ throughout a year. The integer $b_i$ ($0 ≤ b_i ≤ 2 \times 10^5$) is the number of seagulls counted on day $i$. At least one of $b_i$’s is non-zero.</p>

### 출력

<p>Output the minimum possible number $m$ of seagulls in the first line. If $m$ is not greater than $2 \times 10^5 $, then output $m$ additional lines describing one possible list of their stay periods. The $j$-th of these $m$ lines should contain two integers $s_j$ and $t_j$ ($1 ≤ s_j ≤ n$, $1 ≤ t_j ≤ n$) separated by a space, representing that the $j$-th seagull comes to the island on day $s_j$ and leaves on day $t_j$. Note that $s_j$ may be greater than $t_j$. In this case, the seagull stays on the island across years, from the last day of a year to the first day of the following year. When there are two or more possibilities, any of them is acceptable.</p>

### 힌트

<p>The following figure depicts the visiting schedules of three seagulls in Sample Output 1. Note that the third seagull stays in the island across years.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35121.%E2%80%85Seagull%E2%80%85Population/5ed1f263.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35121-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 195px;"></p>

<p style="text-align: center;">Figure C.1. Visiting schedules of the seagulls of Sample Output 1</p>