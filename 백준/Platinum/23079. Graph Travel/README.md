# [Platinum V] Graph Travel - 23079

[문제 링크](https://www.acmicpc.net/problem/23079)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 16, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Ada lives in a magic country A, and she is studying at Magic University. Today, Ada wants to collect magic points in a special space.</p>

<p>The space has&nbsp;$N$ rooms&nbsp;$(0,1, \cdots ,N-1)$. There are&nbsp;$M$&nbsp;corridors connecting the rooms. A corridor $j$&nbsp;connects room&nbsp;$X_j$&nbsp;and room&nbsp;$Y_j$, meaning you can travel between the two rooms.</p>

<p>The&nbsp;$i$-th room contains&nbsp;$A_i$&nbsp;magic points and is protected by a magic shield with properties&nbsp;$L_i$&nbsp;and&nbsp;$R_i$. To enter the&nbsp;$i$-th room, first you need to get to any room adjacent to the&nbsp;$i$-th room (i.e. connected to it by a corridor) through rooms with already broken shields. Then you have to break the shield to this room, but you can break the shield if and only if you have between $L_i$&nbsp;and&nbsp;$R_i$&nbsp;magic points, inclusive. After you break the shield, you will enter the room and automatically collect the&nbsp;$A_i$&nbsp;magic points assigned to this room. The room will not generate new magic points. The room will also not generate a new shield after it is broken, so you can freely go back to every room with already broken shields regardless of the amount of points you have.</p>

<p>Ada starts with&nbsp;$0$&nbsp;magic points and her goal is to find a way to collect exactly&nbsp;$K$&nbsp;magic points. She can start in any room, and end in any room. The room she chooses to start in will automatically have its magic shield broken, and she will automatically collect all the magic points from this room.</p>

<p>After inspecting the map of the rooms and corridors, Ada thinks the task is very easy, so she wants to challenge herself with a more difficult task. She wants to know how many unique ways there are to reach the goal. Two ways are different if their unique paths are different. The unique path is the order of rooms in which she broke the shields, e.g.: if you visit the rooms in the order&nbsp;$(1,3,2,1,3,5,3,6)$, the unique path is&nbsp;$(1,3,2,5,6)$.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>For each test case, the first line contains three integers&nbsp;$N$,&nbsp;$M$, and&nbsp;$K$: the number of rooms, the numbers of corridors, and the numbers of magic points we want to collect, respectively.</p>

<p>The next&nbsp;$N$&nbsp;lines contain three integers&nbsp;$L_i$,&nbsp;$R_i$, and&nbsp;$A_i$: The magic shield properties&nbsp;$L_i$&nbsp;and&nbsp;$R_i$&nbsp;of room&nbsp;$i$, and the number of magic points&nbsp;$A_i$, respectively.</p>

<p>The next&nbsp;$M$&nbsp;lines contain two integers&nbsp;$X_j$&nbsp;and&nbsp;$Y_j$: the rooms that are connected by corridor&nbsp;$j$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the number of ways to collect&nbsp;$K$&nbsp;magic points.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$0 \le M \le \frac{N \times (N-1)}{2}$.</li>
	<li>$0 \le X_j,Y_j \le N-1$.</li>
	<li>$X_j \ne Y_j$.</li>
	<li>Each pair of rooms can be connected by at most one corridor.</li>
</ul>

### 힌트

<p>In the first case, there are $4$&nbsp;different ways. They are:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23079.%E2%80%85Graph%E2%80%85Travel/0e64bb95.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23079.%E2%80%85Graph%E2%80%85Travel/0e64bb95.png" data-original-src="https://upload.acmicpc.net/502abadb-c4cd-4b95-b004-dd35f8524319/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In the second case, there are&nbsp;$8$ different ways. They are:</p>

<p style="text-align: center;"><img alt="" class="img-responsive" src="%EB%B0%B1%EC%A4%80/Platinum/23079.%E2%80%85Graph%E2%80%85Travel/01450b76.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23079.%E2%80%85Graph%E2%80%85Travel/01450b76.png" data-original-src="https://upload.acmicpc.net/3575d9b6-3df6-4e84-911d-b3f060de8fd7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In the third case, there are $4$&nbsp;different ways. They are:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23079.%E2%80%85Graph%E2%80%85Travel/57452a6b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23079.%E2%80%85Graph%E2%80%85Travel/57452a6b.png" data-original-src="https://upload.acmicpc.net/93fa1f78-a060-48f7-859f-d60df2dcbc42/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>