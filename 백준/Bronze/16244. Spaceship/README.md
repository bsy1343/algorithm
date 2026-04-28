# [Bronze I] Spaceship - 16244

[문제 링크](https://www.acmicpc.net/problem/16244)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 224, 정답: 161, 맞힌 사람: 129, 정답 비율: 68.984%

### 분류

수학, 구현

### 문제 설명

<p>Space Ranger is caught at an alien spaceship. He is surrounded by enemies. To break free he needs to destroy all enemies in some particular order.</p>

<p>There are n enemies around Space Ranger, the i-th of them has power fi. To break free Space Ranger needs to destroy all enemies in such order, that the power of the last destroyed enemy is equal to the sum of powers of all other enemies.</p>

<p>Space Ranger is short of time, so he has failed to find the required order. Help him! Find the way to destroy all enemies and break free.</p>

### 입력

<p>The first line of input contains n &mdash; the number of enemies (2&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;10<sup>5</sup>).</p>

<p>The second line contains n integers f<sub>i</sub> &mdash; powers of the enemies (-10<sup>9</sup>&thinsp;&le;&thinsp;f<sub>i</sub>&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

### 출력

<p>Output values f<sub>i</sub> in order in which the enemies must be destroyed. If there are several ways to destroy all enemies and break free, print any one. It is guaranteed that there is at least one way to do it.</p>