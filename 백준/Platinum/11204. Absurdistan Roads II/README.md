# [Platinum V] Absurdistan Roads II - 11204

[문제 링크](https://www.acmicpc.net/problem/11204)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 53, 정답: 18, 맞힌 사람: 15, 정답 비율: 41.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The people of Absurdistan discovered how to build roads only last year. After the discovery, each city decided to build its own road, connecting the city with some other city. Each newly built road can be used in both directions.</p>

<p>Absurdistan is full of absurd coincidences. It took all N cities precisely one year to build their roads. And even more surprisingly, when the roads were finished it was possible to travel from every city to any other city using the newly built roads. We say that such a road network is connected. Being interested in mathematics and probability, you started wondering how unlikely this coincidence really is.</p>

<p>Each city picked uniformly at random another city to which they built a road. Calculate the probability that the road network ends up being connected.</p>

### 입력

<p>The first line contains an integer N (2 &le; N &le; 140) &ndash; the number of cities.</p>

### 출력

<p>Output one line containing a floating point number denoting the probability that the randomly built road network with N cities and N roads is connected. Your answer should have an absolute error of at most 10<sup>&minus;8</sup>.</p>