# [Platinum III] The Cow Run - 5834

[문제 링크](https://www.acmicpc.net/problem/5834)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 121, 정답: 81, 맞힌 사람: 72, 정답 비율: 76.596%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John has forgotten to repair a hole in the fence on his farm, and his N cows (1 &lt;= N &lt;= 1,000) have escaped and gone on a rampage! Each minute a cow is outside the fence, she causes one dollar worth of damage. FJ must visit each cow to install a halter that will calm the cow and stop the damage.</p><p>Fortunately, the cows are positioned at distinct locations along a straight line on a road outside the farm. FJ knows the location P_i of each cow i (-500,000 &lt;= P_i &lt;= 500,000, P_i != 0) relative to the gate (position 0) where FJ starts.</p><p>FJ moves at one unit of distance per minute and can install a halter instantly. Please determine the order that FJ should visit the cows so he can minimize the total cost of the damage; you should compute the minimum total damage cost in this case.</p>

### 입력

<ul><li>Line 1: The number of cows, N.</li><li>Lines 2..N+1: Line i+1 contains the integer P_i.</li></ul>

### 출력

<ul><li>Line 1: The minimum total cost of the damage.</li></ul>

### 힌트

<h4>Input Details</h4><p>Four cows placed in positions: -2, -12, 3, and 7.</p><h4>Output Details</h4><p>The optimal visit order is -2, 3, 7, -12. FJ arrives at position -2 in 2 minutes for a total of 2 dollars in damage for that cow.</p><p>He then travels to position 3 (distance: 5) where the cumulative damage is 2 + 5 = 7 dollars for that cow.</p><p>He spends 4 more minutes to get to 7 at a cost of 7 + 4 = 11 dollars for that cow.</p><p>Finally, he spends 19 minutes to go to -12 with a cost of 11 + 19 = 30 dollars.</p><p>The total damage is 2 + 7 + 11 + 30 = 50 dollars.</p>