# [Platinum II] Holding - 18327

[문제 링크](https://www.acmicpc.net/problem/18327)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 14, 맞힌 사람: 14, 정답 비율: 46.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Difficult times lie ahead of Ivica and his Holding &ndash; a group of N Croatian companies that are in his ownership. Each of these companies is in debt so the state sent its attorneys to take everything away from him. We have exclusively found out that Ivica managed to make a deal with the state to leave him certain companies in spite of the massive debt. Which ones? We found that out as well.</p>

<p>The state attorneys have laid out N proprietary papers of Ivica&rsquo;s companies on the table. The debt of first company is written on the first paper A<sub>1</sub>, the debt of the second company is written on A<sub>2</sub>, . . . and the debt of the last company is written on the last paper A<sub>N</sub>. Ivica made a deal with the state to leave the companies A<sub>L</sub>, A<sub>L+1</sub>, . . . , A<sub>R</sub> in his ownership, where L and R represent the positions in an array of papers on the table. Fortunately for Ivica, the attorneys are (also) corrupt. They will force him to take the same contiguous subarray as agreed upon (from L-th to R-th paper), but they will let him swap any two papers on the table for a specific cost. More precisely, swapping papers at positions i and j will cost him |i &minus; j| kunas (Croatian currency). Ivica is desperate. He has only K kunas in his pocket which he now wishes to spend in such a way that the sum of debts of companies he is left with is as small as possible.</p>

<p>Help Ivica achieve his goal.</p>

### 입력

<p>The first line contains four space-separated integers N, L, R (1 &le; L &le; R &le; N &le; 100) and K (0 &le; K &le; 10 000) from the task description.</p>

<p>The second line contains N integers A<sub>i</sub> (0 &le; A<sub>i</sub> &le; 10<sup>6</sup>) from the task description.</p>

### 출력

<p>You should output a single integer which represents the smallest amount of total debt Ivica will have if he spends his K kunas optimally.</p>