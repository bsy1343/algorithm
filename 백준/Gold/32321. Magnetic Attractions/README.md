# [Gold III] Magnetic Attractions - 32321

[문제 링크](https://www.acmicpc.net/problem/32321)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 17, 맞힌 사람: 15, 정답 비율: 93.750%

### 분류

수학, 기하학, 피타고라스 정리

### 문제 설명

<p>You have a new job. You are working with magnets. You have a metal bearing that will lie on a 2D plane. You have two magnets: one weak and one strong. You know that the force exerted upon an object by a magnet is inversely proportional to the square of the distance between the two objects, but linearly proportional to the strength of the magnet. The formula is:</p>

<p style="text-align: center;">force = strength / distance<sup>2</sup></p>

<p>Given the locations of two magnets in the 2D plane and the strength of each magnet, determine the area of the region in which a metal ball bearing can be placed in the grid, such that the force of the weaker magnet upon the bearing is more than the force of the stronger magnet, i.e., the bearing is more attracted to the weaker magnet than the stronger magnet.</p>

### 입력

<p>The first input line contains three integers: s, x, y (1 &le; s, x, y &le; 300), representing the strength, x and y coordinate of the weaker magnet. The second input line contains three integers: S, X, Y (1 &le; S, X, Y &le; 300), providing the information for the stronger magnet following the same format as the first input line. You are guaranteed that s &lt; S and that the two magnets will not be in the same location.</p>

### 출력

<p>Print a single number representing the area of the region in which a bearing could be placed such that the force between the bearing and the weak magnet is more than the force between the bearing and the strong magnet. Any answer within an absolute or relative error of 10<sup>-6</sup> will be accepted.</p>

<p>Assume that the region is convex and bounded. Note that the region should not include the area where the forces between the bearing and the two magnets are equal.</p>