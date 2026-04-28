# [Platinum V] Maple Roundup - 6962

[문제 링크](https://www.acmicpc.net/problem/6962)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 369, 정답: 203, 맞힌 사람: 191, 정답 비율: 57.530%

### 분류

기하학, 볼록 껍질

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6962.%E2%80%85Maple%E2%80%85Roundup/4c20bc83.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6962.%E2%80%85Maple%E2%80%85Roundup/4c20bc83.png" data-original-src="https://upload.acmicpc.net/de31e70e-f1e2-4192-91c1-0f1df9cd8f97/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>An Elmira area maple syrup producer was selected as the winner of this year&#39;s CCC (Canadian Confectionery Competition) and the judge wants to place a blue ribbon around the sugar bush. To do this, she finds the most northerly tree (if there is more than one most northerly tree, any one will do) and stands at the position of that tree, facing due East. She then turns to the right until she is facing another tree, and walks to that tree in a straight line, measuring the distance. Once again she turns right until she faces a tree, and walks to it. At each step she chooses the tree that involves turning the least angle to the right, continuing until the starting tree is reached. The total distance travelled is the length of ribbon required. Your task is to calculate this length.</p>

### 입력

<p>The input to the program will consist of a line containing an integer $m$ followed by $m$ data sets. Each data set consists of a line containing an integer $1 &lt; n &lt; 100$, the number of trees in the bush, and this is followed by $n$ lines each with an ordered pair $(x, y)$ of integers which give the location of a tree on the Cartesian grid. You may assume that the $y$-axis points North while the $x$-axis points East.</p>

### 출력

<p>For each test case, the output from the program is the length of ribbon, to $2$ decimal places, that can enclose every tree.</p>