# [Gold I] Hussites - 35391

[문제 링크](https://www.acmicpc.net/problem/35391)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

기하학, 수학

### 문제 설명

<p>In some of the battles fought by the Hussites on open plains, they employed — in addition to their famous wagon fortifications — another unexpected tactic that made use of the spare lighter or smaller wagons, which could not be incorporated into the main defensive formation.</p>

<p>For their enemies, they prepared what was called a false escape route. Among those spare wagons, they deliberately left various gaps, suggesting an unbending path, the false escape route, as if leading out of the battlefield along an absolutely straight line. Hussite fighters remained hidden and ready behind these wagons, from where they would charge at demoralized individuals or groups attempting to flee the engagement.</p>

<p>From experience, they knew how crucial the position of each wagon was relative to the false escape route. A wagon was said to be powerful if, within the group of these wagons, there was another wagon positioned so that the escape route was at the same distance from both wagons, and moreover, the straight line connecting the two wagons was perpendicular to that route.</p>

<p>The tactical advantage of such a configuration was clear: attackers could rush simultaneously from opposite sides at any opponent caught on the false route, leaving little chance of effective resistance. It was therefore desirable to arrange the wagons so that as many of them as possible were powerful.</p>

<p>Several sketches showing wagon arrangements have been preserved in regional archives, though it is uncertain whether they depict genuine battle layouts involving a false escape route. What is known — in modern terminology — is that the tactic of the false escape route was employed whenever, in a given arrangement, at least $P$ percent of the wagons in the arrangement were powerful, where $P$ was a specified value for that situation. Sometimes a wagon could even stand directly on the false escape route, but such a wagon was never counted among the powerful ones.</p>

<p>For a given wagon arrangement, determine whether it would have allowed the use of the false escape route tactic. We suppose that the positions of the wagons are fixed and that no wagon can be moved elsewhere.</p>

### 입력

<p>The first line contains two integers $N$, $P$ ($1 \le N \le 1500$, $0 \le P \le 100$), the number of wagons in the configuration and the required percentage of wagons that must be powerful for the false escape route tactic to be applicable.</p>

<p>Each of the next $N$ lines contains two integers $x$ and $y$ ($-10^6 \le x, y \le 10^6$), the Cartesian coordinates of a point representing a wagon position. All points are pairwise distinct.</p>

### 출력

<p>Print <code>YES</code> if the configuration of wagons given by the input points allows employing the false escape route tactic; otherwise, print <code>NO</code>.</p>