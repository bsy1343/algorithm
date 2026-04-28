# [Gold III] \(a^ib^jc^k\) - 15485

[문제 링크](https://www.acmicpc.net/problem/15485)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 370, 정답: 248, 맞힌 사람: 173, 정답 비율: 65.283%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>a, b, c로만 이루어진 문자열 S가 주어졌을 때, S의 부분 수열 중에서 a<sup>i</sup>b<sup>j</sup>c<sup>k</sup>의 형태로 이루어진 것의 개수를 구하는 프로그램을 작성하시오. 이때, i &ge; 1, j &ge; 1, k &ge;&nbsp;1을 만족해야 한다.</p>

<p>a<sup>i</sup>b<sup>j</sup>c<sup>k</sup>는 a가 i개 나오고, 이어서 b가 j개, c가 k개 연속해서 나오는 문자열이다. 예를 들어, a<sup>2</sup>b<sup>3</sup>c<sup>1</sup>은 &quot;aabbbc&quot;를 나타내며, a<sup>3</sup>b<sup>1</sup>c<sup>6</sup>은 &quot;aaabcccccc&quot;를 나타낸다.</p>

### 입력

<p>첫째 줄에 a, b, c로만 이루어진 문자열 S가 주어진다. S의 길이는 1,000,000을 넘지 않는다.</p>

### 출력

<p>첫째 줄에 S의 부분 수열 중에서 a<sup>i</sup>b<sup>j</sup>c<sup>k</sup>&nbsp;형태로 이루어진 것의 개수를 1,000,000,007로 나눈 나머지를 출력한다.</p>