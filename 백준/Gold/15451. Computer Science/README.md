# [Gold III] Computer Science - 15451

[문제 링크](https://www.acmicpc.net/problem/15451)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 17, 맞힌 사람: 16, 정답 비율: 41.026%

### 분류

자료 구조, 우선순위 큐, 슬라이딩 윈도우

### 문제 설명

<p>Vera has N integers a<sub>1</sub>, . . . , a<sub>N</sub> . A margin is a non-negative integer L such that it is possible to choose N integers x<sub>1</sub>, . . . , x<sub>N</sub> such that for all i, 1 &le; i &le; N, the interval [x<sub>i</sub>, x<sub>i</sub> + L] contains at least K of Vera&rsquo;s integers and also contains a<sub>i</sub>.</p>

<p>Compute the minimum possible margin.</p>

### 입력

<p>Line 1 contains integers N and K (1 &le; K &le; N &le; 2 &times; 10<sup>5</sup>).</p>

<p>Line 2 contains N integers, a<sub>1</sub>, . . . , a<sub>N</sub> (&minus;10<sup>9</sup> &le; a<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Print one line with one integer, the minimum possible margin.</p>

### 힌트

<p>For the first example, one possible solution is to choose x<sub>1</sub> = &minus;1, x<sub>2</sub> = &minus;2, x<sub>3</sub> = 4, x<sub>4</sub> = 0, x<sub>5</sub> = 0, which is illustrated below.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15451.%E2%80%85Computer%E2%80%85Science/5d42a0dc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15451.%E2%80%85Computer%E2%80%85Science/5d42a0dc.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15451/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:523px" /></p>