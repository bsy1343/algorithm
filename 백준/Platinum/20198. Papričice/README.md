# [Platinum II] Papričice - 20198

[문제 링크](https://www.acmicpc.net/problem/20198)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 140, 정답: 46, 맞힌 사람: 40, 정답 비율: 36.036%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 트리, 집합과 맵, 깊이 우선 탐색, 트리를 사용한 집합과 맵, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p><em>Afrika paprika!</em> &ndash; S.V.</p>

<p>After a tiring morning in the garden, Mr. Malnar decided to reward himself with dried hot peppers he grew himself.</p>

<p>He has n peppers, connected with n &minus; 1 pieces of string, so that every two peppers are connected by some series of strings. Formally, they form a <em>tree</em>.</p>

<p>Mr. Malnar will partake in three lunches today. For that purpose, he will <strong>cut two strings</strong> to get three smaller components, one for each lunch.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4dbc5e0d-9f68-4d67-ada7-3cac4a0d74ba/-/preview/" style="width: 287px; height: 206px;" /></p>

<p style="text-align: center;">The tree from the third example along with the optimal cuts.</p>

<p>It&rsquo;s bad to make any lunch too spicy, so he will choose the cuts in a way that <strong>minimises the difference between the size of the largest and the smallest component</strong>. You need to determine the sought minimum difference.</p>

### 입력

<p>The first line contains an integer n, the number of peppers. The peppers are labeled by integers from 1 to n.</p>

<p>Each of the following n &minus; 1 lines contains two integers x and y (1 &le; x, y &le; n) &ndash; labels of peppers that are directly connected by a piece of string.</p>

### 출력

<p>Print the minimum possible difference of component sizes.</p>

### 힌트

<p>In the first example, each of the possible three ways of cutting the strings yields one component with two peppers and two components with one pepper each. Therefore the answer is 2 &minus; 1 = 1.</p>

<p>In the second example, it&rsquo;s possible to get three components of the same size by cutting the string that connects peppers 1 and 3, and also 3 and 5, so the answer is 0.</p>

<p>Optimal cuts for the thirds example are shown on the figure in the statement. The sizes of the components are 4, 2 and 3, and the answer is 4 &minus; 2 = 2.</p>