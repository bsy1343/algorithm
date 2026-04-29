# [Platinum I] Fences Make Good Neighbors - 32809

[문제 링크](https://www.acmicpc.net/problem/32809)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

기하학, 다이나믹 프로그래밍

### 문제 설명

<p>The King of Gletrian has a large estate that he wishes to divide up into triangular parcels which he then plans to give to deserving (that is, wealthy) followers. The estate is a convex polygon and already has fences around its borders, so the only cost now will be putting in new fences to perform the partitioning of the land. All fences will lie on straight lines between existing corners of the estate and no two fences will cross each other. Being fiscally minded (that is, cheap) he wants to put in the minimum amount of fencing possible.</p>

<p>But there is a problem (there always seems to be, doesn’t there!). He has two sons who already have homes on the estate. One is a cute young lad and the other is a bit obtuse, but the problem lies in that they don't really get along with each other. Because of this, placing a single fence between their two parcels of land is out of the question --- there will be constant bickering between them and at worst some type of physical altercation. However, the King has hope that his two sons might eventually learn to appreciate one another and he feels that all is needed is one good arbiter to serve as a liaison between them. To accomplish this the King wants to place exactly two fences between the brother's parcels, separating the brothers' lands by a single parcel where he'll place some voluntary (that is, conscripted) person to serve as go-between. Given these constraints, the King still wants to minimize the cost of the project, which means minimizing the length of fencing used. In addition, to avoid the brothers' houses, no potential fence which passes directly through a brother's location may be used in the triangulation.</p>

<p>An example (corresponding to Sample Input 1) is shown in Figure E.1, where the brother's locations are indicated by the two plus signs. The partitioning to the right, while using less fencing, is not a solution since there are more than two fences between the brothers' locations. A correct triangulation is shown on the left.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32809.%E2%80%85Fences%E2%80%85Make%E2%80%85Good%E2%80%85Neighbors/725c8369.png" data-original-src="https://boja.mercury.kr/assets/problem/32809-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 434px; height: 150px;"></p>

<p style="text-align: center;">Figure E.1: Sample Input 1. (a) Correct solution. (b) Incorrect solution.</p>

### 입력

<p>Input starts with a single integer $n$ ($6 \leq n \leq 500$), indicating the number of corners of the estate. Following this are $n$ pairs of integers $x_i$ $y_i$ ($|x_i|,|y_i|\leq 3\,000$) specifying the location of each corner, given in clockwise order. No two corner locations are the same and the polygon formed by connecting these corners is convex. No three consecutive corner locations are collinear. The last two lines each contain a pair of coordinates: the first of these lines contains $bx_1$ $by_1$ ($|bx_1|,|by_1|\leq 3\,000$), indicating the location of the first brother, and the second contains $bx_2$ $by_2$ ($|bx_2|,|by_2|\leq 3\,000$), indicating the location of the second brother. The two brother's locations are distinct and lie within the interior of the polygon. All coordinates are in kilometers.</p>

### 출력

<p>Output the minimum length of fencing in kilometers needed to satisfy all the constraints specified above. Answers within an absolute error of $10^{-3}$ of the judges' answer will be deemed correct. If it is not possible to satisfy the conditions stated above, output the word <code>IMPOSSIBLE</code>.</p>