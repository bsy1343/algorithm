# [Gold II] Paper Strips - 7192

[문제 링크](https://www.acmicpc.net/problem/7192)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

자료 구조, 분리 집합, 우선순위 큐, 값 / 좌표 압축

### 문제 설명

<p>Jack has an $L$ cm long black strip of paper. He will glue colored strips of paper onto the black one. It may be assumed the new strips will always fit on top of the black one. All the strips have the same width. Each new strip will hide the colors under it.</p>

<p>Find the colors and lengths of the segments visible in the end.</p>

### 입력

<p>The first line of input contains the length of the black strip $L$ and the number of the colored strips $N$. Each of the following $N$ lines contains three integers describing one colored strip: the color code $K$ ($1 &le; K &le; 100$) and the distance $A$ of the beginning and the distance $B$ of the end of the colored strip from the beginning of the black strip ($0 &le; A &lt; B &le; L$). The code of color black is $0$. Only the initial strip is black, all others are colored.</p>

### 출력

<p>The output should contain the colors and lengths of the segments of each color in the final result, listed from the beginning of the original black strip to its end. Adjacent strip sections of the same color should be output as one segment.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7192.%E2%80%85Paper%E2%80%85Strips/09b67674.png" data-original-src="https://upload.acmicpc.net/75d32764-88e2-4adf-87e4-265fd13c00b6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 393px; height: 40px;" /></p>