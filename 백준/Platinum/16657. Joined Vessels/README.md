# [Platinum I] Joined Vessels - 16657

[문제 링크](https://www.acmicpc.net/problem/16657)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 36, 맞힌 사람: 32, 정답 비율: 58.182%

### 분류

자료 구조, 누적 합, 스택, 오프라인 쿼리

### 문제 설명

<p>John is doing physics practice at school. Today he is studying the law of communicating vessels. This law states that if we have a set of communicating containers with a homogeneous liquid, when the liquid settles, it balances out to the same level in all of the containers regardless of their shape and volume.</p>

<p>In the lab, John has a set of n cylindrical vessels with a base area of one square decimeter and a height that we consider to be infinite. The vessels are numbered from 1 to n, and vessels i and i+1 are communicating via a very thin bridge at a height of h<sub>i</sub> decimeters. All these heights are pairwise distinct.</p>

<p>The practice work contains t independent experiments. In each experiment, all vessels are initially empty. In the i-th experiment, water is slowly put into vessel a<sub>i</sub>, and the experiment finishes when any amount of water appears in vessel b<sub>i</sub>. The result of the experiment is the total volume of water put into vessel a<sub>i</sub>, measured in liters (or, equivalently, cubic decimeters).</p>

<p>Note that the law of communicating vessels can only be applied to vessels i and i + 1 when the water level is at least h<sub>i</sub> in both of them. Until then, if the water level reaches h<sub>i</sub> in just one of them, it stays constant and any excess water coming into this vessel flows through the bridge into the other one.</p>

<p>Help John check his results!</p>

### 입력

<p>The first line of the input contains an integer n &mdash; the number of vessels (2 &le; n &le; 2 &middot; 10<sup>5</sup>).</p>

<p>The second line contains n &minus; 1 integers h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n&minus;1</sub> &mdash; the heights of communication bridges between consecutive vessels, in decimeters (1 &le; h<sub>i</sub> &le; 10<sup>9</sup>). These heights are pairwise distinct.</p>

<p>The third line contains an integer t &mdash; the number of experiments (1 &le; t &le; 2 &middot; 10<sup>5</sup>).</p>

<p>Each of the following t lines contains two integers a<sub>i</sub> and b<sub>i</sub> &mdash; the numbers of the starting vessel and the target vessel in the i-th experiment (1 &le; a<sub>i</sub> &le; n; 1 &le; b<sub>i</sub> &le; n; a<sub>i</sub> &ne;&nbsp;b<sub>i</sub>).</p>

### 출력

<p>For each experiment, in the order of input, output a single integer &mdash; the required volume of water, in liters.v</p>