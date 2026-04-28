# [Gold V] Count von Walken’s Fence - 11211

[문제 링크](https://www.acmicpc.net/problem/11211)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 84, 정답: 35, 맞힌 사람: 28, 정답 비율: 41.791%

### 분류

수학, 누적 합

### 문제 설명

<p>The old Count von Walken ponders along the fence of his backyard. The fence has a repeating pattern with poles in the ground at equal distances. Since von Walken has nothing better to do, he counts the number of steps he takes between each pole.</p>

<p>The distance between two consecutive poles turns out not to be an integer multiple of the length of his steps because sometimes he takes two steps between the poles, and sometimes he takes three steps.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11211/1.png" style="height:152px; width:615px" /></p>

<p style="text-align: center;">Figure I.1: A picture of sample case 2</p>

<p>Von Walken knows that his steps are always 1 meter long, so he starts thinking of what the distance between the poles may be. &ldquo;It must be more than 2 meters, since I occasionally can fit 3 steps between the poles, but it must be less than 3 meters, since I sometimes only fit 2 steps in between.&rdquo;</p>

<p>Given a list of step counts and a distance D, determine whether it is possible that the distance between two poles is D meters. The poles can be considered to have width 0, and each step is strictly between two poles.</p>

<p>To avoid problems with floating point numbers, the result is guaranteed to be the same even if any pole is moved up to 10<sup>&minus;7</sup> meters.</p>

### 입력

<p>The input consists of a line containing the real number D and an integer N, followed by a line with the space-separated list of integer step counts, c<sub>1</sub>, c<sub>2</sub>, . . . , c<sub>N</sub> . It holds that 2 &le; c<sub>i</sub>, D &le; 3 and that 0 &le; N &le; 10 000.</p>

### 출력

<p>The program should print &ldquo;possible&rdquo; if D meters is a possible distance between the poles, and &ldquo;impossible&rdquo; otherwise.</p>