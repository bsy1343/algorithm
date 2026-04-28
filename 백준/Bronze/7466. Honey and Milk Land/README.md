# [Bronze I] Honey and Milk Land - 7466

[문제 링크](https://www.acmicpc.net/problem/7466)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 391, 정답: 170, 맞힌 사람: 140, 정답 비율: 44.586%

### 분류

수학, 기하학, 피타고라스 정리

### 문제 설명

<p>Bad rumors are spreading over the Land of Honey and Milk. Informed people say that the milk in the famous grid of milk rivers is turning sour. Of course, the security service quickly found out that the people are informed by the Kingdom of Tar, which is jealous to tourist popularity of the land. However, this discovery does not help to stop these rumors. The government wants to prevent crisis of the tourist industry, so it wants to establish daily monitoring of the rivers.</p>

<p>A new Milk Security Department is established, which is responsible for preventing the milk from turning sour. It&rsquo;s equipped with powerful boilers and pasteurizer, so any danger for the milk can be quickly neutralized. To better fight the new threat, the department needs to know about possible dangers beforehand. They have a helicopter, capable to check milk freshness. The equipment is perfect. It&rsquo;s enough just to cross a river in any place in order to detect all its potentially dangerous places.</p>

<p>To start the Milk Security Department operations, the government needs to add funding of the Service to the Land budget. One of the issues is the morning route of the helicopter. The helicopter should check all the rivers in the shortest time. They need to determine the price of this flight to add it to the budget.</p>

<p>The grid consists of two sets of milk rivers. Rivers from the first set run from North to South, rivers from the second set &mdash; from East to West. The rivers are straight. The rivers from each set are parallel and the distance between the adjacent rivers is known. There are n rivers, running from North to South and e rivers, running from East to West.</p>

<p>The government needs to determine the minimal morning flight cost. Each kilometer costs 1 honey barrel, the Land national currency. The cost of take-off and landing is not included into this cost. You may freely choose the starting and ending points of the flight.</p>

### 입력

<p>The first line of the input file contains n and e (1 &le; n, e &le; 1 000). The second line contains n &minus; 1 integer numbers that represent distances (in kilometers) between adjacent rivers running from North to South, listed from East to West. The third line contains e &minus; 1 integer numbers that represent distances (also in kilometers) between adjacent rivers running from East to West, listed from North to South. The distance between any two adjacent rivers does not exceed 27 kilometers.</p>

### 출력

<p>Output the minimal morning flight cost in honey barrels. Since there is no smaller denomination, you must output the minimal integer number of honey barrels that would be sufficient to support the flight.</p>