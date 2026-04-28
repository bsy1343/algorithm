# [Silver II] Cranes - 4188

[문제 링크](https://www.acmicpc.net/problem/4188)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 26, 맞힌 사람: 26, 정답 비율: 50.980%

### 분류

브루트포스 알고리즘, 기하학, 비트마스킹, 피타고라스 정리

### 문제 설명

<p>A crane is a wonderful tool for putting up a building. It makes the job go very quickly. When the building must go up even faster, more than one crane can be used. However, when there are too many cranes working on the same building, it can get dangerous. As the cranes spins around, it can bump into another crane if the operator is not careful. Such an accident could cause the cranes to fall over, possibly causing major damage. Therefore, safety regulations require cranes to be spaced far enough apart so that it is impossible for any part of a crane to touch any part of any other crane. Unfortunately, these regulations limit the number of cranes that can be used on the construction site, slowing down the pace of construction. Your task is to place the cranes on the construction site while respecting the safety regulations.</p>

<p>The construction site is laid out as a square grid. Several places on the grid have been marked as possible crane locations. The arm of each crane has a certain length r, and can rotate around the location of the crane. The crane covers the entire area that is no more than r units away from the location of the crane. You are to place the cranes to maximize the total area covered by all the cranes.</p>

### 입력

<p>The first line of input contains one integer specifying the number of test cases to follow. Each test case begins with a line containing an integer C, the number of possible locations where a crane could be placed. There will be no more than 15 such locations. Each of the following C lines contains three integers x, y, and r, all between -10 000 and 10 000 inclusive. The first two integers are the grid coordinates of the location, and the third integer is the length of the arm of the crane that can be placed at that location.</p>

### 출력

<p>For each test case, find the maximum area A that can be covered by cranes, and output a line containing a single integer B such that A = B &times; &pi;.</p>

<p>&nbsp;</p>