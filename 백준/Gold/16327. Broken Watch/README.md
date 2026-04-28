# [Gold III] Broken Watch - 16327

[문제 링크](https://www.acmicpc.net/problem/16327)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 106, 정답: 53, 맞힌 사람: 48, 정답 비율: 59.259%

### 분류

수학, 조합론

### 문제 설명

<p>A UFO crash lands on Earth. The alien captain survives the crash relatively unscathed; however his trusty watch is damaged beyond repair.</p>

<p>The alien watch is very similar to a human watch: It is a disc 30mm in diameter and it has three hands of lengths A, B and C microns (1000 &le; A, B, C &le; 15000). However, the aliens measure time differently: there are N (2 &le; N &lt; 2 32) alien seconds to an alien minute. As such, there are N markings on the edge of the disc, rather than 60.</p>

<p>The watch&rsquo;s glass cover is broken and the hands have come loose: they can rotate freely and independently of one another. By pointing each of the hands at an arbitrary marking, their tips can be made to form an imaginary triangle (as long as they are non-collinear).</p>

<p>Having nothing left to do but wait for help to arrive, the alien ponders the following question: What is the number M of distinct triangles that contain the watch&rsquo;s center? (Triangles where the center lies on one of the edges of the triangle count as well.)</p>

### 입력

<p>The input consists of A, B, C, and N on a single line, separated by whitespace.</p>

### 출력

<p>The output is M modulo 2<sup>64</sup>.</p>