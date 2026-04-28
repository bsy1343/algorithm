# [Gold III] Crossing River - 10198

[문제 링크](https://www.acmicpc.net/problem/10198)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 12, 맞힌 사람: 10, 정답 비율: 37.037%

### 분류

이분 탐색, 구현, 시뮬레이션

### 문제 설명

<p>Doctor Nefario is planning a trip after spending a lot of time doing research in his lab. During the trip he needs to cross a river. Fortunately there are N rocks in the river lying on a straight line across the river that may be used to make the crossing. The width of the river (i.e., the total distance that needs to be crossed) is L.</p>

<p>Doctor Nefario&rsquo;s scooter can hover in the air, but to make the river crossing he wants to build a rocket booster that can make longer jumps. The cost of a rocket booster depends on its quality. More precisely, a rocket booster that can boost jumps up to distance R costs R<sup>2</sup>. The booster may be used multiple times, but each jump costs an additional amount C.</p>

<p>For example, if Doctor Nefario builds a rocket booster that can boost jumps up to distance 10 and uses it to make 5 jumps, the total cost would be 10<sup>2</sup> + 5 &times; C = 100 + 5C.</p>

<p>Given the width of the river L, the cost of each jump C, and the location of N rocks, your goal is to find the minimum cost M for Doctor Nefario to cross the river, the number of jumps J needed, and the range R selected for the rocket booster.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f4c24aa1-4299-425d-be0d-a8793b2d4863/-/preview/" style="width: 527px; height: 268px;" /></p>

<p>For instance, in the figure above Doctor Nefario needs to cross a river of width 6. There are 4 rocks at distances 1, 2, 3, and 5. One possible solution is to build a rocket booster with range 3, which would allow the scooter to cross the river with two jumps.</p>

<p>The parameters of this problem may be quite large: 1 &le; L &le; 10<sup>9</sup>, 0 &le; C &le; 10<sup>6</sup>, and 0 &le; N &lt; 1000. Your implementation should represent these values using long instead of int. Exhaustively checking all possible values for range R will not work in the time allowed.</p>

### 입력

<p>The input consists of multiple test cases. The first line of each test contains three integers L, C and, N: the width of the river, cost of each jump, and the number of rocks, respectively. Each of the next N lines contains an integer specifying the distance of a rock. The input terminates with a line containing just 0.</p>

### 출력

<p>For each test case, print the minimum cost of crossing the river in the following format: Minimum cost M achieved with J jumps of range R</p>