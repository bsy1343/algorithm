# [Platinum III] Oreperations Research - 21153

[문제 링크](https://www.acmicpc.net/problem/21153)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>You run a massive mining facility that extracts ore from a mine and loads it onto long trains for shipment to factories around the nation. A train consists of $n$ cars, where car $i$ has capacity $c_i$, indicating how many tons of ore it can carry. Ore is dropped into the train cars at an overhead loading station from two separate queues of mine carts that run on either side the train. As with the train cars, mine carts hold varying loads of ore. Queue $A$ has $r$ carts, and cart $A_i$ carries a load of $a_i$. Similarly, queue $B$ has $s$ carts, and cart $B_i$ carries a load of $b_i$. Initially train car $1$ is at the loading station, and carts $A_1$ and $B_1$ are available to dump ore into it. The train car currently in the station can be given the load from the front cart in the $A$ queue, the front cart in the $B$ queue, or from both. If a cart doesn&#39;t dump its ore, it remains at the loading station; if it does dump its ore, it cycles back into the mine, loads up on ore, and rejoins the end of its queue. Meanwhile, the next cart in the queue moves into place and is available to dump ore. &nbsp;Carts may not drop partial loads of ore and may not leave the loading station until they&#39;ve emptied. &nbsp;Similarly train cars may not be over-filled and may not leave the loading station until they are filled to capacity. &nbsp;As soon as a train car is filled to capacity it leaves the loading station and the next train car pulls in. Your task is to determine whether given sequences of mine carts can be used to fill a given sequence of train cars to their capacity.</p>

<p>Figure 1 shows an example of the process. &nbsp;Here queue $A$ has three mine carts carrying loads $4$, $3$ and $2$, queue $B$ has four mine carts carrying loads $1$, $5$, $2$ and $2$, and the train has three cars with capacities $8$, $5$ and $4$. &nbsp;The starting setup is shown in the leftmost image. &nbsp;After (say) the first car in queue $A$ dumps its load into the first train car it goes back to the mine and (eventually) returns to the end of the line in queue $A$. &nbsp;This situation is shown in the second image, where &nbsp;the first train car still has capacity $4$ to be filled. &nbsp;This can be accomplished by dumping ore from the front car of both queues $A$ and $B$. Once filled, the first train car moves out of the loading station leaving an alignment of cars and carts shown in the third image. &nbsp;Here, the only way to fill the train car is for the front car of queue $B$ to dump its load. &nbsp;This leads to the final image. &nbsp;Here the last train car can be filled either by the front cars of both queues or the first two cars of queue $B$. &nbsp;Note that if the third train car had capacity $3$ it could not be filled to full capacity.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21153.%E2%80%85Oreperations%E2%80%85Research/b4aca991.png" data-original-src="https://upload.acmicpc.net/584d4609-39a6-4512-9b67-0753b981e97b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 809px; height: 188px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Sample Input $1$</p>

### 입력

<p>Input begins with a line containing three positive integers $r$ $s$ $n$ ($r,s \leq 50, n \leq 100)$ indicating the number of carts in queues $A$ and $B$ and the number of train cars, respectively. This is followed by three lines containing the values $a_1, a_2, \ldots, a_r$, $b_1, b_2, \ldots, b_s$, and $c_1, c_2, \ldots, c_n$, the capacities of the $A$ carts, the $B$ carts and the train cars, respectively. &nbsp;The maximum capacity of any cart is $200$ and the maximum capacity of any train car is $2\,000\,000$.&nbsp;</p>

### 출력

<p>Output <code>Yes</code> or <code>No</code> indicating whether all of the train cars can be filled to capacity.</p>