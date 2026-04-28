# [Gold V] Statues - 24566

[문제 링크](https://www.acmicpc.net/problem/24566)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 14, 정답 비율: 100.000%

### 분류

구현, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>Central City is best known for its famous Statue Park. &nbsp;The park is laid out as a grid, with each grid square housing either a statue or some park water feature (see Figure L.1a). &nbsp;The statues come in all shapes and sizes and therein lies the problem, as some of the statues are so large that they obscure the view of others from the main paths surrounding the park --- roads N, E, S and W. &nbsp;The Park Statue Keeper is Milo D. Venus and he wants to move some of the statues so that visitors on two of these paths can see all of the statues. &nbsp;He realizes that one way to do this is to pick a corner of the park and then start placing the statues along the diagonals of the grid in order of the diagonals&#39; distance from the selected corner, skipping over any water feature squares. The smallest statue would be placed in the first diagonal (assuming there is no water feature there). &nbsp;The next smallest statues will be placed in the second diagonal (this could be $0$, $1$ or $2$ statues depending on the number of water feature squares in the diagonal). &nbsp;The next smallest statues are placed in the third diagonal, and so on. With this scheme though there are a lot of choices to make. &nbsp;For example, if you wanted the best viewing to be along roads N and W, you would use the diagonals in Figure L.1b placing the smallest statue in diagonal $a$, the next smallest in diagonal $b$, the next three smallest in diagonal $c$, the next two smallest in diagonal $d$, and so on. &nbsp;If you wanted the best viewing to be along roads W and S you would use the diagonals in Figure L.1c placing the smallest statue in diagonal $a$, the next two smallest in diagonal $b$, the next three smallest in diagonal $c$, the next smallest in diagonal $d$, and so on. &nbsp;Within any diagonal which can fit more than two statues the placement of those statues can be in any order, leading to even more choices.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24566.%E2%80%85Statues/1e41cb9f.png" data-original-src="https://upload.acmicpc.net/4ab6067a-7e68-4d93-b516-ccae81df75b2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure L.1: Statue Park. &nbsp;Figures (b) and (c) show two possible placements of the diagonals</p>

<p>Given all this flexibility it seems natural to pick the scheme that minimizes the number of statues that need to be moved, but which scheme is best is not immediately clear. &nbsp;Now Milo is a very competent administrator and very charming (he&#39;s downright disarming) but he&#39;s not all that great in solving problems like this. &nbsp;Can you carve out some time to help him?</p>

### 입력

<p>Input begins with two positive integers $n$ $m$ ($n,m \leq 50$) specifying the number of rows and columns in the park grid. &nbsp;After this are $n$ rows each containing $m$ integers. &nbsp;The $j^{\text{th}}$ value in the $i^{\text{th}}$ row indicates what is located in row $i$, column $j$ in the park grid. &nbsp;If this value is positive it indicates a statue of that height; if it is $-1$ it indicates a water feature. &nbsp;No two statues will have the same height.</p>

### 출력

<p>Output the minimum number of statues that need to be moved among all the various ways they can be placed with the scheme described above.</p>