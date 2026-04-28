# [Gold IV] Suspension Bridges - 15432

[문제 링크](https://www.acmicpc.net/problem/15432)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 189, 정답: 51, 맞힌 사람: 42, 정답 비율: 27.451%

### 분류

이분 탐색, 수학, 매개 변수 탐색

### 문제 설명

<p>Mountain villages like to attract tourists by building suspension bridges, such as the one depicted here in the Harz Mountains in Germany. These bridges allow adventurously-inclined people to seek their thrills by crossing over deep gorges. To make sure that everyone gets just the right amount of excitement, the sag at the deepest point of the bridge should be significant relative to the distance the bridge covers.</p>

<p>Given the distance between the anchor points where the bridge is attached, and given a desired amount of sag, compute how long each of the cables holding the suspension bridge needs to be!</p>

<p>To help you solve this task, here is some background: A free-hanging suspension bridge will take on the form of a catenary curve (catena is Latin for chain), just like a free-hanging chain between two poles. Given the horizontal distance d between two anchor points and the desired amount s the cable is sagging in the center, there exists a positive parameter a such that a + s = a &middot; cosh(d/2a). The length of the cable is then given by ℓ(a,d) = 2a &middot; sinh(d/2a).</p>

<p>The functions sinh and cosh denote the hyperbolic sine and hyperbolic cosine, respectively, which are defined as follows:</p>

<p style="text-align:center">\(\sinh{x} = \frac{e^x-e^{-x}}{2}\) \(\cosh{x} = \frac{e^x+e^{-x}}{2}\)</p>

### 입력

<p>The input consists of a single test case with two space-separated integers d and s given on a single line such that 0 &lt; d &le; 1 000 and 0 &lt; s &le; 1 000. The number d denotes the distance between the anchor points and s is the desired sag at the center of the bridge.</p>

### 출력

<p>Output the length of cable needed to cover the distance between the anchor points to achieve the desired sag. Your answer should be correct within an absolute error of 10<sup>&minus;4</sup>.</p>